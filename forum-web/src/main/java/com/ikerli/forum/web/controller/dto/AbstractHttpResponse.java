package com.ikerli.forum.web.controller.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @className: AbstractHttpResponse
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/5/7 15:34
 */
@Getter
@Setter
public abstract class AbstractHttpResponse {

    private int code;

    private String message;
}
