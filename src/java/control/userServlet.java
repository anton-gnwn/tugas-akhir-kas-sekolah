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
import model.user;

/**
 *
 * @author anton
 */
public class userServlet extends HttpServlet {

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
            user usr = new user();
            koneksi kon = new koneksi();
            PreparedStatement pstmt = null;
            int result=0;
            
            String aksi = request.getParameter("aksi");
            if(aksi != null) {
                usr.setId_user(request.getParameter("id_user"));
                usr.setNama_user(request.getParameter("nama_user"));
                usr.setHak_akses(request.getParameter("hak_akses"));
                usr.setPassword(request.getParameter("password"));
                switch (aksi) 
                {
                    case "Simpan" :
                        pstmt = kon.conn.prepareStatement("INSERT INTO user values('"+usr.getId_user()+"','"
                        +usr.getNama_user()+"','"
                        +usr.getPassword()+"','"
                        +usr.getHak_akses()+"')");
                        
                        result = pstmt.executeUpdate();
                        if(result>0) 
                        {
                            out.println("<script>"
                            +"alert('Data telah ditambahkan');"
                            +"document.location='beranda.jsp?hal=tampil_user';"
                            +"</script>");
                        }
                        break;
                        
                    case "Delete" :
                        pstmt=kon.conn.prepareStatement("DELETE FROM user WHERE id_user='"+usr.getId_user()+"'");
                        result = pstmt.executeUpdate();
                        if(result > 0) 
                        {
                            out.println("<script>"
                            +"alert('Data telah dihapus');"
                            +"document.location='beranda.jsp?hal=tampil_user';"
                            +"</script>");
                        }
                        break;
                        
                    case "Update" :
                        pstmt = kon.conn.prepareStatement("UPDATE user SET nama_user='"
                        +usr.getNama_user()+"',hak_akses='"
                        +usr.getHak_akses()+"',password='"
                        +usr.getPassword()+"'where id_user='"
                        +usr.getId_user()+"'");
                        
                        result=pstmt.executeUpdate();
                        if(result > 0) {
                            out.println("<script>"
                            +"alert('Perubahan telah berhasil!');"
                            +"document.location='beranda.jsp?hal=edit_profil&id_user="+usr.getId_user()+"';"
                            +"</script>");
                        }
                     
                    case "Ubah" :
                        pstmt = kon.conn.prepareStatement("UPDATE user SET nama_user='"
                        +usr.getNama_user()+"',hak_akses='"
                        +usr.getHak_akses()+"',password='"
                        +usr.getPassword()+"'where id_user='"
                        +usr.getId_user()+"'");
                        
                        result=pstmt.executeUpdate();
                        if(result > 0) {
                            out.println("<script>"
                            +"alert('Perubahan telah berhasil!');"
                            +"document.location='beranda.jsp?hal=ubah_password&id_user="+usr.getId_user()+"';"
                            +"</script>");
                        } 
                        
                    case "Daftar" :
                        pstmt = kon.conn.prepareStatement("INSERT INTO user values('"+usr.getId_user()+"','"
                        +usr.getNama_user()+"','"
                        +usr.getPassword()+"','"
                        +usr.getHak_akses()+"')");
                        
                        result = pstmt.executeUpdate();
                        if(result>0) 
                        {
                            out.println("<script>"
                            +"alert('Pendaftaran telah berhasil!');"
                            +"document.location='login.jsp';"
                            +"</script>");
                        }
                        break;  
                        
                    case "Hapus User" :
                        pstmt=kon.conn.prepareStatement("DELETE FROM user WHERE id_user='"+usr.getId_user()+"'");
                        result = pstmt.executeUpdate();
                        if(result > 0) 
                        {
                            out.println("<script>"
                            +"alert('Hapus User telah berhasil!');"
                            +"document.location='login.jsp';"
                            +"</script>");
                        }
                        break;    
                    default:
                        break;
                }
            } else {
                out.println("<script>"
                            +"alert('Gagal Eksekusi');"
                            +"document.location='beranda.jsp?hal=tampiluser';"
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
            Logger.getLogger(userServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(userServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(userServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(userServlet.class.getName()).log(Level.SEVERE, null, ex);
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
