package com.ikerli.forum.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: WebApplication
 * @author: ikerli
 * @description: TODO
 * @createTime: 2024/5/6 14:41
 */
@SpringBootApplication
@EnableDubboConfig
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class);
    }
}
