package com.mycompany.tallerjava;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Principal")
public class Principal extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException{
       PrintWriter Salida = respuesta.getWriter();
       Salida.println("<!DOCTYPE html>");
       Salida.println("<html lang=\"es\">");
       Salida.println("<head>");
       Salida.println("<title>Elevado al cubo</title>");
       Salida.println("</head>");
       Salida.println("<body>");
       Salida.println("<h1>Elevacion al cubo</h1>");
       Salida.println("</p>El resultado es: " + (Math.pow(Double.valueOf(peticion.getParameter("Numero1")) , 3)) + "<p>");
       Salida.println("</body>");
       Salida.println("<html>");
    }
}
