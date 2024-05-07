package com.ikerli.forum.web.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @className: UserRegisterHttpRequest
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/5/7 15:32
 */
@Getter
@Setter
public class UserRegisterHttpRequest {
    private String id;
    private String name;
    private int sex;
    private int gender;
    private String passwd;
}
