<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman </title>

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

    <center><h1>BIAYA OPERASIONAL</h1><br></center>
    <hr>

    <table width="90%" border="0" align="center">
        <tr>
            <td><a href="beranda.jsp?hal=input_biaya_operasional" id="biru" ><i class="fas fa-plus-circle"></i> TAMBAH DATA</a></td>
            <td><i class="fas fa-search"></i></td>
            <td><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td>
        </tr>
    </table>
    <table width="90%" border="1" align="center" class="display">
        <thead>    
            <tr align="center">
                <th width="100">No Biaya Operasional</th>
                <th width="100">Tgl. Pengajuan</th>
                <th width="100">Jenis Bantuan</th>
                <th>Jumlah Dana</th>
                <th>Keterangan Dana</th>
                <th>Foto</th>
                <th width="100">Tgl. Pencairan</th>
                <th width="130">Admin</th>
                
            </tr>
        </thead>

        <%
            String no_bo = null;
            String tgl_pengajuan = null;
            String jenis_bantuan = null;
            String jumlah_dana = null;
            String ket_dana = null;
            String foto = null;
            String tgl_pencairan = null;
            String id_user = null;
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM biaya_operasional JOIN user ON biaya_operasional.id_user = user.id_user ORDER BY no_bo asc");

            while (rs.next()) {
                no_bo = rs.getString("no_bo");
                tgl_pengajuan = rs.getString(2);
                jenis_bantuan = rs.getString(3);
                jumlah_dana = rs.getString(4);
                ket_dana = rs.getString(5);
                foto = rs.getString(6);
                tgl_pencairan = rs.getString(7);
                id_user = rs.getString(9);
        %> 

        <tbody  id="dataTable">
            <tr id="klik">          
                <td align="center"><% out.println(no_bo); %></center></td>      
                <td align="center"><% out.println(tgl_pengajuan); %></td>      
                <td align="center"><% out.println(jenis_bantuan); %></td>      
                <td align="right">Rp. <% out.println(jumlah_dana); %></td>      
                <td align="center"><% out.println(ket_dana); %></td>      
                <td align="center"><img src="gambar/<% out.println(foto); %>"</td>      
                <td align="center"><% out.println(tgl_pencairan); %></td>      
                <td align="center"><% out.println(id_user); %></td>      
                     


            </tr>
        </tbody>

        <% } %>
    </table>

    <% kon.close();%> 
</body>
</html>



