package com.us.user;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author liangliang
 * @date 2018/9/5 9:01 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseMockTest {

    protected MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void beforeSetUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

}
