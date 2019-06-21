package com.us.user.demo.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoConsumer
 * @Desciption TODO
 * @Author loren
 * @Date 2019/6/21 4:12 PM
 * @Version 1.0
 **/
@Component
@Slf4j
public class DemoKafkaConsumer {

    @KafkaListener(topics = "topic.quick.demo")
    public void consume(String msg) {
        log.info("kafka message receive: {}", msg);
    }

}
