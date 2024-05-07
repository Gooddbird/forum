package com.ikerli.forum.user.provider;

import com.ikerli.forum.user.UserService;
import com.ikerli.forum.user.domain.handler.UserRegisterHandler;
import com.ikerli.forum.user.dto.AuthenticateRequest;
import com.ikerli.forum.user.dto.AuthenticateResponse;
import com.ikerli.forum.user.dto.RegisterRequest;
import com.ikerli.forum.user.dto.RegisterResponse;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @className: UserServiceProvider
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/5/6 16:34
 */
@Service
public class UserServiceProvider implements UserService {

    @Resource
    private UserRegisterHandler userRegisterHandler;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        return userRegisterHandler.register(request);
    }

    @Override
    public AuthenticateResponse authenticate(AuthenticateRequest request) {
        return null;
    }
}
