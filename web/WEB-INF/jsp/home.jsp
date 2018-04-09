<%-- 
    Document   : home
    Created on : Apr 8, 2018, 4:19:41 PM
    Author     : manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/> ">
    </head>
    <body>
        <header class="header">
            <nav class="menu">
                <ul>
                    <li>
                        <a class="nav-link" 
                           href = "/SistemaAdministracionProyectos/home/salir">Cerrar sesion
                        </a>
                    </li>
                </ul>
            </nav>
		
	</header><!-- .header-->

        <div class="wrapper">
            <div id="top">
                <div id="top1">
                    <p class="titulos">Proyecto</p>
                    <form>
                        <ul>
                            <li>Buscar un Proyecto <input type="text" name="firstname"></li>
                            <li><a href="agregar.jsp">Agregar Proyecto</a></li>
                            <li><a href="busqueda.jsp">Ver todos los Proyectos</a></li>
                        </ul>
                    </form>
                </div>
                <div id="top1">
                    <p class="titulos">Usuario</p>
                    <form>
                        <ul>
                            <li>Bucar un Usuario <input type="text" name="firstname"></li>
                            <sec:authorize access="hasRole('ROLE_ADMINISTRADOR')">
                                <li><a class="nav-link" 
                                       href="/SistemaAdministracionProyectos/home/agregarUsuario">Agregar usuario
                                    </a>
                                </li>
                            </sec:authorize>
                        </ul>
                    </form>
                </div>

                <div id="top1">
                <p class="titulos">Acciones</p>
                    <form>
                    <ul>
                        <li>Buscar una Accion<input type="text" name="firstname"></li>
                        <li><a href="#">Agregar Accion</a></li>
                        <li><a href="#">Ver todas las Acciones</a></li>
                    </ul>
                    </form>
                </div>
            </div><!-- .wrapper -->
        </div>
        <footer class="footer">
                Relizado por <b>Chabelo Software </b>
        </footer><!-- .footer -->
    </body>
</html>
