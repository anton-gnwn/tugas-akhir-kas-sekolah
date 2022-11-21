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

    <center><h1>DATA USER</h1><br></center>
    <hr>

    <table width="90%" border="0" align="center">
        <tr>
            <td><%-- <a href="beranda.jsp?hal=input_user" id="biru" ><i class="fas fa-plus-circle"></i> TAMBAH DATA</a> --%> </td>
            <td><i class="fas fa-search"></i></td>
            <td><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td>
        </tr>
    </table>
    <table width="90%" border="1" align="center" class="display">
        <thead>    
            <tr align="center">
                <th>ID USER</th>
                <th>NAMA USER</th>
                <th>HAK AKSES</th>
                <th>AKSI</th>
            </tr>
        </thead>

        <%
            String id_user = null;
            String nama_user = null;
            String hak_akses = null;
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM user ORDER BY id_user asc");

            while (rs.next()) {
                id_user = rs.getString("id_user");
                nama_user = rs.getString(2);
                hak_akses = rs.getString(4);
        %> 

        <tbody  id="dataTable">
            <tr id="klik">          
                <td align="center"><% out.println(id_user); %></center></td>      
                <td><% out.println(nama_user); %></td>      
                <td><% out.println(hak_akses); %></td>      
                <td align="center"><a href="beranda.jsp?hal=edit_user&id_user=<% out.print(id_user); %>" id="hijau">EDIT</a>
                    <a href="userServlet?aksi=Delete&id_user=<% out.print(id_user);%>" id="merah">HAPUS</a>
                </td>      


            </tr>
        </tbody>

        <% } %>
    </table>

    <% kon.close();%> 
</body>
</html>



