<%@page import="java.sql.*" %>
<%@page import="control.koneksi" %>
<%@page import="model.akun" %>

<%
    akun akun = new akun();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    String no_akun = request.getParameter("no_akun").toString();
    String data = null;
    Statement st;
    rs = kon.stmt.executeQuery("SELECT * FROM akun WHERE no_akun='"+no_akun+"'");
    while (rs.next())
    {
        data = ":" + rs.getString(2) + ":" + no_akun;
    }
    out.println(data);
%>