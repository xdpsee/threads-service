package com.zhenhui.origin.threads.api.dto.content;

import com.zhenhui.origin.threads.api.dto.common.AbstractProperties;
import lombok.Data;

@Data
public class MixedContentImageDTO extends AbstractProperties {

    private static final long serialVersionUID = 162498820763181265L;

    private String url;

    private int width;

    private int height;

}

