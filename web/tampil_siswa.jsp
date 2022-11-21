<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Awal | Data Siswa</title>

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
    <center><h1>DATA SISWA</h1><br></center>
    <hr>  
    <hr>
    <table width="90%" border="0" align="center">
        <tr>
            <td><a href="beranda.jsp?hal=input_siswa" id="biru"><i class="fas fa-plus-circle"></i> TAMBAH DATA</a></td>
            <td><i class="fas fa-search"></i></td>
            <td><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td>
        </tr>
    </table>
    
    <hr>
    <h2 style="margin: 15px 0px 15px 15px;">Kelas VII</h2>
    <table width="90%" border="1" align="center" id="table-tampil">
        
        <thead>    
            <tr align="center">
                <th width="60px">NIS</th>
                <th width="150px">NAMA SISWA</th>
                <th width="150px">TEMPAT TANGGAL LAHIR</th>
                <th width="80px">JENIS KELAMIN</th>
                <th width="180px">ALAMAT</th>
                <th width="80px">NO TELP</th>
                <th width="50px">KELAS</th>
                <th width="280px">AKSI</th>
            </tr>
        </thead>
        
        
        <%
            String nis = null;
            String nama_siswa = null;
            String tempat = null;
            String tgl_lahir = null;
            String jenis_kelamin = null;
            String alamat = null;
            String no_telp = null;
            String kelas = null;
            
            koneksi kon = new koneksi();
            ResultSet rs = null;
            rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE kelas='VII' ORDER BY nama_siswa asc");

            while (rs.next()) {
                nis = rs.getString("nis");
                nama_siswa = rs.getString(2);
                tempat = rs.getString(3);
                tgl_lahir = rs.getString(4);
                jenis_kelamin = rs.getString(5);
                alamat = rs.getString(6);
                no_telp = rs.getString(7);
                kelas = rs.getString(8);
        %> 
        
        
        <tbody  id="dataTable">
            <tr id="klik">          
                <td align="center"><% out.println(nis); %></center></td>      
                <td><% out.println(nama_siswa); %></td>      
                <td><% out.println(tempat+","); %><% out.println(tgl_lahir); %></td>      
                <td align="center"><% out.println(jenis_kelamin); %></td>
                <td><% out.println(alamat); %></td>
                <td align="center"><% out.println(no_telp); %></td>
                <td align="center"><% out.println(kelas); %></td>         
                <td align="center"><a href="beranda.jsp?hal=edit_siswa&nis=<% out.print(nis); %>" id="hijau">EDIT</a>
                    <a href="siswaServlet?aksi=Delete&nis=<% out.print(nis);%>" id="merah">HAPUS</a>
                    <a href="beranda.jsp?hal=detail_siswa&nis=<% out.print(nis); %>" id="biru">DETAIL</a></td>

            </tr>
        </tbody>
        
        <% } %>
        
    </table>
    
    <hr>
    <h2 style="margin: 15px 0px 15px 15px;">Kelas VIII</h2>
    <table width="90%" border="1" align="center" id="table-tampil">
        
        <thead>    
            <tr align="center">
                <th width="60px">NIS</th>
                <th width="150px">NAMA SISWA</th>
                <th width="150px">TEMPAT TANGGAL LAHIR</th>
                <th width="80px">JENIS KELAMIN</th>
                <th width="180px">ALAMAT</th>
                <th width="80px">NO TELP</th>
                <th width="50px">KELAS</th>
                <th width="280px">AKSI</th>
            </tr>
        </thead>
        
        
        <%
            
            rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE kelas='VIII' ORDER BY nama_siswa asc");

            while (rs.next()) {
                nis = rs.getString("nis");
                nama_siswa = rs.getString(2);
                tempat = rs.getString(3);
                tgl_lahir = rs.getString(4);
                jenis_kelamin = rs.getString(5);
                alamat = rs.getString(6);
                no_telp = rs.getString(7);
                kelas = rs.getString(8);
        %> 
        
        
        <tbody  id="dataTable">
            <tr id="klik">          
                <td align="center"><% out.println(nis); %></center></td>      
                <td><% out.println(nama_siswa); %></td>      
                <td><% out.println(tempat); %>, <% out.println(tgl_lahir); %></td>      
                <td align="center"><% out.println(jenis_kelamin); %></td>
                <td><% out.println(alamat); %></td>
                <td align="center"><% out.println(no_telp); %></td>
                <td align="center"><% out.println(kelas); %></td>         
                <td align="center"><a href="beranda.jsp?hal=edit_siswa&nis=<% out.print(nis); %>" id="hijau">EDIT</a>
                    <a href="siswaServlet?aksi=Delete&nis=<% out.print(nis);%>" id="merah">HAPUS</a>
                    <a href="beranda.jsp?hal=detail_siswa&nis=<% out.print(nis); %>" id="biru">DETAIL</a></td>

            </tr>
        </tbody>
        
        <% } %>
        
    </table>
        
    <hr>
    <h2 style="margin: 15px 0px 15px 15px;">Kelas IX</h2>
    <table width="90%" border="1" align="center" id="table-tampil">
        
        <thead>    
            <tr align="center">
                <th width="60px">NIS</th>
                <th width="150px">NAMA SISWA</th>
                <th width="150px">TEMPAT TANGGAL LAHIR</th>
                <th width="80px">JENIS KELAMIN</th>
                <th width="180px">ALAMAT</th>
                <th width="80px">NO TELP</th>
                <th width="50px">KELAS</th>
                <th width="280px">AKSI</th>
            </tr>
        </thead>
        
        
        <%
            
            rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE kelas='IX' ORDER BY nama_siswa asc");

            while (rs.next()) {
                nis = rs.getString("nis");
                nama_siswa = rs.getString(2);
                tempat = rs.getString(3);
                tgl_lahir = rs.getString(4);
                jenis_kelamin = rs.getString(5);
                alamat = rs.getString(6);
                no_telp = rs.getString(7);
                kelas = rs.getString(8);
        %> 
        
        
        <tbody  id="dataTable">
            <tr id="klik">          
                <td align="center"><% out.println(nis); %></center></td>      
                <td><% out.println(nama_siswa); %></td>      
                <td><% out.println(tempat); %>, <% out.println(tgl_lahir); %></td>      
                <td align="center"><% out.println(jenis_kelamin); %></td>
                <td><% out.println(alamat); %></td>
                <td align="center"><% out.println(no_telp); %></td>
                <td align="center"><% out.println(kelas); %></td>         
                <td align="center"><a href="beranda.jsp?hal=edit_siswa&nis=<% out.print(nis); %>" id="hijau">EDIT</a>
                    <a href="siswaServlet?aksi=Delete&nis=<% out.print(nis);%>" id="merah">HAPUS</a>
                    <a href="beranda.jsp?hal=detail_siswa&nis=<% out.print(nis); %>" id="biru">DETAIL</a></td>

            </tr>
        </tbody>
        
        <% } %>
        
    </table>    
        
    <% kon.close();%> 
</body>
</html>
