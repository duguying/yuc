package net.duguying.yuc.servlet;

import javax.servlet.*;
import java.io.IOException;

import net.duguying.common.BaseServlet;

/**
 * Created by rex on 2015/1/18.
 */
public class IndexServlet extends BaseServlet{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("hello world, servlet");
    }
}
