<%@page import="java.sql.*" %>
<%@page import="control.koneksi" %>
<%@page import="model.pembayaran" %>

<%
    pembayaran pem = new pembayaran();
    koneksi kon = new koneksi();
    ResultSet rs=null;
    String notrans=request.getParameter("notrans").toString();
    String data = null;
    Statement st;
    rs = kon.stmt.executeQuery("SELECT * FROM detail_pembayaran WHERE notrans='"+notrans+"'");
    while (rs.next())
    {
        data = ":" + rs.getString(3) + ":" + notrans;
    }
    out.println(data);
%>