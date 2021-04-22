package com.mycompany.ejercicio4.tallerjavaservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Principal4")
public class Principal4 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException{
       Integer variableVisitas = 0;
       PrintWriter Salida = respuesta.getWriter();
       HttpSession miSesion = peticion.getSession();
       
       variableVisitas = (Integer)miSesion.getAttribute("Numero");
       if(variableVisitas == null){
           variableVisitas = 0;
       }
       
       Salida.println("<!DOCTYPE html>");
       Salida.println("<html lang=\"es\">");
       Salida.println("<head>");
       Salida.println("<title>Contador de visitas</title>");
       Salida.println("</head>");
       Salida.println("<body>");
       Salida.println("<h2>Variable de visitas</h2>");
       Salida.println("<p>La variable de visitas es igual a: " + variableVisitas + "</p>");
       Salida.println("<a href=\"index.html\">Pagina principal</a>");
       Salida.println("</body>");
       Salida.println("<html>");
       variableVisitas++;
       
       miSesion.setAttribute("Numero", variableVisitas);
    }
}
