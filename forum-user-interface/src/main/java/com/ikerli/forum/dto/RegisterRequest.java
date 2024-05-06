package com.ikerli.forum.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @className: RegisterRequest
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/5/6 16:19
 */
@Getter
@Setter
public class RegisterRequest {

    private String id;

    private String name;

    private int sex;

    private int gender;

    private String passwd;
}
