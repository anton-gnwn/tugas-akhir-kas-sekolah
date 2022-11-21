<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MTS NURUL YAQIIN | Tambah Data Siswa</title>
    </head>
    <link rel="stylesheet" href="config/all.css">
    <body>
        <form method="post" action="siswaServlet"> 
            <h1 align="center">TAMBAH DATA SISWA</h1><br>
            <hr>
            <table border="0" width="600"> 
                <tr>     
                    <td width="250">NIS</td>  
                    <td>:</td> 
                    <td><input type="text" name="nis" id="input" required></td> 

                </tr> 
                <tr>     
                    <td>Nama Lengkap</td> 
                    <td>:</td> 
                    <td><input type="text" name="nama_siswa" id="input" required></td> 
                </tr> 
                <tr>     
                    <td>Tempat Lahir</td>   
                    <td>:</td> 
                    <td><input type="text" name="tempat" id="input" required></td> 
                </tr> 
                <tr>     
                    <td>Tanggal Lahir</td>   
                    <td>:</td> 
                    <td><input type="date" name="tgl_lahir" value="2000-01-01" required style="width: 232px; height: 25px;"></td> 
                </tr> 
                <tr>     
                    <td>Jenis Kelamin</td>  
                    <td>:</td> 
                    <td><select name="jenis_kelamin" id="input" required>     
                            <option value="#">- Pilih Jenis Kelamin -</option>     
                            <option value="Laki-laki">Laki-laki</option>     
                            <option value="Perempuan">Perempuan</option>     
                        </select>
                        </td>
                </tr>
                <tr>     
                    <td>Alamat</td>     
                    <td>:</td> 
                    <td><textarea rows="5" cols="30" name="alamat" required></textarea></td> 
                </tr>
                <tr>     
                    <td>Nomor Telepon</td> 
                    <td>:</td> 
                    <td><input type="number" name="no_telp" id="input"></td> 
                </tr> 
                
                <tr>     
                    <td>Kelas</td>   
                    <td>:</td> 
                    <td><select name="kelas" id="input">
                            <option value="#">- Pilih Kelas -</option>
                            <option value="VII">VII</option>
                            <option value="VIII">VIII</option>
                            <option value="IX">IX</option>
                        </select></td>
                </tr>
                <tr>    
                    <td><a href="beranda.jsp?hal=tampil_siswa" id="hijau"><i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td>     
                    <td></td> 
                    <td><input type="submit" name="aksi" value="Simpan" 
                               class="<%=session.getAttribute("hak_akses") %>" id="biru"> 
                        <input type="reset" value="Batal" id="merah"></td> 
                </tr> 
            </table> 
        </form>
        <script src="js/all.js"></script>
    </body>
</html>
