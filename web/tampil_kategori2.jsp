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

    <center><h1>DATA KATEGORI</h1><br></center>
    <hr>

    <table width="90%" border="0" align="center">
        <tr>
            <td></td>
            <td><i class="fas fa-search"></i></td>
            <td><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td>
        </tr>
    </table>
    <table width="90%" border="1" align="center" class="display">
        <thead>    
            <tr align="center">
                <th height="30px">ID KATEGORI</th>
                <th>NAMA KATEGORI</th>
                <th>NOMINAL</th>
        </thead>

        <%
            String id_kategori = null;
            String nama_kategori = null;
            String nominal = null;
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM kategori ORDER BY id_kategori asc");

            while (rs.next()) {
                id_kategori = rs.getString("id_kategori");
                nama_kategori = rs.getString(2);
                nominal = rs.getString(3);
        %> 

        <tbody  id="dataTable">
            <tr id="klik">          
                <td align="center"><% out.println(id_kategori); %></center></td>      
                <td><% out.println(nama_kategori); %></td>      
                <td>Rp. <% out.println(nominal); %></td>   


            </tr>
        </tbody>

        <% } %>
    </table>

    <% kon.close();%> 
</body>
</html>



