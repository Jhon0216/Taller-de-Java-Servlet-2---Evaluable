package com.mycompany.ejercicio3.tallerjavaservlet;

import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Principal3")
public class Principal3 extends HttpServlet{
    private double[] numeros;
    @Override
    public void init(){
        numeros = new double[10];
        numeros[0]= 4;
        numeros[1]= 3;
        numeros[2]= 2;
        numeros[3]= 5;
        numeros[4]= 7;
        numeros[5]= 3;
        numeros[6]= 7;
        numeros[7]= 8;
        numeros[8]= 1;
        numeros[9]= 10;
    }
    
    @Override
    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException{
       PrintWriter Salida = respuesta.getWriter();
       Salida.println("<!DOCTYPE html>");
       Salida.println("<html lang=\"es\">");
       Salida.println("<head>");
       Salida.println("<title>Suma de Arraylist</title>");
       Salida.println("</head>");
       Salida.println("<body>");
       Salida.println("<h2>Suma del Arraylist</h2>");
       Salida.println("<p>"+ (numeros[0]) + "</p>");
       Salida.println("<p>"+ (numeros[1]) + "</p>");
       Salida.println("<p>"+ (numeros[2]) + "</p>");
       Salida.println("<p>"+ (numeros[3]) + "</p>");
       Salida.println("<p>"+ (numeros[4]) + "</p>");
       Salida.println("<p>"+ (numeros[5]) + "</p>");
       Salida.println("<p>"+ (numeros[6]) + "</p>");
       Salida.println("<p>"+ (numeros[7]) + "</p>");
       Salida.println("<p>"+ (numeros[8]) + "</p>");
       Salida.println("<p>"+ (numeros[9]) + "</p>");
       Salida.println("<p>La suma de todos los numeros es: "+ (numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5]+numeros[6]+numeros[7]+numeros[8]+numeros[9]) + "</p>");
       Salida.println("</body>");
       Salida.println("<html>");
}
}