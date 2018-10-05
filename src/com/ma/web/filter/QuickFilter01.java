package com.ma.web.filter;

import java.io.IOException;

public class QuickFilter01 implements javax.servlet.Filter {
    //Filter对象销毁的时候执行destiny方法
    public void destroy() {
        System.out.println("destory...");
    }


    /**
     *
     * @param req 内部封装的是客户端http请求
     * @param resp 代表响应
     * @param chain 过滤器链对象
     * @throws javax.servlet.ServletException
     * @throws IOException
     */
    //doFilter过滤器的核心方法
    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {

        System.out.println("Quick01 running...");

        //放行请求
        chain.doFilter(req, resp);
    }

    //Filter创建的时候调用init方法
    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
        //1.获取web.xml的filter的名称
        System.out.println(config.getFilterName());
        //2.获取filter的初始化参数
        System.out.println(config.getInitParameter("aaa"));
        //3.获取ServletContext
        System.out.println(config.getServletContext());

        System.out.println("init...");
    }

}
