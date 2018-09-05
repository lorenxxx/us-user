package com.us.user;

import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liangliang
 * @date 2018/9/5 9:01 PM
 */
@RunWith(SpringRunner.class)
public class BaseTest {

    @Rule
    public ContiPerfRule contiPerfRule = new ContiPerfRule();

}
