<%@page import="java.sql.ResultSet"%>
<%@page import="control.koneksi"%>
<%@page import="model.pembayaran"%>
<%@page import="model.siswa"%>
<%@page import="model.kategori"%>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script src="js/jquery.min.js"></script>

<%
    siswa siswa = new siswa();
    pembayaran pem = new pembayaran();
    kategori kategori = new kategori();
    koneksi kon = new koneksi();
    ResultSet rs = null;
%> 

<script>
    function showEmp(emp_value)
    {
        if (document.getElementById("nis").value != "-1")
        {
            xmlHttp = GetXmlHttpObject()
            if (xmlHttp == null)
            {
                alert("Browser does not support HTTP Request")
                return
            }
            var url = "get_siswa.jsp"
            url = url + "?nis=" + emp_value

            xmlHttp.onreadystatechange = stateChanged
            xmlHttp.open("GET", url, true)
            xmlHttp.send(null)
        } else
        {
            alert("Pilih NIS");
        }
    }

    function stateChanged()
    {
        document.getElementById("ename").value = "";
        document.getElementById("nis").value = "";
        if (xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
        {

            var showdata = xmlHttp.responseText;
            var strar = showdata.split(":");

            if (strar.length == 1)
            {
                document.getElementById("nis").focus();
                alert("Pilih NIS");
                document.getElementById("ename").value = " ";
                document.getElementById("nis").value = " ";
            } else if (strar.length > 1)
            {
                document.getElementById("ename").value = strar[1];
            }


        }
    }

    function GetXmlHttpObject()
    {
        var xmlHttp = null;
        try
        {
            xmlHttp = new XMLHttpRequest();
        } catch (e)
        {
            try
            {
                xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e)
            {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
        }
        return xmlHttp;
    }
    
    
    function jenisbayar(emp_value)
    {
        if (document.getElementById("id_kategori").value != "-1")
        {
            xmlHttp = GetXmlHttpObjectbayar()
            if (xmlHttp == null)
            {
                alert("Browser does not support HTTP Request")
                return
            }
            var url = "get_kategori.jsp"
            url = url + "?id_kategori=" + emp_value

            xmlHttp.onreadystatechange = stateChangedbayar
            xmlHttp.open("GET", url, true)
            xmlHttp.send(null)
        } else
        {
            alert("Pilih Jenis Bayar");
        }
    }

    function stateChangedbayar()
    {
        document.getElementById("bayar").value = "";
        document.getElementById("id_kategori").value = "";
        if (xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
        {

            var showdata = xmlHttp.responseText;
            var strar = showdata.split(":");

            if (strar.length == 1)
            {
                document.getElementById("id_kategori").focus();
                alert("Pilih Jenis Bayar");
                document.getElementById("bayar").value = " ";
                document.getElementById("id_kategori").value = " ";
            } else if (strar.length > 1)
            {
                document.getElementById("bayar").value = strar[1];
            }


        }
    }

    function GetXmlHttpObjectbayar()
    {
        var xmlHttp = null;
        try
        {
            xmlHttp = new XMLHttpRequest();
        } catch (e)
        {
            try
            {
                xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e)
            {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
        }
        return xmlHttp;
    }
</script>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="pembayaranServlet" method="post">

            <h1 align="center">PEMBAYARAN SPP</h1>
            <hr>
            <br>
            <table width="600" border="0">
                <tr> 
                    <td>No Transaksi</td>
                    <td><% try {
                            
                            ResultSet notrans = null;
                            notrans = kon.stmt.executeQuery("select max(right(notrans,4)) as no FROM pembayaran");
                            
                            while (notrans.next()) {
                                if (notrans.first() == false) {
                                    out.println("<input type='text' id='input' readonly value='TRANS0001' name='notrans'>");
                                } else {
                                    notrans.last();
                                    int auto = notrans.getInt(1) + 1;
                                    String nomorpesan = String.valueOf(auto);
                                    int noLong = nomorpesan.length();

                                    for (int a = 1; a < 5 - noLong; a++) {
                                        nomorpesan = "0" + nomorpesan;
                                    }
                                    String nomerpesan = "TRANS" + nomorpesan;
                                    out.println("<input type='text' id='input' readonly value='" + nomerpesan + "' name='notrans'>");
                                }
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                        %></td>
                </tr>
                <tr>
                    <td>Tgl. Transaksi</td>     
                    <td><input type="date" name="tgl_trans"></td>
                </tr>
                <tr>
                    <td>NIS</td>
                    <td><input type name="nis" id="input" placeholder="Masukan NIS" onchange="showEmp(this.value);">                             
                        <input  type="hidden" name="nis" id="nis" value=""></td>
                </tr>
                <tr>
                    <td>Nama Siswa</td>
                    <td><input type="text" id="ename" value="" readonly="readonly">
                        <br><i class="fas fa-info-circle"></i> <i>Nama siswa muncul otomatis ketika NIS di input!</i></td>
                </tr>
                <tr>
                    <td>Jenis</td>
                    <td><select name="id_kategori" onchange="jenisbayar(this.value);" id="input">                             
                        <option value="-1">Select</option>
                                <%
                                    rs = kon.stmt.executeQuery("SELECT * FROM kategori ");
                                    while (rs.next()) {
                                        kategori.setId_kategori(rs.getString("id_kategori"));
                                        kategori.setNama_kategori(rs.getString("nama_kategori"));
                                %>
                                <option value="<%=kategori.getId_kategori()%>"><%=kategori.getId_kategori()%> || <%=kategori.getNama_kategori()%></option>
                                <%  } %></select><input  type="hidden" name="id_kategori" id="id_kategori" value=""></td>
                </tr>
                
                <tr>
                    <td>Total</td>
                    <td><input type="text" name="total_pem" id="bayar" value="" readonly="readonly" onkeyup="sum"></td>
                </tr>
                <tr>
                    <td>Dibayar</td>
                    <td><input type="text" name="dibayar" id="jml" onkeyup="sum();"></td>
                </tr>
                <tr>
                    <td>Kembalian</td>
                    <td><input type="text" name="kembali" id="subtotal" readonly="readonly"><script>
                                function sum() {
                                    var txtFirstNumberValue = document.getElementById("bayar").value;
                                    var txtSecondNumberValue = document.getElementById("jml").value;
                                    var result = parseFloat(txtSecondNumberValue) - parseFloat(txtFirstNumberValue);
                                    if (!isNaN(result)) {
                                        document.getElementById("subtotal").value = result;
                                    }
                                } </script></td>
                </tr>
                <tr>
                    <td>Status</td>     

                    <td><select name="status" id="input">
                            <option>Pilih Status</option>
                            <option value="Lunas">Lunas </option>
                            <option value="Belum Lunas">Belum Lunas</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Keterangan</td>     
                    <td><input type="text" name="keterangan">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Simpan" name="aksi" id="biru"></td>
                </tr>
            </table>
        </form>
    </body>
</html>