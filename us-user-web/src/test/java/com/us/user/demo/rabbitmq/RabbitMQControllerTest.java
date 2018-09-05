package com.us.user.demo.rabbitmq;

import com.us.user.BaseMockTest;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author liangliang
 * @date 2018/9/5 9:05 PM
 */
public class RabbitMQControllerTest extends BaseMockTest {

    @Test
    public void testSend() throws Exception {
        String msg = "this is a mock test";
        this.mockMvc.perform(MockMvcRequestBuilders.post("/rabbitmq/send").param("msg", msg))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

}
