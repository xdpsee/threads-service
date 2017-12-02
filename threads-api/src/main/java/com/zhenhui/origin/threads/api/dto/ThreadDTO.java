package com.zhenhui.origin.threads.api.dto;

import com.zhenhui.origin.threads.api.dto.common.AbstractProperties;
import com.zhenhui.origin.threads.api.dto.common.ThreadStatus;
import com.zhenhui.origin.threads.api.dto.content.ContentDTO;
import lombok.Data;

import java.util.Date;

@Data
public class ThreadDTO extends AbstractProperties {

    private static final long serialVersionUID = 162498820763181265L;

    public static final String KEY_ORIGIN_URL = "originUrl";

    private long id;

    private String title;

    private Date gmtCreate;

    private final ContentDTO content = new ContentDTO();

    private ThreadStatus status;
}

