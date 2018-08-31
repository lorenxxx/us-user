package com.us.user.demo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author liangliang
 * @date 2018/8/29 2:47 PM
 */
@Configuration
public class FilterOrderConfig {

    @Bean
    public FilterRegistrationBean customFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new CustomFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.setOrder(-1);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean authFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new AuthFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

}
