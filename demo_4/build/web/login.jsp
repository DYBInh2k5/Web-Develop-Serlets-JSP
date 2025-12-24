<%-- 
    Document   : login.jsp
    Created on : Oct 21, 2025, 8:31:15 AM
    Author     : Cody Empire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
</head>
<body>
    <h2>Form Đăng Nhập</h2>
    <form action="LoginServlet" method="post">
        Tên đăng nhập: <input type="text" name="username" required><br><br>
        Mật khẩu: <input type="password" name="password" required><br><br>
        <input type="submit" value="Đăng nhập">
    </form>
</body>
</html>
