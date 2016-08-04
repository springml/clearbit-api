
package com.springml.clearbit.model.common;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Facebook {

    private String handle;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
