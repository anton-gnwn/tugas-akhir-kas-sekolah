<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="beranda2.jsp?hal=lap_harian_kepsek2" method="post">
            
            <center><h1>LAPORAN PENERIMAAN KAS HARIAN</h1><br></center>
            <hr>
            <br>
            
            <table border="0">
                <tr>     
                    <td width="50">Pilih Tanggal</td>     
                    <td width="150"><input type="date" name="tgl_trans" id="input" value="2020-01-01"></td>
                   
                </tr>
                
                <tr>
                    <td></td>
                     <td><input type="submit" value="Lihat" id="biru"></td>
                </tr>
            </table>
        </form>
    </body>
</html>