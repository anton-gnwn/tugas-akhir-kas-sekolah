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
        <form method="post" action="kategoriServlet"> 
            <h1 align="center"> TAMBAH DATA KATEGORI</h1><br>
            <hr>
            <table border="0" width="600"> 
                <tr>     
                    <td>ID Kategori</td>
                    <td>
                        <%
                            try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(id_kategori,2)) as no FROM kategori");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' id='input' "
                                                    + "readonly value='KG01' name='id_kategori'>");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 3 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "KG" + nomorkm;
                                            out.println("<input type='text' class='form-control' id='input' "
                                                    + "readonly value='" + nomerkm + "'name='id_kategori'>");
                                        }
                                    }
                                } catch (Exception e) {
                                    out.println(e);
                                }


                        %></td>
                </tr> 
                <tr>     
                    <td>Nama Kategori</td>     
                    <td><input type="text" name="nama_kategori" id="input" required></td> 
                </tr>            
                <tr>    
                <tr>     
                    <td>Nominal</td>     
                    <td><input type="text" name="nominal" id="input" required></td> 
                </tr>            
                <tr>    
                    <td><a href="beranda.jsp?hal=tampil_kategori" id="hijau">
                            <i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td>     
                    <td><input type="submit" name="aksi" value="Simpan" id="biru"> 
                        <input type="reset" value="Batal" id="merah"></td> 
                </tr> 
            </table> 
        </form>

    </body>
</html>
