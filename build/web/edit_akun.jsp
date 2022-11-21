<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%
    String no_akun = request.getParameter("no_akun");
    String nama_akun = null;
    String tipe_akun = null;
    
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM akun where no_akun= '" + no_akun + "'");
    if (rs.next()) {
        no_akun = rs.getString(1);
        nama_akun = rs.getString(2);
        tipe_akun = rs.getString(3);
    }
%>
<html>
    <head>
        <title>Halaman | Ubah Data Akun</title>
    </head>
    <body>
        <form method="POST" action="kategoriServlet"> 
            <h1 align="center"> UBAH DATA AKUN</h1><br>
            <hr>
            <table border="0"> 
                <td>ID Akun</td>     
                <td>:</td>     
                <td><input type="text" values="<%=no_akun%>" id="input" readonly >
                    <input type="hidden" name="no_akun" value="<%=no_akun%>"/>
                </td> 
                </tr> 
                <tr>     
                    <td>Nama akun</td>     
                    <td>:</td>     
                    <td><input type="text" name="nama_akun" value="<%=nama_akun%>" id="input"></td> 
                </tr>
                <tr>     
                    <td>Tipe Akun</td>     
                    <td>:</td>     
                    <td><% if (tipe_akun.equalsIgnoreCase("Kas & Bank")) { %>

                        <select name="akun" id="input">     
                            <option value="#">- Pilih Akun -</option>     
                            <option value="Kas & Bank" selected="Kas & Bank">Kas & Bank</option>
                            <option value="Piutang">Piutang</option>
                            <option value="Hutang">Hutang</option>
                            <option value="Pendapatan SPP">Pendapatan SPP</option>
                            <option value="Pendapatan">Pendapatan</option>     
                        </select>
                        <% } else if (tipe_akun.equalsIgnoreCase("Piutang")) { %>
                        <select name="tipe_akun" id="input">     
                            <option value="#">- Pilih Akun -</option>     
                            <option value="Kas & Bank">Kas & Bank</option>
                            <option value="Piutang"  selected="Piutang">Piutang</option>
                            <option value="Hutang">Hutang</option>
                            <option value="Pendapatan SPP">Pendapatan SPP</option>
                            <option value="Pendapatan">Pendapatan</option> >     
                        </select>
                        <% } else if (tipe_akun.equalsIgnoreCase("Hutang")) { %>
                        <select name="tipe_akun" id="input">     
                            <option value="#">- Pilih Akun -</option>     
                            <option value="Kas & Bank">Kas & Bank</option>
                            <option value="Piutang">Piutang</option>
                            <option value="Hutang" selected="Hutang">Hutang</option>
                            <option value="Pendapatan SPP">Pendapatan SPP</option>
                            <option value="Pendapatan">Pendapatan</option> >     
                        </select>
                        <% } else if (tipe_akun.equalsIgnoreCase("Pendapatan SPP")) { %>
                        <select name="tipe_akun" id="input">     
                            <option value="#">- Pilih Akun -</option>     
                            <option value="Kas & Bank">Kas & Bank</option>
                            <option value="Piutang">Piutang</option>
                            <option value="Hutang">Hutang</option>
                            <option value="Pendapatan SPP" selected="Pendapatan SPP">Pendapatan SPP</option>
                            <option value="Pendapatan">Pendapatan</option> >     
                        </select>
                        <% } else { %>
                        <select name="tipe_akun" id="input">     
                            <option value="#">- Pilih Akun -</option>     
                            <option value="Kas & Bank">Kas & Bank</option>
                            <option value="Piutang">Piutang</option>
                            <option value="Hutang">Hutang</option>
                            <option value="Pendapatan SPP">Pendapatan SPP</option>
                            <option value="Pendapatan" selected="Pendapatan">Pendapatan</option> >    
                        </select>
                        <% } %>
                    </td>
                </tr>

                <tr>    
                    <td><a href="beranda.jsp?hal=tampil_akun" id="hijau"><i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td> 
                    <td></td>     
                    <td><input type="submit" name="aksi" value="Update" id="biru">
                        <a href="beranda.jsp?hal=tampil_akun" id="hijau">Lihat Data</a>
                    </td> 
                </tr> 
            </table>
        </form>
    </body>
</html>