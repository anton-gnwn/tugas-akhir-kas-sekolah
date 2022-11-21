package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Halaman Login</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"config/login1.css\" media=\"screen\"/>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"loginBox\">\n");
      out.write("            <form method=\"post\" action=\"login?proses=login\">\n");
      out.write("                <img class=\"user\" src=\"img/logo-mts.png\" />\n");
      out.write("                <h2>Login Administrasi</h2>\n");
      out.write("                <p>Username</p>\n");
      out.write("                <input type=\"text\" name=\"nama_user\" placeholder=\"Masukkan Username\" required>\n");
      out.write("                <p>Password</p>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"***************\" required>\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Login\">\n");
      out.write("                <p align=\"center\">Belum punya akun? <a href=\"daftar_user.jsp\" style=\"color: blue; font-size: 16px;\">Daftar</a></p>   \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
