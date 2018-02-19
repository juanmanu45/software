<%-- 
    Document   : ListarPersona
    Created on : 8/02/2018, 11:36:06 AM
    Author     : LabingXEON
--%>

<%@page import="VO.Persona"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
               <h1>Personas</h1>
                    <table>
                        <tr>
                            <td>ID</td>
                            <td>NOMBRE</td>
                            <td>CORREO</td>
                            <td>CARRERA</td>
                            <td>TELEFONO</td>
                            <td>USUARIO</td>
                            <td>CONTRASENA</td>
                            
                        </tr>
                        <%
                            if (request.getAttribute("lis") != null) {
                                ArrayList<Persona> persona = (ArrayList<Persona>) request.getAttribute("lis");

                                if (persona != null) {
                                    for (Persona es: persona) {

                        %>
                        <h1></h1>
                        <tr>  
                            <td><%=es.getId()%></td>
                            <td><%=es.getNombre()%></td>
                            <td><%=es.getCorreo()%></td>
                            <td><%=es.getCarrera()%></td>
                            <td><%=es.getTelefono()%></td>
                            <td><%=es.getUsuario()%></td>
                            <td><%=es.getContrasena()%></td>
                           
                        </tr>

                        <%

                                    }
                                }
                            }
                        %>

                    </table>
    </body>
</html>

