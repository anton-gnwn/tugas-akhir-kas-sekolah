package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>MTs Nurul Yaqiin Kota Tangerang</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                \n");
      out.write("                <h1><a><b>MTS NURUL YAQIIN KOTA TANGERANG</b></a></h1>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"#\">Home</a></li>\n");
      out.write("                    <li><a href=\"#\">About</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"middle\">\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <li class=\"item\" id=\"master\">\n");
      out.write("                    <a class=\"btn\" href=\"#master\">\n");
      out.write("                        <i class=\"far fa-user\"></i>\n");
      out.write("                        Master Data\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"smenu\">\n");
      out.write("                        <a href=\"#\">Data Siswa</a>\n");
      out.write("                        <a href=\"#\">Data Kategori</a>\n");
      out.write("                        <a href=\"#\">Data Akun</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"item\" id=\"transaksi\" style=\"list-style-type: none;\">\n");
      out.write("                    <a class=\"btn\" href=\"#transaksi\">\n");
      out.write("                        <i class=\"fas fa-cash-register\"></i>\n");
      out.write("                        Transaksi\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"smenu\">\n");
      out.write("                        <a href=\"#\">Pembayaran Siswa</a>\n");
      out.write("                        <a href=\"#\">Biaya Operasional</a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                 \n");
      out.write("                <li class=\"item\" id=\"jurnal\" style=\"list-style-type: none;\">\n");
      out.write("                    <a class=\"btn\" href=\"#\">\n");
      out.write("                        <i class=\"fas fa-newspaper\"></i>\n");
      out.write("                        Jurnal\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"smenu\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li class=\"item\" id=\"laporan\" style=\"list-style-type: none;\">\n");
      out.write("                    <a class=\"btn\" href=\"#laporan\">\n");
      out.write("                        <i class=\"fas fa-layer-group\"></i>\n");
      out.write("                        Laporan\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"smenu\">\n");
      out.write("                        <a href=\"#\">Penerimaan Kas</a>\n");
      out.write("                        <a href=\"#\">Biaya Operasional</a>\n");
      out.write("                        <a href=\"#\">Jurnal</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"item\" id=\"pengaturan\" style=\"list-style-type: none;\">\n");
      out.write("                    <a class=\"btn\" href=\"#pengaturan\">\n");
      out.write("                        <i class=\"fas fa-cog\"></i>\n");
      out.write("                        Pengaturan\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"smenu\">\n");
      out.write("                        <a href=\"#\">Edit Profil</a>\n");
      out.write("                        <a href=\"#\">Backup & Restore</a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"item\" id=\"laporan\" style=\"list-style-type: none;\">\n");
      out.write("                    <a class=\"btn\" href=\"login?proses=logout\">\n");
      out.write("                        <i class=\"fas fa-sign-out-alt\"></i>\n");
      out.write("                        Logout\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <table width=\"75%\" border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"top\">\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                       <div class=\"footer\">\n");
      out.write("                           Support By Mahasiswa <br> \n");
      out.write("                           Universitas Bina Sarana Informatika Program Studi Sistem Informasi Akuntansi<br>\n");
      out.write("                           <i id=\"fb\" class=\"fab fa-facebook-square\"></i> Bina Sarana Informatika\n");
      out.write("                           <i id=\"tw\" class=\"fab fa-twitter-square\"></i> @kuliahbsiaja\n");
      out.write("                           <i id=\"ig\" class=\"fab fa-instagram\"></i> @kuliahbsiaja\n");
      out.write("                       </div>        \n");
      out.write("                </div>\n");
      out.write("            <div style=\"clear: both\"></div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/all.js\"></script>\n");
      out.write("        \n");
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
