package com.us.user.demo.profile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

/**
 * @author liangliang
 * @date 2018/8/28 11:09 PM
 */
@Configuration
@Profile("dev")
@Slf4j
public class DevBean {

    @PostConstruct
    public void init() {
        log.info("dev environment active");
    }

}
