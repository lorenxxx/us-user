package com.us.user.kafka.consumer;


import com.guazi.sample.kafka.constants.KafkaConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName KafkaConsumer
 * @Desciption Kafka消费者
 * @Author loren
 * @Date 2019/6/14 3:10 PM
 * @Version 1.0
 **/
@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = {KafkaConstants.MY_TOPIC})
    public void receiveMessage(String message) {
        log.info("message received: message: {}", message);
    }

    @KafkaListener(topics = {KafkaConstants.MY_TOPIC})
    public void receiveMessage(byte[] message) {

    }

    @KafkaListener(topics = {KafkaConstants.MY_TOPIC})
    public void receiveMessage(ConsumerRecord record) {

    }

}
