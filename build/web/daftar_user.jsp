<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script src="js/jquery.min.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Data User </title>
    </head>
    <link rel="stylesheet" type="text/css" href="config/login2.css" media="screen"/>
    <body>

        <div class="loginBox">
        <form method="post" action="userServlet">
            <h2> DAFTAR USER </h2>
            <table border="0">
                <tr>
                    <td>ID USER</td>
                    <td>
                        <%
                            try {
                                ResultSet rs = null;
                                koneksi kon = new koneksi();
                                rs = kon.stmt.executeQuery("select max(right(id_user,4)) as no FROM user");
                                while (rs.next()) {
                                    if (rs.first() == false) {
                                        out.println("<input type='text' id='input' readonly value='USR0001' name='id_user'>");
                                    } else {
                                        rs.last();
                                        int autonokm = rs.getInt(1) + 1;
                                        String nomorkm = String.valueOf(autonokm);
                                        int noLong = nomorkm.length();
                                        for (int a = 1; a < 5 - noLong; a++) {
                                            nomorkm = "0" + nomorkm;
                                        }
                                        String nomerkm = "USR" + nomorkm;
                                        out.println("<input type='text' id='inputEmail3' readonly value='" + nomerkm + "'name='id_user'>");
                                    }
                                }
                            } catch (Exception e) {
                                out.println(e);
                            }

                        %></td>

                </tr>
                <tr>
                    <td> Nama User</td>
                    <td><input type="text" name="nama_user"></td>
                </tr>
                <tr>
                    <td>Hak Akses</td>
                    <td>
                        <select name="hak_akses" id="input">
                            <option value="#">- Pilih Akses -</option>   
                            <option value="Kepala Sekolah">Kepala Sekolah</option>     
                            <option value="Kepala Tata Usaha">Kepala Tata Usaha</option>    
                            <option value="Bendahara">Bendahara</option>    
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" id="pass"><input type="checkbox" class="form-checkbox1"> Show Password</td>
                </tr>
                
                <tr>
                    <td>Konfirmasi Password</td>
                    <td><input type="password" id="konpass"><input type="checkbox" class="form-checkbox2"> Show Password</td>
                </tr>
                
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" name="aksi" value="Daftar" id="save">
                        <input type="reset" value="Batal">
                    </td>
                </tr>  
            </table>
                        <p align="center">Sudah punya akun? <a href="login.jsp">Login</a></p>
        </form>
        </div>
        <script>
            $(function () {
                $("#save").click(function () {
                    var password = $("#pass").val();
                    var konfirm = $("#konpass").val();
                    if (password != konfirm) {
                        alert("Konfirmasi Password Tidak Cocok.");
                        return false;
                    }
                    return true;
                })
            })

            $(document).ready(function () {
                var cek = $(".form-checkbox1").val();
                $(".form-checkbox1").click(function () {
                    if ($(this).is(":checked")) {
                        $("#pass").attr("type", "text");
                    } else {
                        $("#pass").attr("type", "password");
                    }
                })
            })

            $(document).ready(function () {
                var cek = $(".form-checkbox2").val();
                $(".form-checkbox2").click(function () {
                    if ($(this).is(":checked")) {
                        $("#konpass").attr("type", "text");
                    } else {
                        $("#konpass").attr("type", "password");
                    }
                })
            })
        </script>
    </body>
</html>