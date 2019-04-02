package com.us.user.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName DatasourceConfig
 * @Desciption TODO
 * @Author loren
 * @Date 2019/4/2 7:40 PM
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "claudine.datasource")
@Data
public class DatasourceConfig {

    private List<Cluster> clusters;

}
