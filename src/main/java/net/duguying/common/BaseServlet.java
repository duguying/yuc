package net.duguying.common;

import javax.servlet.*;
import java.io.IOException;

import net.duguying.common.SqlHelper;

/**
 * Created by rex on 2015/1/18.
 */
public class BaseServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        SqlHelper sql = new SqlHelper();
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
