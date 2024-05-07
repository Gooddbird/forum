package com.ikerli.forum.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan(basePackages = "com.ikerli.forum.user.infra.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
