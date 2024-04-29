package com.ikerli.forum.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: UserController
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/4/28 15:10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/register")
    public String register() {
        return "100001";
    }

}
