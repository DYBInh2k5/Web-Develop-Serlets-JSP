/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cody Empire
 */
@WebServlet(name = "SumServlet", urlPatterns = {"/SumServlet"})
public class SumServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Xử lý tiếng Việt
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // Lấy dữ liệu từ form
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");

        // Chuyển sang kiểu số và tính tổng
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int sum = a + b;

        // Gửi kết quả về trình duyệt
        try (PrintWriter out = response.getWriter()) {
            out.println("<h2>Kết quả:</h2>");
            out.println("<p>Tổng của " + a + " + " + b + " = <b>" + sum + "</b></p>");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int sum = a + b;

        try (PrintWriter out = response.getWriter()) {
            out.println("<h2>Kết quả (POST):</h2>");
            out.println("<p>Tổng của " + a + " + " + b + " = <b>" + sum + "</b></p>");
        }
    }
}
