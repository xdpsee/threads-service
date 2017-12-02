package com.zhenhui.origin.threads.api.dto.common;

public interface Properties {

    Object getProperty(String key);

    void setProperty(String key, Object value);

    void clearProperty(String key);
}
