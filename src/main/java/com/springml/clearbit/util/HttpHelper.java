package com.springml.clearbit.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.Logger;

import java.io.InputStream;

import static com.springml.clearbit.util.Constants.*;

/**
 * Helper class for HTTP requests
 */
public class HttpHelper {
    private static final Logger LOG = Logger.getLogger(HttpHelper.class);

    public String get(String url, String apikey) throws Exception {
        LOG.info("Executing GET request on " + url);
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(getRequestConfig());

        return execute(url, httpGet, apikey);
    }

    private String execute(String url, HttpUriRequest httpReq, String apiKey) throws Exception {
        String auth = apiKey + ":";
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes());
        String authHeader = "Basic " + new String(encodedAuth);
        httpReq.setHeader(HttpHeaders.AUTHORIZATION, authHeader);

        CredentialsProvider provider = new BasicCredentialsProvider();
        UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(apiKey, null);
        provider.setCredentials(AuthScope.ANY, credentials);
        HttpClient httpClient = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();

        InputStream eis = null;
        try {
            HttpResponse response = httpClient.execute(httpReq);

            int statusCode = response.getStatusLine().getStatusCode();
            if (!(statusCode == HttpStatus.SC_OK || statusCode == HttpStatus.SC_CREATED)) {
                String reasonPhrase = response.getStatusLine().getReasonPhrase();
                String errResponse = IOUtils.toString(response.getEntity().getContent(), STR_UTF_8);
                LOG.error(String.format("Accessing %s failed. Status %d. Reason %s \n Error from server %s", url, statusCode, reasonPhrase, errResponse));
                return errResponse;
            }

            HttpEntity responseEntity = response.getEntity();
            eis = responseEntity.getContent();
            return IOUtils.toString(eis, STR_UTF_8);
        } finally {
            try {
                if (eis != null) {
                    eis.close();
                }
            } catch (Exception e) {
                LOG.debug("Error while closing InputStream", e);
            }
        }
    }

    private static RequestConfig getRequestConfig() {
        int timeout = Integer.parseInt(System.getProperty(SYS_PROPERTY_SOCKET_TIMEOUT, DEFAULT_CONNECTION_TIMEOUT));

        return RequestConfig.custom().setSocketTimeout(timeout)
                .setConnectTimeout(timeout).setConnectionRequestTimeout(timeout).build();
    }
}
