package com.springml.clearbit.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.springml.clearbit.ClearbitApi;
import com.springml.clearbit.model.Company;
import com.springml.clearbit.model.Person;
import com.springml.clearbit.util.HttpHelper;

import static com.springml.clearbit.util.Constants.*;

/**
 * Created by sam on 4/8/16.
 */
public class ClearbitV2Impl implements ClearbitApi {
    private String apiKey;
    private HttpHelper httpHelper;
    private Gson gson;

    public ClearbitV2Impl(String apiKey) {
        this(apiKey, new HttpHelper());
    }

    public ClearbitV2Impl(String apiKey, HttpHelper httpHelper) {
        this.apiKey = apiKey;
        this.httpHelper = httpHelper;
        this.gson = new GsonBuilder().create();
    }

    public Company getCompany(String domain) throws Exception {
        String url = getCompanyURL(domain);
        String response = httpHelper.get(url, apiKey);
        Company company = gson.fromJson(response, Company.class);
        return company;
    }

    public Person getPerson(String email) throws Exception {
        String url = getPeopleURL(email);
        String response = httpHelper.get(url, apiKey);
        Person person = gson.fromJson(response, Person.class);
        return person;
    }

    private String getCompanyURL(String domain) {
        StringBuilder companyURL = new StringBuilder();
        companyURL.append(CLEARBIT_BASEURL).append(CLEARBIT_API_VERSION);
        companyURL.append(STR_SLASH).append(STR_COMPANIES);
        companyURL.append(COMPANIES_QUERY_PATH).append(domain);

        return companyURL.toString();
    }

    private String getPeopleURL(String email) {
        StringBuilder peopleURL = new StringBuilder();
        peopleURL.append(CLEARBIT_BASEURL).append(CLEARBIT_API_VERSION);
        peopleURL.append(STR_SLASH).append(STR_PEOPLE);
        peopleURL.append(PERSON_QUERY_PATH).append(email);

        return peopleURL.toString();
    }
}
