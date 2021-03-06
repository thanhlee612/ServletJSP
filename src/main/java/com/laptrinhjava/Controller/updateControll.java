/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.laptrinhjava.Controller;


import com.laptrinhjava.DAO.studentDAO;
import com.laptrinhjava.Model.listStudent;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "updateControll", urlPatterns = {"/update"})
public class updateControll extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updateControll</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateControll at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
        
        String idst = request.getParameter("sid");
        studentDAO dao = new studentDAO();
        listStudent student = dao.getStudentbyID(idst);
        request.setAttribute("st", student);
        request.getRequestDispatcher("view/Update.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
         
        String sid = request.getParameter("id");
        String sname = request.getParameter("name");
        String saddress = request.getParameter("address");
        studentDAO dao = new studentDAO();
        dao.UpdateStudent(sid, sname, saddress);
        response.sendRedirect("trang-chu");
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
