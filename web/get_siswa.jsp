<%@page import="java.sql.*" %>
<%@page import="control.koneksi" %>
<%@page import="model.siswa" %>

<%
    siswa siswa = new siswa();
    koneksi kon = new koneksi();
    ResultSet rs=null;
    String nis=request.getParameter("nis").toString();
    String data = null;
    Statement st;
    rs = kon.stmt.executeQuery("SELECT * FROM siswa WHERE nis='"+nis+"'");
    while (rs.next())
    {
        data = ":" + rs.getString(2) + ":" + nis;
    }
    out.println(data);
%>