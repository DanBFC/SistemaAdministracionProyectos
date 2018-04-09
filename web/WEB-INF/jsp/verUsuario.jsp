<%-- 
    Document   : verUsuario
    Created on : 9/04/2018, 03:11:20 AM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header class="header">
            <nav class="menu">

                <ul>
	
                </ul>
            </nav>
		
	</header><!-- .header-->

        <div class="wrapper">
            <div id="top">
                <div id="top2">
                    <p class="titulos">Registro</p>
                    <form action="home" method="get">
                        <ul>
                            <li>Nombre:<input type="text" name="nombre" 
                                              value="${p.nombre}"></li>
                            
                            <li>Rol: <input type="text" value="${p.rol}"</li>

                        </ul>
                    <input type="submit" href="home.jsp">
                    </form>
                </div>
            </div><!-- .wrapper -->
        </div>
        <footer class="footer">
            Relizado por <b>Chabelo Software </b>
        </footer><!-- .footer -->
    </body>
</html>
