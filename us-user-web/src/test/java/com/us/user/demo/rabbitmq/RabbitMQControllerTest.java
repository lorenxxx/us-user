package com.us.user.demo.rabbitmq;

import com.us.claudine.test.AbstractMockTest;
import org.databene.contiperf.PerfTest;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author liangliang
 * @date 2018/9/5 9:05 PM
 */
public class RabbitMQControllerTest extends AbstractMockTest {

    @Test
    @PerfTest(invocations = 100, threads = 10)
    public void testSend() throws Exception {
        String msg = "this is a mock test";
        this.mockMvc.perform(MockMvcRequestBuilders.post("/rabbitmq/send").param("msg", msg))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

}
