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
                }
            %>
            
            
            
        </table>
        </div>
    </body>
</html>
