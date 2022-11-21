<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%
    String nis = request.getParameter("nis");
    String nama_siswa = null;
    String tempat = null;
    String tgl_lahir = null;
    String jenis_kelamin = null;
    String alamat = null;
    String no_telp = null;
    String kelas = null;
    
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM siswa where nis= '" + nis + "'");
    if (rs.next()) {
        nis = rs.getString(1);
        nama_siswa = rs.getString(2);
        tempat = rs.getString(3);
        tgl_lahir = rs.getString(4);
        jenis_kelamin = rs.getString(5);
        alamat = rs.getString(6);
        no_telp = rs.getString(7);
        kelas = rs.getString(8);
    }
%>
<html>
    <head>
        <title>Ubah Data Siswa</title>
    </head>
    <body>
        <form method="POST" action="siswaServlet"> 
            <h1 align="center"> UBAH DATA SISWA</h1><br>
            <hr>
            <table border="0"> 
                <tr>
                <td>NIS</td>     
                <td>:</td>     
                <td><input type="text" name="nis" value="<%=nis%>" id="input" readonly="readonly" >
                    
                </td> 
                </tr> 
                <tr>     
                    <td>Nama Siswa</td>     
                    <td>:</td>     
                    <td><input type="text" name="nama_siswa" value="<%=nama_siswa%>" id="input"></td> 
                </tr>
                <tr>     
                    <td>Tempat Tanggal Lahir</td>
                    <td>:</td>
                    <td><input type="text" name="tempat" value="<%=tempat%>" id="input">
                        <input type="date" name="tgl_lahir" value="<%=tgl_lahir%>" value="2000-01-01" 
                               style="width: 135px; height: 25px;"></td> 
                </tr> 
                
                <tr>     
                    <td>Jenis Kelamin</td>     
                    <td>:</td>     
                    <td>
                        <% if (jenis_kelamin.equalsIgnoreCase("Laki-laki")) { %>

                        <select name="jenis_kelamin" id="input">     
                            <option value="#">- Pilih Jenis Kelamin -</option>     
                            <option value="Laki-laki" selected="Laki-laki">Laki-laki</option>     
                            <option value="Perempuan">Perempuan</option>     
                        </select>
                        <% } else { %>
                        <select name="jenis_kelamin" id="input">     
                            <option value="#">- Pilih Jenis Kelamin -</option>     
                            <option value="Laki-laki">Laki-laki</option>     
                            <option value="Perempuan" selected="Perempuan">Perempuan</option>     
                        </select>
                        <% } %>
                    </td> 
                </tr>
                <tr>     
                    <td>Alamat</td>     
                    <td>:</td>     
                    <td><textarea rows="5" cols="30" name="alamat"><%=alamat%></textarea></td>
                </tr>
                <tr>     
                    <td>No Telepon</td>     
                    <td>:</td>     
                    <td><input type="text" name="no_telp" value="<%=no_telp%>" id="input"></td> 
                </tr>
                <tr>     
                    <td>Kelas</td>     
                    <td>:</td>     
                    <td>
                        <% if (kelas.equalsIgnoreCase("VII")) { %>

                        <select name="kelas" id="input">     
                            <option value="#">- Pilih Kelas -</option>     
                            <option value="VII" selected="VII">VII</option>     
                            <option value="VIII">VIII</option>     
                            <option value="IX">IX</option>     
                        </select>
                        <% } else if (kelas.equalsIgnoreCase("VIII")) { %>
                        <select name="kelas" id="input">     
                            <option value="#">- Pilih Kelas -</option>     
                            <option value="VIII" selected="VIII">VIII</option>     
                            <option value="VII">VII</option>     
                            <option value="IX">IX</option>     
                        </select>
                        <% } else { %>
                        <select name="kelas" id="input">     
                            <option value="#">- Pilih Kelas -</option>     
                            <option value="VIII">VIII</option>     
                            <option value="VII">VII</option>     
                            <option value="IX" selected="IX">IX</option>     
                        </select>
                        <% } %>
                    </td> 
                </tr>

                
                <tr>    
                    <td><a href="beranda.jsp?hal=tampil_siswa" id="hijau"><i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td> 
                    <td></td>     
                    <td><input type="submit" name="aksi" value="Update" id="biru">
                        <a href="beranda.jsp?hal=tampil_siswa" id="hijau">Lihat Data</a>
                    </td> 
                </tr> 
            </table>
        </form>
    </body>
</html>