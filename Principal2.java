package com.mycompany.ejercicio2.tallerjavaservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Principal2")
public class Principal2 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException{
       PrintWriter Salida = respuesta.getWriter();
       Salida.println("<!DOCTYPE html>");
       Salida.println("<html lang=\"es\">");
       Salida.println("<head>");
       Salida.println("<title>La hipotenuza</title>");
       Salida.println("<script src=\"scripts/Script.js\"></script>");
       Salida.println("</head>");
       Salida.println("<body>");
       Salida.println("<h2>Resultado:</h2>");
       Salida.println("<p>La hipotenuza es: " + (Math.hypot(Double.valueOf(peticion.getParameter("Cateto1")), Double.valueOf(peticion.getParameter("Cateto2")))) + "</p>");
       Salida.println("<p><a href=\"index.html\">Clic aqui para ingresar mas catetos</a></p>");
       Salida.println("</body>");
       Salida.println("<html>");
    }
    
}
