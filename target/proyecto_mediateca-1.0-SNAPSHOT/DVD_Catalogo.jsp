<%-- 
    Document   : Principal
    Created on : 24 may 2024, 12:23:21 a. m.
    Author     : Carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="CRUD.MultimediaDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catalgo de DVD</title>
        <link rel="stylesheet" href="css/principal.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"><!-- comment -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

        <script src="https://kit.fontawesome.com/357aae614a.js" crossorigin="anonymous"></script>
    </head>
    <body style="background-color: white">
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="" style="font-size: 15px">
                    <img src="./assets/logo.png" alt="Logo" width="60px"  class="d-inline-block">
                    AMIGOS DE DON BOSCO
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active seleccion" aria-current="page" href style="font-size: 20px; margin-left: 10px; margin-right: 10px">Inicio</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle seleccion" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false" style="font-size: 20px; margin-left: 10px; margin-right: 10px">
                                Catalogo
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="./Area_de_Libros.jsp" style="font-size: 20px; margin-left: 10px; margin-right: 10px">Ver Catalogo de Libros</a></li>
                                <li><a class="dropdown-item" href="./revistas.jsp" style="font-size: 20px; margin-left: 10px; margin-right: 10px">Ver Catalogo de Revistas</a></li>
                                <li><a class="dropdown-item" href="./CD.jsp" style="font-size: 20px; margin-left: 10px; margin-right: 10px">Ver Catalogo de CD</a></li>
                                <li><a class="dropdown-item" href="./DVD_Catalogo.jsp" style="font-size: 20px; margin-left: 10px; margin-right: 10px">Ver Catalogo de DVD</a></li>

                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link seleccion" href="#"  style="font-size: 20px; margin-left: 10px; margin-right: 10px">Prestamos Vigentes</a>
                        </li>


                        <li class="nav-item">
                            <a class="nav-link  seleccion" aria-current="page" href style="font-size: 20px; margin-left: 10px; margin-right: 10px">Perfil</a>
                        </li>
                    </ul>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Buscar por titulo" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Buscar</button>
                    </form>
                </div>
            </div>
        </nav>
        <div class="container">
            <h1 style='font-size: 20px'>
                <b>
                    BIENVENIDOS A NUESTRA FAMILIA (NOMBRE DEL USUARIO)
                </b>

            </h1>
            <%
                MultimediaDAO MultimediaDAO= new MultimediaDAO();
            %>
            <%
                List<Map<String, Object>> resultados = MultimediaDAO.obtenerInfoPrestamos(2);
                int contador;
                // Reemplaza 1 con el filtro que deseas utilizar
            %>
            <h2>
                Area de DVD
            </h2>
            <% for (Map<String, Object> fila : resultados) { %>
            <div class="card" style="width: 18rem; margin-top: 80px;display: inline-flex;margin-left: 20px;margin-right: 20px;">

                <div class="card-body">
                    <h5 class="card-title"><%= fila.get("TITULO") %></h5>

                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">Director: <%= fila.get("DIRECTOR") %></li>
                    <li class="list-group-item">Genero: <%= fila.get("GENERO") %></li>
                    <li class="list-group-item">Cantidad Disponible:<%= fila.get("UNIDADES_DISPONIBLES") %></li>
                </ul>
                <div class="card-body">
                    <a href="#" class="card-link">Ver mas a detalle</a>

                </div>
            </div>
            <% } %> 
            
            
        </div>

    </body>
</html>
