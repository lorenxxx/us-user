package com.us.user.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author liangliang
 * @date 2018/9/5 8:34 PM
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue demoQueue() {
        return new Queue("demo");
    }

}
