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
import model.siswa;

/**
 *
 * @author anton
 */
public class siswaServlet extends HttpServlet {

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
            siswa siswa = new siswa();
            koneksi kon = new koneksi();
            PreparedStatement pstmt = null;
            int result=0;
            
            String aksi = request.getParameter("aksi");
            if(aksi != null) {
                siswa.setNis(request.getParameter("nis"));
                siswa.setNama_siswa(request.getParameter("nama_siswa"));
                siswa.setTempat(request.getParameter("tempat"));
                siswa.setTgl_lahir(request.getParameter("tgl_lahir"));
                siswa.setJenis_kelamin(request.getParameter("jenis_kelamin"));
                siswa.setAlamat(request.getParameter("alamat"));
                siswa.setNo_telp(request.getParameter("no_telp"));
                siswa.setKelas(request.getParameter("kelas"));
                
                
                
                switch (aksi) 
                {
                    case "Simpan" :
                        pstmt = kon.conn.prepareStatement("INSERT INTO siswa values('"+siswa.getNis()+"','"
                        +siswa.getNama_siswa()+"','"
                        +siswa.getTempat()+"','"
                        +siswa.getTgl_lahir()+"','"
                        +siswa.getJenis_kelamin()+"','"
                        +siswa.getAlamat()+"','"
                        +siswa.getNo_telp()+"','"
                        +siswa.getKelas()+"')");
                        
                        result = pstmt.executeUpdate();
                        if(result>0) 
                        {
                            out.println("<script>"
                            
                            
                            +"alert('Data telah ditambahkan');"
                            + "document.location='beranda.jsp?hal=tampil_siswa';"
                                  
                            +"</script>"); 
                            
                        }
                        break;
                        
                    case "Delete" :
                        pstmt=kon.conn.prepareStatement("DELETE FROM siswa WHERE nis='"+siswa.getNis()+"'");
                        result = pstmt.executeUpdate();
                        if(result > 0) 
                        {
                            out.println("<script>"
                            +"alert('Data telah dihapus');"
                            +"document.location='beranda.jsp?hal=tampil_siswa';"
                            +"</script>");
                        }
                        break;
                        
                    case "Update" :
                        pstmt = kon.conn.prepareStatement("UPDATE siswa SET nama_siswa='"
                        +siswa.getNama_siswa()+"',jenis_kelamin='"
                        +siswa.getJenis_kelamin()+"',tempat='"
                        +siswa.getTempat()+"',tgl_lahir='"
                        +siswa.getTgl_lahir()+"',alamat='"
                        +siswa.getAlamat()+"',no_telp='"
                        +siswa.getNo_telp()+"',kelas='"
                        +siswa.getKelas()+"' where nis='"
                        +siswa.getNis()+"'");
                        
                        result=pstmt.executeUpdate();
                        if(result > 0) {
                            out.println("<script>"
                            +"alert('Data telah ubah');"
                            +"document.location='beranda.jsp?hal=tampil_siswa';"
                            +"</script>");
                        }
                    default:
                        break;
                }
            } else {
                out.println("<script>"
                            +"alert('Gagal Eksekusi');"
                            +"document.location='beranda.jsp?hal=tampil_siswa';"
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
            Logger.getLogger(siswaServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(siswaServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(siswaServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(siswaServlet.class.getName()).log(Level.SEVERE, null, ex);
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
