<%@page import="java.sql.*" %>
<%@page import="control.koneksi" %>
<%@page import="model.kategori" %>

<%
    kategori kategori = new kategori();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    String id_kategori = request.getParameter("id_kategori").toString();
    String data = null;
    Statement st;
    rs = kon.stmt.executeQuery("SELECT * FROM kategori WHERE id_kategori='"+id_kategori+"'");
    while (rs.next())
    {
        data = ":" + rs.getString(3) + ":" + id_kategori;
    }
    out.println(data);
%>