package com.us.user.demo.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liangliang
 * @date 2018/8/29 5:16 PM
 */
@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customHandlerInterceptor()).addPathPatterns("/**");
    }

    @Bean
    public static HandlerInterceptor customHandlerInterceptor() {
        return new CustomHandlerInterceptor();
    }

}
