<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%
    String id_kategori = request.getParameter("id_kategori");
    String nama_kategori = null;
    String nominal = null;
    
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM kategori where id_kategori= '" + id_kategori + "'");
    if (rs.next()) {
        id_kategori = rs.getString(1);
        nama_kategori = rs.getString(2);
        nominal = rs.getString(3);
    }
%>
<html>
    <head>
        <title>Halaman | Ubah Data Guru</title>
    </head>
    <body>
        <form method="POST" action="kategoriServlet"> 
            <h1 align="center"> UBAH DATA JENIS BAYAR</h1><br>
            <hr>
            <table border="0"> 
                <td>ID kategori</td>     
                <td>:</td>     
                <td><input type="text" values="<%=id_kategori%>" id="input" readonly >
                    <input type="hidden" name="id_kategori" value="<%=id_kategori%>"/>
                </td> 
                </tr> 
                <tr>     
                    <td>Nama kategori</td>     
                    <td>:</td>     
                    <td><input type="text" name="nama_kategori" value="<%=nama_kategori%>" id="input"></td> 
                </tr>
                <tr>     
                    <td>Nominal</td>     
                    <td>:</td>     
                    <td><input type="text" name="nominal" value="<%=nominal%>" id="input"></td> 
                </tr>

                <tr>    
                    <td><a href="beranda.jsp?hal=tampil_kategori" id="hijau"><i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td> 
                    <td></td>     
                    <td><input type="submit" name="aksi" value="Update" id="biru">
                        <a href="beranda.jsp?hal=tampil_kategori" id="hijau">Lihat Data</a>
                    </td> 
                </tr> 
            </table>
        </form>
    </body>
</html>