package com.ikerli.forum.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @className: BaseResponse
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/5/6 16:26
 */

@Getter
@Setter
public abstract class BaseResponse {
    private int code;

    private String message;
}
