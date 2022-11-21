<%@page import="java.sql.ResultSet"%>
<%@page import="control.koneksi"%>
<%@page import="model.pembayaran"%>
<%@page import="model.siswa"%>
<%@page import="model.kategori"%>
<%@page import="model.user"%>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script src="js/jquery.min.js"></script>

<%
    
    java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun+"-"+bulan+"-"+tanggal;
    String tgl2 = tahun+""+bulan;
    
    siswa siswa = new siswa();
    pembayaran pem = new pembayaran();
    kategori kategori = new kategori();
    user usr = new user();
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

            <h1 align="center">PEMBAYARAN SISWA</h1>
            <hr>
            <br>
            <table width="600" border="0">
                <tr> 
                    <td width="95">No Transaksi</td>
                    <td width="10">:</td>
                    <td><% try {
                            
                            ResultSet notrans = null;
                            notrans = kon.stmt.executeQuery("select max(right(notrans,4)) as no FROM pembayaran");
                            
                            while (notrans.next()) {
                                if (notrans.first() == false) {
                                    out.println("<input type='text' id='input' readonly name='notrans'>");
                                } else {
                                    notrans.last();
                                    int auto = notrans.getInt(1) + 1;
                                    String nomorpesan = String.valueOf(auto);
                                    int noLong = nomorpesan.length();

                                    for (int a = 1; a < 5 - noLong; a++) {
                                        nomorpesan = "0" + nomorpesan;
                                    }
                                    String nomerpesan = tgl2 + nomorpesan;
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
                    <td>:</td>
                    <td><input type="text" name="tgl_trans" id="input" value="<%= tgl%>" readonly="readonly"></td>
                </tr>
            </table>
                
                <hr>
                <br>
                
                <table width="600" border="0">
                    
                <tr>
                    <td>NIS</td>
                    <td>:</td>
                    <td><input type name="nis" id="input" placeholder="Masukan NIS" onchange="showEmp(this.value);" required>                             
                        <input  type="hidden" name="nis" id="nis" value=""></td>
                    <td>Jenis Kategori</td>
                    <td>:</td>
                    <td><select name="id_kategori" onchange="jenisbayar(this.value);" id="input" required>                             
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
                    
                </tr>
                <tr>
                    <td>Nama Siswa</td>
                    <td>:</td>
                    <td><input type="text" id="ename" value="" readonly="readonly" style="width: 232px; height: 20px;">
                        <br><i class="fas fa-info-circle"></i> <i>Nama siswa muncul otomatis ketika NIS di input!</i></td>
                    <td>Jumlah Nominal</td>
                    <td>:</td>
                    <td><input type="text" name="total_pem" id="bayar" value="" readonly="readonly" onkeyup="sum" style="width: 232px; height: 25px;"></td>
                    
                    </td>
                </tr>
                
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>Dibayar</td>
                    <td>:</td>
                    <td><input type="text" name="dibayar" id="jml" onkeyup="sum();" required style="width: 232px; height: 25px;"></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>Sisa Pembayaran</td>
                    <td>:</td>
                    <td><input type="text" name="kembali" id="subtotal" readonly="readonly" style="width: 232px; height: 25px;"><script>
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
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>Status</td>
                    <td>:</td>
                    <td><select name="status" id="input" required>
                            <option>Pilih Status</option>
                            <option value="Lunas">Lunas </option>
                            <option value="Belum Lunas">Belum Lunas</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Admin</td>
                    <td>:</td>
                    <td><input type="text" name="id_user" value="<%=session.getAttribute("id_user") %>" readonly="readonly"></td>
                    <td>Keterangan</td>
                    <td>:</td>
                    <td><textarea rows="5" cols="30" name="keterangan"></textarea></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Simpan" name="aksi" id="biru"><input type="reset" value="Batal" id="merah"></td>
                </tr>
            </table>
        </form>
        <hr>
        <br>

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
        <h2 align="center">Transaksi Pembayaran</h2>
        <br>
        <hr>
        
        <table width="90%" border="0" align="center">
            <tr>
                <td width="120"></td>
                <td><i class="fas fa-search"></i></td>
                <td><input type="text" id="myInput" onkeyup="myFunction()" placeholder="Pencarian"></td>
            </tr>
        </table>
        <table width="90%" border="1" align="center" id="table-tampil">   
            <thead>
                <tr height="50">
                    <th width="80">No Transaksi</th>   
                    <th width="80">Tgl. Transaksi</th>  
                    <th>NIS</th>  
                    <th>Nama</th>  
                    <th width="50">Jenis Kategori</th>   
                    <th>Nominal</th>  
                    <th>Dibayar</th>  
                    <th>Sisa</th>  
                    <th>Status</th>  
                    <th>Keterangan</th>  
                    <th>Admin</th>  
                </tr>  
            </thead>
            <%
                String notrans = null;
                String tgl_trans = null;
                String nis = null;
                String id_kategori = null;
                String total_pem = null;
                String dibayar = null;
                String kembali = null;
                String status = null;
                String keterangan = null;
                String nama_kategori = null;
                String nama_siswa = null;
                String id_user = null;
                
                rs = kon.stmt.executeQuery("SELECT * FROM pembayaran JOIN detail_pembayaran ON pembayaran.notrans=detail_pembayaran.notrans "
                        + "JOIN siswa ON detail_pembayaran.nis=siswa.nis "
                        + "JOIN kategori ON pembayaran.id_kategori=kategori.id_kategori "
                        + "JOIN user ON pembayaran.id_user=user.id_user ORDER BY tgl_trans DESC LIMIT 8");

                while (rs.next()) {
                    notrans = rs.getString("notrans");
                    tgl_trans = rs.getString(2);
                    id_kategori = rs.getString(3);
                    status = rs.getString(4);
                    keterangan = rs.getString(5);
                    nis = rs.getString(8);
                    total_pem = rs.getString(9);
                    dibayar = rs.getString(10);
                    kembali = rs.getString(11);
                    nama_siswa = rs.getString(13);
                    nama_kategori = rs.getString(21);
                    id_user = rs.getString(24);
            %>
            <tbody id="dataTable">
                <tr id="klik">
                    <td align="center"><% out.println(notrans); %></td>
                    <td align="center"><% out.println(tgl_trans); %></td>
                    <td align="center"><% out.println(nis); %></td>
                    <td><% out.println(nama_siswa); %></td>
                    <td align="center" width="40"><% out.println(nama_kategori); %></td>
                    <td align="right">Rp. <% out.println(total_pem); %></td>
                    <td align="right">Rp. <% out.println(dibayar); %></td>
                    <td align="right">Rp. <% out.println(kembali); %></td>
                    <td align="center"><% out.println(status);
                        
                        if (status.equals("Lunas"))
                        {
                            out.print("<i class='fas fa-check-circle' style='color: limegreen; font-size: 16px;'></i>"); 
                        } else if (status.equals("Belum Lunas"))
                        {
                            out.print("<i class='fas fa-minus-circle' style='color: red; font-size: 16px;'></i>");
                        }
                        
                        %></td>
                    <td align="center"><% out.println(keterangan); %></td>
                    <td align="center"><% out.println(id_user); %></td>
                    </tr>

                <% } %>
                   
                
            </tbody>
        </table>                        
    </body>
</html>