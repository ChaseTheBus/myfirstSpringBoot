package com.xiaodianbidao.firstpringboot.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {

    public static final String[] SecondFilter={"/testController"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("this is SecondFilter doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
