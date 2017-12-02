package com.zhenhui.origin.threads.api.service;

import com.zhenhui.origin.threads.api.dto.ThreadDTO;

public interface ThreadQueryService {

    ThreadDTO getThreadById(long threadId);

}


