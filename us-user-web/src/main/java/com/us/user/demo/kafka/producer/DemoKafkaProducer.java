package com.us.user.demo.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoProducer
 * @Desciption TODO
 * @Author loren
 * @Date 2019/6/21 4:26 PM
 * @Version 1.0
 **/
@Component
@Slf4j
public class DemoKafkaProducer {

    @Autowired
    private KafkaTemplate<Integer, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        log.info("kafka message send: topic: {}, message: {}", topic, message);
    }

}
