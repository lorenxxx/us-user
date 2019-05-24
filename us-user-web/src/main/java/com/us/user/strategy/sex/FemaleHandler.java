package com.us.user.strategy.sex;

import com.us.user.annotation.SexHandleType;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName FemaleHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2019/5/24 3:19 PM
 * @Version 1.0
 **/
@Slf4j
@SexHandleType("female")
public class FemaleHandler implements SexHandler {

    @Override
    public void handle() {
        log.info("FemaleHandler invoke...");
    }

}
