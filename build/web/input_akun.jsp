<%-- 
    Document   : input_guru
    Created on : Feb 2, 2020, 4:46:41 PM
    Author     : anton
--%>
<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MTS NURUL YAQIIN | Tambah Data Guru</title>
    </head>
    <body>
        <form method="post" action="akunServlet"> 
            <h1 align="center"> TAMBAH DATA AKUN</h1><br>
            <hr>
            <table border="0" width="600"> 
                <tr>     
                    <td>No Akun</td>
                    <td><input type="text" name="no_akun" id="input"></td>
                </tr> 
                <tr>     
                    <td>Nama Akun</td>     
                    <td><input type="text" name="nama_akun" id="input"></td> 
                </tr>            
                <tr>    
                <tr>     
                    <td>Tipe Akun</td>     
                    <td><select name="tipe_akun" id="input">
                            <option value="#">- Pilih Akun -</option>
                            <option value="Kas & Bank">Kas & Bank</option>
                            <option value="Piutang">Piutang</option>
                            <option value="Hutang">Hutang</option>
                            <option value="Pendapatan SPP">Pendapatan SPP</option>
                            <option value="Pendapatan">Pendapatan</option>
                        </select></td> 
                </tr>            
                <tr>    
                    <td><a href="beranda.jsp?hal=tampil_jb" id="hijau"><i class="fas fa-arrow-circle-left"></i> KEMBALI</a></td>     
                    <td><input type="submit" name="aksi" value="Simpan" id="biru"> 
                        <input type="reset" value="Batal" id="merah"></td> 
                </tr> 
            </table> 
        </form>

    </body>
</html>
