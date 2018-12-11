package com.mjl.mycloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author 缪缪同学
 */
@SpringBootApplication
@MapperScan("com.mjl.mycloud.mapper")
public class MycloudApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MycloudApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MycloudApplication.class);
    }
}
