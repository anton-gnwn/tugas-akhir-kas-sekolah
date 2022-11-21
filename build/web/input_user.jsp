
<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MTS NURUL YAQIIN | Tambah Data Guru</title>
    </head>
    <body>
        <form method="post" action="userServlet"> 
            <h1 align="center"> TAMBAH DATA USER</h1><br>
            <hr>
            <table border="0" width="600"> 
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
                                        out.println("<input type='text' id='input' readonly value='" + nomerkm + "'name='id_user'>");
                                    }
                                }
                            } catch (Exception e) {
                                out.println(e);
                            }

                        %></td>
                </tr> 
                <tr>     
                    <td>Nama User</td>
                    <td><input type="text" name="nama_user" id="input" required></td> 
                </tr>            
                <tr>    
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
                    <td><input type="password" name="password" id="pass" required style="width: 232px; height: 25px;"> 
                        <input type="checkbox" class="form-checkbox1"> Show Password</td>
                </tr>
                <tr>
                    <td>Konfirmasi Password</td>
                    <td><input type="password" id="konpass" style="width: 232px; height: 25px;"> 
                        <input type="checkbox" class="form-checkbox2"> Show Password</td>
                </tr>
                <tr>
                    <td><a href="beranda.jsp?hal=tampil_user" id="hijau"><i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td> 
                       
                    <td><input type="submit" name="aksi" value="Simpan" id="biru"><input type="reset" value="Batal" id="merah"></td>  
                </tr>   
            </table> 
        </form>
    </body>
</html>
