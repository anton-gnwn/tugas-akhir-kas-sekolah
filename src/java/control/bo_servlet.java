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
import model.biaya_operasional;

/**
 *
 * @author anton
 */
public class bo_servlet extends HttpServlet {

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
            biaya_operasional bo = new biaya_operasional();
            koneksi kon = new koneksi();
            PreparedStatement pstmt = null;
            int result=0;
            
            String aksi = request.getParameter("aksi");
            if(aksi != null) {
                
                
                
                
                switch (aksi) 
                {
                    case "Simpan" :
                        bo.setNo_bo(request.getParameter("no_bo"));
                        bo.setTgl_pengajuan(request.getParameter("tgl_pengajuan"));
                        bo.setJenis_bantuan(request.getParameter("jenis_bantuan"));
                        bo.setJumlah_dana(Double.parseDouble(request.getParameter("jumlah_dana")));
                        bo.setKet_dana(request.getParameter("ket_dana"));
                        bo.setFoto(request.getParameter("foto"));
                        bo.setTgl_pencairan(request.getParameter("tgl_pencairan"));
                        bo.setId_user(request.getParameter("id_user"));
                
                        pstmt = kon.conn.prepareStatement("INSERT INTO biaya_operasional values('"+bo.getNo_bo()+"','"
                        +bo.getTgl_pengajuan()+"','"
                        +bo.getJenis_bantuan()+"','"
                        +bo.getJumlah_dana()+"','"
                        +bo.getKet_dana()+"','"
                        +bo.getFoto()+"','"
                        +bo.getTgl_pencairan()+"','"
                        +bo.getId_user()+"')");
                        
                        result = pstmt.executeUpdate();
                        if(result>0) 
                        {
                            out.println("<script>"
                            +"alert('Data telah ditambahkan');"
                            +"document.location='beranda.jsp?hal=tampil_biaya_operasional';"
                            +"</script>");
                        }
                        break;
                        
                    case "Delete" :
                        bo.setNo_bo(request.getParameter("no_bo"));
                        pstmt=kon.conn.prepareStatement("DELETE FROM biaya_operasional WHERE no_bo='"+bo.getNo_bo()+"'");
                        result = pstmt.executeUpdate();
                        if(result > 0) 
                        {
                            out.println("<script>"
                            +"alert('Data telah dihapus');"
                            +"document.location='beranda.jsp?hal=tampil_biaya_operasional';"
                            +"</script>");
                        }
                        break;
                        
                    
                    default:
                }
            } else {
                out.println("<script>"
                            +"alert('Gagal Eksekusi');"
                            +"document.location='beranda.jsp?hal=input_biaya_operasional';"
                            +"</script>");
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
            Logger.getLogger(bo_servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bo_servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(bo_servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bo_servlet.class.getName()).log(Level.SEVERE, null, ex);
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
