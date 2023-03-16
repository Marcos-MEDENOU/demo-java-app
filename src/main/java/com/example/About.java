package com.example;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 

public class About extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("Bonjour tout le monde");
        out.println("</body></html>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

}