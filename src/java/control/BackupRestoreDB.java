/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DBBackup;

/**
 *
 * @author anton
 */
public class BackupRestoreDB extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("backup") != null) {

            String status = DBBackup.mysqlDatabaseBackUp();
            if (status.equals("y")) {

                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", "");
                response.sendRedirect("beranda.jsp?hal=backup_berhasil");
            } else if (status.equals("n")) {

                response.sendRedirect("beranda.jsp?hal=backup_gagal");
            }

        } else if (request.getParameter("restore") != null) {

            String fileName = request.getParameter("file");

            boolean status = DBBackup.mysqlDatabaseRestore("kas_masuk_sekolah", "-u root", "-p", "C:\\Backup Database\\" + fileName);
            if (status == true) {
                System.out.println("restore success ");
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", "");
                response.sendRedirect("beranda.jsp?hal=restore_berhasil");
            } else {
                System.out.println("restore failure ");
                response.sendRedirect("beranda.jsp?hal=restore_gagal");
            }

        }
    }

}
