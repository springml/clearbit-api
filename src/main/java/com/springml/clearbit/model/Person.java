package com.springml.clearbit.model;

import com.springml.clearbit.model.common.Error;
import com.springml.clearbit.model.common.Facebook;
import com.springml.clearbit.model.common.Linkedin;
import com.springml.clearbit.model.common.Twitter;
import com.springml.clearbit.model.person.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {

    private String id;
    private Name name;
    private String email;
    private String gender;
    private String location;
    private String timeZone;
    private long utcOffset;
    private Geo geo;
    private String bio;
    private String site;
    private String avatar;
    private Employment employment;
    private Facebook facebook;
    private Github github;
    private Twitter twitter;
    private Linkedin linkedin;
    private Googleplus googleplus;
    private Angellist angellist;
    private Aboutme aboutme;
    private Gravatar gravatar;
    private boolean fuzzy;
    private Error error;

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
    public Name getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     *
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     *     The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     *     The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
     *     The bio
     */
    public String getBio() {
        return bio;
    }

    /**
     *
     * @param bio
     *     The bio
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     *
     * @return
     *     The site
     */
    public String getSite() {
        return site;
    }

    /**
     *
     * @param site
     *     The site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     *
     * @return
     *     The avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     *
     * @param avatar
     *     The avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     *
     * @return
     *     The employment
     */
    public Employment getEmployment() {
        return employment;
    }

    /**
     *
     * @param employment
     *     The employment
     */
    public void setEmployment(Employment employment) {
        this.employment = employment;
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
     *     The github
     */
    public Github getGithub() {
        return github;
    }

    /**
     *
     * @param github
     *     The github
     */
    public void setGithub(Github github) {
        this.github = github;
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
     *     The googleplus
     */
    public Googleplus getGoogleplus() {
        return googleplus;
    }

    /**
     *
     * @param googleplus
     *     The googleplus
     */
    public void setGoogleplus(Googleplus googleplus) {
        this.googleplus = googleplus;
    }

    /**
     *
     * @return
     *     The angellist
     */
    public Angellist getAngellist() {
        return angellist;
    }

    /**
     *
     * @param angellist
     *     The angellist
     */
    public void setAngellist(Angellist angellist) {
        this.angellist = angellist;
    }

    /**
     *
     * @return
     *     The aboutme
     */
    public Aboutme getAboutme() {
        return aboutme;
    }

    /**
     *
     * @param aboutme
     *     The aboutme
     */
    public void setAboutme(Aboutme aboutme) {
        this.aboutme = aboutme;
    }

    /**
     *
     * @return
     *     The gravatar
     */
    public Gravatar getGravatar() {
        return gravatar;
    }

    /**
     *
     * @param gravatar
     *     The gravatar
     */
    public void setGravatar(Gravatar gravatar) {
        this.gravatar = gravatar;
    }

    /**
     *
     * @return
     *     The fuzzy
     */
    public boolean isFuzzy() {
        return fuzzy;
    }

    /**
     *
     * @param fuzzy
     *     The fuzzy
     */
    public void setFuzzy(boolean fuzzy) {
        this.fuzzy = fuzzy;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
