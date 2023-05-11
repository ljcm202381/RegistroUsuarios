<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 08:42:05 PM
    Author     : INSTRUCTOR
--%>

<%@page import="model.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Editar</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="view/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
      <div class="container">
            <div class="col-lg-6">
                <h1>Editar Aprendiz</h1>
                <%
                AprendizDao ape =new AprendizDao();   
                int id = Integer.parseInt((String)request.getAttribute(("id")));
                Aprendiz ap = new Aprendiz();
                ap= ape.list(id);
                
                %>
                <form action="ControladorAprendiz">
                  
                    
                    Documento:<br>
                    <input class="form-control" type="number" name="txtdoc1" value="<%=ap.getCodapred()%>"><br>
                    Nombres: <br>
                    <input class="form-control" type="text" name="txtNom1" value="<%=ap.getNombreap()%>"><br>
                     Apellidos: <br>
                    <input class="form-control" type="text" name="txtApe1" value="<%=ap.getApellidoap()%>"><br>
                     Email: <br>
                    <input class="form-control" type="email" name="txtemail1" value="<%=ap.getEmailap()%>"><br>
                     Telefono: <br>
                    <input class="form-control" type="number" name="txttel1" value="<%=ap.getTeleap()%>"><br>
                    <br>
                    <input class="form-control" type="hidden" name="txtid" value="<%=ap.getId()%>"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                    
                </form>
            </div>

        </div>
    </body>
</html>
