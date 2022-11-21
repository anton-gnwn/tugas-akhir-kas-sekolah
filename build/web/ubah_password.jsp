<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<script src="js/jquery.min.js"></script>

<%
    String id_user = request.getParameter("id_user");
    String nama_user = null;
    String hak_akses = null;
    String password = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM user where id_user= '" + id_user + "'");
    if (rs.next()) {
        id_user = rs.getString(1);
        nama_user = rs.getString(2);
        password = rs.getString(3);
        hak_akses = rs.getString(4);
    }
%>
<html>
    <head>
        <title>Ubah Data User</title>
    </head>
    <body>
        <h1 align="center">UBAH PASSWORD</h1>
        <hr>
        <br>
        <form method="POST" action="userServlet"> 
            <table border="0"> 
                
                <tr>     
                    <td>Id User</td>     
                    <td>:</td>     
                    <td><input type="text" name="id_user" id="input" value="<%=id_user%>" readonly="readonly">
                    </td> 
                </tr> 
                <tr>     
                    <td>Nama User</td>     
                    <td>:</td>     
                    <td><input type="text" name="nama_user" id="input" value="<%=nama_user%>" readonly="readonly"></td> 
                </tr>
                <tr>     
                    <td>Hak Akses</td>     
                    <td>:</td>     
                    <td><input type="text" name="hak_akses" id="input" value="<%=hak_akses%>" readonly="readonly">
                    </td> 
                </tr>
                <tr>     
                    <td>Password</td>     
                    <td>:</td>     
                    <td width="200"><input type="password" name="password" id="pass" value="<%=password%>"  style="width: 232px; height: 25px;"></td>
                    <td><input type="checkbox" class="form-checkbox1"> Show Password</td>
                </tr>
                    
                </tr>
                <tr>
                    <td>Konfirmasi Password</td>
                    <td>:</td>
                    <td><input type="password" id="konpass"  style="width: 232px; height: 25px;"></td>
                    <td><input type="checkbox" class="form-checkbox2"> Show Password</td>
                </tr>
                
                <tr>    
                    <td></td> 
                    <td></td>     
                    <td><input type="submit" name="aksi" value="Ubah" id="biru">
                    </td> 
                </tr> 
            </table>
        </form>
        <script>
            $(function () {
                $("#biru").click(function () {
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