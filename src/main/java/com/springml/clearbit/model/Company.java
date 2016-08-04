
package com.springml.clearbit.model;

import com.springml.clearbit.model.common.Facebook;
import com.springml.clearbit.model.common.Linkedin;
import com.springml.clearbit.model.common.Twitter;
import com.springml.clearbit.model.company.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String id;
    private String name;
    private String legalName;
    private String domain;
    private List<String> domainAliases = new ArrayList<String>();
    private String url;
    private Site site;
    private Category category;
    private List<String> tags = new ArrayList<String>();
    private String description;
    private long foundedYear;
    private String location;
    private String timeZone;
    private long utcOffset;
    private Geo geo;
    private String logo;
    private Facebook facebook;
    private Linkedin linkedin;
    private Twitter twitter;
    private Crunchbase crunchbase;
    private boolean emailProvider;
    private String type;
    private String ticker;
    private String phone;
    private Metrics metrics;
    private List<String> tech = new ArrayList<String>();

    /**
     *
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     *     The legalName
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     *
     * @param legalName
     *     The legalName
     */
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    /**
     *
     * @return
     *     The domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     *
     * @param domain
     *     The domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     *
     * @return
     *     The domainAliases
     */
    public List<String> getDomainAliases() {
        return domainAliases;
    }

    /**
     *
     * @param domainAliases
     *     The domainAliases
     */
    public void setDomainAliases(List<String> domainAliases) {
        this.domainAliases = domainAliases;
    }

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
     *     The site
     */
    public Site getSite() {
        return site;
    }

    /**
     *
     * @param site
     *     The site
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     *
     * @return
     *     The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     *
     * @param category
     *     The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     *
     * @return
     *     The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     *     The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     *     The foundedYear
     */
    public long getFoundedYear() {
        return foundedYear;
    }

    /**
     *
     * @param foundedYear
     *     The foundedYear
     */
    public void setFoundedYear(long foundedYear) {
        this.foundedYear = foundedYear;
    }

    /**
     *
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     *     The timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     *
     * @param timeZone
     *     The timeZone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     *
     * @return
     *     The utcOffset
     */
    public long getUtcOffset() {
        return utcOffset;
    }

    /**
     *
     * @param utcOffset
     *     The utcOffset
     */
    public void setUtcOffset(long utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     *
     * @return
     *     The geo
     */
    public Geo getGeo() {
        return geo;
    }

    /**
     *
     * @param geo
     *     The geo
     */
    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    /**
     *
     * @return
     *     The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     *
     * @param logo
     *     The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     *
     * @return
     *     The facebook
     */
    public Facebook getFacebook() {
        return facebook;
    }

    /**
     *
     * @param facebook
     *     The facebook
     */
    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    /**
     *
     * @return
     *     The linkedin
     */
    public Linkedin getLinkedin() {
        return linkedin;
    }

    /**
     *
     * @param linkedin
     *     The linkedin
     */
    public void setLinkedin(Linkedin linkedin) {
        this.linkedin = linkedin;
    }

    /**
     *
     * @return
     *     The twitter
     */
    public Twitter getTwitter() {
        return twitter;
    }

    /**
     *
     * @param twitter
     *     The twitter
     */
    public void setTwitter(Twitter twitter) {
        this.twitter = twitter;
    }

    /**
     *
     * @return
     *     The crunchbase
     */
    public Crunchbase getCrunchbase() {
        return crunchbase;
    }

    /**
     *
     * @param crunchbase
     *     The crunchbase
     */
    public void setCrunchbase(Crunchbase crunchbase) {
        this.crunchbase = crunchbase;
    }

    /**
     *
     * @return
     *     The emailProvider
     */
    public boolean isEmailProvider() {
        return emailProvider;
    }

    /**
     *
     * @param emailProvider
     *     The emailProvider
     */
    public void setEmailProvider(boolean emailProvider) {
        this.emailProvider = emailProvider;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     *     The ticker
     */
    public String getTicker() {
        return ticker;
    }

    /**
     *
     * @param ticker
     *     The ticker
     */
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    /**
     *
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return
     *     The metrics
     */
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     *
     * @param metrics
     *     The metrics
     */
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     *
     * @return
     *     The tech
     */
    public List<String> getTech() {
        return tech;
    }

    /**
     *
     * @param tech
     *     The tech
     */
    public void setTech(List<String> tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
