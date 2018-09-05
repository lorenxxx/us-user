package com.us.user.demo.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liangliang
 * @date 2018/9/5 8:37 PM
 */
@Component
@RabbitListener(queues = "demo")
@Slf4j
public class DemoConsumer {

    @RabbitHandler
    public void process(String msg) {
        log.info("DemoConsumer Receive: " + msg);
    }

}
