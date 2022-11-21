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
import model.akun;

/**
 *
 * @author anton
 */
public class akunServlet extends HttpServlet {

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
            akun akun = new akun();
            koneksi kon = new koneksi();
            PreparedStatement pstmt = null;
            int result=0;
            
            String aksi = request.getParameter("aksi");
            if(aksi != null) {
                akun.setNo_akun(request.getParameter("no_akun"));
                akun.setNama_akun(request.getParameter("nama_akun"));
                akun.setTipe_akun(request.getParameter("tipe_akun"));
                
                
                switch (aksi) 
                {
                    case "Simpan" :
                        pstmt = kon.conn.prepareStatement("INSERT INTO akun values('"+akun.getNo_akun()+"','"
                        +akun.getNama_akun()+"','"        
                        +akun.getTipe_akun()+"')");
                        
                        result = pstmt.executeUpdate();
                        if(result>0) 
                        {
                            out.println("<script>"
                            +"alert('Data telah ditambahkan');"
                            +"document.location='beranda.jsp?hal=tampil_akun';"
                            +"</script>");
                        }
                        break;
                        
                    case "Delete" :
                        pstmt=kon.conn.prepareStatement("DELETE FROM akun WHERE no_akun='"+akun.getNo_akun()+"'");
                        result = pstmt.executeUpdate();
                        if(result > 0) 
                        {
                            out.println("<script>"
                            +"alert('Data telah dihapus');"
                            +"document.location='beranda.jsp?hal=tampil_akun';"
                            +"</script>");
                        }
                        break;
                        
                     case "Update" :
                        pstmt = kon.conn.prepareStatement("UPDATE akun SET nama_akun='"
                        +akun.getNama_akun()+"', tipe_akun='"
                        +akun.getTipe_akun()+"'where no_akun='"
                        +akun.getNo_akun()+"'");
                        
                        result=pstmt.executeUpdate();
                        if(result > 0) {
                            out.println("<script>"
                            +"alert('Data telah ubah');"
                            +"document.location='beranda.jsp?hal=tampil_akun';"
                            +"</script>");
                        }
                    default:
                        break;
                   
                        
                }
            } else {
                out.println("<script>"
                            +"alert('Gagal Eksekusi');"
                            +"document.location='beranda.jsp?hal=tampil_akun';"
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
            Logger.getLogger(akunServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(akunServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(akunServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(akunServlet.class.getName()).log(Level.SEVERE, null, ex);
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
