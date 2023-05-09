<%-- 
    Document   : ListarA
    Created on : 3/05/2023, 07:16:39 PM
    Author     : INSTRUCTOR
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.AprendizDao"%>
<%@page import="model.Aprendiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listar</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
        <h1>APRENDICES REGISTRADOS EN EL SISTEMA</h1>
        <table class="table table-responsive">
            <thead>
                <tr>
                    <th class="text-center">ID</th>
                    <th class="text-center">DOCUMENTO</th>
                    <th class="text-center">NOMBRE</th>
                    <th class="text-center">APELLIDO</th>
                    <th class="text-center">EMAIL</th>
                    <th class="text-center">CELULAR</th>
                   </tr>
                      
            </thead>
            
            <%
             AprendizDao dao = new AprendizDao();  
             List<Aprendiz>listar=dao.listadoA();
             Iterator<Aprendiz>it=listar.iterator();
             Aprendiz usu =null;
             while(it.hasNext()){
                 usu=it.next();
                
            %>
            <tbody>
                <tr>
                    <td class="text-center"><%=usu.getId()%></td>
                    <td class="text-center"><%=usu.getCodapred()%></td>
                    <td class="text-center"><%=usu.getNombreap()%></td>
                    <td class="text-center"><%=usu.getApellidoap()%></td>
                    <td class="text-center"><%=usu.getEmailap()%></td>
                    <td class="text-center"><%=usu.getTeleap()%></td>
                   
                    <td class="text-center">
                        <a class="btn btn-danger" href="../ControladorAprendiz?accion=editar&id=<%=usu.getId()%>">EDITAR</a>
                        <a class="btn btn-warning" href="../ControladorAprendiz?accion=eliminar&id=<%=usu.getId()%>">ELIMINAR</a>
                        
                    </td>   
                </tr>
              <% } %>
                   </tbody>
            
                      
        </table>
        </div>
    </body>
</html>
