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
        <h1 align="center">EDIT NAMA USER</h1>
        <hr>
        <br>
        <form method="POST" action="userServlet"> 
            <table border="0"> 


                <tr>     
                    <td>Nama User</td>     
                    <td>:</td>     
                    <td><input type="text" name="nama_user" id="input" value="<%=nama_user%>"></td> 
                </tr>
                <tr>    
                    <td></td> 
                    <td></td>     
                    <td><input type="submit" name="aksi" value="Update" id="biru">
                    </td> 
                </tr> 
            </table>
            <input type="hidden" name="id_user" value="<%=id_user%>"/>
            <input type="hidden" name="hak_akses" value="<%=hak_akses%>"/>
            <input type="hidden" name="password" value="<%=password%>"/>
        </form>

    </body>
</html>