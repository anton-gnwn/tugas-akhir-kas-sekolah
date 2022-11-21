package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.koneksi;
import model.pembayaran;
import model.siswa;
import model.kategori;
import java.util.Date;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");

    siswa siswa = new siswa();
    pembayaran pem = new pembayaran();
    kategori kategori = new kategori();
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
      out.write("            <h1 align=\"center\">PEMBAYARAN SPP</h1>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("            <table width=\"600\" border=\"0\">\n");
      out.write("                <tr> \n");
      out.write("                    <td>No Transaksi</td>\n");
      out.write("                    <td>");
 try {
                            
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
                        
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tgl. Transaksi</td>     \n");
      out.write("                    <td><input type=\"date\" name=\"tgl_trans\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>NIS</td>\n");
      out.write("                    <td><input type name=\"nis\" id=\"input\" placeholder=\"Masukan NIS\" onchange=\"showEmp(this.value);\">                             \n");
      out.write("                        <input  type=\"hidden\" name=\"nis\" id=\"nis\" value=\"\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nama Siswa</td>\n");
      out.write("                    <td><input type=\"text\" id=\"ename\" value=\"\" readonly=\"readonly\">\n");
      out.write("                        <br><i class=\"fas fa-info-circle\"></i> <i>Nama siswa muncul otomatis ketika NIS di input!</i></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Jenis</td>\n");
      out.write("                    <td><select name=\"id_kategori\" onchange=\"jenisbayar(this.value);\" id=\"input\">                             \n");
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
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Total</td>\n");
      out.write("                    <td><input type=\"text\" name=\"total_pem\" id=\"bayar\" value=\"\" readonly=\"readonly\" onkeyup=\"sum\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Dibayar</td>\n");
      out.write("                    <td><input type=\"text\" name=\"dibayar\" id=\"jml\" onkeyup=\"sum();\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Kembalian</td>\n");
      out.write("                    <td><input type=\"text\" name=\"kembali\" id=\"subtotal\" readonly=\"readonly\"><script>\n");
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
      out.write("                    <td>Status</td>     \n");
      out.write("\n");
      out.write("                    <td><select name=\"status\" id=\"input\">\n");
      out.write("                            <option>Pilih Status</option>\n");
      out.write("                            <option value=\"Lunas\">Lunas </option>\n");
      out.write("                            <option value=\"Belum Lunas\">Belum Lunas</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Keterangan</td>     \n");
      out.write("                    <td><input type=\"text\" name=\"keterangan\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Simpan\" name=\"aksi\" id=\"biru\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
