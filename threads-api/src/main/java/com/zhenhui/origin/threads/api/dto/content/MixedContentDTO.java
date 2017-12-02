package com.zhenhui.origin.threads.api.dto.content;

import lombok.Data;

@Data
public class MixedContentDTO {

    private MixedContentType type;

    private String text;

    private MixedContentImageDTO image;

    private MixedContentAudioDTO audio;

    private MixedContentVideoDTO video;

}

