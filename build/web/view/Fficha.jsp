<%-- 
    Document   : FLibros
    Created on : 15/05/2023, 06:33:52 PM
    Author     : INSTRUCTOR
--%>

<%@page import="model.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page import="java.util.List"%>
<%@page import="model.Programa"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Ficha</title>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         
            
                <h1>Agregar Ficha</h1>
                
                    Codigo ficha:<br>
                    <input class="form-control" type="number" name="txtcodficha"><br>
                    # de aprendices: <br>
                    <input class="form-control" type="text" name="txtnumapre"><br>
                    <br>
                    <div class="form-group">
                        <label>Nombre Programa:</label>
                        <select name="listapro" class="custom-select">
                            <option value="0"></option>
                            <% ProgramaDao pro = new ProgramaDao();
                            List<Programa> lista = pro.listadopro();%>
                            <% for(Programa li:lista){%>
                            <option value="<%=li.getCodprograma()%>"><%=li.getNomprograma()%></option>
                            <% } %>
                            </select>
                    </div>    
                            <br>
                       <div class="form-group">
    <label for="CodCateg">SELECCIONA APRENDICES:</label>
    <select name="Laprendices" class="custom-select">
        <option value="0"></option> 
       <% AprendizDao da = new AprendizDao();
        List<Aprendiz> listar = da.listadoA();%>
        
      <% for(Aprendiz ca:listar){%>
         <option value="<%=ca.getId()%>"><%=ca.getCodapred()%><%=ca.getNombreap()%><%=ca.getApellidoap()%>"</option> 
       <% } %>
    </select> 
                            
                        
                   
               
                    
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    
                
            

        
    </body>
</html>
