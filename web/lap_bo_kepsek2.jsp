<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.Date" %>
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

    <b><table width="90%" border="0" align="center">
        <tr>
           <%
            
            String tgl_pengajuan = null;
            String pbulan = request.getParameter("pbulan");
            String dana_bo = request.getParameter("dana_bo");
            String jenis_bantuan = null;
            
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM biaya_operasional JOIN user ON biaya_operasional.id_user = user.id_user WHERE biaya_operasional.jenis_bantuan='"+dana_bo+"' AND month(tgl_pengajuan)='"+pbulan+"'ORDER BY no_bo asc");

            if (rs.next()) {
                jenis_bantuan = rs.getString(3);
                
        %> 
            <td>Jenis Dana</td>
            <td>: <% out.println(dana_bo); %></td>
            <td rowspan="2"><i class="fas fa-search"></i></td>
            <td rowspan="2"><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td>
        </tr>
        <tr>
            <td>Bulan</td>
            <td><%
                        String bt;
                    %>
                    :
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
                        %>
            </td>
        </tr>
        <% } %>
        </table></b>
    <table width="90%" border="1" align="center" class="display">
        <thead>    
            <tr align="center">
                <th width="100">No Biaya Operasional</th>
                <th width="100">Tgl. Pengajuan</th>
                <th width="100">Jenis Bantuan</th>
                <th>Jumlah Dana</th>
                <th>Keterangan Dana</th>
                <th width="100">Tgl. Pencairan</th>
                <th width="130">Admin</th>
            </tr>
        </thead>

        <%
            String no_bo = null;
            
            String jumlah_dana = null;
            String ket_dana = null;
            String tgl_pencairan = null;
            String id_user = null;
            rs = kon.stmt.executeQuery("SELECT * FROM biaya_operasional JOIN user ON biaya_operasional.id_user = user.id_user WHERE biaya_operasional.jenis_bantuan='"+dana_bo+"' AND month(tgl_pengajuan)='"+pbulan+"'ORDER BY no_bo asc");

            while (rs.next()) {
                no_bo = rs.getString("no_bo");
                tgl_pengajuan = rs.getString(2);
                jenis_bantuan = rs.getString(3);
                jumlah_dana = rs.getString(4);
                ket_dana = rs.getString(5);
                tgl_pencairan = rs.getString(6);
                id_user = rs.getString(9);
        %> 

        <tbody  id="dataTable">
            <tr id="klik">          
                <td align="center"><% out.println(no_bo); %></center></td>      
                <td align="center"><% out.println(tgl_pengajuan); %></td>      
                <td align="center"><% out.println(jenis_bantuan); %></td>      
                <td align="right">Rp. <% out.println(jumlah_dana); %></td>      
                <td align="center"><% out.println(ket_dana); %></td>      
                <td align="center"><% out.println(tgl_pencairan); %></td>      
                <td align="center"><% out.println(id_user); %></td>      
                </td>      


            </tr>
        </tbody>

        <% } %>
    </table>

    <% kon.close();%> 
</body>
</html>



