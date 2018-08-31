package com.us.user.demo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author liangliang
 * @date 2018/8/28 11:20 PM
 */
@Slf4j
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("customFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("customFilter doFilter");

        // 对request，response进行一些预处理
        // 比如设置编码格式
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");

        // TODO: 2018/8/28 进行其他业务逻辑处理

        // 过滤器链路 传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("customFilter destroy");
    }
}
