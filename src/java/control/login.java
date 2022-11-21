/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.user;

/**
 *
 * @author anton
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    

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
        String proses=request.getParameter("proses");
        if (proses.equals("logout")) {
            HttpSession sesi=request.getSession();
            sesi.invalidate();
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String proses=request.getParameter("proses");
        
        if (proses.equals("login")) {
            String user = request.getParameter("nama_user");
            String pass = request.getParameter("password");
            String hak_akses = request.getParameter("hak_akses");
            String id_user = request.getParameter("id_user");
            if (pass == null || pass.equals("")) {
                response.sendRedirect("login.jsp");
            } else {
                user pm = new user();
                List<user> datalogin = new ArrayList<user>();
                
                datalogin = pm.LoginUser(user, pass);
                if (datalogin.isEmpty()) {
                    response.sendRedirect("login.jsp");
                } else {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("nama_user", datalogin.get(0).getNama_user());
                    session.setAttribute("id_user", datalogin.get(0).getId_user());
                    session.setAttribute("hak_akses", datalogin.get(0).getHak_akses());
                    
                if (datalogin.get(0).getHak_akses().equals("Kepala Tata Usaha")) {
                    response.sendRedirect("beranda1.jsp");
                }    
                else if (datalogin.get(0).getHak_akses().equals("Bendahara")) {
                    response.sendRedirect("beranda.jsp");
                }    
                else if (datalogin.get(0).getHak_akses().equals("Kepala Sekolah")) {
                    response.sendRedirect("beranda2.jsp");
                }
                }
            }
        }
    }

}
