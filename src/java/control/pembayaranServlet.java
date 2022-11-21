/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.pembayaran;

/**
 *
 * @author anton
 */
public class pembayaranServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         pembayaran pem = new pembayaran();
         koneksi kon = new koneksi();
         
         PreparedStatement pstmt = null;
         PreparedStatement pstmt1 = null;
         
         int result = 0;
         int result1 = 0;
         int result2 = 0;
         
         
         String aksi = request.getParameter("aksi");
         
         if(aksi != null) {
                     
                     
                     
                     
                     
             switch(aksi){
                 case "Simpan":
                     pem.setNotrans(request.getParameter("notrans"));
                     pem.setTgl_trans(request.getParameter("tgl_trans"));
                     pem.setId_kategori(request.getParameter("id_kategori"));
                     pem.setStatus(request.getParameter("status"));
                     pem.setKeterangan(request.getParameter("keterangan"));
                     pem.setId_user(request.getParameter("id_user"));
                     pstmt = kon.conn.prepareStatement("INSERT INTO pembayaran values('"+pem.getNotrans()+"','"
                             + pem.getTgl_trans()+"','"
                             + pem.getId_kategori()+"','"
                             + pem.getStatus()+"','"
                             + pem.getKeterangan()+"','"
                             + pem.getId_user()+"')");
                     result = pstmt.executeUpdate();
                     
                     pem.setNis(request.getParameter("nis"));
                     pem.setTotal_pem(Double.parseDouble(request.getParameter("total_pem")));
                     pem.setDibayar(Double.parseDouble(request.getParameter("dibayar")));
                     pem.setKembali(Double.parseDouble(request.getParameter("kembali")));
                     pstmt1 = kon.conn.prepareStatement("INSERT INTO detail_pembayaran values('"+pem.getNotrans()+"','"
                             + pem.getNis()+"','"
                             + pem.getTotal_pem()+"','"
                             + pem.getDibayar()+"','"
                             + pem.getKembali()+"')");
                     
                     
                     result1 = pstmt1.executeUpdate();
                     result2 = result+result1;
                     
                     if(result2 > 0) {
                         out.println("<script> "
                                 + "alert('Data telah ditambahkan');"
                                 + "document.location='beranda.jsp?hal=pembayaran';"
                                 + " </script>");
                     }
                     break;
                 case "Delete":
                     pem.setNotrans(request.getParameter("notrans"));
                     pstmt = kon.conn.prepareStatement("DELETE FROM pembayaran WHERE notrans= '" +pem.getNotrans()+"'");
                     result = pstmt.executeUpdate();
                     
                     pstmt1 = kon.conn.prepareStatement("DELETE FROM detail_pembayaran WHERE notrans= '" +pem.getNotrans()+"'");
                     result1 = pstmt1.executeUpdate();
                     
                     result2 = result+result1;
                     if(result2>0){
                         out.println("<script>"
                                 + "alert('Data telah dihapus');"
                                 + "document.location='beranda.jsp?hal=pembayaran';"
                                 + " </script>");
                     }
                     break;
                 
                 default:
             }
         } else {
             out.println("<script> "
                     + "alert('Gagal Eksekusi');"
                     + "document.location='beranda.jsp?hal=tampil_pembayaran';"
                     + " </script>");
                     }
             }
         }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pembayaranServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pembayaranServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pembayaranServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pembayaranServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
