<%@page import="java.sql.ResultSet"%>
<%@page import="control.koneksi"%>
<%@page import="model.pembayaran"%>
<%@page import="model.siswa"%>
<%@page import="model.kategori"%>
<%@page import="model.user"%>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script src="js/jquery.min.js"></script>

<%
    siswa siswa = new siswa();
    pembayaran pem = new pembayaran();
    kategori kategori = new kategori();
    user usr = new user();
    koneksi kon = new koneksi();
    ResultSet rs = null;
%> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">LAPORAN PENERIMAAN KAS BULANAN</h1>
        <br>
        <hr>
        
        <table width="90%" border="0" align="center">
            <tr>
                
                 <% 
                    String tgl_trans = request.getParameter("tgl_trans");
                    String pbulan = request.getParameter("pbulan");
                    String ptahun = request.getParameter("ptahun");
                    
                    rs = kon.stmt.executeQuery("SELECT * FROM pembayaran JOIN detail_pembayaran ON pembayaran.notrans=detail_pembayaran.notrans "
                        + "JOIN siswa ON detail_pembayaran.nis=siswa.nis "
                        + "JOIN kategori ON pembayaran.id_kategori=kategori.id_kategori "
                        + "JOIN user ON pembayaran.id_user=user.id_user WHERE month(tgl_trans)='"+pbulan+"' AND year(tgl_trans)='"+ptahun+"' ORDER BY tgl_trans ASC ");

                    
                    if (rs.next()) {
                    tgl_trans = rs.getString(2);
                %>
                <td width="40"><h3>Bulan</h3></td>
                <td width="100">
                    <%!
                        String bt;
                    %>
                    <h3>:
                    <% 
                        
                         
                        if (pbulan.equals("01"))
                        {
                           bt="Januari"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("02"))
                        {
                           bt="Februari"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("03"))
                        {
                           bt="Maret"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("04"))
                        {
                           bt="April"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("05"))
                        {
                           bt="Mei"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("06"))
                        {
                           bt="Juni"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("07"))
                        {
                           bt="Juli"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("08"))
                        {
                           bt="Agustus"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("09"))
                        {
                           bt="September"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("10"))
                        {
                           bt="Oktober"; 
                           out.println(bt);
                        }
                        else if (pbulan.equals("11"))
                        {
                           bt="November"; 
                           out.println(bt);
                        }
                        else
                        {
                           bt="Desember"; 
                           out.println(bt);
                        }
                        %></h3>
                </td>
                <td rowspan="2"><i class="fas fa-search"></i></td>
                <td rowspan="2"><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td></tr>
            <tr>
                <td><h3>Tahun</h3></td>
                <td><h3>: <% out.println(ptahun); %></h3></td>
            </tr>
                <% } %>
        </table>
        <table width="90%" border="1" align="center" id="table-tampil">   
            <thead>
                <tr height="50">
                    <th width="80">No Transaksi</th>   
                    <th width="80">Tgl. Transaksi</th>  
                    <th>NIS</th>  
                    <th>Nama</th>  
                    <th width="50">Jenis Kategori</th>   
                    <th>Nominal</th>  
                    <th>Dibayar</th>  
                    <th>Sisa</th>  
                    <th>Status</th>  
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
                        + "JOIN siswa ON detail_pembayaran.nis=siswa.nis "
                        + "JOIN kategori ON pembayaran.id_kategori=kategori.id_kategori "
                        + "JOIN user ON pembayaran.id_user=user.id_user WHERE month(tgl_trans)='"+pbulan+"' AND year(tgl_trans)='"+ptahun+"' ORDER BY tgl_trans ASC ");

                while (rs.next()) {
                    notrans = rs.getString("notrans");
                    tgl_trans = rs.getString("tgl_trans");
                    id_kategori = rs.getString(3);
                    status = rs.getString(4);
                    keterangan = rs.getString(5);
                    nis = rs.getString(8);
                    total_pem = rs.getString(9);
                    dibayar = rs.getString(10);
                    kembali = rs.getString(11);
                    nama_siswa = rs.getString(13);
                    nama_kategori = rs.getString(21);
                    id_user = rs.getString(24);
            %>
            <tbody id="dataTable">
                <tr id="klik">
                    <td align="center"><% out.println(notrans); %></td>
                    <td align="center"><% out.println(tgl_trans); %></td>
                    <td align="center"><% out.println(nis); %></td>
                    <td><% out.println(nama_siswa); %></td>
                    <td align="center" width="40"><% out.println(nama_kategori); %></td>
                    <td align="right">Rp. <% out.println(total_pem); %></td>
                    <td align="right">Rp. <% out.println(dibayar); %></td>
                    <td align="right">Rp. <% out.println(kembali); %></td>
                    <td align="center"><% out.println(status);
                        
                        if (status.equals("Lunas"))
                        {
                            out.print("<i class='fas fa-check-circle' style='color: limegreen; font-size: 16px;'></i>"); 
                        } else if (status.equals("Belum Lunas"))
                        {
                            out.print("<i class='fas fa-minus-circle' style='color: red; font-size: 16px;'></i>");
                        }
                        
                        %></td>
                    <td align="center"><% out.println(keterangan); %></td>
                    <td align="center"><% out.println(id_user); %></td>
                </tr>

                <% } %>
                   
                
            </tbody>
        </table>
    </body>
</html>