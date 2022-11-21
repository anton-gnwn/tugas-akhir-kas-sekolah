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
    java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun+"-"+bulan+"-"+tanggal;
    String tgl2 = tahun+""+bulan;
    
    siswa siswa = new siswa();
    pembayaran pem = new pembayaran();
    kategori kategori = new kategori();
    user usr = new user();
    koneksi kon = new koneksi();
    ResultSet rs = null;
%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="bo_servlet" method="post">

            <h1 align="center">BIAYA OPERASIONAL</h1>
            <hr>
            <br>
            <table width="600" border="0">
                <tr> 
                    <td width="120">No Biaya Operasional</td>
                    <td width="10">:</td>
                    <td><% try {

                            ResultSet no_bo = null;
                            no_bo = kon.stmt.executeQuery("select max(right(no_bo,4)) as no FROM biaya_operasional");

                            while (no_bo.next()) {
                                if (no_bo.first() == false) {
                                    out.println("<input type='text' id='input' readonly value='BO0001' name='no_bo'>");
                                } else {
                                    no_bo.last();
                                    int auto = no_bo.getInt(1) + 1;
                                    String nomorpesan = String.valueOf(auto);
                                    int noLong = nomorpesan.length();

                                    for (int a = 1; a < 4 - noLong; a++) {
                                        nomorpesan = "0" + nomorpesan;
                                    }
                                    String nomerpesan = tgl2 + nomorpesan;
                                    out.println("<input type='text' id='input' readonly value='" + nomerpesan + "' name='no_bo'>");
                                }
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                        %></td>
                </tr>
                <tr>
                    <td>Tgl. Pengajuan</td>
                    <td>:</td>
                    <td><input type="date" name="tgl_pengajuan" id="input" value="2020-01-01"></td>
                </tr>
            </table>

            <hr>
            <br>

            <table width="600" border="0">

                <tr>
                    <td width="120">Jenis Bantuan</td>
                    <td>:</td>
                    <td><select name="jenis_bantuan" id="input" required>                             
                            <option value="#">- Pilih -</option>
                            <option value="Dana BOS">Dana BOS</option>
                            <option value="Dana BOP">Dana BOP</option>
                        </select></td>

                    <td>Jumlah Dana</td>
                    <td>:</td>
                    <td><input type="number" name="jumlah_dana" id="input" required></td>

                </tr>
               
                <tr>
                    <td>Scan Bukti Pengajuan</td> 
                    <td>:</td>
                    <td><input type="file" id="input" name="foto"></td>
                    <td>Keterangan</td>
                    <td>:</td>
                    <td><input type="text" name="ket_dana" id="input" value=""></td>

                    </td>
                </tr>
            </table>

            <br>
            <hr>
            <table width="600" border="0">

                <tr>
                    <td width="120">Tgl. Pencairan</td>
                    <td width="10">:</td>
                    <td><input type="date" name="tgl_pencairan" id="input" value="2020-01-01"></td>

                </tr>


                <tr>
                    <td>Admin</td>
                    <td>:</td>
                    <td><input type="text" name="id_user" value="<%=session.getAttribute("id_user") %>" readonly="readonly"></td>

                </tr>
                <tr>

                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Simpan" name="aksi" id="biru">
                        <input type="reset" value="Batal" id="merah">
                        <a href="beranda.jsp?hal=tampil_biaya_operasional" id="hijau">Lihat Data</a>
                    </td>
                </tr>
            </table>
        </form>
        <hr>
        <br>
        <%--
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
        <h2 align="center">Update Pembayaran</h2>
        <br>
        <hr>
        
        <table width="90%" border="0" align="center">
            <tr>
                <td width="120"></td>
                <td><i class="fas fa-search"></i></td>
                <td><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td>
            </tr>
        </table>
        <table width="90%" border="1" align="center" id="table-tampil">   
            <thead>
                <tr height="50">
                    <th width="80">No Transaksi</th>   
                    <th width="80">Tgl. Transaksi</th>  
                    <th>NIS</th>  
                    <th>Nama</th>  
                    <th width="60">Jenis Kategori</th>   
                    <th>Nominal</th>  
                    <th>Dibayar</th>  
                    <th>Sisa</th>  
                    <th>Status</th>  
                    <th>Keterangan</th>  
                    <th>Aksi</th>  
                </tr>  
            </thead>
            <%
                String notrans = null;
                String tgl_trans = null;
                String nis = null;
                String id_kategori = null;
                String total_pem = null;
                String dibayar = null;
                String kembali = null;
                String status = null;
                String keterangan = null;
                String nama_kategori = null;
                String nama_siswa = null;
                
                rs = kon.stmt.executeQuery("SELECT * FROM pembayaran JOIN detail_pembayaran ON pembayaran.notrans=detail_pembayaran.notrans "
                        + "JOIN siswa ON detail_pembayaran.nis=siswa.nis "
                        + "JOIN kategori ON pembayaran.id_kategori=kategori.id_kategori ORDER BY tgl_trans ASC");

                while (rs.next()) {
                    notrans = rs.getString("notrans");
                    tgl_trans = rs.getString(2);
                    id_kategori = rs.getString(3);
                    status = rs.getString(4);
                    keterangan = rs.getString(5);
                    nis = rs.getString(7);
                    total_pem = rs.getString(8);
                    dibayar = rs.getString(9);
                    kembali = rs.getString(10);
                    nama_siswa = rs.getString(12);
                    nama_kategori = rs.getString(20);
            %>
            <tbody id="dataTable">
                <tr id="klik">
                    <td align="center"><% out.println(notrans); %></td>
                    <td align="center"><% out.println(tgl_trans); %></td>
                    <td align="center"><% out.println(nis); %></td>
                    <td align="center"><% out.println(nama_siswa); %></td>
                    <td align="center"><% out.println(nama_kategori); %></td>
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
                    <td align="center"><a href=pembayaranServlet?aksi=Delete&notrans=<% out.println(notrans); %> id="merah">Hapus</a></td>
                </tr>

                <% } %>
                   
                
            </tbody>
        </table>
        --%>
    </body>
</html>