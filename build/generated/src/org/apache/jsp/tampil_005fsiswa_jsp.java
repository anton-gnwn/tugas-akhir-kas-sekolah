package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;

public final class tampil_005fsiswa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Halaman Awal | Data Siswa</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
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
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <center><h1>DATA SISWA</h1><br></center>\n");
      out.write("    <hr>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <table width=\"90%\" border=\"0\" align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <td><a href=\"beranda.jsp?hal=input_siswa\" id=\"biru\"><i class=\"fas fa-plus-circle\"></i> TAMBAH DATA</a></td>\n");
      out.write("            <td><i class=\"fas fa-search\"></i></td>\n");
      out.write("            <td><input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Pencarian\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    <hr>\n");
      out.write("    <h2 style=\"margin: 15px 0px 15px 15px;\">Kelas VII</h2>\n");
      out.write("    <table width=\"90%\" border=\"1\" align=\"center\" id=\"table-tampil\">\n");
      out.write("        \n");
      out.write("        <thead>    \n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <th width=\"60px\">NIS</th>\n");
      out.write("                <th width=\"150px\">NAMA SISWA</th>\n");
      out.write("                <th width=\"150px\">TEMPAT TANGGAL LAHIR</th>\n");
      out.write("                <th width=\"80px\">JENIS KELAMIN</th>\n");
      out.write("                <th width=\"180px\">ALAMAT</th>\n");
      out.write("                <th width=\"80px\">NO TELP</th>\n");
      out.write("                <th width=\"50px\">KELAS</th>\n");
      out.write("                <th width=\"280px\">AKSI</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            String nis = null;
            String nama_siswa = null;
            String tempat = null;
            String tgl_lahir = null;
            String jenis_kelamin = null;
            String alamat = null;
            String no_telp = null;
            String kelas = null;
            
            koneksi kon = new koneksi();
            ResultSet rs = null;
            rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE kelas='VII' ORDER BY nama_siswa asc");

            while (rs.next()) {
                nis = rs.getString("nis");
                nama_siswa = rs.getString(2);
                tempat = rs.getString(3);
                tgl_lahir = rs.getString(4);
                jenis_kelamin = rs.getString(5);
                alamat = rs.getString(6);
                no_telp = rs.getString(7);
                kelas = rs.getString(8);
        
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tbody  id=\"dataTable\">\n");
      out.write("            <tr id=\"klik\">          \n");
      out.write("                <td align=\"center\">");
 out.println(nis); 
      out.write("</center></td>      \n");
      out.write("                <td>");
 out.println(nama_siswa); 
      out.write("</td>      \n");
      out.write("                <td>");
 out.println(tempat+","); 
 out.println(tgl_lahir); 
      out.write("</td>      \n");
      out.write("                <td align=\"center\">");
 out.println(jenis_kelamin); 
      out.write("</td>\n");
      out.write("                <td>");
 out.println(alamat); 
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
 out.println(no_telp); 
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
 out.println(kelas); 
      out.write("</td>         \n");
      out.write("                <td align=\"center\"><a href=\"beranda.jsp?hal=edit_siswa&nis=");
 out.print(nis); 
      out.write("\" id=\"hijau\">EDIT</a>\n");
      out.write("                    <a href=\"siswaServlet?aksi=Delete&nis=");
 out.print(nis);
      out.write("\" id=\"merah\">HAPUS</a>\n");
      out.write("                    <a href=\"beranda.jsp?hal=detail_siswa&nis=");
 out.print(nis); 
      out.write("\" id=\"biru\">DETAIL</a></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("        \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    <hr>\n");
      out.write("    <h2 style=\"margin: 15px 0px 15px 15px;\">Kelas VIII</h2>\n");
      out.write("    <table width=\"90%\" border=\"1\" align=\"center\" id=\"table-tampil\">\n");
      out.write("        \n");
      out.write("        <thead>    \n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <th width=\"60px\">NIS</th>\n");
      out.write("                <th width=\"150px\">NAMA SISWA</th>\n");
      out.write("                <th width=\"150px\">TEMPAT TANGGAL LAHIR</th>\n");
      out.write("                <th width=\"80px\">JENIS KELAMIN</th>\n");
      out.write("                <th width=\"180px\">ALAMAT</th>\n");
      out.write("                <th width=\"80px\">NO TELP</th>\n");
      out.write("                <th width=\"50px\">KELAS</th>\n");
      out.write("                <th width=\"280px\">AKSI</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            
            rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE kelas='VIII' ORDER BY nama_siswa asc");

            while (rs.next()) {
                nis = rs.getString("nis");
                nama_siswa = rs.getString(2);
                tempat = rs.getString(3);
                tgl_lahir = rs.getString(4);
                jenis_kelamin = rs.getString(5);
                alamat = rs.getString(6);
                no_telp = rs.getString(7);
                kelas = rs.getString(8);
        
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tbody  id=\"dataTable\">\n");
      out.write("            <tr id=\"klik\">          \n");
      out.write("                <td align=\"center\">");
 out.println(nis); 
      out.write("</center></td>      \n");
      out.write("                <td>");
 out.println(nama_siswa); 
      out.write("</td>      \n");
      out.write("                <td>");
 out.println(tempat); 
      out.write(',');
      out.write(' ');
 out.println(tgl_lahir); 
      out.write("</td>      \n");
      out.write("                <td align=\"center\">");
 out.println(jenis_kelamin); 
      out.write("</td>\n");
      out.write("                <td>");
 out.println(alamat); 
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
 out.println(no_telp); 
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
 out.println(kelas); 
      out.write("</td>         \n");
      out.write("                <td align=\"center\"><a href=\"beranda.jsp?hal=edit_siswa&nis=");
 out.print(nis); 
      out.write("\" id=\"hijau\">EDIT</a>\n");
      out.write("                    <a href=\"siswaServlet?aksi=Delete&nis=");
 out.print(nis);
      out.write("\" id=\"merah\">HAPUS</a>\n");
      out.write("                    <a href=\"beranda.jsp?hal=detail_siswa&nis=");
 out.print(nis); 
      out.write("\" id=\"biru\">DETAIL</a></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("        \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("        \n");
      out.write("    <hr>\n");
      out.write("    <h2 style=\"margin: 15px 0px 15px 15px;\">Kelas IX</h2>\n");
      out.write("    <table width=\"90%\" border=\"1\" align=\"center\" id=\"table-tampil\">\n");
      out.write("        \n");
      out.write("        <thead>    \n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <th width=\"60px\">NIS</th>\n");
      out.write("                <th width=\"150px\">NAMA SISWA</th>\n");
      out.write("                <th width=\"150px\">TEMPAT TANGGAL LAHIR</th>\n");
      out.write("                <th width=\"80px\">JENIS KELAMIN</th>\n");
      out.write("                <th width=\"180px\">ALAMAT</th>\n");
      out.write("                <th width=\"80px\">NO TELP</th>\n");
      out.write("                <th width=\"50px\">KELAS</th>\n");
      out.write("                <th width=\"280px\">AKSI</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            
            rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE kelas='IX' ORDER BY nama_siswa asc");

            while (rs.next()) {
                nis = rs.getString("nis");
                nama_siswa = rs.getString(2);
                tempat = rs.getString(3);
                tgl_lahir = rs.getString(4);
                jenis_kelamin = rs.getString(5);
                alamat = rs.getString(6);
                no_telp = rs.getString(7);
                kelas = rs.getString(8);
        
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tbody  id=\"dataTable\">\n");
      out.write("            <tr id=\"klik\">          \n");
      out.write("                <td align=\"center\">");
 out.println(nis); 
      out.write("</center></td>      \n");
      out.write("                <td>");
 out.println(nama_siswa); 
      out.write("</td>      \n");
      out.write("                <td>");
 out.println(tempat); 
      out.write(',');
      out.write(' ');
 out.println(tgl_lahir); 
      out.write("</td>      \n");
      out.write("                <td align=\"center\">");
 out.println(jenis_kelamin); 
      out.write("</td>\n");
      out.write("                <td>");
 out.println(alamat); 
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
 out.println(no_telp); 
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
 out.println(kelas); 
      out.write("</td>         \n");
      out.write("                <td align=\"center\"><a href=\"beranda.jsp?hal=edit_siswa&nis=");
 out.print(nis); 
      out.write("\" id=\"hijau\">EDIT</a>\n");
      out.write("                    <a href=\"siswaServlet?aksi=Delete&nis=");
 out.print(nis);
      out.write("\" id=\"merah\">HAPUS</a>\n");
      out.write("                    <a href=\"beranda.jsp?hal=detail_siswa&nis=");
 out.print(nis); 
      out.write("\" id=\"biru\">DETAIL</a></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("        \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("    </table>    \n");
      out.write("        \n");
      out.write("    ");
 kon.close();
      out.write(" \n");
      out.write("</body>\n");
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
