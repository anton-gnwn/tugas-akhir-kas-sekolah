<%-- 
    Document   : login
    Created on : May 5, 2019, 10:43:00 AM
    Author     : anton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Login</title>
    </head>
    <link rel="stylesheet" type="text/css" href="config/login1.css" media="screen"/>
    <body>
        <div class="loginBox">
            <form method="post" action="login?proses=login">
                <img class="user" src="img/logo-mts.png" />
                <h2>Login Administrasi</h2>
                <p>Username</p>
                <input type="text" name="nama_user" placeholder="Masukkan Username" required>
                <p>Password</p>
                <input type="password" name="password" placeholder="***************" required>
                <input type="submit" name="submit" value="Login">
                <p align="center">Belum punya akun? <a href="daftar_user.jsp" style="color: blue; font-size: 16px;">Daftar</a></p>   
            </form>
        </div>
    </body>
</html>
