package com.ikerli.forum.user.domain.handler;

import com.ikerli.forum.user.domain.entity.TUser;
import com.ikerli.forum.user.dto.RegisterRequest;
import com.ikerli.forum.user.dto.RegisterResponse;
import com.ikerli.forum.user.infra.mapper.TUserMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @className: UserRegisterHandler
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/5/7 15:21
 */
@Service
public class UserRegisterHandler {

    @Resource
    private TUserMapper tUserMapper;

    public RegisterResponse register(RegisterRequest request) {
        TUser user = new TUser();
        user.setId(request.getId());
        user.setName(request.getName());
        user.setPasswd(request.getPasswd());

        tUserMapper.insert(user);

        return new RegisterResponse();
    }
}
