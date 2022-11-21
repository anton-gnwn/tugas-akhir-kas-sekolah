package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;
import model.siswa;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import java.sql.ResultSet;
import control.koneksi;
import model.pembayaran;
import model.siswa;
import model.kategori;
import model.user;
import java.util.Date;
import java.sql.ResultSet;
import control.koneksi;
import model.pembayaran;
import model.siswa;
import model.kategori;
import model.user;
import java.util.Date;
import control.koneksi;
import java.sql.*;
import java.sql.ResultSet;
import control.koneksi;
import model.jurnal;
import model.akun;
import model.pembayaran;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import control.koneksi;
import model.jurnal;
import model.akun;
import model.pembayaran;
import java.util.Date;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import model.siswa;

public final class beranda1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(30);
    _jspx_dependants.add("/about.jsp");
    _jspx_dependants.add("/edit_user.jsp");
    _jspx_dependants.add("/input_user.jsp");
    _jspx_dependants.add("/tampil_user.jsp");
    _jspx_dependants.add("/ubah_password.jsp");
    _jspx_dependants.add("/input_siswa.jsp");
    _jspx_dependants.add("/tampil_siswa.jsp");
    _jspx_dependants.add("/edit_siswa.jsp");
    _jspx_dependants.add("/detail_siswa.jsp");
    _jspx_dependants.add("/input_kategori.jsp");
    _jspx_dependants.add("/tampil_kategori.jsp");
    _jspx_dependants.add("/edit_kategori.jsp");
    _jspx_dependants.add("/input_akun.jsp");
    _jspx_dependants.add("/tampil_akun.jsp");
    _jspx_dependants.add("/edit_akun.jsp");
    _jspx_dependants.add("/pembayaran.jsp");
    _jspx_dependants.add("/input_biaya_operasional.jsp");
    _jspx_dependants.add("/tampil_biaya_operasional.jsp");
    _jspx_dependants.add("/jurnal.jsp");
    _jspx_dependants.add("/test_jurnal.jsp");
    _jspx_dependants.add("/laporan_harian.jsp");
    _jspx_dependants.add("/laporan_harian_lihat.jsp");
    _jspx_dependants.add("/laporan_bulanan.jsp");
    _jspx_dependants.add("/laporan_bo.jsp");
    _jspx_dependants.add("/backupdb.jsp");
    _jspx_dependants.add("/backup_berhasil.jsp");
    _jspx_dependants.add("/backup_gagal.jsp");
    _jspx_dependants.add("/restore_berhasil.jsp");
    _jspx_dependants.add("/restore_gagal.jsp");
    _jspx_dependants.add("/home.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.setTimeout(\"waktu()\",1000);\n");
      out.write("            function waktu() {\n");
      out.write("                var tanggal = new Date();\n");
      out.write("                setTimeout(\"waktu()\",1000);\n");
      out.write("                document.getElementById(\"jam\").innerHTML = tanggal.getHours()+\":\"+tanggal.getMinutes()+\":\"+tanggal.getSeconds();\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            var tanggallengkap = new String();\n");
      out.write("            var namahari = (\"Minggu Senin Selasa Rabu Kami Jumat Sabtu\");\n");
      out.write("            namahari = namahari.split(\" \");\n");
      out.write("            var namabulan = (\"Januari Februari Maret April Mei Juni Juli Agustus September Oktober November Desember\");\n");
      out.write("            namabulan = namabulan.split(\" \");\n");
      out.write("            var tgl = new Date();\n");
      out.write("            var hari = tgl.getDay();\n");
      out.write("            var tanggal = tgl.getDate();\n");
      out.write("            var bulan = tgl.getMonth();\n");
      out.write("            var tahun = tgl.getFullYear();\n");
      out.write("            tanggallengkap = namahari[hari]+\", \"+tanggal+\" \"+namabulan[bulan]+\" \"+tahun;\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"config/style1.css\" media=\"screen\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"config/all.css\">\n");
      out.write("        \n");
      out.write("    \n");
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
      out.write("                    <li><a href=\"beranda1.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"beranda1.jsp?hal=about\">About</a></li>\n");
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
      out.write("                        <a href=\"beranda1.jsp?hal=tampil_siswa\">Data Siswa</a>\n");
      out.write("                        <a href=\"beranda1.jsp?hal=tampil_kategori\">Data Kategori</a>\n");
      out.write("                        <a href=\"beranda1.jsp?hal=tampil_user\">Data User</a>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"item\" id=\"transaksi\" style=\"list-style-type: none;\">\n");
      out.write("                    <a class=\"btn\" href=\"#transaksi\">\n");
      out.write("                        <i class=\"fas fa-cash-register\"></i>\n");
      out.write("                        Transaksi\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"smenu\">\n");
      out.write("                        <a href=\"beranda1.jsp?hal=pembayaran\">Pembayaran Siswa</a>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <li class=\"item\" id=\"laporan\" style=\"list-style-type: none;\">\n");
      out.write("                    <a class=\"btn\" href=\"#laporan\">\n");
      out.write("                        <i class=\"fas fa-layer-group\"></i>\n");
      out.write("                        Laporan\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"smenu\">\n");
      out.write("                        <a href=\"beranda1.jsp?hal=laporan_harian\">Penerimaan Kas Harian</a>\n");
      out.write("                        <a href=\"beranda1.jsp?hal=laporan_bulanan\">Penerimaan Kas Bulanan</a>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"item\" id=\"pengaturan\" style=\"list-style-type: none;\">\n");
      out.write("                    <a class=\"btn\" href=\"#pengaturan\">\n");
      out.write("                        <i class=\"fas fa-cog\"></i>\n");
      out.write("                        Pengaturan\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"smenu\">\n");
      out.write("                        <a href=\"beranda1.jsp?hal=backup\">Backup & Restore</a>\n");
      out.write("                        <a href=\"beranda1.jsp?hal=ubah_password&id_user=");
      out.print(session.getAttribute("id_user") );
      out.write("\">Ubah Password</a>\n");
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
      out.write("                ");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <table width=\"75%\" border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td align=\"top\">\n");
      out.write("                                 ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    \n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='edit_user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
              out.write("\n");
              out.write("\n");
              out.write("<script src=\"js/jquery.min.js\"></script>\n");
              out.write("\n");

    String id_user = request.getParameter("id_user");
    String nama_user = null;
    String hak_akses = null;
    String password = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM user where id_user= '" + id_user + "'");
    if (rs.next()) {
        id_user = rs.getString(1);
        nama_user = rs.getString(2);
        password = rs.getString(3);
        hak_akses = rs.getString(4);
    }

              out.write("\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <title>Ubah Data User</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <h1 align=\"center\">UBAH DATA USER</h1>\n");
              out.write("        <hr>\n");
              out.write("        <br>\n");
              out.write("        <form method=\"POST\" action=\"userServlet\"> \n");
              out.write("            <table border=\"0\"> \n");
              out.write("                \n");
              out.write("                <tr>     \n");
              out.write("                    <td>Id User</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td><input type=\"text\" values=\"");
              out.print(id_user);
              out.write("\" readonly id=\"input\">\n");
              out.write("                        <input type=\"hidden\" name=\"id_user\" value=\"");
              out.print(id_user);
              out.write("\"/>\n");
              out.write("                    </td> \n");
              out.write("                </tr> \n");
              out.write("                <tr>     \n");
              out.write("                    <td>Nama User</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td><input type=\"text\" name=\"nama_user\" id=\"input\" value=\"");
              out.print(nama_user);
              out.write("\"></td> \n");
              out.write("                </tr>\n");
              out.write("                <tr>     \n");
              out.write("                    <td>Hak Akses</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td>");

                        if (hak_akses.equalsIgnoreCase("Kepala Sekolah")) {
                        
              out.write("\n");
              out.write("\n");
              out.write("                        <select name=\"hak_akses\" id=\"input\">     \n");
              out.write("                            <option value=\"Pilih Akses\">=Pilih Akses=</option>     \n");
              out.write("                            <option value=\"Kepala Sekolah\" selected=\"Kepala Sekolah\">Kepala Sekolah</option>     \n");
              out.write("                            <option value=\"Kepala Tata Usaha\">Kepala Tata Usaha</option> \n");
              out.write("                            <option value=\"Bendahara\">Bendahara</option> \n");
              out.write("                        </select>\n");
              out.write("                        ");
 } else if (hak_akses.equalsIgnoreCase("Kepala Tata Usaha")) { 
              out.write("\n");
              out.write("                        <select name=\"hak_akses\" id=\"input\">     \n");
              out.write("                            <option value=\"Pilih Akses\">=Pilih Akses=</option>     \n");
              out.write("                            <option value=\"Kepala Sekolah\">Kepala Sekolah</option>     \n");
              out.write("                            <option value=\"Kepala Tata Usaha\" selected=\"Kepala Tata Usaha\">Kepala Tata Usaha</option> \n");
              out.write("                            <option value=\"Bendahara\">Bendahara</option>      \n");
              out.write("                        </select>\n");
              out.write("                        ");
 } else { 
              out.write("\n");
              out.write("                        <select name=\"hak_akses\" id=\"input\">     \n");
              out.write("                            <option value=\"Pilih Akses\">=Pilih Akses=</option>     \n");
              out.write("                            <option value=\"Kepala Sekolah\">Kepala Sekolah</option>     \n");
              out.write("                            <option value=\"Kepala Tata Usaha\">Kepala Tata Usaha</option> \n");
              out.write("                            <option value=\"Bendahara\" selected=\"Bendahara\">Bendahara</option>      \n");
              out.write("                        </select>\n");
              out.write("                        ");
 }
              out.write("\n");
              out.write("                    </td> \n");
              out.write("                </tr>\n");
              out.write("                <tr>    \n");
              out.write("                    <td><a href=\"beranda.jsp?hal=tampil_user\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td> \n");
              out.write("                    <td></td>     \n");
              out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Update\" id=\"biru\">\n");
              out.write("                        <a href=\"beranda.jsp?hal=tampil_user\" id=\"hijau\">Lihat Data</a>\n");
              out.write("                    </td> \n");
              out.write("                </tr> \n");
              out.write("            </table>\n");
              out.write("        </form>\n");
              out.write("        ");
              out.write("\n");
              out.write("    </body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_2.setPageContext(_jspx_page_context);
          _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='input_user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
          if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("        <form method=\"post\" action=\"userServlet\"> \n");
              out.write("            <h1 align=\"center\"> TAMBAH DATA USER</h1><br>\n");
              out.write("            <hr>\n");
              out.write("            <table border=\"0\" width=\"600\"> \n");
              out.write("                <tr>     \n");
              out.write("                    <td>ID USER</td>\n");
              out.write("                    <td>\n");
              out.write("                        ");

                            try {
                                ResultSet rs = null;
                                koneksi kon = new koneksi();
                                rs = kon.stmt.executeQuery("select max(right(id_user,4)) as no FROM user");
                                while (rs.next()) {
                                    if (rs.first() == false) {
                                        out.println("<input type='text' id='input' readonly value='USR0001' name='id_user'>");
                                    } else {
                                        rs.last();
                                        int autonokm = rs.getInt(1) + 1;
                                        String nomorkm = String.valueOf(autonokm);
                                        int noLong = nomorkm.length();
                                        for (int a = 1; a < 5 - noLong; a++) {
                                            nomorkm = "0" + nomorkm;
                                        }
                                        String nomerkm = "USR" + nomorkm;
                                        out.println("<input type='text' id='input' readonly value='" + nomerkm + "'name='id_user'>");
                                    }
                                }
                            } catch (Exception e) {
                                out.println(e);
                            }

                        
              out.write("</td>\n");
              out.write("                </tr> \n");
              out.write("                <tr>     \n");
              out.write("                    <td>Nama User</td>\n");
              out.write("                    <td><input type=\"text\" name=\"nama_user\" id=\"input\" required></td> \n");
              out.write("                </tr>            \n");
              out.write("                <tr>    \n");
              out.write("                <tr>     \n");
              out.write("                    <td>Hak Akses</td>\n");
              out.write("                    <td>\n");
              out.write("                        <select name=\"hak_akses\" id=\"input\">\n");
              out.write("                            <option value=\"#\">- Pilih Akses -</option>   \n");
              out.write("                            <option value=\"Kepala Sekolah\">Kepala Sekolah</option>     \n");
              out.write("                            <option value=\"Kepala Tata Usaha\">Kepala Tata Usaha</option>    \n");
              out.write("                            <option value=\"Bendahara\">Bendahara</option>    \n");
              out.write("                        </select>\n");
              out.write("                    </td>\n");
              out.write("                </tr> \n");
              out.write("                <tr>\n");
              out.write("                    <td>Password</td>\n");
              out.write("                    <td><input type=\"password\" name=\"password\" id=\"pass\" required style=\"width: 232px; height: 25px;\"> \n");
              out.write("                        <input type=\"checkbox\" class=\"form-checkbox1\"> Show Password</td>\n");
              out.write("                </tr>\n");
              out.write("                \n");
              out.write("                <tr>\n");
              out.write("                    <td>Konfirmasi Password</td>\n");
              out.write("                    <td><input type=\"password\" id=\"konpass\" style=\"width: 232px; height: 25px;\"> \n");
              out.write("                        <input type=\"checkbox\" class=\"form-checkbox2\"> Show Password</td>\n");
              out.write("                </tr>\n");
              out.write("                \n");
              out.write("                <tr>\n");
              out.write("                    <td><a href=\"beranda.jsp?hal=tampil_user\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td> \n");
              out.write("                       \n");
              out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Simpan\" id=\"biru\"><input type=\"reset\" value=\"Batal\" id=\"merah\"></td>\n");
              out.write("                        \n");
              out.write("                </tr>  \n");
              out.write("                \n");
              out.write("            </table> \n");
              out.write("        </form>\n");
              out.write("\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_3.setPageContext(_jspx_page_context);
          _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampil_user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
          if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("    <center><h1>DATA USER</h1><br></center>\n");
              out.write("    <hr>\n");
              out.write("\n");
              out.write("    <table width=\"90%\" border=\"0\" align=\"center\">\n");
              out.write("        <tr>\n");
              out.write("            <td><a href=\"beranda.jsp?hal=input_user\" id=\"biru\" ><i class=\"fas fa-plus-circle\"></i> TAMBAH DATA</a></td>\n");
              out.write("            <td><i class=\"fas fa-search\"></i></td>\n");
              out.write("            <td><input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Pencarian\"></td>\n");
              out.write("        </tr>\n");
              out.write("    </table>\n");
              out.write("    <table width=\"90%\" border=\"1\" align=\"center\" class=\"display\">\n");
              out.write("        <thead>    \n");
              out.write("            <tr align=\"center\">\n");
              out.write("                <th>ID USER</th>\n");
              out.write("                <th>NAMA USER</th>\n");
              out.write("                <th>HAK AKSES</th>\n");
              out.write("                <th>AKSI</th>\n");
              out.write("            </tr>\n");
              out.write("        </thead>\n");
              out.write("\n");
              out.write("        ");

            String id_user = null;
            String nama_user = null;
            String hak_akses = null;
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM user ORDER BY id_user asc");

            while (rs.next()) {
                id_user = rs.getString("id_user");
                nama_user = rs.getString(2);
                hak_akses = rs.getString(4);
        
              out.write(" \n");
              out.write("\n");
              out.write("        <tbody  id=\"dataTable\">\n");
              out.write("            <tr id=\"klik\">          \n");
              out.write("                <td align=\"center\">");
 out.println(id_user); 
              out.write("</center></td>      \n");
              out.write("                <td>");
 out.println(nama_user); 
              out.write("</td>      \n");
              out.write("                <td>");
 out.println(hak_akses); 
              out.write("</td>      \n");
              out.write("                <td align=\"center\"><a href=\"beranda.jsp?hal=edit_user&id_user=");
 out.print(id_user); 
              out.write("\" id=\"hijau\">EDIT</a>\n");
              out.write("                    <a href=\"userServlet?aksi=Delete&id_user=");
 out.print(id_user);
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_4.setPageContext(_jspx_page_context);
          _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='ubah_password'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
          if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
              out.write("\n");
              out.write("\n");
              out.write("<script src=\"js/jquery.min.js\"></script>\n");
              out.write("\n");

    String id_user = request.getParameter("id_user");
    String nama_user = null;
    String hak_akses = null;
    String password = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM user where id_user= '" + id_user + "'");
    if (rs.next()) {
        id_user = rs.getString(1);
        nama_user = rs.getString(2);
        password = rs.getString(3);
        hak_akses = rs.getString(4);
    }

              out.write("\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <title>Ubah Data User</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <h1 align=\"center\">UBAH PASSWORD</h1>\n");
              out.write("        <hr>\n");
              out.write("        <br>\n");
              out.write("        <form method=\"POST\" action=\"userServlet\"> \n");
              out.write("            <table border=\"0\"> \n");
              out.write("                \n");
              out.write("                <tr>     \n");
              out.write("                    <td>Id User</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td><input type=\"text\" name=\"id_user\" id=\"input\" value=\"");
              out.print(id_user);
              out.write("\" readonly=\"readonly\">\n");
              out.write("                    </td> \n");
              out.write("                </tr> \n");
              out.write("                <tr>     \n");
              out.write("                    <td>Nama User</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td><input type=\"text\" name=\"nama_user\" id=\"input\" value=\"");
              out.print(nama_user);
              out.write("\" readonly=\"readonly\"></td> \n");
              out.write("                </tr>\n");
              out.write("                <tr>     \n");
              out.write("                    <td>Hak Akses</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td><input type=\"text\" name=\"hak_akses\" id=\"input\" value=\"");
              out.print(hak_akses);
              out.write("\" readonly=\"readonly\">\n");
              out.write("                    </td> \n");
              out.write("                </tr>\n");
              out.write("                <tr>     \n");
              out.write("                    <td>Password</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td width=\"200\"><input type=\"password\" name=\"password\" id=\"pass\" value=\"");
              out.print(password);
              out.write("\"  style=\"width: 232px; height: 25px;\"></td>\n");
              out.write("                    <td><input type=\"checkbox\" class=\"form-checkbox1\"> Show Password</td>\n");
              out.write("                </tr>\n");
              out.write("                    \n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Konfirmasi Password</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"password\" id=\"konpass\"  style=\"width: 232px; height: 25px;\"></td>\n");
              out.write("                    <td><input type=\"checkbox\" class=\"form-checkbox2\"> Show Password</td>\n");
              out.write("                </tr>\n");
              out.write("                \n");
              out.write("                <tr>    \n");
              out.write("                    <td></td> \n");
              out.write("                    <td></td>     \n");
              out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Ubah\" id=\"biru\">\n");
              out.write("                    </td> \n");
              out.write("                </tr> \n");
              out.write("            </table>\n");
              out.write("        </form>\n");
              out.write("        <script>\n");
              out.write("            $(function () {\n");
              out.write("                $(\"#biru\").click(function () {\n");
              out.write("                    var password = $(\"#pass\").val();\n");
              out.write("                    var konfirm = $(\"#konpass\").val();\n");
              out.write("                    if (password != konfirm) {\n");
              out.write("                        alert(\"Konfirmasi Password Tidak Cocok.\");\n");
              out.write("                        return false;\n");
              out.write("                    }\n");
              out.write("                    return true;\n");
              out.write("                })\n");
              out.write("            })\n");
              out.write("\n");
              out.write("            $(document).ready(function () {\n");
              out.write("                var cek = $(\".form-checkbox1\").val();\n");
              out.write("                $(\".form-checkbox1\").click(function () {\n");
              out.write("                    if ($(this).is(\":checked\")) {\n");
              out.write("                        $(\"#pass\").attr(\"type\", \"text\");\n");
              out.write("                    } else {\n");
              out.write("                        $(\"#pass\").attr(\"type\", \"password\");\n");
              out.write("                    }\n");
              out.write("                })\n");
              out.write("            })\n");
              out.write("\n");
              out.write("            $(document).ready(function () {\n");
              out.write("                var cek = $(\".form-checkbox2\").val();\n");
              out.write("                $(\".form-checkbox2\").click(function () {\n");
              out.write("                    if ($(this).is(\":checked\")) {\n");
              out.write("                        $(\"#konpass\").attr(\"type\", \"text\");\n");
              out.write("                    } else {\n");
              out.write("                        $(\"#konpass\").attr(\"type\", \"password\");\n");
              out.write("                    }\n");
              out.write("                })\n");
              out.write("            })\n");
              out.write("        </script>\n");
              out.write("    </body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
          out.write("\n");
          out.write("                                    \n");
          out.write("                                    \n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_6.setPageContext(_jspx_page_context);
          _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampil_siswa'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
          if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_7.setPageContext(_jspx_page_context);
          _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='edit_siswa'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
          if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("                <td><input type=\"text\" values=\"");
              out.print(nis);
              out.write("\" id=\"input\" readonly >\n");
              out.write("                    <input type=\"hidden\" name=\"nis\" value=\"");
              out.print(nis);
              out.write("\"/>\n");
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_8.setPageContext(_jspx_page_context);
          _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='detail_siswa'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
          if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>MTS NURUL YAQIIN | Data Detail Siswa</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("\n");
              out.write("    <center><h1>DATA DETAIL SISWA</h1><br></center>\n");
              out.write("    <hr>\n");
              out.write("    ");

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

        rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE nis='" + nis + "' ORDER BY nis asc");

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
    
              out.write(" \n");
              out.write("    <br>\n");
              out.write("    <table id=\"table-siswa\" border=\"0\">\n");
              out.write("        <th colspan=\"3\">Data Pribadi</th>\n");
              out.write("        <tr>\n");
              out.write("            <td width=\"170px\">NIS</td>\n");
              out.write("            <td width=\"5px\">:</td>\n");
              out.write("            <td width=\"200px\">");
 out.println(nis); 
              out.write("</td>      \n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td>Nama Siswa</td>\n");
              out.write("            <td>:</td>\n");
              out.write("            <td>");
 out.println(nama_siswa); 
              out.write("</td>      \n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td>Tempat Tanggal Lahir</td>\n");
              out.write("            <td>:</td>\n");
              out.write("            <td>");
out.println(tempat+",");
              out.write(' ');
 out.println(tgl_lahir); 
              out.write("</td>      \n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td>Jenis Kelamin</td>\n");
              out.write("            <td>:</td>\n");
              out.write("            <td>");
 out.println(jenis_kelamin); 
              out.write("</td>\n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td>Alamat</td>\n");
              out.write("            <td>:</td>\n");
              out.write("            <td>");
 out.println(alamat); 
              out.write("</td>      \n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td>No Telepon</td>\n");
              out.write("            <td>:</td>\n");
              out.write("            <td>");
 out.println(no_telp); 
              out.write("</td>\n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <td>Kelas</td>\n");
              out.write("            <td>:</td>\n");
              out.write("            <td>");
 out.println(kelas); 
              out.write("</td>     \n");
              out.write("        </tr>\n");
              out.write("        \n");
              out.write("    </table>\n");
              out.write("\n");
              out.write("            \n");
              out.write("        <div class=\"table-detail\">\n");
              out.write("    <table id=\"spp-detail-siswa\" border=\"0\">   \n");
              out.write("        <tr align=\"center\">    \n");
              out.write("            <th>Update Pembayaran</th>   \n");
              out.write("        </tr>\n");
              out.write("    </table>\n");
              out.write("    <br>\n");
              out.write("    <table id=\"spp-detail-siswa\" border=\"1\" class=\"display\">\n");
              out.write("        <tr>\n");
              out.write("            <th width=\"15\">No</th>\n");
              out.write("            <th width=\"80\">No Transaksi</th>     \n");
              out.write("            <th width=\"80\">Tgl. Transaksi</th>  \n");
              out.write("            <th>Jenis Kategori</th>  \n");
              out.write("            <th width=\"80\">Nominal</th>   \n");
              out.write("            <th width=\"80\">Dibayar</th>   \n");
              out.write("            <th width=\"80\">Sisa Pemb.</th>   \n");
              out.write("            <th>Status</th>  \n");
              out.write("            <th>Keterangan</th>  \n");
              out.write("        </tr>    \n");
              out.write("        ");


            String notrans = null;
            String tgl_trans = null;
            String id_kategori = null;
            String total_pem = null;
            String dibayar = null;
            String kembali = null;
            String status = null;
            String keterangan = null;
            String nama_kategori = null;

            rs = kon.stmt.executeQuery("SELECT * FROM pembayaran JOIN detail_pembayaran ON pembayaran.notrans=detail_pembayaran.notrans "
                        + "JOIN siswa ON detail_pembayaran.nis=siswa.nis "
                        + "JOIN kategori ON pembayaran.id_kategori=kategori.id_kategori WHERE detail_pembayaran.nis='"+nis+"' ORDER BY tgl_trans ASC");

            while (rs.next()) {
                    notrans = rs.getString("notrans");
                    tgl_trans = rs.getString(2);
                    status = rs.getString(4);
                    keterangan = rs.getString(5);
                    total_pem = rs.getString(9);
                    dibayar = rs.getString(10);
                    kembali = rs.getString(11);
                    nama_kategori = rs.getString(21);

        
              out.write("\n");
              out.write("        <tr align=\"center\" id=\"klik\">\n");
              out.write("\n");
              out.write("        <td>.</td>\n");
              out.write("        <td align=\"center\">");
 out.println(notrans); 
              out.write("</td>\n");
              out.write("        <td align=\"center\">");
 out.println(tgl_trans); 
              out.write("</td>\n");
              out.write("        <td align=\"center\">");
 out.println(nama_kategori); 
              out.write("</td>\n");
              out.write("        <td align=\"right\">Rp. ");
 out.println(total_pem); 
              out.write("</td>\n");
              out.write("        <td align=\"right\">Rp. ");
 out.println(dibayar); 
              out.write("</td>\n");
              out.write("        <td align=\"right\">Rp. ");
 out.println(kembali); 
              out.write("</td>\n");
              out.write("        <td>");
 out.println(status);

            if (status.equals("Lunas")) {
                out.print("<i class='fas fa-check-circle' style='color: limegreen; font-size: 16px;'></i>");
            } else if (status.equals("Belum Lunas")) {
                out.print("<i class='fas fa-minus-circle' style='color: red; font-size: 16px;'></i>");
            }

            
              out.write("</td>\n");
              out.write("        <td align=\"center\">");
 out.println(keterangan); 
              out.write("</td>\n");
              out.write("    </tr>\n");
              out.write("    ");
 }
              out.write("\n");
              out.write("</table>\n");
              out.write("    ");
              out.write("\n");
              out.write("</div>\n");
              out.write("            \n");
              out.write("\n");
              out.write("<table>\n");
              out.write("    <tr>\n");
              out.write("        <td><a href=\"beranda.jsp?hal=tampil_siswa\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td>\n");
              out.write("    </tr>\n");
              out.write("</table>\n");
              out.write("\n");
              out.write("\n");
              out.write("</table> \n");
              out.write("</body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
          out.write("\n");
          out.write("                                    \n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_9.setPageContext(_jspx_page_context);
          _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='input_kategori'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
          if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_10.setPageContext(_jspx_page_context);
          _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampil_kategori'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
          if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_11.setPageContext(_jspx_page_context);
          _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='edit_kategori'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
          if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
              out.write('\n');
              out.write('\n');

    String id_kategori = request.getParameter("id_kategori");
    String nama_kategori = null;
    String nominal = null;
    
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM kategori where id_kategori= '" + id_kategori + "'");
    if (rs.next()) {
        id_kategori = rs.getString(1);
        nama_kategori = rs.getString(2);
        nominal = rs.getString(3);
    }

              out.write("\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <title>Halaman | Ubah Data Guru</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <form method=\"POST\" action=\"kategoriServlet\"> \n");
              out.write("            <h1 align=\"center\"> UBAH DATA JENIS BAYAR</h1><br>\n");
              out.write("            <hr>\n");
              out.write("            <table border=\"0\"> \n");
              out.write("                <td>ID kategori</td>     \n");
              out.write("                <td>:</td>     \n");
              out.write("                <td><input type=\"text\" values=\"");
              out.print(id_kategori);
              out.write("\" id=\"input\" readonly >\n");
              out.write("                    <input type=\"hidden\" name=\"id_kategori\" value=\"");
              out.print(id_kategori);
              out.write("\"/>\n");
              out.write("                </td> \n");
              out.write("                </tr> \n");
              out.write("                <tr>     \n");
              out.write("                    <td>Nama kategori</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td><input type=\"text\" name=\"nama_kategori\" value=\"");
              out.print(nama_kategori);
              out.write("\" id=\"input\"></td> \n");
              out.write("                </tr>\n");
              out.write("                <tr>     \n");
              out.write("                    <td>Nominal</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td><input type=\"text\" name=\"nominal\" value=\"");
              out.print(nominal);
              out.write("\" id=\"input\"></td> \n");
              out.write("                </tr>\n");
              out.write("\n");
              out.write("                <tr>    \n");
              out.write("                    <td><a href=\"beranda.jsp?hal=tampil_kategori\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td> \n");
              out.write("                    <td></td>     \n");
              out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Update\" id=\"biru\">\n");
              out.write("                        <a href=\"beranda.jsp?hal=tampil_kategori\" id=\"hijau\">Lihat Data</a>\n");
              out.write("                    </td> \n");
              out.write("                </tr> \n");
              out.write("            </table>\n");
              out.write("        </form>\n");
              out.write("    </body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
          out.write("\n");
          out.write("                                    \n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_13 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_13.setPageContext(_jspx_page_context);
          _jspx_th_c_when_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampil_akun'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_13 = _jspx_th_c_when_13.doStartTag();
          if (_jspx_eval_c_when_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("    <center><h1>DATA AKUN</h1><br></center>\n");
              out.write("    <hr>\n");
              out.write("\n");
              out.write("    <table width=\"90%\" border=\"0\" align=\"center\">\n");
              out.write("        <tr>\n");
              out.write("            <td><a href=\"beranda.jsp?hal=input_akun\" id=\"biru\" ><i class=\"fas fa-plus-circle\"></i> TAMBAH DATA</a></td>\n");
              out.write("            <td><i class=\"fas fa-search\"></i></td>\n");
              out.write("            <td><input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Pencarian\"></td>\n");
              out.write("        </tr>\n");
              out.write("    </table>\n");
              out.write("    <table width=\"90%\" border=\"1\" align=\"center\" class=\"display\">\n");
              out.write("        <thead>    \n");
              out.write("            <tr align=\"center\">\n");
              out.write("                <th>NO AKUN</th>\n");
              out.write("                <th>NAMA AKUN</th>\n");
              out.write("                <th>TIPE AKUN</th>\n");
              out.write("                <th>AKSI</th>\n");
              out.write("            </tr>\n");
              out.write("        </thead>\n");
              out.write("\n");
              out.write("        ");

            String no_akun = null;
            String nama_akun = null;
            String tipe_akun = null;
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM akun ORDER BY no_akun asc");

            while (rs.next()) {
                no_akun = rs.getString("no_akun");
                nama_akun = rs.getString(2);
                tipe_akun = rs.getString(3);
        
              out.write(" \n");
              out.write("\n");
              out.write("        <tbody  id=\"dataTable\">\n");
              out.write("            <tr id=\"klik\">          \n");
              out.write("                <td>");
 out.println(no_akun); 
              out.write("</center></td>      \n");
              out.write("                <td>");
 out.println(nama_akun); 
              out.write("</td>      \n");
              out.write("                <td>");
 out.println(tipe_akun); 
              out.write("</td>      \n");
              out.write("                <td align=\"center\"><a href=\"beranda.jsp?hal=edit_akun&no_akun=");
 out.print(no_akun); 
              out.write("\" id=\"hijau\">EDIT</a>\n");
              out.write("                    <a href=\"akunServlet?aksi=Delete&no_akun=");
 out.print(no_akun);
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_13.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_14 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_14.setPageContext(_jspx_page_context);
          _jspx_th_c_when_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='edit_akun'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_14 = _jspx_th_c_when_14.doStartTag();
          if (_jspx_eval_c_when_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
              out.write('\n');
              out.write('\n');

    String no_akun = request.getParameter("no_akun");
    String nama_akun = null;
    String tipe_akun = null;
    
    ResultSet rs = null;
    koneksi kon = new koneksi();

    rs = kon.stmt.executeQuery("SELECT * FROM akun where no_akun= '" + no_akun + "'");
    if (rs.next()) {
        no_akun = rs.getString(1);
        nama_akun = rs.getString(2);
        tipe_akun = rs.getString(3);
    }

              out.write("\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <title>Halaman | Ubah Data Akun</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <form method=\"POST\" action=\"kategoriServlet\"> \n");
              out.write("            <h1 align=\"center\"> UBAH DATA AKUN</h1><br>\n");
              out.write("            <hr>\n");
              out.write("            <table border=\"0\"> \n");
              out.write("                <td>ID Akun</td>     \n");
              out.write("                <td>:</td>     \n");
              out.write("                <td><input type=\"text\" values=\"");
              out.print(no_akun);
              out.write("\" id=\"input\" readonly >\n");
              out.write("                    <input type=\"hidden\" name=\"no_akun\" value=\"");
              out.print(no_akun);
              out.write("\"/>\n");
              out.write("                </td> \n");
              out.write("                </tr> \n");
              out.write("                <tr>     \n");
              out.write("                    <td>Nama akun</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td><input type=\"text\" name=\"nama_akun\" value=\"");
              out.print(nama_akun);
              out.write("\" id=\"input\"></td> \n");
              out.write("                </tr>\n");
              out.write("                <tr>     \n");
              out.write("                    <td>Tipe Akun</td>     \n");
              out.write("                    <td>:</td>     \n");
              out.write("                    <td>");
 if (tipe_akun.equalsIgnoreCase("Kas & Bank")) { 
              out.write("\n");
              out.write("\n");
              out.write("                        <select name=\"akun\" id=\"input\">     \n");
              out.write("                            <option value=\"#\">- Pilih Akun -</option>     \n");
              out.write("                            <option value=\"Kas & Bank\" selected=\"Kas & Bank\">Kas & Bank</option>\n");
              out.write("                            <option value=\"Piutang\">Piutang</option>\n");
              out.write("                            <option value=\"Hutang\">Hutang</option>\n");
              out.write("                            <option value=\"Pendapatan SPP\">Pendapatan SPP</option>\n");
              out.write("                            <option value=\"Pendapatan\">Pendapatan</option>     \n");
              out.write("                        </select>\n");
              out.write("                        ");
 } else if (tipe_akun.equalsIgnoreCase("Piutang")) { 
              out.write("\n");
              out.write("                        <select name=\"tipe_akun\" id=\"input\">     \n");
              out.write("                            <option value=\"#\">- Pilih Akun -</option>     \n");
              out.write("                            <option value=\"Kas & Bank\">Kas & Bank</option>\n");
              out.write("                            <option value=\"Piutang\"  selected=\"Piutang\">Piutang</option>\n");
              out.write("                            <option value=\"Hutang\">Hutang</option>\n");
              out.write("                            <option value=\"Pendapatan SPP\">Pendapatan SPP</option>\n");
              out.write("                            <option value=\"Pendapatan\">Pendapatan</option> >     \n");
              out.write("                        </select>\n");
              out.write("                        ");
 } else if (tipe_akun.equalsIgnoreCase("Hutang")) { 
              out.write("\n");
              out.write("                        <select name=\"tipe_akun\" id=\"input\">     \n");
              out.write("                            <option value=\"#\">- Pilih Akun -</option>     \n");
              out.write("                            <option value=\"Kas & Bank\">Kas & Bank</option>\n");
              out.write("                            <option value=\"Piutang\">Piutang</option>\n");
              out.write("                            <option value=\"Hutang\" selected=\"Hutang\">Hutang</option>\n");
              out.write("                            <option value=\"Pendapatan SPP\">Pendapatan SPP</option>\n");
              out.write("                            <option value=\"Pendapatan\">Pendapatan</option> >     \n");
              out.write("                        </select>\n");
              out.write("                        ");
 } else if (tipe_akun.equalsIgnoreCase("Pendapatan SPP")) { 
              out.write("\n");
              out.write("                        <select name=\"tipe_akun\" id=\"input\">     \n");
              out.write("                            <option value=\"#\">- Pilih Akun -</option>     \n");
              out.write("                            <option value=\"Kas & Bank\">Kas & Bank</option>\n");
              out.write("                            <option value=\"Piutang\">Piutang</option>\n");
              out.write("                            <option value=\"Hutang\">Hutang</option>\n");
              out.write("                            <option value=\"Pendapatan SPP\" selected=\"Pendapatan SPP\">Pendapatan SPP</option>\n");
              out.write("                            <option value=\"Pendapatan\">Pendapatan</option> >     \n");
              out.write("                        </select>\n");
              out.write("                        ");
 } else { 
              out.write("\n");
              out.write("                        <select name=\"tipe_akun\" id=\"input\">     \n");
              out.write("                            <option value=\"#\">- Pilih Akun -</option>     \n");
              out.write("                            <option value=\"Kas & Bank\">Kas & Bank</option>\n");
              out.write("                            <option value=\"Piutang\">Piutang</option>\n");
              out.write("                            <option value=\"Hutang\">Hutang</option>\n");
              out.write("                            <option value=\"Pendapatan SPP\">Pendapatan SPP</option>\n");
              out.write("                            <option value=\"Pendapatan\" selected=\"Pendapatan\">Pendapatan</option> >    \n");
              out.write("                        </select>\n");
              out.write("                        ");
 } 
              out.write("\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("\n");
              out.write("                <tr>    \n");
              out.write("                    <td><a href=\"beranda.jsp?hal=tampil_akun\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td> \n");
              out.write("                    <td></td>     \n");
              out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Update\" id=\"biru\">\n");
              out.write("                        <a href=\"beranda.jsp?hal=tampil_akun\" id=\"hijau\">Lihat Data</a>\n");
              out.write("                    </td> \n");
              out.write("                </tr> \n");
              out.write("            </table>\n");
              out.write("        </form>\n");
              out.write("    </body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_14.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_14);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_14);
          out.write("\n");
          out.write("                                    \n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_15 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_15.setPageContext(_jspx_page_context);
          _jspx_th_c_when_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='pembayaran'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_15 = _jspx_th_c_when_15.doStartTag();
          if (_jspx_eval_c_when_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("        <h2 align=\"center\">Update Pembayaran</h2>\n");
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
              out.write("                    <th>Aksi</th>  \n");
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
              out.write("                    <td align=\"center\"><a href=pembayaranServlet?aksi=Delete&notrans=");
 out.println(notrans); 
              out.write(" id=\"merah\">Hapus</a></td>\n");
              out.write("                </tr>\n");
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_15.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_15);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_15);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_16 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_16.setPageContext(_jspx_page_context);
          _jspx_th_c_when_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='input_biaya_operasional'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_16 = _jspx_th_c_when_16.doStartTag();
          if (_jspx_eval_c_when_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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

    siswa siswa = new siswa();
    pembayaran pem = new pembayaran();
    kategori kategori = new kategori();
    user usr = new user();
    koneksi kon = new koneksi();
    ResultSet rs = null;

              out.write(" \n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>JSP Page</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("\n");
              out.write("        <form action=\"bo_servlet\" method=\"post\">\n");
              out.write("\n");
              out.write("            <h1 align=\"center\">BIAYA OPERASIONAL</h1>\n");
              out.write("            <hr>\n");
              out.write("            <br>\n");
              out.write("            <table width=\"600\" border=\"0\">\n");
              out.write("                <tr> \n");
              out.write("                    <td width=\"120\">No Biaya Operasional</td>\n");
              out.write("                    <td width=\"10\">:</td>\n");
              out.write("                    <td>");
 try {

                            ResultSet no_bo = null;
                            no_bo = kon.stmt.executeQuery("select max(right(no_bo,4)) as no FROM biaya_operasional");

                            while (no_bo.next()) {
                                if (no_bo.first() == false) {
                                    out.println("<input type='text' id='input' readonly value='BO0001' name='no_bo'>");
                                } else {
                                    no_bo.last();
                                    int auto = no_bo.getInt(1) + 1;
                                    String nomorpesan = String.valueOf(auto);
                                    int noLong = nomorpesan.length();

                                    for (int a = 1; a < 5 - noLong; a++) {
                                        nomorpesan = "0" + nomorpesan;
                                    }
                                    String nomerpesan = "BO" + nomorpesan;
                                    out.println("<input type='text' id='input' readonly value='" + nomerpesan + "' name='no_bo'>");
                                }
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                        
              out.write("</td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Tgl. Pengajuan</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"date\" name=\"tgl_pengajuan\" id=\"input\" value=\"2020-01-01\"></td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("\n");
              out.write("            <hr>\n");
              out.write("            <br>\n");
              out.write("\n");
              out.write("            <table width=\"600\" border=\"0\">\n");
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td width=\"120\">Jenis Bantuan</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><select name=\"jenis_bantuan\" id=\"input\" required>                             \n");
              out.write("                            <option value=\"#\">- Pilih -</option>\n");
              out.write("                            <option value=\"Dana BOS\">Dana BOS</option>\n");
              out.write("                            <option value=\"Dana BOP\">Dana BOP</option>\n");
              out.write("                        </select></td>\n");
              out.write("\n");
              out.write("                    <td>Jumlah Dana</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"jumlah_dana\" id=\"input\" required></td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write("               \n");
              out.write("                <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>Keterangan</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"ket_dana\" id=\"input\" value=\"\"></td>\n");
              out.write("\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("\n");
              out.write("            <br>\n");
              out.write("            <hr>\n");
              out.write("            <table width=\"600\" border=\"0\">\n");
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td width=\"120\">Tgl. Pencairan</td>\n");
              out.write("                    <td width=\"10\">:</td>\n");
              out.write("                    <td><input type=\"date\" name=\"tgl_pencairan\" id=\"input\" value=\"2020-01-01\"></td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write("\n");
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td>Admin</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"id_user\" value=\"");
              out.print(session.getAttribute("id_user") );
              out.write("\" readonly=\"readonly\"></td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td><input type=\"submit\" value=\"Simpan\" name=\"aksi\" id=\"biru\">\n");
              out.write("                        <input type=\"reset\" value=\"Batal\" id=\"merah\">\n");
              out.write("                        <a href=\"beranda.jsp?hal=tampil_biaya_operasional\" id=\"hijau\">Lihat Data</a>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("        </form>\n");
              out.write("        <hr>\n");
              out.write("        <br>\n");
              out.write("        ");
              out.write("\n");
              out.write("    </body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_16.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_16);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_16);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_17 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_17.setPageContext(_jspx_page_context);
          _jspx_th_c_when_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampil_biaya_operasional'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_17 = _jspx_th_c_when_17.doStartTag();
          if (_jspx_eval_c_when_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Halaman </title>\n");
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
              out.write("    <center><h1>BIAYA OPERASIONAL</h1><br></center>\n");
              out.write("    <hr>\n");
              out.write("\n");
              out.write("    <table width=\"90%\" border=\"0\" align=\"center\">\n");
              out.write("        <tr>\n");
              out.write("            <td><a href=\"beranda.jsp?hal=input_biaya_operasional\" id=\"biru\" ><i class=\"fas fa-plus-circle\"></i> TAMBAH DATA</a></td>\n");
              out.write("            <td><i class=\"fas fa-search\"></i></td>\n");
              out.write("            <td><input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Pencarian\"></td>\n");
              out.write("        </tr>\n");
              out.write("    </table>\n");
              out.write("    <table width=\"90%\" border=\"1\" align=\"center\" class=\"display\">\n");
              out.write("        <thead>    \n");
              out.write("            <tr align=\"center\">\n");
              out.write("                <th width=\"100\">No Biaya Operasional</th>\n");
              out.write("                <th width=\"100\">Tgl. Pengajuan</th>\n");
              out.write("                <th width=\"100\">Jenis Bantuan</th>\n");
              out.write("                <th>Jumlah Dana</th>\n");
              out.write("                <th>Keterangan Dana</th>\n");
              out.write("                <th width=\"100\">Tgl. Pencairan</th>\n");
              out.write("                <th width=\"130\">Admin</th>\n");
              out.write("                <th>Aksi</th>\n");
              out.write("            </tr>\n");
              out.write("        </thead>\n");
              out.write("\n");
              out.write("        ");

            String no_bo = null;
            String tgl_pengajuan = null;
            String jenis_bantuan = null;
            String jumlah_dana = null;
            String ket_dana = null;
            String tgl_pencairan = null;
            String id_user = null;
            ResultSet rs = null;

            koneksi kon = new koneksi();
            rs = kon.stmt.executeQuery("SELECT * FROM biaya_operasional JOIN user ON biaya_operasional.id_user = user.id_user ORDER BY no_bo asc");

            while (rs.next()) {
                no_bo = rs.getString("no_bo");
                tgl_pengajuan = rs.getString(2);
                jenis_bantuan = rs.getString(3);
                jumlah_dana = rs.getString(4);
                ket_dana = rs.getString(5);
                tgl_pencairan = rs.getString(6);
                id_user = rs.getString(9);
        
              out.write(" \n");
              out.write("\n");
              out.write("        <tbody  id=\"dataTable\">\n");
              out.write("            <tr id=\"klik\">          \n");
              out.write("                <td align=\"center\">");
 out.println(no_bo); 
              out.write("</center></td>      \n");
              out.write("                <td align=\"center\">");
 out.println(tgl_pengajuan); 
              out.write("</td>      \n");
              out.write("                <td align=\"center\">");
 out.println(jenis_bantuan); 
              out.write("</td>      \n");
              out.write("                <td align=\"right\">Rp. ");
 out.println(jumlah_dana); 
              out.write("</td>      \n");
              out.write("                <td align=\"center\">");
 out.println(ket_dana); 
              out.write("</td>      \n");
              out.write("                <td align=\"center\">");
 out.println(tgl_pencairan); 
              out.write("</td>      \n");
              out.write("                <td align=\"center\">");
 out.println(id_user); 
              out.write("</td>      \n");
              out.write("                <td align=\"center\"><a href=\"bo_servlet?aksi=Delete&no_bo=");
 out.print(no_bo);
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_17.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_17);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_17);
          out.write("\n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_18 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_18.setPageContext(_jspx_page_context);
          _jspx_th_c_when_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='jurnal'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_18 = _jspx_th_c_when_18.doStartTag();
          if (_jspx_eval_c_when_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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

    akun akun = new akun();
    jurnal jurnal = new jurnal();
    pembayaran pem = new pembayaran();
    koneksi kon = new koneksi();
    ResultSet rs = null;

              out.write(" \n");
              out.write("\n");
              out.write("<script>\n");
              out.write("    function showEmp(emp_value)\n");
              out.write("    {\n");
              out.write("        if (document.getElementById(\"no_akun\").value != \"-1\")\n");
              out.write("        {\n");
              out.write("            xmlHttp = GetXmlHttpObject()\n");
              out.write("            if (xmlHttp == null)\n");
              out.write("            {\n");
              out.write("                alert(\"Browser does not support HTTP Request\")\n");
              out.write("                return\n");
              out.write("            }\n");
              out.write("            var url = \"get_akun.jsp\"\n");
              out.write("            url = url + \"?no_akun=\" + emp_value\n");
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
              out.write("        document.getElementById(\"no_akun\").value = \"\";\n");
              out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
              out.write("        {\n");
              out.write("\n");
              out.write("            var showdata = xmlHttp.responseText;\n");
              out.write("            var strar = showdata.split(\":\");\n");
              out.write("\n");
              out.write("            if (strar.length == 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"no_akun\").focus();\n");
              out.write("                alert(\"Pilih NIS\");\n");
              out.write("                document.getElementById(\"ename\").value = \" \";\n");
              out.write("                document.getElementById(\"no_akun\").value = \" \";\n");
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
              out.write("    function showEmp2(emp_value)\n");
              out.write("    {\n");
              out.write("        if (document.getElementById(\"no_akun\").value != \"-1\")\n");
              out.write("        {\n");
              out.write("            xmlHttp = GetXmlHttpObjectbayar()\n");
              out.write("            if (xmlHttp == null)\n");
              out.write("            {\n");
              out.write("                alert(\"Browser does not support HTTP Request\")\n");
              out.write("                return\n");
              out.write("            }\n");
              out.write("            var url = \"get_akun.jsp\"\n");
              out.write("            url = url + \"?no_akun=\" + emp_value\n");
              out.write("\n");
              out.write("            xmlHttp.onreadystatechange = stateChangedbayar\n");
              out.write("            xmlHttp.open(\"GET\", url, true)\n");
              out.write("            xmlHttp.send(null)\n");
              out.write("        } else\n");
              out.write("        {\n");
              out.write("            alert(\"Pilih No Akun\");\n");
              out.write("        }\n");
              out.write("    }\n");
              out.write("\n");
              out.write("    function stateChangedbayar()\n");
              out.write("    {\n");
              out.write("        document.getElementById(\"nama_akun\").value = \"\";\n");
              out.write("        document.getElementById(\"no_akun\").value = \"\";\n");
              out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
              out.write("        {\n");
              out.write("\n");
              out.write("            var showdata = xmlHttp.responseText;\n");
              out.write("            var strar = showdata.split(\":\");\n");
              out.write("\n");
              out.write("            if (strar.length == 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"no_akun\").focus();\n");
              out.write("                alert(\"Pilih No Akun\");\n");
              out.write("                document.getElementById(\"nama_akun\").value = \" \";\n");
              out.write("                document.getElementById(\"no_akun\").value = \" \";\n");
              out.write("            } else if (strar.length > 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"nama_akun\").value = strar[1];\n");
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
              out.write("\n");
              out.write("    function showEmp3(emp_value)\n");
              out.write("    {\n");
              out.write("        if (document.getElementById(\"notrans\").value != \"-1\")\n");
              out.write("        {\n");
              out.write("            xmlHttp = GetXmlHttpObjectTrans()\n");
              out.write("            if (xmlHttp == null)\n");
              out.write("            {\n");
              out.write("                alert(\"Browser does not support HTTP Request\")\n");
              out.write("                return\n");
              out.write("            }\n");
              out.write("            var url = \"get_pembayaran.jsp\"\n");
              out.write("            url = url + \"?notrans=\" + emp_value\n");
              out.write("\n");
              out.write("            xmlHttp.onreadystatechange = stateChangedTrans\n");
              out.write("            xmlHttp.open(\"GET\", url, true)\n");
              out.write("            xmlHttp.send(null)\n");
              out.write("        } else\n");
              out.write("        {\n");
              out.write("            alert(\"Pilih No Transaksi\");\n");
              out.write("        }\n");
              out.write("    }\n");
              out.write("\n");
              out.write("    function stateChangedTrans()\n");
              out.write("    {\n");
              out.write("        document.getElementById(\"debet1\").value = \"\";\n");
              out.write("        document.getElementById(\"kredit2\").value = \"\";\n");
              out.write("        document.getElementById(\"notrans\").value = \"\";\n");
              out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
              out.write("        {\n");
              out.write("\n");
              out.write("            var showdata = xmlHttp.responseText;\n");
              out.write("            var strar = showdata.split(\":\");\n");
              out.write("\n");
              out.write("            if (strar.length == 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"no_akun\").focus();\n");
              out.write("                alert(\"Pilih No Trans\");\n");
              out.write("                document.getElementById(\"debet1\").value = \" \";\n");
              out.write("                document.getElementById(\"notrans\").value = \" \";\n");
              out.write("                document.getElementById(\"kredit2\").value = \" \";\n");
              out.write("            } else if (strar.length > 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"debet1\").value = strar[1];\n");
              out.write("                document.getElementById(\"kredit2\").value = strar[1];\n");
              out.write("            }\n");
              out.write("\n");
              out.write("\n");
              out.write("        }\n");
              out.write("    }\n");
              out.write("\n");
              out.write("    function GetXmlHttpObjectTrans()\n");
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
              out.write("    } \n");
              out.write("    \n");
              out.write("        \n");
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
              out.write("        <form action=\"jurnalServlet\" method=\"post\">\n");
              out.write("\n");
              out.write("            <h1 align=\"center\">PEMBAYARAN SPP</h1>\n");
              out.write("            <hr>\n");
              out.write("            <br>\n");
              out.write("            <table width=\"600\" border=\"0\">\n");
              out.write("                <tr>\n");
              out.write("                    <td>Tgl. Jurnal</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td width=\"500\"><input type=\"date\" name=\"tgl_jurnal\" step=\"7\" value=\"2020-01-01\" id=\"input\"</td>\n");
              out.write("                    <td>No. Transaksi</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td width=\"100\"><select name=\"notrans\" id=\"input\" onchange=\"showEmp3(this.value);\">\n");
              out.write("                            <option value=\"#\">- Pilih Kelas -</option>\n");
              out.write("                            ");

                                rs = kon.stmt.executeQuery("SELECT notrans FROM detail_pembayaran");
                                while (rs.next()) {
                                    pem.setNotrans(rs.getString("notrans"));
                            
              out.write("\n");
              out.write("\n");
              out.write("                            <option value=\"");
              out.print(pem.getNotrans());
              out.write('"');
              out.write('>');
              out.print(pem.getNotrans());
              out.write("</option>\n");
              out.write("                            ");
 }
              out.write("\n");
              out.write("                        </select><input type=\"hidden\" name=\"notrans\" id=\"notrans\" value=\"\"</td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Keterangan</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td colspan=\"4\"><input type=\"text\" name=\"ket_jurnal\" style=\"width: 332px; height: 25px;\"</td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("            <hr>\n");
              out.write("            <br>\n");
              out.write("            <table width=\"90%\" border=\"1\" align=\"center\" id=\"table-tampil\">\n");
              out.write("                <tr>\n");
              out.write("                    <th>No</th>\n");
              out.write("                    <th colspan=\"2\">No Akun</th>\n");
              out.write("                    <th>Nama Akun</th>\n");
              out.write("                    <th>Debet</th>\n");
              out.write("                    <th>Kredit</th>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td rowspan=\"2\"><div class=\"nojurnal\">\n");
              out.write("                        ");
 try {
                            
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
                        
              out.write("\n");
              out.write("                        </div></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"checkbox\" name=\"pilih\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pilih}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"</td>\n");
              out.write("                    <td><select name=\"no_akun\" onchange=\"showEmp(this.value);\" id=\"input\">                             \n");
              out.write("                        <option value=\"-1\">Select</option>\n");
              out.write("                                ");

                                    rs = kon.stmt.executeQuery("SELECT * FROM akun ");
                                    while (rs.next()) {
                                        akun.setNo_akun(rs.getString("no_akun"));
                                        akun.setNama_akun(rs.getString("nama_akun"));
                                
              out.write("\n");
              out.write("                                <option value=\"");
              out.print(akun.getNo_akun());
              out.write('"');
              out.write('>');
              out.print(akun.getNo_akun());
              out.write("</option>\n");
              out.write("                                ");
  } 
              out.write("</select><input  type=\"hidden\" name=\"no_akun\" id=\"no_akun\" value=\"\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"nama_akun\" id=\"ename\" value=\"\" readonly=\"readonly\" style=\"width: 232px; height: 25px;\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"debet\" id=\"debet1\" value=\"0\" style=\"width: 150px; height: 25px;\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"kredit\" id=\"kredit1\" value=\"0\" style=\"width: 150px; height: 25px;\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td><input type=\"checkbox\" name=\"pilih\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pilih}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"</td>\n");
              out.write("                    <td><select name=\"no_akun\" onchange=\"showEmp2(this.value);\" id=\"input\">                             \n");
              out.write("                        <option value=\"-1\">Select</option>\n");
              out.write("                                ");

                                    rs = kon.stmt.executeQuery("SELECT * FROM akun ");
                                    while (rs.next()) {
                                        akun.setNo_akun(rs.getString("no_akun"));
                                        akun.setNama_akun(rs.getString("nama_akun"));
                                
              out.write("\n");
              out.write("                                <option value=\"");
              out.print(akun.getNo_akun());
              out.write('"');
              out.write('>');
              out.print(akun.getNo_akun());
              out.write("</option>\n");
              out.write("                                ");
  } 
              out.write("</select><input  type=\"hidden\" name=\"no_akun\" id=\"no_akun\" value=\"\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"nama_akun\" id=\"nama_akun\" value=\"\" readonly=\"readonly\" style=\"width: 232px; height: 25px;\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"debet\" id=\"debet2\" value=\"0\" style=\"width: 150px; height: 25px;\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"kredit\" id=\"kredit2\" value=\"0\" style=\"width: 150px; height: 25px;\"></td>\n");
              out.write("                </tr>\n");
              out.write("                \n");
              out.write("                <tr>\n");
              out.write("                    <th colspan=\"4\">Total</th>\n");
              out.write("                    <td><input type=\"text\" id=\"Ttldebet\" onkeyup=\"Hitung()\" readonly=\"readonly\" style=\"width: 150px; height: 25px;\"></td>\n");
              out.write("                    <td><input type=\"text\" id=\"Ttlkredit\" onkeyup=\"Hitung()\" readonly=\"readonly\" style=\"width: 150px; height: 25px;\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <th colspan=\"4\">Balance</th>\n");
              out.write("                    <th></th>\n");
              out.write("                    <td><input type=\"text\" id=\"Balance\" name=\"balance\" readonly=\"readonly\" style=\"width: 150px; height: 25px;\"></td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("                                <input type=\"submit\" value=\"Simpan\" name=\"aksi\" id=\"biru\">\n");
              out.write("        </form>\n");
              out.write("        <hr>\n");
              out.write("        <br>\n");
              out.write("\n");
              out.write("                                \n");
              out.write("    </body>\n");
              out.write("    <script>\n");
              out.write("        function Hitung(){\n");
              out.write("        var kre1 = document.getElementById(\"kredit1\").value;\n");
              out.write("        var kre2 = document.getElementById(\"kredit2\").value;\n");
              out.write("        \n");
              out.write("        var Totkre = parseInt(kre1) + parseInt(kre2);\n");
              out.write("        document.getElementById(\"Ttlkredit\").value = parseInt(Totkre);\n");
              out.write("        \n");
              out.write("        var deb1 = document.getElementById(\"debet1\").value;\n");
              out.write("        var deb2 = document.getElementById(\"debet2\").value;\n");
              out.write("        \n");
              out.write("        var Totdeb = parseInt(deb1) + parseInt(deb2);\n");
              out.write("        document.getElementById(\"Ttldebet\").value = parseInt(Totdeb);\n");
              out.write("        \n");
              out.write("        var Total = parseInt(Totdeb) - parseInt(Totkre);\n");
              out.write("        document.getElementById(\"Balance\").value = parseInt(Total);\n");
              out.write("    }   \n");
              out.write("    \n");
              out.write("    \n");
              out.write("    </script>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_18.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_18);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_18);
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_19 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_19.setPageContext(_jspx_page_context);
          _jspx_th_c_when_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='test_jurnal'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_19 = _jspx_th_c_when_19.doStartTag();
          if (_jspx_eval_c_when_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
              out.write("\n");
              out.write("\n");
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

    akun akun = new akun();
    jurnal jurnal = new jurnal();
    pembayaran pem = new pembayaran();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    
    Connection koneksi = null;
    Statement perintah = null;
    
    Class.forName("com.mysql.jdbc.Driver");
    koneksi = DriverManager.getConnection("jdbc:mysql://localhost/kas_masuk_sekolah", "root" ,"");

              out.write(" \n");
              out.write("\n");
              out.write("<script>\n");
              out.write("    function showEmp(emp_value)\n");
              out.write("    {\n");
              out.write("        if (document.getElementById(\"no_akun\").value != \"-1\")\n");
              out.write("        {\n");
              out.write("            xmlHttp = GetXmlHttpObject()\n");
              out.write("            if (xmlHttp == null)\n");
              out.write("            {\n");
              out.write("                alert(\"Browser does not support HTTP Request\")\n");
              out.write("                return\n");
              out.write("            }\n");
              out.write("            var url = \"get_akun.jsp\"\n");
              out.write("            url = url + \"?no_akun=\" + emp_value\n");
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
              out.write("        document.getElementById(\"no_akun\").value = \"\";\n");
              out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
              out.write("        {\n");
              out.write("\n");
              out.write("            var showdata = xmlHttp.responseText;\n");
              out.write("            var strar = showdata.split(\":\");\n");
              out.write("\n");
              out.write("            if (strar.length == 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"no_akun\").focus();\n");
              out.write("                alert(\"Pilih NIS\");\n");
              out.write("                document.getElementById(\"ename\").value = \" \";\n");
              out.write("                document.getElementById(\"no_akun\").value = \" \";\n");
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
              out.write("    function showEmp2(emp_value)\n");
              out.write("    {\n");
              out.write("        if (document.getElementById(\"no_akun\").value != \"-1\")\n");
              out.write("        {\n");
              out.write("            xmlHttp = GetXmlHttpObjectbayar()\n");
              out.write("            if (xmlHttp == null)\n");
              out.write("            {\n");
              out.write("                alert(\"Browser does not support HTTP Request\")\n");
              out.write("                return\n");
              out.write("            }\n");
              out.write("            var url = \"get_akun.jsp\"\n");
              out.write("            url = url + \"?no_akun=\" + emp_value\n");
              out.write("\n");
              out.write("            xmlHttp.onreadystatechange = stateChangedbayar\n");
              out.write("            xmlHttp.open(\"GET\", url, true)\n");
              out.write("            xmlHttp.send(null)\n");
              out.write("        } else\n");
              out.write("        {\n");
              out.write("            alert(\"Pilih No Akun\");\n");
              out.write("        }\n");
              out.write("    }\n");
              out.write("\n");
              out.write("    function stateChangedbayar()\n");
              out.write("    {\n");
              out.write("        document.getElementById(\"nama_akun\").value = \"\";\n");
              out.write("        document.getElementById(\"no_akun\").value = \"\";\n");
              out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
              out.write("        {\n");
              out.write("\n");
              out.write("            var showdata = xmlHttp.responseText;\n");
              out.write("            var strar = showdata.split(\":\");\n");
              out.write("\n");
              out.write("            if (strar.length == 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"no_akun\").focus();\n");
              out.write("                alert(\"Pilih No Akun\");\n");
              out.write("                document.getElementById(\"nama_akun\").value = \" \";\n");
              out.write("                document.getElementById(\"no_akun\").value = \" \";\n");
              out.write("            } else if (strar.length > 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"nama_akun\").value = strar[1];\n");
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
              out.write("    function showEmp3(emp_value)\n");
              out.write("    {\n");
              out.write("        if (document.getElementById(\"notrans\").value != \"-1\")\n");
              out.write("        {\n");
              out.write("            xmlHttp = GetXmlHttpObjectTrans()\n");
              out.write("            if (xmlHttp == null)\n");
              out.write("            {\n");
              out.write("                alert(\"Browser does not support HTTP Request\")\n");
              out.write("                return\n");
              out.write("            }\n");
              out.write("            var url = \"get_pembayaran.jsp\"\n");
              out.write("            url = url + \"?notrans=\" + emp_value\n");
              out.write("\n");
              out.write("            xmlHttp.onreadystatechange = stateChangedTrans\n");
              out.write("            xmlHttp.open(\"GET\", url, true)\n");
              out.write("            xmlHttp.send(null)\n");
              out.write("        } else\n");
              out.write("        {\n");
              out.write("            alert(\"Pilih No Transaksi\");\n");
              out.write("        }\n");
              out.write("    }\n");
              out.write("\n");
              out.write("    function stateChangedTrans()\n");
              out.write("    {\n");
              out.write("        document.getElementById(\"debet1\").value = \"\";\n");
              out.write("        document.getElementById(\"kredit2\").value = \"\";\n");
              out.write("        document.getElementById(\"notrans\").value = \"\";\n");
              out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
              out.write("        {\n");
              out.write("\n");
              out.write("            var showdata = xmlHttp.responseText;\n");
              out.write("            var strar = showdata.split(\":\");\n");
              out.write("\n");
              out.write("            if (strar.length == 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"no_akun\").focus();\n");
              out.write("                alert(\"Pilih No Trans\");\n");
              out.write("                document.getElementById(\"debet1\").value = \" \";\n");
              out.write("                document.getElementById(\"notrans\").value = \" \";\n");
              out.write("                document.getElementById(\"kredit2\").value = \" \";\n");
              out.write("            } else if (strar.length > 1)\n");
              out.write("            {\n");
              out.write("                document.getElementById(\"debet1\").value = strar[1];\n");
              out.write("                document.getElementById(\"kredit2\").value = strar[1];\n");
              out.write("            }\n");
              out.write("\n");
              out.write("\n");
              out.write("        }\n");
              out.write("    }\n");
              out.write("\n");
              out.write("    function GetXmlHttpObjectTrans()\n");
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
              out.write("           \n");
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
              out.write("        <form action=\"test_jurnal\" method=\"post\">\n");
              out.write("\n");
              out.write("            <h1 align=\"center\">PEMBAYARAN SPP</h1>\n");
              out.write("            <hr>\n");
              out.write("            <br>\n");
              out.write("            <table width=\"600\" border=\"1\">\n");
              out.write("                <tr>\n");
              out.write("                    <td>Tgl. Jurnal</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"date\" name=\"tgl_jurnal\" step=\"7\" value=\"2020-01-01\" id=\"input\"</td>\n");
              out.write("                    <td>No. Transaksi</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><select name=\"notrans\" id=\"input\">\n");
              out.write("                            <option value=\"#\">- Pilih Kelas -</option>\n");
              out.write("                            ");

                                rs = kon.stmt.executeQuery("SELECT notrans FROM pembayaran");
                                while (rs.next()) {
                                    pem.setNotrans(rs.getString("notrans"));
                            
              out.write("\n");
              out.write("\n");
              out.write("                            <option value=\"");
              out.print(pem.getNotrans());
              out.write('"');
              out.write('>');
              out.print(pem.getNotrans());
              out.write("</option>\n");
              out.write("                            ");
 }
              out.write("\n");
              out.write("                        </select><input type=\"hidden\" name=\"notrans\" id=\"notrans\" value=\"\"</td></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Keterangan</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td colspan=\"4\"><input type=\"text\" name=\"ket_jurnal\" style=\"width: 332px; height: 25px;\"</td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("            <hr>\n");
              out.write("            <br>\n");
              out.write("            <table width=\"600\" border=\"1\">\n");
              out.write("                <tr>\n");
              out.write("                    <th>No</th>\n");
              out.write("                    <th colspan=\"2\">No Akun</th>\n");
              out.write("                    <th>Nama Akun</th>\n");
              out.write("                    <th>Debet</th>\n");
              out.write("                    <th>Kredit</th>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td rowspan=\"2\">\n");
              out.write("                        ");
 try {
                            
                            ResultSet nojurnal = null;
                            nojurnal = kon.stmt.executeQuery("select max(right(nojurnal,4)) as no FROM jurnal");
                            
                            while (nojurnal.next()) {
                                if (nojurnal.first() == false) {
                                    out.println("<input type='text' id='input' readonly value='J0001' name='nojurnal'>");
                                } else {
                                    nojurnal.last();
                                    int auto = nojurnal.getInt(1) + 1;
                                    String nomorpesan = String.valueOf(auto);
                                    int noLong = nomorpesan.length();

                                    for (int a = 1; a < 5 - noLong; a++) {
                                        nomorpesan = "0" + nomorpesan;
                                    }
                                    String nomerpesan = "J" + nomorpesan;
                                    out.println("<input type='text' id='input' readonly value='" + nomerpesan + "' name='nojurnal' style='width: 100px; height: 50px;'>");
                                }
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                        
              out.write("\n");
              out.write("                    </td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"checkbox\" name=\"pilih\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pilih}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"></td>\n");
              out.write("                    <td><select name=\"no_akun\" onchange=\"showEmp(this.value);\" id=\"input\">                             \n");
              out.write("                        <option>Select</option>\n");
              out.write("                                ");

                                    Statement kode1 = koneksi.createStatement();
                                    rs = kode1.executeQuery("SELECT * FROM akun ");
                                    while (rs.next()) {
                                        akun.setNo_akun(rs.getString("no_akun"));
                                        akun.setNama_akun(rs.getString("nama_akun"));
                                
              out.write("\n");
              out.write("                                <option value=\"");
              out.print(akun.getNo_akun());
              out.write('"');
              out.write('>');
              out.print(akun.getNo_akun());
              out.write("</option>\n");
              out.write("                                ");
  } 
              out.write("</select><input  type=\"hidden\" name=\"no_akun\" id=\"no_akun\" value=\"\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" id=\"ename\" value=\"\" readonly=\"readonly\" style=\"width: 232px; height: 25px;\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"debet\" id=\"debet1\" onchange=\"Hitung()\" value=\"0\"</td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"kredit\" id=\"kredit1\" onchange=\"Hitung()\" value=\"0\"</td>\n");
              out.write("                </tr>\n");
              out.write("                <tr> \n");
              out.write("                    <td><input type=\"checkbox\" name=\"pilih\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pilih}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"></td>\n");
              out.write("                    <td><select name=\"no_akun\" onchange=\"showEmp2(this.value);\" id=\"input\">                             \n");
              out.write("                        <option>Select</option>\n");
              out.write("                                ");

                                    Statement kode2 = koneksi.createStatement();
                                    rs = kode2.executeQuery("SELECT * FROM akun ");
                                    while (rs.next()) {
                                        akun.setNo_akun(rs.getString("no_akun"));
                                        akun.setNama_akun(rs.getString("nama_akun"));
                                
              out.write("\n");
              out.write("                                <option value=\"");
              out.print(akun.getNo_akun());
              out.write('"');
              out.write('>');
              out.print(akun.getNo_akun());
              out.write("</option>\n");
              out.write("                                ");
  } 
              out.write("</select><input  type=\"hidden\" name=\"no_akun\" id=\"no_akun\" value=\"\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" id=\"nama_akun\" value=\"\" readonly=\"readonly\" style=\"width: 232px; height: 25px;\"></td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"debet\" id=\"debet2\" onchange=\"Hitung()\" value=\"0\"</td>\n");
              out.write("                    \n");
              out.write("                    <td><input type=\"text\" name=\"kredit\" id=\"kredit2\" onchange=\"Hitung()\" value=\"0\"</td>\n");
              out.write("                </tr>\n");
              out.write("                \n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"4\">Total</td>\n");
              out.write("                    <td><input type=\"text\" id=\"Ttldebet\" onchange=\"Hitung()\" readonly=\"readonly\"></td>\n");
              out.write("                    <td><input type=\"text\" id=\"Ttlkredit\" onchange=\"Hitung()\" readonly=\"readonly\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"4\">Balance</td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td><input type=\"text\" id=\"Balance\" name=\"balance\" readonly=\"readonly\"</td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("                                <input type=\"submit\" name=\"aksi\" value=\"Simpan\">\n");
              out.write("        </form>\n");
              out.write("        <hr>\n");
              out.write("        <br>\n");
              out.write("\n");
              out.write("                                \n");
              out.write("    </body>\n");
              out.write("    <script>\n");
              out.write("        function Hitung(){\n");
              out.write("        var kre1 = document.getElementById(\"kredit1\").value;\n");
              out.write("        var kre2 = document.getElementById(\"kredit2\").value;\n");
              out.write("        \n");
              out.write("        var Totkre = parseInt(kre1) + parseInt(kre2);\n");
              out.write("        document.getElementById(\"Ttlkredit\").value = parseInt(Totkre);\n");
              out.write("        \n");
              out.write("        var deb1 = document.getElementById(\"debet1\").value;\n");
              out.write("        var deb2 = document.getElementById(\"debet2\").value;\n");
              out.write("        \n");
              out.write("        var Totdeb = parseInt(deb1) + parseInt(deb2);\n");
              out.write("        document.getElementById(\"Ttldebet\").value = parseInt(Totdeb);\n");
              out.write("        \n");
              out.write("        var Total = parseInt(Totdeb) - parseInt(Totkre);\n");
              out.write("        document.getElementById(\"Balance\").value = parseInt(Total);\n");
              out.write("    }\n");
              out.write("    </script>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_19.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_19);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_19);
          out.write("\n");
          out.write("                                    \n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_21 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_21.setPageContext(_jspx_page_context);
          _jspx_th_c_when_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='laporan_harian_lihat'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_21 = _jspx_th_c_when_21.doStartTag();
          if (_jspx_eval_c_when_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("    <center><h1>DATA AKUN</h1><br></center>\n");
              out.write("    <hr>\n");
              out.write("\n");
              out.write("    <table width=\"90%\" border=\"0\" align=\"center\">\n");
              out.write("        <tr>\n");
              out.write("            <td><a href=\"beranda.jsp?hal=input_akun\" id=\"biru\" ><i class=\"fas fa-plus-circle\"></i> TAMBAH DATA</a></td>\n");
              out.write("            <td><i class=\"fas fa-search\"></i></td>\n");
              out.write("            <td><input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Pencarian\"></td>\n");
              out.write("        </tr>\n");
              out.write("    </table>\n");
              out.write("    <table width=\"90%\" border=\"1\" align=\"center\" id=\"table-tampil\">   \n");
              out.write("            \n");
              out.write("        ");
 
            String tgl_trans = null;
            
            ResultSet rs = null;
            koneksi kon = new koneksi();

            rs = kon.stmt.executeQuery("SELECT * FROM pembayaran WHERE tgl_trans='" + tgl_trans + "' ");

            if (rs.next()) {
                tgl_trans = rs.getString(2);
        
              out.write("\n");
              out.write("        <tr>\n");
              out.write("            <td>Tanggal</td>\n");
              out.write("            <td>:</td>\n");
              out.write("            <td align=\"center\">");
 out.println(tgl_trans); 
              out.write("</td>\n");
              out.write("        </tr>\n");
              out.write("        ");
 } 
              out.write("\n");
              out.write("        \n");
              out.write("        \n");
              out.write("            <thead>\n");
              out.write("                <tr height=\"50\">\n");
              out.write("                    <th width=\"80\">No Transaksi</th> \n");
              out.write("                    <th width=\"60\">Nama Kategori</th>   \n");
              out.write("                    <th>Jumlah</th>   \n");
              out.write("                    <th>Keterangan</th>  \n");
              out.write("                    <th>Admin</th> \n");
              out.write("                </tr>  \n");
              out.write("            </thead>\n");
              out.write("            ");

                String notrans = null;
                
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
                        + "JOIN kategori ON pembayaran.id_kategori=kategori.id_kategori "
                        + "JOIN user ON pembayaran.id_user=user.id_user WHERE pembayaran='"+tgl_trans+"' ORDER BY tgl_trans ASC");

                while (rs.next()) {
                    notrans = rs.getString("notrans");
                    id_kategori = rs.getString(3);
                    status = rs.getString(4);
                    keterangan = rs.getString(5);
                    nis = rs.getString(8);
                    total_pem = rs.getString(9);
                    dibayar = rs.getString(10);
                    kembali = rs.getString(11);
                    nama_siswa = rs.getString(13);
                    nama_kategori = rs.getString(21);
                    id_user = rs.getString(23);
            
              out.write("\n");
              out.write("            <tbody id=\"dataTable\">\n");
              out.write("                <tr id=\"klik\">\n");
              out.write("                    <td align=\"center\">");
 out.println(notrans); 
              out.write("</td>\n");
              out.write("                    <td align=\"center\">");
 out.println(nama_kategori); 
              out.write("</td>\n");
              out.write("                    <td align=\"right\">Rp. ");
 out.println(dibayar); 
              out.write("</td>\n");
              out.write("                    \n");
              out.write("                    <td align=\"center\">");
 out.println(keterangan); 
              out.write("</td>\n");
              out.write("                    <td align=\"center\">");
 out.println(id_user); 
              out.write("</td>\n");
              out.write("                    \n");
              out.write("                </tr>\n");
              out.write("\n");
              out.write("                ");
 } 
              out.write("\n");
              out.write("                   \n");
              out.write("                \n");
              out.write("            </tbody>\n");
              out.write("        </table>\n");
              out.write("\n");
              out.write("    ");
 kon.close();
              out.write(" \n");
              out.write("</body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_21.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_21);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_21);
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    \n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_24 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_24.setPageContext(_jspx_page_context);
          _jspx_th_c_when_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='backup'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_24 = _jspx_th_c_when_24.doStartTag();
          if (_jspx_eval_c_when_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>JSP Page</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <form method=\"get\" action=\"");
              out.print(request.getContextPath());
              out.write("/BackupRestoreDB\" enctype=\"multipart/form-data\">\n");
              out.write("            <center>\n");
              out.write("                <h1>BACKUP & RESTORE DATABASE</h1>\n");
              out.write("                <hr>\n");
              out.write("                <br>\n");
              out.write("                <table border=\"0\">\n");
              out.write("                    <tr>\n");
              out.write("                        <td width=\"120\">Backup</td>\n");
              out.write("                        <td width=\"150\"></td>\n");
              out.write("                        <td><input type=\"submit\" name=\"backup\" value=\"Backup\" id=\"hijau\" /></td>\n");
              out.write("                    </tr>\n");
              out.write("                    <tr>\n");
              out.write("                        <td>Restore</td>\n");
              out.write("                        <td><input type=\"file\" name=\"file\" ></td>\n");
              out.write("                        <td><input type=\"submit\" name=\"restore\" value=\"Restore\" id=\"hijau\" /></td>\n");
              out.write("                    </tr>\n");
              out.write("                </table>\n");
              out.write("            </center>\n");
              out.write("        </form>\n");
              out.write("    </body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_when_24.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_24);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_24);
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_when_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                                    \n");
          out.write("                                    ");
          out.write("\n");
          out.write("                                    ");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
          _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
          if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                        ");
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
              out.write("        <title>MTS NURUL YAQIIN | Tambah Data Siswa</title>\n");
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
              out.write("\n");
              out.write("                                    ");
              int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
            return;
          }
          _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
          out.write("\n");
          out.write("                                 ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
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

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='about'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
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
        out.write("        <title>MTS NURUL YAQIIN | Tambah Data Siswa</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <br>\n");
        out.write("        <img src=\"img/logo-mts.png\" class=\"logo-mts\" \n");
        out.write("             style=\"width: 110px; \n");
        out.write("             height: 110px; \n");
        out.write("             float: left; \n");
        out.write("             padding-left: 50px;\n");
        out.write("             padding-top: 5px;\n");
        out.write("             padding-bottom: 10px;\n");
        out.write("             margin-right: -100px;\">\n");
        out.write("        <img src=\"img/logo-kota-tangerang.png\" class=\"logo-mts\" \n");
        out.write("             style=\"width: 110px; \n");
        out.write("             height: 110px; \n");
        out.write("             float: right; \n");
        out.write("             padding-right: 50px;\n");
        out.write("             padding-top: 5px;\n");
        out.write("             padding-bottom: 10px;\n");
        out.write("             margin-left: -100px;\">\n");
        out.write("    <center><h1><br>VISI, MISI DAN TUJUAN<br>MTS NURUL YAQIIN KOTA TANGERANG</h1></center>\n");
        out.write("\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <br>\n");
        out.write("    <hr>\n");
        out.write("    <br>\n");
        out.write("\n");
        out.write("    <div class=\"visi-misi\">\n");
        out.write("        <div class=\"kolom-kiri\">\n");
        out.write("            <table width=\"300\">\n");
        out.write("                <tr>\n");
        out.write("                    <th>VISI</th>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>MEMBENTUK GENERASI PENERUS YANG KREATIF, INOVATIF, CERDAS, TERAMPIL DAN BERAKHLAHUL KARIMAH</td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        </div>\n");
        out.write("\n");
        out.write("        <div class=\"kolom-tengah\">\n");
        out.write("            <table>\n");
        out.write("                <tr>\n");
        out.write("                    <th colspan=\"2\">MISI</th>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>1.</td>\n");
        out.write("                    <td>Menyelenggarakan proses pembelajaran yang dinamis, sinergis dan inovatif</td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>2.</td>\n");
        out.write("                    <td>Menanamkan keimanan dan pengetahuan yang memadai</td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>3.</td>\n");
        out.write("                    <td>Mewujudkan kehidupan yang religius islam di lingkungan pendidikan</td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>4.</td>\n");
        out.write("                    <td>Mengembangkan potensi kecerdasan secara maksimal</td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>5.</td>\n");
        out.write("                    <td>Memberdaya gunakan sarana dan prasarana modern guna mencapai kualitas pendidikan</td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        </div>\n");
        out.write("        <div class=\"kolom-kanan\">\n");
        out.write("            <table width=\"300\">\n");
        out.write("                <tr>\n");
        out.write("                    <th>TUJUAN</th>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td>YAYASAN PENDIDIKAN ISLAM NURUL YAQIIN ADALAH LEMBAGA YANG MENYELENGGARAKAN PENDIDIKAN \n");
        out.write("                        YANG BERCIRI KHAS AGAMA ISLAM, BERTUJUAM MENYIAPKAN KADER BANGSA YANG BERIMAN, BERILMU DAN \n");
        out.write("                        BERAKHLAK MULIA SERTA MEMPUNYAI KEMAMPUAN DI BIDANG TEKNOLOGI DAN INFORMASI</td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        </div>\n");
        out.write("    </div>\n");
        out.write("\n");
        out.write("    <div style=\"float: bottom; margin-top: 40px; margin-bottom: 10px;\">\n");
        out.write("        <h3 align=\"center\">ALAMAT :</h3>\n");
        out.write("        <p align=\"center\">Jl. Raden Fatah Gg. Masjid II RT. 01/10 Parung Serab, Sudimara Selatan,\n");
        out.write("            <br> Ciledug - Kota Tangerang. No Telp. 021-7344 1601 / 0856 7746 235\n");
        out.write("        </p></div>\n");
        out.write("\n");
        out.write("\n");
        out.write("    <script src=\"js/all.js\"></script>\n");
        out.write("</body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='input_siswa'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
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
        out.write("                    <td><input type=\"text\" name=\"no_telp\" id=\"input\"></td> \n");
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
        out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Simpan\" id=\"biru\"> <input type=\"reset\" value=\"Batal\" id=\"merah\"></td> \n");
        out.write("                </tr> \n");
        out.write("            </table> \n");
        out.write("        </form>\n");
        out.write("        <script src=\"js/all.js\"></script>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_when_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_12 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_12.setPageContext(_jspx_page_context);
    _jspx_th_c_when_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='input_akun'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_12 = _jspx_th_c_when_12.doStartTag();
    if (_jspx_eval_c_when_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
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
        out.write("        <form method=\"post\" action=\"akunServlet\"> \n");
        out.write("            <h1 align=\"center\"> TAMBAH DATA AKUN</h1><br>\n");
        out.write("            <hr>\n");
        out.write("            <table border=\"0\" width=\"600\"> \n");
        out.write("                <tr>     \n");
        out.write("                    <td>No Akun</td>\n");
        out.write("                    <td><input type=\"text\" name=\"no_akun\" id=\"input\"></td>\n");
        out.write("                </tr> \n");
        out.write("                <tr>     \n");
        out.write("                    <td>Nama Akun</td>     \n");
        out.write("                    <td><input type=\"text\" name=\"nama_akun\" id=\"input\"></td> \n");
        out.write("                </tr>            \n");
        out.write("                <tr>    \n");
        out.write("                <tr>     \n");
        out.write("                    <td>Tipe Akun</td>     \n");
        out.write("                    <td><select name=\"tipe_akun\" id=\"input\">\n");
        out.write("                            <option value=\"#\">- Pilih Akun -</option>\n");
        out.write("                            <option value=\"Kas & Bank\">Kas & Bank</option>\n");
        out.write("                            <option value=\"Piutang\">Piutang</option>\n");
        out.write("                            <option value=\"Hutang\">Hutang</option>\n");
        out.write("                            <option value=\"Pendapatan SPP\">Pendapatan SPP</option>\n");
        out.write("                            <option value=\"Pendapatan\">Pendapatan</option>\n");
        out.write("                        </select></td> \n");
        out.write("                </tr>            \n");
        out.write("                <tr>    \n");
        out.write("                    <td><a href=\"beranda.jsp?hal=tampil_jb\" id=\"hijau\"><i class=\"fas fa-arrow-circle-left\"></i> KEMBALI</a></td>     \n");
        out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Simpan\" id=\"biru\"> \n");
        out.write("                        <input type=\"reset\" value=\"Batal\" id=\"merah\"></td> \n");
        out.write("                </tr> \n");
        out.write("            </table> \n");
        out.write("        </form>\n");
        out.write("\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
    return false;
  }

  private boolean _jspx_meth_c_when_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_20 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_20.setPageContext(_jspx_page_context);
    _jspx_th_c_when_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='laporan_harian'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_20 = _jspx_th_c_when_20.doStartTag();
    if (_jspx_eval_c_when_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        \n");
        out.write("        <form action=\"laporan_harian_cetak.jsp\" method=\"post\" target=\"blank\">\n");
        out.write("            \n");
        out.write("            <center><h1>LAPORAN PENERIMAAN KAS HARIAN</h1><br></center>\n");
        out.write("            <hr>\n");
        out.write("            <br>\n");
        out.write("            \n");
        out.write("            <table border=\"0\">\n");
        out.write("                <tr>     \n");
        out.write("                    <td width=\"50\">Pilih Tanggal</td>     \n");
        out.write("                    <td width=\"150\"><input type=\"date\" name=\"tgl\" id=\"input\" value=\"2020-01-01\" ></td>\n");
        out.write("                   \n");
        out.write("                </tr>\n");
        out.write("                \n");
        out.write("                <tr>\n");
        out.write("                    <td></td>\n");
        out.write("                     <td><input type=\"submit\" value=\"Cetak\" id=\"biru\"></td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_20);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_20);
    return false;
  }

  private boolean _jspx_meth_c_when_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_22 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_22.setPageContext(_jspx_page_context);
    _jspx_th_c_when_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='laporan_bulanan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_22 = _jspx_th_c_when_22.doStartTag();
    if (_jspx_eval_c_when_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        \n");
        out.write("        <form action=\"laporan_bulanan_cetak.jsp\" method=\"post\" target=\"blank\">\n");
        out.write("            \n");
        out.write("            <center><h1>LAPORAN PENERIMAAN KAS BULANAN</h1><br></center>\n");
        out.write("            <hr>\n");
        out.write("            <br>\n");
        out.write("            \n");
        out.write("            <table border=\"0\">\n");
        out.write("                <tr>     \n");
        out.write("                    <td width=\"50\">Pilih Bulan</td>     \n");
        out.write("                    <td width=\"150\"><select name=\"pbulan\" id=\"input\" required>\n");
        out.write("                            <option value=\"#\">- Pilih Bulan -</option>\n");
        out.write("                            <option value=\"01\">Januari</option>\n");
        out.write("                            <option value=\"02\">Februari</option>\n");
        out.write("                            <option value=\"03\">Maret</option>\n");
        out.write("                            <option value=\"04\">April</option>\n");
        out.write("                            <option value=\"05\">Mei</option>\n");
        out.write("                            <option value=\"06\">Juni</option>\n");
        out.write("                            <option value=\"07\">Juli</option>\n");
        out.write("                            <option value=\"08\">Agustus</option>\n");
        out.write("                            <option value=\"09\">September</option>\n");
        out.write("                            <option value=\"10\">Oktober</option>\n");
        out.write("                            <option value=\"11\">November</option>\n");
        out.write("                            <option value=\"12\">Desember</option>\n");
        out.write("                        </select></td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>\n");
        out.write("                    <td width=\"50\">Pilih Tahun</td>     \n");
        out.write("                    <td width=\"150\"><select name=\"ptahun\" id=\"input\" required>\n");
        out.write("                            <option value=\"#\">- Pilih Tahun -</option>\n");
        out.write("                            <option value=\"2019\">2019</option>\n");
        out.write("                            <option value=\"2020\">2020</option>\n");
        out.write("                            <option value=\"2021\">2021</option>\n");
        out.write("                            <option value=\"2022\">2022</option>\n");
        out.write("                            <option value=\"2023\">2023</option>\n");
        out.write("                        </select></td>\n");
        out.write("                   \n");
        out.write("                </tr>\n");
        out.write("                \n");
        out.write("                <tr>\n");
        out.write("                    <td></td>\n");
        out.write("                     <td><input type=\"submit\" value=\"Cetak\" id=\"biru\"></td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_22);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_22);
    return false;
  }

  private boolean _jspx_meth_c_when_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_23 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_23.setPageContext(_jspx_page_context);
    _jspx_th_c_when_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='laporan_bo'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_23 = _jspx_th_c_when_23.doStartTag();
    if (_jspx_eval_c_when_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        \n");
        out.write("        <form action=\"laporan_bo_cetak.jsp\" method=\"post\" target=\"blank\">\n");
        out.write("            \n");
        out.write("            <center><h1>LAPORAN BIAYA OPERASIONAL</h1><br></center>\n");
        out.write("            <hr>\n");
        out.write("            <br>\n");
        out.write("            \n");
        out.write("            <table border=\"0\">\n");
        out.write("                <tr>     \n");
        out.write("                    <td width=\"50\">Pilih Jenis</td>     \n");
        out.write("                    <td width=\"150\"><select name=\"dana_bo\" id=\"input\" required>\n");
        out.write("                            <option value=\"#\">- Pilih Jenis -</option>\n");
        out.write("                            <option value=\"Dana BOP\">Dana BOP</option>\n");
        out.write("                            <option value=\"Dana BOS\">Dana BOS</option>\n");
        out.write("                        </select></td>\n");
        out.write("                </tr>\n");
        out.write("                <tr>     \n");
        out.write("                    <td width=\"50\">Pilih Bulan</td>     \n");
        out.write("                    <td width=\"150\"><select name=\"pbulan\" id=\"input\" required>\n");
        out.write("                            <option value=\"#\">- Pilih Bulan -</option>\n");
        out.write("                            <option value=\"01\">Januari</option>\n");
        out.write("                            <option value=\"02\">Februari</option>\n");
        out.write("                            <option value=\"03\">Maret</option>\n");
        out.write("                            <option value=\"04\">April</option>\n");
        out.write("                            <option value=\"05\">Mei</option>\n");
        out.write("                            <option value=\"06\">Juni</option>\n");
        out.write("                            <option value=\"07\">Juli</option>\n");
        out.write("                            <option value=\"08\">Agustus</option>\n");
        out.write("                            <option value=\"09\">September</option>\n");
        out.write("                            <option value=\"10\">Oktober</option>\n");
        out.write("                            <option value=\"11\">November</option>\n");
        out.write("                            <option value=\"12\">Desember</option>\n");
        out.write("                        </select></td>\n");
        out.write("                </tr>\n");
        out.write("                \n");
        out.write("                <tr>\n");
        out.write("                    <td></td>\n");
        out.write("                     <td><input type=\"submit\" value=\"Cetak\" id=\"biru\"></td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_23);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_23);
    return false;
  }

  private boolean _jspx_meth_c_when_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_25 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_25.setPageContext(_jspx_page_context);
    _jspx_th_c_when_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='backup_berhasil'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_25 = _jspx_th_c_when_25.doStartTag();
    if (_jspx_eval_c_when_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("    <center>\n");
        out.write("        <br>\n");
        out.write("        <br>\n");
        out.write("        <h1>Backup Database Berhasil!</h1>\n");
        out.write("        <i class='fas fa-check-circle' style='color: limegreen; font-size: 50px;'></i>\n");
        out.write("        <br>\n");
        out.write("        <br>\n");
        out.write("    </center>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_25);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_25);
    return false;
  }

  private boolean _jspx_meth_c_when_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_26 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_26.setPageContext(_jspx_page_context);
    _jspx_th_c_when_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='backup_gagal'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_26 = _jspx_th_c_when_26.doStartTag();
    if (_jspx_eval_c_when_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("    <center>\n");
        out.write("        <br>\n");
        out.write("        <br>\n");
        out.write("        <h1>Backup Database Gagal!</h1>\n");
        out.write("        <i class='fas fa-times-circle' style='color: red; font-size: 50px;'></i>\n");
        out.write("        <br>\n");
        out.write("        <br>\n");
        out.write("    </center>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_26);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_26);
    return false;
  }

  private boolean _jspx_meth_c_when_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_27 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_27.setPageContext(_jspx_page_context);
    _jspx_th_c_when_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='restore_berhasil'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_27 = _jspx_th_c_when_27.doStartTag();
    if (_jspx_eval_c_when_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("    <center>\n");
        out.write("        <br>\n");
        out.write("        <br>\n");
        out.write("        <h1>Restore Database Berhasil!</h1>\n");
        out.write("        <i class='fas fa-check-circle' style='color: limegreen; font-size: 50px;'></i>\n");
        out.write("        <br>\n");
        out.write("        <br>\n");
        out.write("    </center>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_27);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_27);
    return false;
  }

  private boolean _jspx_meth_c_when_28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_28 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_28.setPageContext(_jspx_page_context);
    _jspx_th_c_when_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='restore_gagal'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_28 = _jspx_th_c_when_28.doStartTag();
    if (_jspx_eval_c_when_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("    <center>\n");
        out.write("        <br>\n");
        out.write("        <br>\n");
        out.write("        <h1>Restore Database Gagal!</h1>\n");
        out.write("        <i class='fas fa-times-circle' style='color: red; font-size: 50px;'></i>\n");
        out.write("        <br>\n");
        out.write("        <br>\n");
        out.write("    </center>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_28);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_28);
    return false;
  }
}
