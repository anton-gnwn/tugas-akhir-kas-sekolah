package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;

public final class input_005fsiswa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>MTS NURUL YAQIIN | Tambah Data Siswa</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"config/all.css\">\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"siswaServlet\"> \n");
      out.write("            <h1 align=\"center\">TAMBAH DATA SISWA</h1><br>\n");
      out.write("            <hr>\n");
      out.write("            <table border=\"0\" width=\"600\"> \n");
      out.write("                <tr>     \n");
      out.write("                    <td width=\"250\">NIS</td>  \n");
      out.write("                    <td>:</td> \n");
      out.write("                    <td><input type=\"text\" name=\"nis\" id=\"input\" required></td> \n");
      out.write("\n");
      out.write("                </tr> \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Nama Lengkap</td> \n");
      out.write("                    <td>:</td> \n");
      out.write("                    <td><input type=\"text\" name=\"nama_siswa\" id=\"input\" required></td> \n");
      out.write("                </tr> \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Tempat Lahir</td>   \n");
      out.write("                    <td>:</td> \n");
      out.write("                    <td><input type=\"text\" name=\"tempat\" id=\"input\" required></td> \n");
      out.write("                </tr> \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Tanggal Lahir</td>   \n");
      out.write("                    <td>:</td> \n");
      out.write("                    <td><input type=\"date\" name=\"tgl_lahir\" value=\"2000-01-01\" required style=\"width: 232px; height: 25px;\"></td> \n");
      out.write("                </tr> \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Jenis Kelamin</td>  \n");
      out.write("                    <td>:</td> \n");
      out.write("                    <td><select name=\"jenis_kelamin\" id=\"input\" required>     \n");
      out.write("                            <option value=\"#\">- Pilih Jenis Kelamin -</option>     \n");
      out.write("                            <option value=\"Laki-laki\">Laki-laki</option>     \n");
      out.write("                            <option value=\"Perempuan\">Perempuan</option>     \n");
      out.write("                        </select>\n");
      out.write("                        </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>     \n");
      out.write("                    <td>Alamat</td>     \n");
      out.write("                    <td>:</td> \n");
      out.write("                    <td><textarea rows=\"5\" cols=\"30\" name=\"alamat\" required></textarea></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>     \n");
      out.write("                    <td>Nomor Telepon</td> \n");
      out.write("                    <td>:</td> \n");
      out.write("                    <td><input type=\"number\" name=\"no_telp\" id=\"input\"></td> \n");
      out.write("                </tr> \n");
      out.write("                \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Kelas</td>   \n");
      out.write("                    <td>:</td> \n");
      out.write("                    <td><select name=\"kelas\" id=\"input\">\n");
      out.write("                            <option value=\"#\">- Pilih Kelas -</option>\n");
      out.write("                            <option value=\"VII\">VII</option>\n");
      out.write("                            <option value=\"VIII\">VIII</option>\n");
      out.write("                            <option value=\"IX\">IX</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>    \n");
      out.write("                    <td><a href=\"beranda.jsp?hal=tampil_siswa\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td>     \n");
      out.write("                    <td></td> \n");
      out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Simpan\" class=\"");
      out.print(session.getAttribute("hak_akses") );
      out.write("\" id=\"biru\"> <input type=\"reset\" value=\"Batal\" id=\"merah\"></td> \n");
      out.write("                </tr> \n");
      out.write("            </table> \n");
      out.write("        </form>\n");
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
