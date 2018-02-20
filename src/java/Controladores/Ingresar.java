/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DAO.ServiciosEvento;
import VO.Evento;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Manuel
 */
public class Ingresar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ingresar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ingresar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        // Obtengo los datos de la peticion
        String inicio = request.getParameter("ini");
        String id_persona = "1";
        String nombreEvento = "nom";

        
        int idp = Integer.parseInt(id_persona);

        String fin = request.getParameter("fin");
        String dia = request.getParameter("dia");

        // Compruebo que los campos del formulario tienen datos para añadir a la tabla
        if (inicio.length() > 0 && fin.length() > 0 && dia.length() > 0) {
            
            
            String[] parts = dia.split(" ");
            String dia1 = parts[0]; 
            String dia2 = parts[1]; 
            
            String[] parts2 = fin.split(" ");
            String fin1 = parts2[0]; 
            String fin2 = parts2[1]; 
            
            
           int d=Integer.parseInt(dia1);
           int f=Integer.parseInt(fin1);

            Evento even = new Evento(ide, idp, nombreEvento,dia,d, f);
            ServiciosEvento serv=new ServiciosEvento();
            
            serv.agregarPersona(even);
            System.out.println("llegue hasta aca");
            
        }

       

    }



/**
 * Handles the HTTP <code>POST</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
