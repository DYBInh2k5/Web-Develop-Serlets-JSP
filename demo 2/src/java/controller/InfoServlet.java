package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InfoServlet", urlPatterns = "/info")
public class InfoServlet extends HttpServlet {

    // Hàm xử lý chung cho cả GET và POST
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");  // Đảm bảo tiếng Việt không lỗi

        // Lấy tham số từ form
        String hoten = request.getParameter("hoten");
        String tuoi  = request.getParameter("tuoi");

        if (hoten == null) hoten = "";
        if (tuoi == null) tuoi = "";

        // Gửi sang JSP
        request.setAttribute("ten", hoten);
        request.setAttribute("tuoi", tuoi);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "InfoServlet handles form input and forwards to result.jsp";
    }
}
