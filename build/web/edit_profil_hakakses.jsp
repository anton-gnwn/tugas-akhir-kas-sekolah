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
                    <td></td> 
                    <td></td>     
                    <td><input type="submit" name="aksi" value="Update" id="biru">
                    </td> 
                </tr> 
            </table>
                        <input type="hidden" name="id_user" value="<%=id_user%>"/>
                        <input type="hidden" name="nama_user" value="<%=nama_user%>"/>
                        <input type="hidden" name="password" value="<%=password%>"/>
        </form>
        
    </body>
</html>