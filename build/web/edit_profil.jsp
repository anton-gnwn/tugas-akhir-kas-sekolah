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
        <h1 align="center">EDIT PROFIL</h1>
        <hr>
        <br>
        <form method="POST" action="userServlet"> 
            <table border="0"> 
                
                <tr>     
                    <td>Id User</td>     
                    <td>:</td>     
                    <td><div class="nojurnal"><input type="text" name="id_user" value="<%=id_user%>" readonly id="input">
                        </div>    
                    </td> 
                </tr> 
                <tr>     
                    <td width="200">Nama User</td>     
                    <td width="40">:</td>     
                    <td width="120"><% out.println(nama_user); %></td> 
                    <td><a href="beranda.jsp?hal=edit_profil_namauser&id_user=<% out.print(id_user); %>" id="hijau">EDIT</a></td>
                </tr>
                <tr>     
                    <td>Hak Akses</td>     
                    <td>:</td>     
                    <td><% out.println(hak_akses); %></td> 
                    <td><a href="beranda.jsp?hal=edit_profil_hakakses&id_user=<% out.print(id_user); %>" id="hijau">EDIT</a></td>
                </tr>
                <tr>     
                    <td>Password</td>     
                    <td>:</td>     
                    <td>**********</td>
                    <td><a href="beranda.jsp?hal=edit_profil_password&id_user=<% out.print(id_user); %>" id="hijau">EDIT</a></td>
                    
                </tr>
                <tr>
                    <td colspan="4"><hr></td>
                </tr>
                <tr>    
                    <td>Hapus Akun</td> 
                    <td></td>     
                    <td><input type="submit" name="aksi" value="Hapus User" id="merah">
                        
                    </td> 
                </tr> 
            </table>
        </form>
        <%-- 
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
        --%>
    </body>
</html>