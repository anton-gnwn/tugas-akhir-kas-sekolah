package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;

public final class tampil_005fkategori_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Halaman | Data Guru</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#myInput\").on(\"keyup\", function () {\n");
      out.write("                var value = $(this).val().toLowerCase();\n");
      out.write("                $(\"#dataTable tr\").filter(function () {\n");
      out.write("                    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <center><h1>DATA KATEGORI</h1><br></center>\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <table width=\"90%\" border=\"0\" align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <td><a href=\"beranda.jsp?hal=input_kategori\" id=\"biru\" ><i class=\"fas fa-plus-circle\"></i> TAMBAH DATA</a></td>\n");
      out.write("            <td><i class=\"fas fa-search\"></i></td>\n");
      out.write("            <td><input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Pencarian\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <table width=\"90%\" border=\"1\" align=\"center\" class=\"display\">\n");
      out.write("        <thead>    \n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <th height=\"30px\">ID KATEGORI</th>\n");
      out.write("                <th>NAMA KATEGORI</th>\n");
      out.write("                <th>NOMINAL</th>\n");
      out.write("                <th>AKSI</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("\n");
      out.write("        ");

            String id_kategori = null;
            String nama_kategori = null;
            String nominal = null;
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM kategori ORDER BY id_kategori asc");

            while (rs.next()) {
                id_kategori = rs.getString("id_kategori");
                nama_kategori = rs.getString(2);
                nominal = rs.getString(3);
        
      out.write(" \n");
      out.write("\n");
      out.write("        <tbody  id=\"dataTable\">\n");
      out.write("            <tr id=\"klik\">          \n");
      out.write("                <td align=\"center\">");
 out.println(id_kategori); 
      out.write("</center></td>      \n");
      out.write("                <td>");
 out.println(nama_kategori); 
      out.write("</td>      \n");
      out.write("                <td>Rp. ");
 out.println(nominal); 
      out.write("</td>      \n");
      out.write("                <td align=\"center\"><a href=\"beranda.jsp?hal=edit_kategori&id_kategori=");
 out.print(id_kategori); 
      out.write("\" id=\"hijau\">EDIT</a>\n");
      out.write("                    <a href=\"kategoriServlet?aksi=Delete&id_kategori=");
 out.print(id_kategori);
      out.write("\" id=\"merah\">HAPUS</a>\n");
      out.write("                </td>      \n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    ");
 kon.close();
      out.write(" \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
