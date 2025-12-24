<%-- 
    Document   : login.jsp
    Created on : Oct 28, 2025, 9:05:26 AM
    Author     : Cody Empire
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Đăng nhập</h2>
    <form action="login" method="post">
        Username: <input type="text" name="username" required><br><br>
        Password: <input type="password" name="password" required><br><br>
        <input type="submit" value="Login">
    </form>

    <p style="color:red;">
        ${error}
    </p>
</body>
</html>

