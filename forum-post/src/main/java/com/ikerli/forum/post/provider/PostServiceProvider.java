package com.ikerli.forum.post.provider;

import com.ikerli.forum.post.PostService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @className: PostServiceProvider
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/4/29 15:16
 */
@DubboService
public class PostServiceProvider implements PostService {

    @Override
    public String publishPost(String post) {
        return "{\"retCode\": \"0\"}";
    }
}
