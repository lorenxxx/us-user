package com.us.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ServletComponentScan
@PropertySource(value = "classpath:admin-config.yml", encoding = "utf-8")
public class UsUserWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsUserWebApplication.class, args);
	}
}
