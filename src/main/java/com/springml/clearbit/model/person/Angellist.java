
package com.springml.clearbit.model.person;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Angellist {

    private String handle;
    private String bio;
    private String blog;
    private String site;
    private long followers;
    private String avatar;

    /**
     * 
     * @return
     *     The handle
     */
    public String getHandle() {
        return handle;
    }

    /**
     * 
     * @param handle
     *     The handle
     */
    public void setHandle(String handle) {
        this.handle = handle;
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
     *     The blog
     */
    public String getBlog() {
        return blog;
    }

    /**
     * 
     * @param blog
     *     The blog
     */
    public void setBlog(String blog) {
        this.blog = blog;
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
     *     The followers
     */
    public long getFollowers() {
        return followers;
    }

    /**
     * 
     * @param followers
     *     The followers
     */
    public void setFollowers(long followers) {
        this.followers = followers;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
