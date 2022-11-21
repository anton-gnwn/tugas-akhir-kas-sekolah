<%@page import="java.sql.ResultSet"%>
<%@page import="control.koneksi"%>
<%@page import="model.jurnal"%>
<%@page import="model.akun"%>
<%@page import="model.pembayaran"%>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script src="js/jquery.min.js"></script>

<%
    akun akun = new akun();
    jurnal jurnal = new jurnal();
    pembayaran pem = new pembayaran();
    koneksi kon = new koneksi();
    ResultSet rs = null;
%> 

<script>
    function showEmp(emp_value)
    {
        if (document.getElementById("no_akun").value != "-1")
        {
            xmlHttp = GetXmlHttpObject()
            if (xmlHttp == null)
            {
                alert("Browser does not support HTTP Request")
                return
            }
            var url = "get_akun.jsp"
            url = url + "?no_akun=" + emp_value

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
        document.getElementById("no_akun").value = "";
        if (xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
        {

            var showdata = xmlHttp.responseText;
            var strar = showdata.split(":");

            if (strar.length == 1)
            {
                document.getElementById("no_akun").focus();
                alert("Pilih NIS");
                document.getElementById("ename").value = " ";
                document.getElementById("no_akun").value = " ";
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
    
    
    function showEmp2(emp_value)
    {
        if (document.getElementById("no_akun").value != "-1")
        {
            xmlHttp = GetXmlHttpObjectbayar()
            if (xmlHttp == null)
            {
                alert("Browser does not support HTTP Request")
                return
            }
            var url = "get_akun.jsp"
            url = url + "?no_akun=" + emp_value

            xmlHttp.onreadystatechange = stateChangedbayar
            xmlHttp.open("GET", url, true)
            xmlHttp.send(null)
        } else
        {
            alert("Pilih No Akun");
        }
    }

    function stateChangedbayar()
    {
        document.getElementById("nama_akun").value = "";
        document.getElementById("no_akun").value = "";
        if (xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
        {

            var showdata = xmlHttp.responseText;
            var strar = showdata.split(":");

            if (strar.length == 1)
            {
                document.getElementById("no_akun").focus();
                alert("Pilih No Akun");
                document.getElementById("nama_akun").value = " ";
                document.getElementById("no_akun").value = " ";
            } else if (strar.length > 1)
            {
                document.getElementById("nama_akun").value = strar[1];
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
    

    function showEmp3(emp_value)
    {
        if (document.getElementById("notrans").value != "-1")
        {
            xmlHttp = GetXmlHttpObjectTrans()
            if (xmlHttp == null)
            {
                alert("Browser does not support HTTP Request")
                return
            }
            var url = "get_pembayaran.jsp"
            url = url + "?notrans=" + emp_value

            xmlHttp.onreadystatechange = stateChangedTrans
            xmlHttp.open("GET", url, true)
            xmlHttp.send(null)
        } else
        {
            alert("Pilih No Transaksi");
        }
    }

    function stateChangedTrans()
    {
        document.getElementById("debet1").value = "";
        document.getElementById("kredit2").value = "";
        document.getElementById("notrans").value = "";
        if (xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
        {

            var showdata = xmlHttp.responseText;
            var strar = showdata.split(":");

            if (strar.length == 1)
            {
                document.getElementById("no_akun").focus();
                alert("Pilih No Trans");
                document.getElementById("debet1").value = " ";
                document.getElementById("notrans").value = " ";
                document.getElementById("kredit2").value = " ";
            } else if (strar.length > 1)
            {
                document.getElementById("debet1").value = strar[1];
                document.getElementById("kredit2").value = strar[1];
            }


        }
    }

    function GetXmlHttpObjectTrans()
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

        <form action="jurnalServlet" method="post">

            <h1 align="center">JURNAL</h1>
            <hr>
            <table border="0">
                <tr>
                    <td width="80">Pilih Jurnal</td>
                    <td width="8">:</td>
                    <td>
                        <select id="pilihan" onclick="myFunction()" style="width: 232px; height: 25px;">
                            <option value="test_jurnal">Pembayaran Siswa</option>
                            <option value="jurnal">Biaya Operasional</option>
                        </select>
                    </td>
                </tr>
            </table>
            <p id="demo"></p>

            <script>
                function myFunction() {
                     var x = document.getElementById("pilihan").value;
                     document.getElementById("demo").innerHTML = "<a href='beranda.jsp?hal="+x+"'></a>";
                        }
            </script>
            
            <hr>
            <br>
            <table width="600" border="0">
                <tr>
                    <td>Tgl. Jurnal</td>
                    <td>:</td>
                    <td width="500"><input type="date" name="tgl_jurnal" step="7" value="2020-01-01" id="input"</td>
                    <td>No. Transaksi</td>
                    <td>:</td>
                    <td width="100"><select name="notrans" id="input" onchange="showEmp3(this.value);">
                            <option value="#">- Pilih -</option>
                            <%
                                rs = kon.stmt.executeQuery("SELECT notrans FROM detail_pembayaran");
                                while (rs.next()) {
                                    pem.setNotrans(rs.getString("notrans"));
                            %>

                            <option value="<%=pem.getNotrans()%>"><%=pem.getNotrans()%></option>
                            <% }%>
                        </select><input type="hidden" name="notrans" id="notrans" value=""</td>
                </tr>
                <tr>
                    <td>Keterangan</td>
                    <td>:</td>
                    <td colspan="4"><input type="text" name="ket_jurnal" style="width: 332px; height: 25px;"</td>
                </tr>
            </table>
            <hr>
            <br>
            <table width="90%" border="1" align="center" id="table-tampil">
                <tr>
                    <th>No</th>
                    <th colspan="2">No Akun</th>
                    <th>Nama Akun</th>
                    <th>Debet</th>
                    <th>Kredit</th>
                </tr>
                <tr>
                    <td rowspan="2"><div class="nojurnal">
                        <% try {
                            
                            ResultSet nojurnal = null;
                            nojurnal = kon.stmt.executeQuery("select max(right(nojurnal,4)) as no FROM jurnal");
                            
                            while (nojurnal.next()) {
                                if (nojurnal.first() == false) {
                                    out.println("<input type='text' id='no-jurnal' readonly value='J0001' name='nojurnal'>");
                                } else {
                                    nojurnal.last();
                                    int auto = nojurnal.getInt(1) + 1;
                                    String nomorpesan = String.valueOf(auto);
                                    int noLong = nomorpesan.length();

                                    for (int a = 1; a < 5 - noLong; a++) {
                                        nomorpesan = "0" + nomorpesan;
                                    }
                                    String nomerpesan = "J" + nomorpesan;
                                    out.println("<input type='text' id='no-jurnal' readonly value='" + nomerpesan + "' name='nojurnal' style='width: 50px; height: 60px; text-align: center;'>");
                                }
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                        %>
                        </div></td>
                    
                    <td><input type="checkbox" name="pilih" value="${param.pilih}"</td>
                    <td><select name="no_akun" onchange="showEmp(this.value);" id="input">                             
                        <option value="-1">Select</option>
                                <%
                                    rs = kon.stmt.executeQuery("SELECT * FROM akun ");
                                    while (rs.next()) {
                                        akun.setNo_akun(rs.getString("no_akun"));
                                        akun.setNama_akun(rs.getString("nama_akun"));
                                %>
                                <option value="<%=akun.getNo_akun()%>"><%=akun.getNo_akun()%></option>
                                <%  } %></select><input  type="hidden" name="no_akun" id="no_akun" value=""></td>
                    
                    <td><input type="text" name="nama_akun" id="ename" value="" readonly="readonly" style="width: 232px; height: 25px;"></td>
                    
                    <td><input type="text" name="debet" id="debet1" value="0" style="width: 150px; height: 25px;"></td>
                    
                    <td><input type="text" name="kredit" id="kredit1" value="0" style="width: 150px; height: 25px;"></td>
                </tr>
                <tr>
                    <td><input type="checkbox" name="pilih" value="${param.pilih}"</td>
                    <td><select name="no_akun" onchange="showEmp2(this.value);" id="input">                             
                        <option value="-1">Select</option>
                                <%
                                    rs = kon.stmt.executeQuery("SELECT * FROM akun ");
                                    while (rs.next()) {
                                        akun.setNo_akun(rs.getString("no_akun"));
                                        akun.setNama_akun(rs.getString("nama_akun"));
                                %>
                                <option value="<%=akun.getNo_akun()%>"><%=akun.getNo_akun()%></option>
                                <%  } %></select><input  type="hidden" name="no_akun" id="no_akun" value=""></td>
                    
                    <td><input type="text" name="nama_akun" id="nama_akun" value="" readonly="readonly" style="width: 232px; height: 25px;"></td>
                    
                    <td><input type="text" name="debet" id="debet2" value="0" style="width: 150px; height: 25px;"></td>
                    
                    <td><input type="text" name="kredit" id="kredit2" value="0" style="width: 150px; height: 25px;"></td>
                </tr>
                
                <tr>
                    <th colspan="4">Total</th>
                    <td><input type="text" id="Ttldebet" onkeyup="Hitung()" readonly="readonly" style="width: 150px; height: 25px;"></td>
                    <td><input type="text" id="Ttlkredit" onkeyup="Hitung()" readonly="readonly" style="width: 150px; height: 25px;"></td>
                </tr>
                <tr>
                    <th colspan="4">Balance</th>
                    <th></th>
                    <td><input type="text" id="Balance" name="balance" readonly="readonly" style="width: 150px; height: 25px;"></td>
                </tr>
            </table>
                                <input type="submit" value="Simpan" name="aksi" id="biru">
                                <input type="reset" value="Batal" id="merah">
        </form>
        <hr>
        <br>

                                
    </body>
    <script>
        function Hitung(){
        var kre1 = document.getElementById("kredit1").value;
        var kre2 = document.getElementById("kredit2").value;
        
        var Totkre = parseInt(kre1) + parseInt(kre2);
        document.getElementById("Ttlkredit").value = parseInt(Totkre);
        
        var deb1 = document.getElementById("debet1").value;
        var deb2 = document.getElementById("debet2").value;
        
        var Totdeb = parseInt(deb1) + parseInt(deb2);
        document.getElementById("Ttldebet").value = parseInt(Totdeb);
        
        var Total = parseInt(Totdeb) - parseInt(Totkre);
        document.getElementById("Balance").value = parseInt(Total);
    }   
    
    
    </script>
</html>