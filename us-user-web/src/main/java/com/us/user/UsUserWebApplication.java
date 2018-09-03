package com.us.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.us.user.dao")
@PropertySource(value = "classpath:admin-config.yml", encoding = "utf-8")
public class UsUserWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsUserWebApplication.class, args);
	}
}
