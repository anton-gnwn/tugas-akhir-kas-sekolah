package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;

public final class edit_005fsiswa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    String nis = request.getParameter("nis");
    String nama_siswa = null;
    String tempat = null;
    String tgl_lahir = null;
    String jenis_kelamin = null;
    String alamat = null;
    String no_telp = null;
    String kelas = null;
    
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM siswa where nis= '" + nis + "'");
    if (rs.next()) {
        nis = rs.getString(1);
        nama_siswa = rs.getString(2);
        tempat = rs.getString(3);
        tgl_lahir = rs.getString(4);
        jenis_kelamin = rs.getString(5);
        alamat = rs.getString(6);
        no_telp = rs.getString(7);
        kelas = rs.getString(8);
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Ubah Data Siswa</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"POST\" action=\"siswaServlet\"> \n");
      out.write("            <h1 align=\"center\"> UBAH DATA SISWA</h1><br>\n");
      out.write("            <hr>\n");
      out.write("            <table border=\"0\"> \n");
      out.write("                <tr>\n");
      out.write("                <td>NIS</td>     \n");
      out.write("                <td>:</td>     \n");
      out.write("                <td><input type=\"text\" name=\"nis\" value=\"");
      out.print(nis);
      out.write("\" id=\"input\" readonly=\"readonly\" >\n");
      out.write("                    \n");
      out.write("                </td> \n");
      out.write("                </tr> \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Nama Siswa</td>     \n");
      out.write("                    <td>:</td>     \n");
      out.write("                    <td><input type=\"text\" name=\"nama_siswa\" value=\"");
      out.print(nama_siswa);
      out.write("\" id=\"input\"></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>     \n");
      out.write("                    <td>Tempat Tanggal Lahir</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"tempat\" value=\"");
      out.print(tempat);
      out.write("\" id=\"input\">\n");
      out.write("                        <input type=\"date\" name=\"tgl_lahir\" value=\"");
      out.print(tgl_lahir);
      out.write("\" value=\"2000-01-01\" style=\"width: 135px; height: 25px;\"></td> \n");
      out.write("                </tr> \n");
      out.write("                \n");
      out.write("                <tr>     \n");
      out.write("                    <td>Jenis Kelamin</td>     \n");
      out.write("                    <td>:</td>     \n");
      out.write("                    <td>\n");
      out.write("                        ");
 if (jenis_kelamin.equalsIgnoreCase("Laki-laki")) { 
      out.write("\n");
      out.write("\n");
      out.write("                        <select name=\"jenis_kelamin\" id=\"input\">     \n");
      out.write("                            <option value=\"#\">- Pilih Jenis Kelamin -</option>     \n");
      out.write("                            <option value=\"Laki-laki\" selected=\"Laki-laki\">Laki-laki</option>     \n");
      out.write("                            <option value=\"Perempuan\">Perempuan</option>     \n");
      out.write("                        </select>\n");
      out.write("                        ");
 } else { 
      out.write("\n");
      out.write("                        <select name=\"jenis_kelamin\" id=\"input\">     \n");
      out.write("                            <option value=\"#\">- Pilih Jenis Kelamin -</option>     \n");
      out.write("                            <option value=\"Laki-laki\">Laki-laki</option>     \n");
      out.write("                            <option value=\"Perempuan\" selected=\"Perempuan\">Perempuan</option>     \n");
      out.write("                        </select>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>     \n");
      out.write("                    <td>Alamat</td>     \n");
      out.write("                    <td>:</td>     \n");
      out.write("                    <td><textarea rows=\"5\" cols=\"30\" name=\"alamat\">");
      out.print(alamat);
      out.write("</textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>     \n");
      out.write("                    <td>No Telepon</td>     \n");
      out.write("                    <td>:</td>     \n");
      out.write("                    <td><input type=\"text\" name=\"no_telp\" value=\"");
      out.print(no_telp);
      out.write("\" id=\"input\"></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>     \n");
      out.write("                    <td>Kelas</td>     \n");
      out.write("                    <td>:</td>     \n");
      out.write("                    <td>\n");
      out.write("                        ");
 if (kelas.equalsIgnoreCase("VII")) { 
      out.write("\n");
      out.write("\n");
      out.write("                        <select name=\"kelas\" id=\"input\">     \n");
      out.write("                            <option value=\"#\">- Pilih Kelas -</option>     \n");
      out.write("                            <option value=\"VII\" selected=\"VII\">VII</option>     \n");
      out.write("                            <option value=\"VIII\">VIII</option>     \n");
      out.write("                            <option value=\"IX\">IX</option>     \n");
      out.write("                        </select>\n");
      out.write("                        ");
 } else if (kelas.equalsIgnoreCase("VIII")) { 
      out.write("\n");
      out.write("                        <select name=\"kelas\" id=\"input\">     \n");
      out.write("                            <option value=\"#\">- Pilih Kelas -</option>     \n");
      out.write("                            <option value=\"VIII\" selected=\"VIII\">VIII</option>     \n");
      out.write("                            <option value=\"VII\">VII</option>     \n");
      out.write("                            <option value=\"IX\">IX</option>     \n");
      out.write("                        </select>\n");
      out.write("                        ");
 } else { 
      out.write("\n");
      out.write("                        <select name=\"kelas\" id=\"input\">     \n");
      out.write("                            <option value=\"#\">- Pilih Kelas -</option>     \n");
      out.write("                            <option value=\"VIII\">VIII</option>     \n");
      out.write("                            <option value=\"VII\">VII</option>     \n");
      out.write("                            <option value=\"IX\" selected=\"IX\">IX</option>     \n");
      out.write("                        </select>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </td> \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <tr>    \n");
      out.write("                    <td><a href=\"beranda.jsp?hal=tampil_siswa\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td> \n");
      out.write("                    <td></td>     \n");
      out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Update\" id=\"biru\">\n");
      out.write("                        <a href=\"beranda.jsp?hal=tampil_siswa\" id=\"hijau\">Lihat Data</a>\n");
      out.write("                    </td> \n");
      out.write("                </tr> \n");
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
