package com.aprn.servlets;
import jakarta.servlet.Servlet;
import jakarta.servlet.annotation.WebServlet;

import javax.servlet.*;
import java.io.IOException;

public class FirstServlet  implements Servlet {

    private transient jakarta.servlet.ServletConfig config;
//    private transient ServletConfig config;

//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        this.config=config;
//
//    }



    @Override
    public void init(jakarta.servlet.ServletConfig servletConfig) throws jakarta.servlet.ServletException {
        this.config=config;
    }

    @Override
    public jakarta.servlet.ServletConfig getServletConfig() {
        return config;
    }


//    @Override
//    public ServletConfig getServletConfig() {
//        return config;
//    }

    @Override
    public void service(jakarta.servlet.ServletRequest request, jakarta.servlet.ServletResponse response)
            throws jakarta.servlet.ServletException, IOException {

//      getServletConfig().getServletContext().getRequestDispatcher("/page_header").include(request, response);
        response.getWriter().println("<h1>You are inside the servlet</h1>");
        response.getWriter().println("<h2>You are inside the servlet</h2>");
    }

//    @Override
//    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//        response.getWriter().println("<h1>You are inside the servlet</h1>");
//        response.getWriter().println("<h2>You are inside the servlet</h2>");
//
//    }

    @Override
    public String getServletInfo() {
        return "First Servlet";
    }

    @Override
    public void destroy() {

    }
}
