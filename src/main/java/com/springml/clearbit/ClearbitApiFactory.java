package com.springml.clearbit;

import com.springml.clearbit.impl.ClearbitV2Impl;

/**
 * Created by sam on 4/8/16.
 */
public class ClearbitApiFactory {

    public static final ClearbitApi getClearbitApi(String apiKey, String version) {
        // Currently v2 alone is supported
        return new ClearbitV2Impl(apiKey);
    }
}
