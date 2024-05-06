package com.ikerli.forum.web.controller;

import com.ikerli.forum.PostService;
import javax.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: PostController
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/4/29 16:58
 */
@RestController
@RequestMapping("/post")
public class PostController {

    @DubboReference
    private PostService postService;

    @RequestMapping("/publish")
    public String publish() {
        return postService.publishPost("this is a test post");
    }
}
