package com.zhenhui.origin.threads.api.dto.content;

import java.util.Arrays;

@SuppressWarnings("unused")
public enum MixedContentType {

    TEXT(0,  "文本"),
    IMAGE(1, "图片"),
    AUDIO(2, "音频"),
    VIDEO(3, "视频"),
    ;

    public final int code;
    public final String comment;
    MixedContentType(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    public static MixedContentType valueOf(int code) {
        return Arrays.stream(values())
                .filter(type -> type.code == code)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("invalid code: %d", code)));
    }

}
