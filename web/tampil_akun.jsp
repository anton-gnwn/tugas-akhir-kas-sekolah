<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman | Data Guru</title>

    </head>
    <script src="js/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $("#myInput").on("keyup", function () {
                var value = $(this).val().toLowerCase();
                $("#dataTable tr").filter(function () {
                    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                });
            });
        });
    </script>
    <body>

    <center><h1>DATA AKUN</h1><br></center>
    <hr>

    <table width="90%" border="0" align="center">
        <tr>
            <td><a href="beranda.jsp?hal=input_akun" id="biru" ><i class="fas fa-plus-circle"></i> TAMBAH DATA</a></td>
            <td><i class="fas fa-search"></i></td>
            <td><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td>
        </tr>
    </table>
    <table width="90%" border="1" align="center" class="display">
        <thead>    
            <tr align="center">
                <th>NO AKUN</th>
                <th>NAMA AKUN</th>
                <th>TIPE AKUN</th>
                <th>AKSI</th>
            </tr>
        </thead>

        <%
            String no_akun = null;
            String nama_akun = null;
            String tipe_akun = null;
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM akun ORDER BY no_akun asc");

            while (rs.next()) {
                no_akun = rs.getString("no_akun");
                nama_akun = rs.getString(2);
                tipe_akun = rs.getString(3);
        %> 

        <tbody  id="dataTable">
            <tr id="klik">          
                <td><% out.println(no_akun); %></center></td>      
                <td><% out.println(nama_akun); %></td>      
                <td><% out.println(tipe_akun); %></td>      
                <td align="center"><a href="beranda.jsp?hal=edit_akun&no_akun=<% out.print(no_akun); %>" id="hijau">EDIT</a>
                    <a href="akunServlet?aksi=Delete&no_akun=<% out.print(no_akun);%>" id="merah">HAPUS</a>
                </td>      


            </tr>
        </tbody>

        <% } %>
    </table>

    <% kon.close();%> 
</body>
</html>



