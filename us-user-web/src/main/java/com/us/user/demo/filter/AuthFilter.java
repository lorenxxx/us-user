package com.us.user.demo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author liangliang
 * @date 2018/8/29 2:33 PM
 */
@Slf4j
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("authFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("authFilter doFilter");

        // TODO: 2018/8/29 进行其他业务逻辑处理

        // 过滤器链路 传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("authFilter destroy");
    }

}
