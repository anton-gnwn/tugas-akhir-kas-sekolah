<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="laporan_bulanan_cetak.jsp" method="post" target="blank">
            
            <center><h1>LAPORAN PENERIMAAN KAS BULANAN</h1><br></center>
            <hr>
            <br>
            
            <table border="0">
                <tr>     
                    <td width="50">Pilih Bulan</td>     
                    <td width="150"><select name="pbulan" id="input" required>
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
                    <td width="50">Pilih Tahun</td>     
                    <td width="150"><select name="ptahun" id="input" required>
                            <option value="#">- Pilih Tahun -</option>
                            <option value="2019">2019</option>
                            <option value="2020">2020</option>
                            <option value="2021">2021</option>
                            <option value="2022">2022</option>
                            <option value="2023">2023</option>
                        </select></td>
                   
                </tr>
                
                <tr>
                    <td></td>
                     <td><input type="submit" value="Cetak" id="biru"></td>
                </tr>
            </table>
        </form>
    </body>
</html>