package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;

public final class input_005fkategori_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MTS NURUL YAQIIN | Tambah Data Guru</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"kategoriServlet\"> \n");
      out.write("            <h1 align=\"center\"> TAMBAH DATA KATEGORI</h1><br>\n");
      out.write("            <hr>\n");
      out.write("            <table border=\"0\" width=\"600\"> \n");
      out.write("                <tr>     \n");
      out.write("                    <td>ID Kategori</td>\n");
      out.write("                    <td>\n");
      out.write("                        ");

                            try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(id_kategori,2)) as no FROM kategori");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' id='input' readonly value='KG01' name='id_kategori'>");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 3 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "KG" + nomorkm;
                                            out.println("<input type='text' class='form-control' id='input' readonly value='" + nomerkm + "'name='id_kategori'>");
                                        }
                                    }
                                } catch (Exception e) {
                                    out.println(e);
                                }


                        
      out.write("</td>\n");
      out.write("                </tr> \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Nama Kategori</td>     \n");
      out.write("                    <td><input type=\"text\" name=\"nama_kategori\" id=\"input\" required></td> \n");
      out.write("                </tr>            \n");
      out.write("                <tr>    \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Nominal</td>     \n");
      out.write("                    <td><input type=\"text\" name=\"nominal\" id=\"input\" required></td> \n");
      out.write("                </tr>            \n");
      out.write("                <tr>    \n");
      out.write("                    <td><a href=\"beranda.jsp?hal=tampil_kategori\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td>     \n");
      out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Simpan\" id=\"biru\"> \n");
      out.write("                        <input type=\"reset\" value=\"Batal\" id=\"merah\"></td> \n");
      out.write("                </tr> \n");
      out.write("            </table> \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
