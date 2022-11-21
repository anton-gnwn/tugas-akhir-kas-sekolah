package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.koneksi;
import model.pembayaran;
import model.siswa;
import model.kategori;
import model.user;
import java.util.Date;

public final class pembayaran_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");

    
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

      out.write(" \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function showEmp(emp_value)\n");
      out.write("    {\n");
      out.write("        if (document.getElementById(\"nis\").value != \"-1\")\n");
      out.write("        {\n");
      out.write("            xmlHttp = GetXmlHttpObject()\n");
      out.write("            if (xmlHttp == null)\n");
      out.write("            {\n");
      out.write("                alert(\"Browser does not support HTTP Request\")\n");
      out.write("                return\n");
      out.write("            }\n");
      out.write("            var url = \"get_siswa.jsp\"\n");
      out.write("            url = url + \"?nis=\" + emp_value\n");
      out.write("\n");
      out.write("            xmlHttp.onreadystatechange = stateChanged\n");
      out.write("            xmlHttp.open(\"GET\", url, true)\n");
      out.write("            xmlHttp.send(null)\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            alert(\"Pilih NIS\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function stateChanged()\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"ename\").value = \"\";\n");
      out.write("        document.getElementById(\"nis\").value = \"\";\n");
      out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
      out.write("        {\n");
      out.write("\n");
      out.write("            var showdata = xmlHttp.responseText;\n");
      out.write("            var strar = showdata.split(\":\");\n");
      out.write("\n");
      out.write("            if (strar.length == 1)\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"nis\").focus();\n");
      out.write("                alert(\"Pilih NIS\");\n");
      out.write("                document.getElementById(\"ename\").value = \" \";\n");
      out.write("                document.getElementById(\"nis\").value = \" \";\n");
      out.write("            } else if (strar.length > 1)\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"ename\").value = strar[1];\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function GetXmlHttpObject()\n");
      out.write("    {\n");
      out.write("        var xmlHttp = null;\n");
      out.write("        try\n");
      out.write("        {\n");
      out.write("            xmlHttp = new XMLHttpRequest();\n");
      out.write("        } catch (e)\n");
      out.write("        {\n");
      out.write("            try\n");
      out.write("            {\n");
      out.write("                xmlHttp = new ActiveXObject(\"Msxml2.XMLHTTP\");\n");
      out.write("            } catch (e)\n");
      out.write("            {\n");
      out.write("                xmlHttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        return xmlHttp;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    function jenisbayar(emp_value)\n");
      out.write("    {\n");
      out.write("        if (document.getElementById(\"id_kategori\").value != \"-1\")\n");
      out.write("        {\n");
      out.write("            xmlHttp = GetXmlHttpObjectbayar()\n");
      out.write("            if (xmlHttp == null)\n");
      out.write("            {\n");
      out.write("                alert(\"Browser does not support HTTP Request\")\n");
      out.write("                return\n");
      out.write("            }\n");
      out.write("            var url = \"get_kategori.jsp\"\n");
      out.write("            url = url + \"?id_kategori=\" + emp_value\n");
      out.write("\n");
      out.write("            xmlHttp.onreadystatechange = stateChangedbayar\n");
      out.write("            xmlHttp.open(\"GET\", url, true)\n");
      out.write("            xmlHttp.send(null)\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            alert(\"Pilih Jenis Bayar\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function stateChangedbayar()\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"bayar\").value = \"\";\n");
      out.write("        document.getElementById(\"id_kategori\").value = \"\";\n");
      out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
      out.write("        {\n");
      out.write("\n");
      out.write("            var showdata = xmlHttp.responseText;\n");
      out.write("            var strar = showdata.split(\":\");\n");
      out.write("\n");
      out.write("            if (strar.length == 1)\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"id_kategori\").focus();\n");
      out.write("                alert(\"Pilih Jenis Bayar\");\n");
      out.write("                document.getElementById(\"bayar\").value = \" \";\n");
      out.write("                document.getElementById(\"id_kategori\").value = \" \";\n");
      out.write("            } else if (strar.length > 1)\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"bayar\").value = strar[1];\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function GetXmlHttpObjectbayar()\n");
      out.write("    {\n");
      out.write("        var xmlHttp = null;\n");
      out.write("        try\n");
      out.write("        {\n");
      out.write("            xmlHttp = new XMLHttpRequest();\n");
      out.write("        } catch (e)\n");
      out.write("        {\n");
      out.write("            try\n");
      out.write("            {\n");
      out.write("                xmlHttp = new ActiveXObject(\"Msxml2.XMLHTTP\");\n");
      out.write("            } catch (e)\n");
      out.write("            {\n");
      out.write("                xmlHttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        return xmlHttp;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("            \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form action=\"pembayaranServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("            <h1 align=\"center\">PEMBAYARAN SISWA</h1>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("            <table width=\"600\" border=\"0\">\n");
      out.write("                <tr> \n");
      out.write("                    <td width=\"95\">No Transaksi</td>\n");
      out.write("                    <td width=\"10\">:</td>\n");
      out.write("                    <td>");
 try {
                            
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
                        
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tgl. Transaksi</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"tgl_trans\" id=\"input\" value=\"");
      out.print( tgl);
      out.write("\" readonly=\"readonly\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("                <hr>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <table width=\"600\" border=\"0\">\n");
      out.write("                    \n");
      out.write("                <tr>\n");
      out.write("                    <td>NIS</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type name=\"nis\" id=\"input\" placeholder=\"Masukan NIS\" onchange=\"showEmp(this.value);\" required>                             \n");
      out.write("                        <input  type=\"hidden\" name=\"nis\" id=\"nis\" value=\"\"></td>\n");
      out.write("                    <td>Jenis Kategori</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><select name=\"id_kategori\" onchange=\"jenisbayar(this.value);\" id=\"input\" required>                             \n");
      out.write("                        <option value=\"-1\">Select</option>\n");
      out.write("                                ");

                                    rs = kon.stmt.executeQuery("SELECT * FROM kategori ");
                                    while (rs.next()) {
                                        kategori.setId_kategori(rs.getString("id_kategori"));
                                        kategori.setNama_kategori(rs.getString("nama_kategori"));
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(kategori.getId_kategori());
      out.write('"');
      out.write('>');
      out.print(kategori.getId_kategori());
      out.write(" || ");
      out.print(kategori.getNama_kategori());
      out.write("</option>\n");
      out.write("                                ");
  } 
      out.write("</select><input  type=\"hidden\" name=\"id_kategori\" id=\"id_kategori\" value=\"\"></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nama Siswa</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" id=\"ename\" value=\"\" readonly=\"readonly\" style=\"width: 232px; height: 20px;\">\n");
      out.write("                        <br><i class=\"fas fa-info-circle\"></i> <i>Nama siswa muncul otomatis ketika NIS di input!</i></td>\n");
      out.write("                    <td>Jumlah Nominal</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"total_pem\" id=\"bayar\" value=\"\" readonly=\"readonly\" onkeyup=\"sum\" style=\"width: 232px; height: 25px;\"></td>\n");
      out.write("                    \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>Dibayar</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"dibayar\" id=\"jml\" onkeyup=\"sum();\" required style=\"width: 232px; height: 25px;\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>Sisa Pembayaran</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"kembali\" id=\"subtotal\" readonly=\"readonly\" style=\"width: 232px; height: 25px;\"><script>\n");
      out.write("                                function sum() {\n");
      out.write("                                    var txtFirstNumberValue = document.getElementById(\"bayar\").value;\n");
      out.write("                                    var txtSecondNumberValue = document.getElementById(\"jml\").value;\n");
      out.write("                                    var result = parseFloat(txtSecondNumberValue) - parseFloat(txtFirstNumberValue);\n");
      out.write("                                    if (!isNaN(result)) {\n");
      out.write("                                        document.getElementById(\"subtotal\").value = result;\n");
      out.write("                                    }\n");
      out.write("                                } </script></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>Status</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><select name=\"status\" id=\"input\" required>\n");
      out.write("                            <option>Pilih Status</option>\n");
      out.write("                            <option value=\"Lunas\">Lunas </option>\n");
      out.write("                            <option value=\"Belum Lunas\">Belum Lunas</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Admin</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"id_user\" value=\"");
      out.print(session.getAttribute("id_user") );
      out.write("\" readonly=\"readonly\"></td>\n");
      out.write("                    <td>Keterangan</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><textarea rows=\"5\" cols=\"30\" name=\"keterangan\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Simpan\" name=\"aksi\" id=\"biru\"><input type=\"reset\" value=\"Batal\" id=\"merah\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#myInput\").on(\"keyup\", function () {\n");
      out.write("                    var value = $(this).val().toLowerCase();\n");
      out.write("                    $(\"#dataTable tr\").filter(function () {\n");
      out.write("                        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <h2 align=\"center\">Transaksi Pembayaran</h2>\n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        <table width=\"90%\" border=\"0\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"120\"></td>\n");
      out.write("                <td><i class=\"fas fa-search\"></i></td>\n");
      out.write("                <td><input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Pencarian\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <table width=\"90%\" border=\"1\" align=\"center\" id=\"table-tampil\">   \n");
      out.write("            <thead>\n");
      out.write("                <tr height=\"50\">\n");
      out.write("                    <th width=\"80\">No Transaksi</th>   \n");
      out.write("                    <th width=\"80\">Tgl. Transaksi</th>  \n");
      out.write("                    <th>NIS</th>  \n");
      out.write("                    <th>Nama</th>  \n");
      out.write("                    <th width=\"50\">Jenis Kategori</th>   \n");
      out.write("                    <th>Nominal</th>  \n");
      out.write("                    <th>Dibayar</th>  \n");
      out.write("                    <th>Sisa</th>  \n");
      out.write("                    <th>Status</th>  \n");
      out.write("                    <th>Keterangan</th>  \n");
      out.write("                    <th>Admin</th>  \n");
      out.write("                </tr>  \n");
      out.write("            </thead>\n");
      out.write("            ");

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
            
      out.write("\n");
      out.write("            <tbody id=\"dataTable\">\n");
      out.write("                <tr id=\"klik\">\n");
      out.write("                    <td align=\"center\">");
 out.println(notrans); 
      out.write("</td>\n");
      out.write("                    <td align=\"center\">");
 out.println(tgl_trans); 
      out.write("</td>\n");
      out.write("                    <td align=\"center\">");
 out.println(nis); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.println(nama_siswa); 
      out.write("</td>\n");
      out.write("                    <td align=\"center\" width=\"40\">");
 out.println(nama_kategori); 
      out.write("</td>\n");
      out.write("                    <td align=\"right\">Rp. ");
 out.println(total_pem); 
      out.write("</td>\n");
      out.write("                    <td align=\"right\">Rp. ");
 out.println(dibayar); 
      out.write("</td>\n");
      out.write("                    <td align=\"right\">Rp. ");
 out.println(kembali); 
      out.write("</td>\n");
      out.write("                    <td align=\"center\">");
 out.println(status);
                        
                        if (status.equals("Lunas"))
                        {
                            out.print("<i class='fas fa-check-circle' style='color: limegreen; font-size: 16px;'></i>"); 
                        } else if (status.equals("Belum Lunas"))
                        {
                            out.print("<i class='fas fa-minus-circle' style='color: red; font-size: 16px;'></i>");
                        }
                        
                        
      out.write("</td>\n");
      out.write("                    <td align=\"center\">");
 out.println(keterangan); 
      out.write("</td>\n");
      out.write("                    <td align=\"center\">");
 out.println(id_user); 
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                   \n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>                        \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
