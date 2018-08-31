package com.us.user.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liangliang
 * @date 2018/8/28 3:24 PM
 */
@Component
@ConfigurationProperties(prefix = "admin")
@Data
public class AdminConfig {

    private String name;

    private Integer age;

    private List<String> hobby;

}
