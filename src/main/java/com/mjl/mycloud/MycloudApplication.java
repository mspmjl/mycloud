package com.mjl.mycloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 缪缪同学
 */
@SpringBootApplication
@MapperScan("com.mjl.mycloud.mapper")
public class MycloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycloudApplication.class, args);
	}
}
