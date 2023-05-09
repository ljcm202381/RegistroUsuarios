<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 08:42:05 PM
    Author     : INSTRUCTOR
--%>

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
                <form action="ControladorAprendiz">
                    Id:<br>
                    <input class="form-control" type="number" name="txtid" disabled=""><br>
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
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                    
                </form>
            </div>

        </div>
    </body>
</html>
