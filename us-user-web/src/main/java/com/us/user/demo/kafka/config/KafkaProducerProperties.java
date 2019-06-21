package com.us.user.demo.kafka.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName KafkaProducerProperties
 * @Desciption TODO
 * @Author loren
 * @Date 2019/6/21 4:47 PM
 * @Version 1.0
 **/
@Configuration
@ConfigurationProperties(prefix = "")
public class KafkaProducerProperties {
}
