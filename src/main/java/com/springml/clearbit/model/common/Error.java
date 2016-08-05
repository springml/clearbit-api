package com.springml.clearbit.model.common;

/**
 * Created by sam on 5/8/16.
 */
public class Error {
    private String type;
    private String message;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
