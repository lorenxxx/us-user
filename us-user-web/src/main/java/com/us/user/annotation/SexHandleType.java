package com.us.user.annotation;

import java.lang.annotation.*;

/**
 * @author liangliang
 * @date 2019/5/24 3:15 PM
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface SexHandleType {

    String value();

}
