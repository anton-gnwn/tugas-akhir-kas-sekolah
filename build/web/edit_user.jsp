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
        <h1 align="center">UBAH DATA USER</h1>
        <hr>
        <br>
        <form method="POST" action="userServlet"> 
            <table border="0"> 
                
                <tr>     
                    <td>Id User</td>     
                    <td>:</td>     
                    <td><input type="text" name="id_user" value="<%=id_user%>" readonly id="input">
                        
                    </td> 
                </tr> 
                <tr>     
                    <td>Nama User</td>     
                    <td>:</td>     
                    <td><input type="text" name="nama_user" id="input" value="<%=nama_user%>"></td> 
                </tr>
                <tr>     
                    <td>Hak Akses</td>     
                    <td>:</td>     
                    <td><%
                        if (hak_akses.equalsIgnoreCase("Kepala Sekolah")) {
                        %>

                        <select name="hak_akses" id="input">     
                            <option value="Pilih Akses">=Pilih Akses=</option>     
                            <option value="Kepala Sekolah" selected="Kepala Sekolah">Kepala Sekolah</option>     
                            <option value="Kepala Tata Usaha">Kepala Tata Usaha</option> 
                            <option value="Bendahara">Bendahara</option> 
                        </select>
                        <% } else if (hak_akses.equalsIgnoreCase("Kepala Tata Usaha")) { %>
                        <select name="hak_akses" id="input">     
                            <option value="Pilih Akses">=Pilih Akses=</option>     
                            <option value="Kepala Sekolah">Kepala Sekolah</option>     
                            <option value="Kepala Tata Usaha" selected="Kepala Tata Usaha">Kepala Tata Usaha</option> 
                            <option value="Bendahara">Bendahara</option>      
                        </select>
                        <% } else { %>
                        <select name="hak_akses" id="input">     
                            <option value="Pilih Akses">=Pilih Akses=</option>     
                            <option value="Kepala Sekolah">Kepala Sekolah</option>     
                            <option value="Kepala Tata Usaha">Kepala Tata Usaha</option> 
                            <option value="Bendahara" selected="Bendahara">Bendahara</option>      
                        </select>
                        <% }%>
                    </td> 
                </tr>
                <tr>    
                    <td><a href="beranda.jsp?hal=tampil_user" id="hijau"><i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td> 
                    <td></td>     
                    <td><input type="submit" name="aksi" value="Update" id="biru">
                        <a href="beranda.jsp?hal=tampil_user" id="hijau">Lihat Data</a>
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