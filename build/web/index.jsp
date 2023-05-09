<%-- 
    Document   : index
    Created on : 27/04/2023, 7:30:16 p. m.
    Author     : APRENDIZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <title>Registro</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="view/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Aprendiz</h1>
                <form action="ControladorAprendiz">
                    Documento:<br>
                    <input class="form-control" type="number" name="txtdoc"><br>
                    Nombres: <br>
                    <input class="form-control" type="text" name="txtNom"><br>
                     Apellidos: <br>
                    <input class="form-control" type="text" name="txtApe"><br>
                     Email: <br>
                    <input class="form-control" type="email" name="txtemail"><br>
                     Telefono: <br>
                    <input class="form-control" type="number" name="txttel"><br>
                    <br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    
                </form>
            </div>

        </div>
      
</html>
