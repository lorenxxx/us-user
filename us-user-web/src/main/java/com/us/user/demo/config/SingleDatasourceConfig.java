package com.us.user.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName SingleDatasourceConfig
 * @Desciption TODO
 * @Author loren
 * @Date 2019/4/2 11:11 PM
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "claudine.datasource.user.master.node1")
@Data
public class SingleDatasourceConfig {

    private String url;

    private String username;

    private String password;

}
