package com.us.user.demo.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author liangliang
 * @date 2018/8/29 3:09 PM
 */
@WebListener
@Slf4j
public class CustomSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        log.info("customSessionListener init");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        log.info("customSessionListener destroy");
    }

}
