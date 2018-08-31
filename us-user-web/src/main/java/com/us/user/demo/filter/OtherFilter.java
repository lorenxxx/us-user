package com.us.user.demo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author liangliang
 * @date 2018/8/29 2:56 PM
 */
@WebFilter(filterName = "otherFilter", urlPatterns = {"/*"})
@Slf4j
public class OtherFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("otherFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("otherFilter doFilter");

        // TODO: 2018/8/29 处理其他业务逻辑

        // 过滤器链路 传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("otherFilter destroy");
    }

}
