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
    <table width="90%" border="1" align="center" id="table-tampil">   
            
        <% 
            String tgl_trans = null;
            
            ResultSet rs = null;
            koneksi kon = new koneksi();

            rs = kon.stmt.executeQuery("SELECT * FROM pembayaran WHERE tgl_trans='" + tgl_trans + "' ");

            if (rs.next()) {
                tgl_trans = rs.getString(2);
        %>
        <tr>
            <td>Tanggal</td>
            <td>:</td>
            <td align="center"><% out.println(tgl_trans); %></td>
        </tr>
        <% } %>
        
        
            <thead>
                <tr height="50">
                    <th width="80">No Transaksi</th> 
                    <th width="60">Nama Kategori</th>   
                    <th>Jumlah</th>   
                    <th>Keterangan</th>  
                    <th>Admin</th> 
                </tr>  
            </thead>
            <%
                String notrans = null;
                
                String nis = null;
                String id_kategori = null;
                String total_pem = null;
                String dibayar = null;
                String kembali = null;
                String status = null;
                String keterangan = null;
                String nama_kategori = null;
                String nama_siswa = null;
                String id_user = null;
                
                
                rs = kon.stmt.executeQuery("SELECT * FROM pembayaran JOIN detail_pembayaran ON pembayaran.notrans=detail_pembayaran.notrans "
                        + "JOIN kategori ON pembayaran.id_kategori=kategori.id_kategori "
                        + "JOIN user ON pembayaran.id_user=user.id_user WHERE pembayaran='"+tgl_trans+"' ORDER BY tgl_trans ASC");

                while (rs.next()) {
                    notrans = rs.getString("notrans");
                    id_kategori = rs.getString(3);
                    status = rs.getString(4);
                    keterangan = rs.getString(5);
                    nis = rs.getString(8);
                    total_pem = rs.getString(9);
                    dibayar = rs.getString(10);
                    kembali = rs.getString(11);
                    nama_siswa = rs.getString(13);
                    nama_kategori = rs.getString(21);
                    id_user = rs.getString(23);
            %>
            <tbody id="dataTable">
                <tr id="klik">
                    <td align="center"><% out.println(notrans); %></td>
                    <td align="center"><% out.println(nama_kategori); %></td>
                    <td align="right">Rp. <% out.println(dibayar); %></td>
                    
                    <td align="center"><% out.println(keterangan); %></td>
                    <td align="center"><% out.println(id_user); %></td>
                    
                </tr>

                <% } %>
                   
                
            </tbody>
        </table>

    <% kon.close();%> 
</body>
</html>



