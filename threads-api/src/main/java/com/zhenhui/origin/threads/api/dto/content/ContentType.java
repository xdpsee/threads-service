package com.zhenhui.origin.threads.api.dto.content;

import java.util.Arrays;

@SuppressWarnings("unused")
public enum ContentType {

    MISC(0, "混合内容"),
    HTML(1, "HTML文本"),
    MARKDOWN(2, "Markdown文本"),
    ;

    public final int code;
    public final String comment;
    ContentType(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public static ContentType valueOf(int code) {
        return Arrays.stream(values())
                .filter(type -> type.code == code)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("invalid code: %d", code)));
    }
}
