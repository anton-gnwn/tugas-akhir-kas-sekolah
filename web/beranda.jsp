<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MTs Nurul Yaqiin Kota Tangerang</title>
        
        <script type="text/javascript">
            window.setTimeout("waktu()",1000);
            function waktu() {
                var tanggal = new Date();
                setTimeout("waktu()",1000);
                document.getElementById("jam").innerHTML = tanggal.getHours()+":"+tanggal.getMinutes()+":"+tanggal.getSeconds();
            }
            
            var tanggallengkap = new String();
            var namahari = ("Minggu Senin Selasa Rabu Kami Jumat Sabtu");
            namahari = namahari.split(" ");
            var namabulan = ("Januari Februari Maret April Mei Juni Juli Agustus September Oktober November Desember");
            namabulan = namabulan.split(" ");
            var tgl = new Date();
            var hari = tgl.getDay();
            var tanggal = tgl.getDate();
            var bulan = tgl.getMonth();
            var tahun = tgl.getFullYear();
            tanggallengkap = namahari[hari]+", "+tanggal+" "+namabulan[bulan]+" "+tahun;
        </script>
        
        
    </head>
    <link rel="stylesheet" type="text/css" href="config/style1.css" media="screen"/>
    <link rel="stylesheet" href="config/all.css">
        
    
    <body>
        <div id="wrap">
            <div id="header">
                
                <h1><a><b>MTS NURUL YAQIIN KOTA TANGERANG</b></a></h1>
                
            </div>
            <div id="menu">
                <ul>
                    
                    <li><a href="beranda.jsp">Home</a></li>
                    <li><a href="beranda.jsp?hal=about">About</a></li>
                </ul>
            </div>
            
            <div class="middle">
            <div class="menu">
                <li class="item" id="master">
                    <a class="btn" href="#master">
                        <i class="far fa-user"></i>
                        Master Data
                    </a>
                    <div class="smenu">
                        <a href="beranda.jsp?hal=tampil_siswa">Data Siswa</a>
                        <a href="beranda.jsp?hal=tampil_kategori">Data Kategori</a>
                        <a href="beranda.jsp?hal=tampil_akun">Data Akun</a>
                    </div>
                </li>
                <li class="item" id="transaksi" style="list-style-type: none;">
                    <a class="btn" href="#transaksi">
                        <i class="fas fa-cash-register"></i>
                        Transaksi
                    </a>
                    <div class="smenu">
                        <a href="beranda.jsp?hal=pembayaran">Pembayaran Siswa</a>
                        <a href="beranda.jsp?hal=input_biaya_operasional">Biaya Operasional</a>
                        
                    </div>
                </li>
                 
                <li class="item" id="jurnal" style="list-style-type: none;">
                    <a class="btn" href="beranda.jsp?hal=jurnal">
                        <i class="fas fa-newspaper"></i>
                        Jurnal
                    </a>
                    <div class="smenu">
                        <!-- 
                        <a href="beranda.jsp?hal=jurnal">Jurnal Kas Masuk</a>
                        <a href="beranda.jsp?hal=test_jurnal">Jurnal Kas Masuk</a> 
                        -->
                    </div>
                </li>
                
                <li class="item" id="laporan" style="list-style-type: none;">
                    <a class="btn" href="#laporan">
                        <i class="fas fa-layer-group"></i>
                        Laporan
                    </a>
                    <div class="smenu">
                        <a href="beranda.jsp?hal=laporan_harian">Penerimaan Kas</a>
                        <a href="beranda.jsp?hal=laporan_bo">Biaya Operasional</a>
                        <a href="beranda.jsp?hal=laporan_jurnal">Jurnal</a>
                    </div>
                </li>
                <li class="item" id="pengaturan" style="list-style-type: none;">
                    <a class="btn" href="#pengaturan">
                        <i class="fas fa-cog"></i>
                        Pengaturan
                    </a>
                    <div class="smenu">
                        <a href="beranda.jsp?hal=edit_profil&id_user=<%=session.getAttribute("id_user") %>">Edit Profil</a>
                        <a href="beranda.jsp?hal=backup">Backup & Restore</a>
                        
                    </div>
                </li>
                <li class="item" id="laporan" style="list-style-type: none;">
                    <a class="btn" href="login?proses=logout">
                        <i class="fas fa-sign-out-alt"></i>
                        Logout
                    </a>
                </li>
            </div>
        </div>
                <%-- 
                <table width="250" id="kolom-tgl" border="0" align="center">
                    <tr>
                        <td align="center"><div id="jam"></div></td>
                    </tr>
                    <tr>
                        <td align="center"><script> document.write(tanggallengkap); </script></td>
                    </tr>
                </table>
                --%>
                
                <div class="right">
                    <table width="75%" border="0">
                        <tr>
                            <td align="top">
                                 <c:choose>
                                    <c:when test="${param.hal=='about'}">
                                        <%@include file="about.jsp" %>
                                    </c:when>
                                    
                                    <%-- Data Siswa --%>
                                    <c:when test="${param.hal=='input_siswa'}">
                                        <%@include file="input_siswa.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='tampil_siswa'}">
                                        <%@include file="tampil_siswa.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='edit_siswa'}">
                                        <%@include file="edit_siswa.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='detail_siswa'}">
                                        <%@include file="detail_siswa.jsp" %>
                                    </c:when>
                                    
                                    <%-- Data User --%>
                                    <c:when test="${param.hal=='edit_user'}">
                                        <%@include file="edit_user.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='input_user'}">
                                        <%@include file="input_user.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='tampil_user'}">
                                        <%@include file="tampil_user.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='ubah_password'}">
                                        <%@include file="ubah_password.jsp" %>
                                    </c:when>
                                    
                                    <%-- Edit Profil --%>
                                    <c:when test="${param.hal=='edit_profil'}">
                                        <%@include file="edit_profil.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='edit_profil_namauser'}">
                                        <%@include file="edit_profil_namauser.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='edit_profil_hakakses'}">
                                        <%@include file="edit_profil_hakakses.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='edit_profil_password'}">
                                        <%@include file="edit_profil_password.jsp" %>
                                    </c:when>
                                    
                                    
                                    
                                    
                                    <%-- Data Kategori --%>
                                    <c:when test="${param.hal=='input_kategori'}">
                                        <%@include file="input_kategori.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='tampil_kategori'}">
                                        <%@include file="tampil_kategori.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='edit_kategori'}">
                                        <%@include file="edit_kategori.jsp" %>
                                    </c:when>
                                    
                                    <%-- Data Akun --%>
                                    <c:when test="${param.hal=='input_akun'}">
                                        <%@include file="input_akun.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='tampil_akun'}">
                                        <%@include file="tampil_akun.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='edit_akun'}">
                                        <%@include file="edit_akun.jsp" %>
                                    </c:when>
                                    
                                    <%-- Transaksi --%>
                                    <c:when test="${param.hal=='pembayaran'}">
                                        <%@include file="pembayaran.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='input_biaya_operasional'}">
                                        <%@include file="input_biaya_operasional.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='tampil_biaya_operasional'}">
                                        <%@include file="tampil_biaya_operasional.jsp" %>
                                    </c:when>
                                    <%-- Transaksi --%>
                                    <c:when test="${param.hal=='jurnal'}">
                                        <%@include file="jurnal.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='test_jurnal'}">
                                        <%@include file="test_jurnal.jsp" %>
                                    </c:when>
                                    
                                    <%-- Laporan --%>
                                    <c:when test="${param.hal=='laporan_harian'}">
                                        <%@include file="laporan_harian.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='laporan_harian_lihat'}">
                                        <%@include file="laporan_harian_lihat.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='laporan_bulanan'}">
                                        <%@include file="laporan_bulanan.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='laporan_bo'}">
                                        <%@include file="laporan_bo.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='laporan_jurnal'}">
                                        <%@include file="laporan_jurnal.jsp" %>
                                    </c:when>
                                    
                                    <%-- Backup --%>
                                    <c:when test="${param.hal=='backup'}">
                                        <%@include file="backupdb.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='backup_berhasil'}">
                                        <%@include file="backup_berhasil.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='backup_gagal'}">
                                        <%@include file="backup_gagal.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='restore_berhasil'}">
                                        <%@include file="restore_berhasil.jsp" %>
                                    </c:when>
                                    <c:when test="${param.hal=='restore_gagal'}">
                                        <%@include file="restore_gagal.jsp" %>
                                    </c:when>
                                    
                                    <%-- Home --%>
                                    <c:otherwise>
                                        <%@include file="home.jsp" %>
                                    </c:otherwise>
                                 </c:choose>
                            </td>
                        </tr>
                    </table>
                       <div class="footer">
                           Support By Mahasiswa <br> 
                           Universitas Bina Sarana Informatika Program Studi Sistem Informasi Akuntansi<br>
                           <i id="fb" class="fab fa-facebook-square"></i> Bina Sarana Informatika
                           <i id="tw" class="fab fa-twitter-square"></i> @kuliahbsiaja
                           <i id="ig" class="fab fa-instagram"></i> @kuliahbsiaja
                       </div>        
                </div>
            <div style="clear: both"></div>
        </div>
        <script src="js/all.js"></script>
        
    </body>
</html>
