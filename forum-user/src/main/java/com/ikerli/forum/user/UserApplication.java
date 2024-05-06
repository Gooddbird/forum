package com.ikerli.forum.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: UserApplication
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/4/28 15:08
 */
@EnableDubbo
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
