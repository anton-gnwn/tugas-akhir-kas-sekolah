/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.jurnal;

/**
 *
 * @author anton
 */
public class jurnal_test extends HttpServlet {

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
            jurnal jurnal = new jurnal();
            koneksi kon = new koneksi();
         
            Connection koneksi = null;
            PreparedStatement pstmt = null;
            PreparedStatement pstmt1 = null;
            PreparedStatement pstmt2 = null;
         
            int result = 0;
            int result1 = 0;
            int result2 = 0;
            int result3 = 0;
         
         
            String aksi = request.getParameter("aksi");
            
            String URL = "jdbc:mysql://localhost:3306/kas_masuk_sekolah";
            String Username = "root";
            String Password = "";
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(URL, Username, Password);
              
                     jurnal.setNojurnal(request.getParameter("nojurnal"));
                     jurnal.setNotrans(request.getParameter("notrans"));
                     jurnal.setTgl_jurnal(request.getParameter("tgl_jurnal"));
                     jurnal.setKet_jurnal(request.getParameter("ket_jurnal"));
                     
                     
                     
                     String[] pilih = request.getParameterValues("pilih");
                     String[] bal = request.getParameterValues("balance");
                     String[] no_akun = request.getParameterValues("no_akun");
                     String[] debet = request.getParameterValues("debet");
                     String[] kredit = request.getParameterValues("kredit");
            
            if(aksi != null) {
                     
             switch(aksi){
                 case "Simpan":
                     if(bal.equals("0")){
                         pstmt = koneksi.prepareStatement("INSERT INTO jurnal values('"+jurnal.getNojurnal()+"','"
                             + jurnal.getNotrans()+"','"
                             + jurnal.getTgl_jurnal()+"','"
                             + jurnal.getKet_jurnal()+"')");
                        result = pstmt.executeUpdate();
                        out.println(pilih.length);
                        for (int j=0; j<pilih.length; j++){
                            pstmt1 = koneksi.prepareStatement("INSERT INTO detail_jurnal values('"+jurnal.getNojurnal()+"','"
                             + no_akun[j]+"','"
                             + debet[j]+"','"
                             + kredit[j]+"')");  
                          result1 = pstmt1.executeUpdate();
                        }
                        
                     
                        
                     result2 = result+result1;
                     
                     if(result2 > 0) {
                         out.println("<script> "
                                 + "alert('Data telah ditambahkan');"
                                 + "document.location='beranda.jsp?hal=jurnal';"
                                 + " </script>");
                     }
                     }
                     
                     
                   
                     
                     
                     break;
                 case "Delete":
                     jurnal.setNojurnal(request.getParameter("nojurnal"));
                     pstmt = kon.conn.prepareStatement("DELETE FROM jurnal WHERE nojurnal= '" +jurnal.getNojurnal()+"'");
                     result = pstmt.executeUpdate();
                     
                     pstmt1 = kon.conn.prepareStatement("DELETE FROM detail_jurnal WHERE nojurnal= '" +jurnal.getNojurnal()+"'");
                     result1 = pstmt1.executeUpdate();
                     
                     result2 = result+result1;
                     if(result2>0){
                         out.println("<script>"
                                 + "alert('Data telah dihapus');"
                                 + "document.location='beranda.jsp?hal=jurnal';"
                                 + " </script>");
                     }
                     break;
                 
                 default:
             }
         } else {
             out.println("<script> "
                     + "alert('Gagal Eksekusi');"
                     + "document.location='test_jurnal.jsp';"
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
            Logger.getLogger(jurnal_test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jurnal_test.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(jurnal_test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jurnal_test.class.getName()).log(Level.SEVERE, null, ex);
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
