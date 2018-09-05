package com.us.user.demo.rabbitmq;

import com.us.user.CommonTest;
import org.databene.contiperf.PerfTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liangliang
 * @date 2018/9/5 8:56 PM
 */
public class RabbitMQServiceTest extends CommonTest {

    @Autowired
    private IRabbitMQService rabbitMQService;

    @Test
    @PerfTest(invocations = 100, threads = 10)
    public void testSend() {
        String msg = "test msg";
        rabbitMQService.sendMsg(msg);
    }

}
