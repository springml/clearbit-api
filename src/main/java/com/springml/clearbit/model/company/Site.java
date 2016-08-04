
package com.springml.clearbit.model.company;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Site {

    private String url;
    private String title;
    private String h1;
    private String metaDescription;
    private String metaAuthor;
    private List<Object> phoneNumbers = new ArrayList<Object>();
    private List<String> emailAddresses = new ArrayList<String>();

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The h1
     */
    public String getH1() {
        return h1;
    }

    /**
     * 
     * @param h1
     *     The h1
     */
    public void setH1(String h1) {
        this.h1 = h1;
    }

    /**
     * 
     * @return
     *     The metaDescription
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * 
     * @param metaDescription
     *     The metaDescription
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    /**
     * 
     * @return
     *     The metaAuthor
     */
    public String getMetaAuthor() {
        return metaAuthor;
    }

    /**
     * 
     * @param metaAuthor
     *     The metaAuthor
     */
    public void setMetaAuthor(String metaAuthor) {
        this.metaAuthor = metaAuthor;
    }

    /**
     * 
     * @return
     *     The phoneNumbers
     */
    public List<Object> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * 
     * @param phoneNumbers
     *     The phoneNumbers
     */
    public void setPhoneNumbers(List<Object> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * 
     * @return
     *     The emailAddresses
     */
    public List<String> getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * 
     * @param emailAddresses
     *     The emailAddresses
     */
    public void setEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
