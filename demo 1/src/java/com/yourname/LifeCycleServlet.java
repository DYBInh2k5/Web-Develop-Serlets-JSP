/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.yourname;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LifeCycleServlet", urlPatterns = {"/life"}, loadOnStartup = 1)
public class LifeCycleServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println(">> LifeCycleServlet.init() chạy — servlet được khởi tạo");
        // Có thể lưu thời gian khởi tạo:
        getServletContext().setAttribute("lifeInitTime", System.currentTimeMillis());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println(">> LifeCycleServlet.service() — xử lý request");
        super.service(req, resp); // gọi doGet/doPost phù hợp
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<h1>LifeCycleServlet — doGet()</h1>");
            Object t = getServletContext().getAttribute("lifeInitTime");
            out.println("<p>init time: " + t + "</p>");
            out.println("<p>Context path: " + request.getContextPath() + "</p>");
        }
    }

    @Override
    public void destroy() {
        System.out.println(">> LifeCycleServlet.destroy() — servlet bị hủy");
    }
}