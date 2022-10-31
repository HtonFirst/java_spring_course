package com.aprn.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
"/something"                    /something

"/something/*"                  /something/first
                                /something/second
                                /something/.../.../..abc

"*.jpeg" "*.html"               /abc.jpeg  /abc.html

""                              /
"/"                             будут обработаны все внешние запросы
"/*"                            будут обработаны все внешние и все внутренние запросы

 */
import java.io.IOException;
@WebServlet("/first_http_servlet")
public class FirstHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/page_header").include(req, resp);

        resp.getWriter().println("<h2>You are inside Http-Servlet</h2>");
        resp.getWriter().println("<h2>Вы внутри Http Сервлета</h2>");

        resp.getWriter().println("<p>contextPath: " + req.getContextPath() + "</p>");
        resp.getWriter().println("<p>servletPath: " + req.getServletPath() + "</p>");
        resp.getWriter().println("<p>pathInfo: " + req.getPathInfo() + "</p>");
        resp.getWriter().println("<p>queryString: " + req.getQueryString() + "</p>");

        resp.getWriter().println("<p>param 0ne: " + req.getParameter("name") + "</p>");
        resp.getWriter().println("<p>param two: " + req.getParameter("question") + "</p>");

//        resp.sendRedirect(req.getContextPath() + "/first_servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
