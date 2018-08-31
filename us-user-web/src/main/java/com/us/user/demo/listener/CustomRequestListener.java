package com.us.user.demo.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author liangliang
 * @date 2018/8/29 3:06 PM
 */
@WebListener
@Slf4j
public class CustomRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        log.info("customRequestListener init");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        log.info("customRequestListener destroy");
    }

}
