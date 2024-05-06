package com.ikerli.forum.user.provider;

import com.ikerli.forum.UserService;
import com.ikerli.forum.dto.AuthenticateRequest;
import com.ikerli.forum.dto.AuthenticateResponse;
import com.ikerli.forum.dto.RegisterRequest;
import com.ikerli.forum.dto.RegisterResponse;

/**
 * @className: UserServiceProvider
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/5/6 16:34
 */
public class UserServiceProvider implements UserService {

    @Override
    public RegisterResponse register(RegisterRequest request) {
        return null;
    }

    @Override
    public AuthenticateResponse authenticate(AuthenticateRequest request) {
        return null;
    }
}
