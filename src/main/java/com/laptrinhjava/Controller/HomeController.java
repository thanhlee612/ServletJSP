/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laptrinhjava.Controller;


import com.laptrinhjava.DAO.studentDAO;
import com.laptrinhjava.Model.listStudent;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        studentDAO dao= new studentDAO();       
        List<listStudent> list = dao.getfindAll();
        req.setAttribute("listS", list);
        req.getRequestDispatcher("view/home.jsp").forward(req, resp);
//        RequestDispatcher rd = req.getRequestDispatcher("/view/web/home.jsp");
//        rd.forward(req, resp);
    }
    
}
