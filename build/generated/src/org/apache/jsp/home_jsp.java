package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;
import model.siswa;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MTS NURUL YAQIIN</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <img src=\"img/logo-mts.png\" class=\"logo-mts\" \n");
      out.write("             style=\"width: 110px; \n");
      out.write("                    height: 110px; \n");
      out.write("                    float: left; \n");
      out.write("                    padding-left: 50px;\n");
      out.write("                    padding-top: 5px;\n");
      out.write("                    padding-bottom: 10px;\n");
      out.write("                    margin-right: -100px;\">\n");
      out.write("        <img src=\"img/logo-kota-tangerang.png\" class=\"logo-mts\" \n");
      out.write("             style=\"width: 110px; \n");
      out.write("                    height: 110px; \n");
      out.write("                    float: right; \n");
      out.write("                    padding-right: 50px;\n");
      out.write("                    padding-top: 5px;\n");
      out.write("                    padding-bottom: 10px;\n");
      out.write("                    margin-left: -100px;\">\n");
      out.write("    <center><h1><br>SELAMAT DATANG DI WEBSITE ADMINISTRASI <br> MTS NURUL YAQIIN KOTA TANGERANG</h1></center>\n");
      out.write("        \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("           \n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <br>\n");
      out.write("        \n");
      out.write("            ");

                String nis = null;
                
                koneksi kon = new koneksi();
                ResultSet rs = null;
                rs = kon.stmt.executeQuery("SELECT COUNT(*) AS nis FROM siswa WHERE kelas='VII'");

                if (rs.next()) {
                    nis = rs.getString("nis");
            
      out.write("\n");
      out.write("        \n");
      out.write("            <div class=\"kolom1\">\n");
      out.write("            Kelas VII <br> ");
 out.println(nis); 
      out.write(" Siswa\n");
      out.write("            </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                
                rs = kon.stmt.executeQuery("SELECT COUNT(*) AS nis FROM siswa WHERE kelas='VIII'");

                if (rs.next()) {
                    nis = rs.getString("nis");
            
      out.write("\n");
      out.write("        \n");
      out.write("            <div class=\"kolom2\" style=\"margin-left: 125px;\">\n");
      out.write("            Kelas VIII <br> ");
 out.println(nis); 
      out.write(" Siswa\n");
      out.write("            </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                
                rs = kon.stmt.executeQuery("SELECT COUNT(*) AS nis FROM siswa WHERE kelas='IX'");

                if (rs.next()) {
                    nis = rs.getString("nis");
            
      out.write("\n");
      out.write("        \n");
      out.write("            <div class=\"kolom3\" style=\"margin-left: 125px;\">\n");
      out.write("            Kelas IX <br> ");
 out.println(nis); 
      out.write(" Siswa\n");
      out.write("            </div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div style=\"float: bottom; margin-top: 150px; margin-bottom: 10px;\">\n");
      out.write("                <h3 align=\"center\">ALAMAT :</h3>\n");
      out.write("                <p align=\"center\">Jl. Raden Fatah Gg. Masjid II RT. 01/10 Parung Serab, Sudimara Selatan,\n");
      out.write("                    <br> Ciledug - Kota Tangerang. No Telp. 021-7344 1601 / 0856 7746 235\n");
      out.write("            </p></div>\n");
      out.write("        \n");
      out.write("        <script src=\"js/all.js\"></script>\n");
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
