package com.zhenhui.origin.threads.api.dto.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractProperties implements Properties, Serializable {

    protected final Map<String, Object> extras = new HashMap<>();

    @Override
    public Object getProperty(String key) {
        if (null == key) {
            throw new IllegalArgumentException("key == null");
        }

        return extras.get(key);
    }

    @Override
    public void setProperty(String key, Object value) {
        if (null == key) {
            throw new IllegalArgumentException("key == null");
        }

        if (null == value) {
            throw new IllegalArgumentException("value == null");
        }

        extras.put(key, value);
    }

    @Override
    public void clearProperty(String key) {
        if (null == key) {
            throw new IllegalArgumentException("key == null");
        }

        extras.remove(key);
    }

}
