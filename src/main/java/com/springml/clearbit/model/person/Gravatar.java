
package com.springml.clearbit.model.person;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Gravatar {

    private String handle;
    private List<Url> urls = new ArrayList<Url>();
    private String avatar;
    private List<Avatar> avatars = new ArrayList<Avatar>();

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
     *     The urls
     */
    public List<Url> getUrls() {
        return urls;
    }

    /**
     * 
     * @param urls
     *     The urls
     */
    public void setUrls(List<Url> urls) {
        this.urls = urls;
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
     *     The avatars
     */
    public List<Avatar> getAvatars() {
        return avatars;
    }

    /**
     * 
     * @param avatars
     *     The avatars
     */
    public void setAvatars(List<Avatar> avatars) {
        this.avatars = avatars;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
