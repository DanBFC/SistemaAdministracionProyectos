<%-- 
    Document   : PantallaInicioSesion
    Created on : Apr 7, 2018, 6:22:44 PM
    Author     : manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${param.error != null}">
            <div class = "alert alert-danger">
                Nombre o contraseña incorrectos.
            </div>
        </c:if>
        <h1>Iniciar sesión</h1>
        <form method="POST" action="/Dahood/iniciarsesion">
            <p>Usuario</p>
            <input type="text" name="usuario" value=""
                   placeholder="Nombre de usuario" 
                   required
                   oninvalid="this.setCustomValidity('Llena este campo')"
                   oninput="setCustomValidity('')"
            />
            <p>Contraseña</p>
            <input type='password' name='contrasena' placeholder="Contraseña"
                   required
                   oninvalid='this.setCustomValidity("Llena este campo")'
                   oninput='setCustomValidity("")'
            />
            <input name="submit" type="submit" value="Iniciar sesión"/>
        </form>
    </body>
</html>
