package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException
{
    resp.setContentType("text/html");
    resp.setCharacterEncoding("UTF-8");
    PrintWriter out=resp.getWriter();
    out.println("<h1 style=color:green>Salut la servlet,  Comment vas tu? c'est le serveur </h1>");
    out.println("<h2 style=color:blue>Bien et toi?</h2>");
    out.println("<h1 style=color:green>T'es belle !! </h1>");
    out.println("<h2 style=color:blue>Ah oui, Merci 😍😍  </h2>");
    
}
}
