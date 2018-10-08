package com.us.user.demo.conditional;

import com.us.claudine.test.AbstractCommonTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Loren on 2018/10/8.
 */
public class ConditionalTest extends AbstractCommonTest {

    @Autowired
    private VanPlayer vanPlayer;

    @Test
    public void test() {
        vanPlayer.fightSomeOne();
    }

}
