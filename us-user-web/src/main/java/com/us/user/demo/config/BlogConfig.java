package com.us.user.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liangliang
 * @date 2018/8/28 3:05 PM
 */
@Component
@ConfigurationProperties(prefix = "config")
@Data
public class BlogConfig {

    private Integer code;

    private String name;

    private List<String> hobby;

}











