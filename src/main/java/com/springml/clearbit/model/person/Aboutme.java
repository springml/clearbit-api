
package com.springml.clearbit.model.person;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Aboutme {

    private String handle;
    private String bio;
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
