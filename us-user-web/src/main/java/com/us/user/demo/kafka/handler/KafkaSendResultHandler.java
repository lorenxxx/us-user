package com.us.user.demo.kafka.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;

/**
 * @ClassName KafkaProduceCallbackHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2019/6/21 5:01 PM
 * @Version 1.0
 **/
@Slf4j
public class KafkaSendResultHandler implements ProducerListener {

    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {
        log.info("Kafka message send success: {}", producerRecord);
    }

    @Override
    public void onError(ProducerRecord producerRecord, Exception exception) {
        log.error("Kafka message send error: {}", producerRecord);
    }

}
