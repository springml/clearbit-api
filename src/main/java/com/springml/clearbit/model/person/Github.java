
package com.springml.clearbit.model.person;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Github {

    private String handle;
    private String avatar;
    private String company;
    private String blog;
    private long followers;
    private long following;

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
     *     The company
     */
    public String getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    public void setCompany(String company) {
        this.company = company;
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
     *     The following
     */
    public long getFollowing() {
        return following;
    }

    /**
     * 
     * @param following
     *     The following
     */
    public void setFollowing(long following) {
        this.following = following;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
