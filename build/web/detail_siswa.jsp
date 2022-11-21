<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MTS NURUL YAQIIN | Data Detail Siswa</title>
    </head>
    <body>

    <center><h1>DATA DETAIL SISWA</h1><br></center>
    <hr>
    <%
        String nis = request.getParameter("nis");
        String nama_siswa = null;
        String tempat = null;
        String tgl_lahir = null;
        String jenis_kelamin = null;
        String alamat = null;
        String no_telp = null;
        String kelas = null;
        
        ResultSet rs = null;
        koneksi kon = new koneksi();

        rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE nis='" + nis + "' ORDER BY nis asc");

        if (rs.next()) {
            nis = rs.getString(1);
            nama_siswa = rs.getString(2);
            tempat = rs.getString(3);
            tgl_lahir = rs.getString(4);
            jenis_kelamin = rs.getString(5);
            alamat = rs.getString(6);
            no_telp = rs.getString(7);
            kelas = rs.getString(8);
        }
    %> 
    <br>
    <table id="table-siswa" border="0">
        <th colspan="3">Data Pribadi</th>
        <tr>
            <td width="170px">NIS</td>
            <td width="5px">:</td>
            <td width="200px"><% out.println(nis); %></td>      
        </tr>
        <tr>
            <td>Nama Siswa</td>
            <td>:</td>
            <td><% out.println(nama_siswa); %></td>      
        </tr>
        <tr>
            <td>Tempat Tanggal Lahir</td>
            <td>:</td>
            <td><%out.println(tempat+",");%> <% out.println(tgl_lahir); %></td>      
        </tr>
        <tr>
            <td>Jenis Kelamin</td>
            <td>:</td>
            <td><% out.println(jenis_kelamin); %></td>
        </tr>
        <tr>
            <td>Alamat</td>
            <td>:</td>
            <td><% out.println(alamat); %></td>      
        </tr>
        <tr>
            <td>No Telepon</td>
            <td>:</td>
            <td><% out.println(no_telp); %></td>
        </tr>
        <tr>
            <td>Kelas</td>
            <td>:</td>
            <td><% out.println(kelas); %></td>     
        </tr>
        
    </table>

            
        <div class="table-detail">
    <table id="spp-detail-siswa" border="0">   
        <tr align="center">    
            <th>Riwayat Transaksi</th>   
        </tr>
    </table>
    <br>
    <table id="spp-detail-siswa" border="1" class="display">
        <tr>
            <th width="15">No</th>
            <th width="80">No Transaksi</th>     
            <th width="80">Tgl. Transaksi</th>  
            <th>Jenis Kategori</th>  
            <th width="80">Nominal</th>   
            <th width="80">Dibayar</th>   
            <th width="80">Sisa Pemb.</th>   
            <th>Status</th>  
            <th>Keterangan</th>  
        </tr>    
        <%

            String notrans = null;
            String tgl_trans = null;
            String id_kategori = null;
            String total_pem = null;
            String dibayar = null;
            String kembali = null;
            String status = null;
            String keterangan = null;
            String nama_kategori = null;

            rs = kon.stmt.executeQuery("SELECT * FROM pembayaran JOIN detail_pembayaran ON pembayaran.notrans=detail_pembayaran.notrans "
                        + "JOIN siswa ON detail_pembayaran.nis=siswa.nis "
                        + "JOIN kategori ON pembayaran.id_kategori=kategori.id_kategori WHERE detail_pembayaran.nis='"+nis+"' ORDER BY tgl_trans ASC");

            while (rs.next()) {
                    notrans = rs.getString("notrans");
                    tgl_trans = rs.getString(2);
                    status = rs.getString(4);
                    keterangan = rs.getString(5);
                    total_pem = rs.getString(9);
                    dibayar = rs.getString(10);
                    kembali = rs.getString(11);
                    nama_kategori = rs.getString(21);

        %>
        <tr align="center" id="klik">

        <td>.</td>
        <td align="center"><% out.println(notrans); %></td>
        <td align="center"><% out.println(tgl_trans); %></td>
        <td align="center"><% out.println(nama_kategori); %></td>
        <td align="right">Rp. <% out.println(total_pem); %></td>
        <td align="right">Rp. <% out.println(dibayar); %></td>
        <td align="right">Rp. <% out.println(kembali); %></td>
        <td><% out.println(status);

            if (status.equals("Lunas")) {
                out.print("<i class='fas fa-check-circle' style='color: limegreen; font-size: 16px;'></i>");
            } else if (status.equals("Belum Lunas")) {
                out.print("<i class='fas fa-minus-circle' style='color: red; font-size: 16px;'></i>");
            }

            %></td>
        <td align="center"><% out.println(keterangan); %></td>
    </tr>
    <% }%>
</table>
    <%--
<table border="0" id="menghitung">
        <%
                
                rs = kon.stmt.executeQuery("SELECT SUM(nominal) AS nominal FROM spp WHERE nis='"+nis+"'");

                if (rs.next()) {
                    (nominal) = rs.getString("nominal");
            %>
    <tr>
        <th width="425"><i>Total yang sudah dibayarkan</i></th>
        <th align="right" width="115">Rp. <% out.println(nominal); %> </th>
        <th></th>
    </tr>
    <% } %>
</table>
    --%>
</div>
            

<table>
    <tr>
        <td><a href="beranda.jsp?hal=tampil_siswa" id="hijau"><i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td>
    </tr>
</table>


</table> 
</body>
</html>
