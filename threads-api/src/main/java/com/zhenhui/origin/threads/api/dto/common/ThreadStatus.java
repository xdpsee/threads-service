package com.zhenhui.origin.threads.api.dto.common;

import java.util.Arrays;

@SuppressWarnings("unused")
public enum ThreadStatus {

    INACTIVE(0, "未激活,不可见"),
    NORMAL(1, "正常"),
    REMOVED(2, "已删除"),
    ;

    public final int code;
    public final String comment;
    ThreadStatus(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public static ThreadStatus valueOf(int code) {
        return Arrays.stream(values())
                .filter(type -> type.code == code)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("invalid code: %d", code)));
    }

}
