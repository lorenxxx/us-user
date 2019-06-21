package com.us.user.demo.kafka.producer;

import com.us.claudine.test.AbstractCommonTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liangliang
 * @date 2019/6/21 4:30 PM
 */
public class DemoKafkaProducerTest extends AbstractCommonTest {

    @Autowired
    private DemoKafkaProducer demoKafkaProducer;

    @Test
    public void sendMessage() throws Exception {
        demoKafkaProducer.sendMessage("topic.quick.demo", "hello, kafka");
    }

}