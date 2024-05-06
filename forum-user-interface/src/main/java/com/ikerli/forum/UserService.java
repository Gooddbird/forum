package com.ikerli.forum;

import com.ikerli.forum.dto.AuthenticateRequest;
import com.ikerli.forum.dto.AuthenticateResponse;
import com.ikerli.forum.dto.RegisterRequest;
import com.ikerli.forum.dto.RegisterResponse;

public interface UserService {

    /**
     * 注册用户
     * @param request
     * @return
     */
    RegisterResponse register(RegisterRequest request);

    /**
     * 用户鉴权
     * @param request
     * @return
     */
    AuthenticateResponse authenticate(AuthenticateRequest request);


}
