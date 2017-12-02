package com.zhenhui.origin.threads.api.dto.content;

import com.zhenhui.origin.threads.api.dto.common.AbstractProperties;
import lombok.Data;

@Data
public class MixedContentVideoDTO extends AbstractProperties {

    private static final long serialVersionUID = 162498820763181265L;

    public static final String KEY_ORIGIN_URL = "originUrl";
    public static final String KEY_COVER_IMAGE_URL = "coverImageUrl";

    private String url;

    private int width;

    private int height;

    private int duration; // ms

}
