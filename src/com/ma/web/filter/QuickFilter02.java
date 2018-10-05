package com.ma.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class QuickFilter02 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Quick02 running...");
        //放行请求
        chain.doFilter(req, resp);


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
