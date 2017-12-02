package com.zhenhui.origin.threads.api.dto.content;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ContentDTO implements Serializable{

    private static final long serialVersionUID = 162498820763181265L;

    private ContentType type;

    private List<MixedContentDTO> mixes;

    private String html;

    private String markdown;

}
