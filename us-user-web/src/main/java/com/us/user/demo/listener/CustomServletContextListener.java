package com.us.user.demo.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author liangliang
 * @date 2018/8/29 3:08 PM
 */
@WebListener
@Slf4j
public class CustomServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("customServletContextListener init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("customServletContextListener destroy");
    }

}
