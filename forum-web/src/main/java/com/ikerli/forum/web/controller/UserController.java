package com.ikerli.forum.web.controller;

import com.ikerli.forum.post.PostService;
import com.ikerli.forum.user.UserService;
import com.ikerli.forum.user.dto.RegisterRequest;
import com.ikerli.forum.web.controller.dto.UserRegisterHttpRequest;
import com.ikerli.forum.web.controller.dto.UserRegisterHttpResponse;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: PostController
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/4/29 16:58
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference
    private UserService userService;

    @RequestMapping("/register")
    public UserRegisterHttpResponse register(@RequestBody UserRegisterHttpRequest userRegisterHttpRequest) {

        RegisterRequest registerRequest = new RegisterRequest();
        try {
            BeanUtils.copyProperties(registerRequest, userRegisterHttpRequest);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        userService.register(registerRequest);
        return new UserRegisterHttpResponse();
    }
}
