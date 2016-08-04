package com.springml.clearbit;

import com.springml.clearbit.model.Company;
import com.springml.clearbit.model.Person;

/**
 * Created by sam on 4/8/16.
 */
public interface ClearbitApi {
    /**
     * Invokes Clearbit API and get the details of the company
     * @param domain - Domain of the company. Like, salesforce.com
     * @return
     */
    public Company getCompany(String domain) throws Exception;

    /**
     * Invokes Clearbit API and get the details of the person
     * @param email - Person's email address
     * @return
     */
    public Person getPerson(String email) throws Exception;
}
