<%-- 
    Document   : login
    Created on : Oct 14, 2025, 8:40:02 AM
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
    <h2>Form Đăng nhập (method = POST)</h2>

    <form action="login" method="post">
        Username: <input type="text" name="user"><br><br>
        Password: <input type="password" name="pass"><br><br>
        <button type="submit">Đăng nhập</button>
    </form>
</body>
</html>