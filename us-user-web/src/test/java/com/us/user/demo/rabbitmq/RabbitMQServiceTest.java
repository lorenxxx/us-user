package com.us.user.demo.rabbitmq;

import com.us.user.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liangliang
 * @date 2018/9/5 8:56 PM
 */
public class RabbitMQServiceTest extends BaseTest {

    @Autowired
    private IRabbitMQService rabbitMQService;

    @Test
    public void testSend() {
        String msg = "test msg";
        rabbitMQService.sendMsg(msg);
    }

}
