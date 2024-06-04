<%-- 
    Document   : index
    Created on : 23 may 2024, 10:58:57 p. m.
    Author     : Carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesion</title>
        <link rel="stylesheet" href="css/style.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"><!-- comment -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/357aae614a.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="Container">
            <nav class="navbar bg-body-tertiary navegacion" >
                <div class="container-fluid">
                    <a class="navbar-brand" href="#">
                        <img src="./assets/logo.png" alt="Logo" width="60px"  class="d-inline-block">
                        AMIGOS DE DON BOSCO
                    </a>

                </div>

            </nav>

            <div class="inicio-sesion">
                <form>
                    <b>
                    <h3>INICIO DE SESION</h3>
                    </b>
                    <i class="fa-regular fa-user" style="font-size: 100px"></i>
                    <p>Carnet</p>
                    <input type="text" class="textbox" required/>
                    <p>Contraseña</p>
                    <input type="password" class="textbox" required/>
                    <br>
                    <input type="submit" class="btn-envio" value="Iniciar sesion"/>
                    <a href="CD.jsp">Iniciar sesion </a>
                </form>
            </div>
        </div>


    </body>
</html>
