package com.us.user.demo.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liangliang
 * @date 2018/9/5 8:53 PM
 */
@Service
@Slf4j
public class RabbitMQService implements IRabbitMQService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMsg(String msg) {
        amqpTemplate.convertAndSend("demo", msg);
        log.info("Send Message Success: " + msg);
    }

}
