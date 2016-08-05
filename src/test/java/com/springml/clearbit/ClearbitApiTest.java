package com.springml.clearbit;

import com.springml.clearbit.impl.ClearbitV2Impl;
import com.springml.clearbit.model.Company;
import com.springml.clearbit.model.Person;
import com.springml.clearbit.model.common.Error;
import com.springml.clearbit.util.HttpHelper;
import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by sam on 4/8/16.
 */
public class ClearbitApiTest {
    private static final String API_KEY = "testApiKey";

    private ClearbitApi clearbitApi;
    @Before
    public void setUp() throws Exception {
        HttpHelper httpHelper = mock(HttpHelper.class);
        clearbitApi = new ClearbitV2Impl(API_KEY, httpHelper);

        InputStream is = this.getClass().getClassLoader().getResourceAsStream("company.json");
        String companyJson = IOUtils.toString(is, Charset.defaultCharset());
        when(httpHelper.get("https://company.clearbit.com/v2/companies/find?domain=uber.com", API_KEY)).thenReturn(companyJson);

        InputStream personIs = this.getClass().getClassLoader().getResourceAsStream("person.json");
        String personJson = IOUtils.toString(personIs, Charset.defaultCharset());
        when(httpHelper.get("https://company.clearbit.com/v2/people/find?email=alex@alexmaccaw.com", API_KEY)).thenReturn(personJson);

        InputStream errorIs = this.getClass().getClassLoader().getResourceAsStream("error.json");
        String errorJson = IOUtils.toString(errorIs, Charset.defaultCharset());
        when(httpHelper.get("https://company.clearbit.com/v2/companies/find?domain=uber", API_KEY)).thenReturn(errorJson);
    }

    @After
    public void tearDown() throws Exception {
        // Nothing to do now
    }

    @Test
    public void getCompany() throws Exception {
        Company company = clearbitApi.getCompany("uber.com");
        assertNotNull(company);
        assertEquals("Uber", company.getName());
    }

    @Test
    public void invalidDomain() throws Exception {
        Company company = clearbitApi.getCompany("uber");
        assertNotNull(company);
        Error error = company.getError();
        assertNotNull(error);
        assertEquals("domain_invalid", error.getType());
    }

    @Test
    public void getPerson() throws Exception {
        Person person = clearbitApi.getPerson("alex@alexmaccaw.com");
        assertNotNull(person);
        assertEquals("alex@alexmaccaw.com", person.getEmail());
        assertEquals("Alex MacCaw", person.getName().getFullName());
    }

}