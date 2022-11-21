<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page import="model.siswa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MTS NURUL YAQIIN</title>
    </head>
    <body>
        <br>
        <img src="img/logo-mts.png" class="logo-mts" 
             style="width: 110px; 
                    height: 110px; 
                    float: left; 
                    padding-left: 50px;
                    padding-top: 5px;
                    padding-bottom: 10px;
                    margin-right: -100px;">
        <img src="img/logo-kota-tangerang.png" class="logo-mts" 
             style="width: 110px; 
                    height: 110px; 
                    float: right; 
                    padding-right: 50px;
                    padding-top: 5px;
                    padding-bottom: 10px;
                    margin-left: -100px;">
    <center><h1><br>SELAMAT DATANG DI WEBSITE ADMINISTRASI <br> MTS NURUL YAQIIN KOTA TANGERANG</h1></center>
        
    <br>
    <br>
    <br>
           
    <hr>
    <br>
    
    
   
    <br>
        
            <%
                String nis = null;
                
                koneksi kon = new koneksi();
                ResultSet rs = null;
                rs = kon.stmt.executeQuery("SELECT COUNT(*) AS nis FROM siswa WHERE kelas='VII'");

                if (rs.next()) {
                    nis = rs.getString("nis");
            %>
        
            <div class="kolom1">
            Kelas VII <br> <% out.println(nis); %> Siswa
            </div>
            <% } %>
            
            <%
                
                rs = kon.stmt.executeQuery("SELECT COUNT(*) AS nis FROM siswa WHERE kelas='VIII'");

                if (rs.next()) {
                    nis = rs.getString("nis");
            %>
        
            <div class="kolom2" style="margin-left: 125px;">
            Kelas VIII <br> <% out.println(nis); %> Siswa
            </div>
            <% } %>
            
            <%
                
                rs = kon.stmt.executeQuery("SELECT COUNT(*) AS nis FROM siswa WHERE kelas='IX'");

                if (rs.next()) {
                    nis = rs.getString("nis");
            %>
        
            <div class="kolom3" style="margin-left: 125px;">
            Kelas IX <br> <% out.println(nis); %> Siswa
            </div>
            <% } %>
            
            
            <div style="float: bottom; margin-top: 150px; margin-bottom: 10px;">
                <h3 align="center">ALAMAT :</h3>
                <p align="center">Jl. Raden Fatah Gg. Masjid II RT. 01/10 Parung Serab, Sudimara Selatan,
                    <br> Ciledug - Kota Tangerang. No Telp. 021-7344 1601 / 0856 7746 235
            </p></div>
        
        <script src="js/all.js"></script>
    </body>
</html>
