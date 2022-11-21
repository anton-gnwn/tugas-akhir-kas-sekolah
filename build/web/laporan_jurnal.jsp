<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="laporan_harian_cetak.jsp" method="post" target="blank">
            
            <center><h1>LAPORAN JURNAL</h1><br></center>
            <hr>
            <br>
            
            <table border="0">
                <tr>     
                    <td width="50">Pilih Tanggal</td>     
                    <td width="150"><input type="date" name="tgl" id="input" value="2020-01-01" > Sampai <input type="date" name="tgl" id="input" value="2020-01-30" > </td>
                   
                </tr>
                
                <tr>
                    <td></td>
                     <td><input type="submit" value="Cetak" id="biru"></td>
                </tr>
            </table>
        </form>
    </body>
</html>