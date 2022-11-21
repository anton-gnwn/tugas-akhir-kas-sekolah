<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="beranda2.jsp?hal=lap_bo_kepsek2" method="post">
            
            <center><h1>LAPORAN BIAYA OPERASIONAL</h1><br></center>
            <hr>
            <br>
            
            <table border="0">
                <tr>     
                    <td width="50">Pilih Jenis</td>     
                    <td width="150"><select name="dana_bo" id="input">
                            <option value="#">- Pilih Jenis -</option>
                            <option value="Dana BOP">Dana BOP</option>
                            <option value="Dana BOS">Dana BOS</option>
                        </select></td>
                </tr>
                <tr>     
                    <td width="50">Pilih Bulan</td>     
                    <td width="150"><select name="pbulan" id="input">
                            <option value="#">- Pilih Bulan -</option>
                            <option value="01">Januari</option>
                            <option value="02">Februari</option>
                            <option value="03">Maret</option>
                            <option value="04">April</option>
                            <option value="05">Mei</option>
                            <option value="06">Juni</option>
                            <option value="07">Juli</option>
                            <option value="08">Agustus</option>
                            <option value="09">September</option>
                            <option value="10">Oktober</option>
                            <option value="11">November</option>
                            <option value="12">Desember</option>
                        </select></td>
                </tr>
                
                <tr>
                    <td></td>
                     <td><input type="submit" value="Lihat" id="biru"></td>
                </tr>
            </table>
        </form>
    </body>
</html>