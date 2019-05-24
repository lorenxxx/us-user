package com.us.user.util;

import com.us.user.annotation.SexHandleType;
import org.junit.Test;

import java.util.Set;

/**
 * @author liangliang
 * @date 2019/5/24 3:49 PM
 */
public class ClassScannerTest {

    @Test
    public void scan() throws Exception {
        Set<Class<?>> scan = ClassScanner.scan("com.us.user", SexHandleType.class);
        for (Class<?> c : scan) {
            System.out.println(c);
        }
    }

    @Test
    public void scan1() throws Exception {
    }

}