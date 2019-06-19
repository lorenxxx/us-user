package com.us.user.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName KafkaProducer
 * @Desciption Kafka生产者
 * @Author loren
 * @Date 2019/6/14 3:09 PM
 * @Version 1.0
 **/
@Component
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
        log.info("kafka message send: topic: {}, message: {}", topic, message);
    }

}
