<%-- 
    Document   : index
    Created on : 06/09/2014, 11:27:20 AM
    Author     : SABADO-MANHANA
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>titulo : ${titulo}</h1>
        <h2>contenido : ${contenido}</h2>
        <h2>contenido : ${programa.descripcion}</h2>
        
        <c:forEach var="i" items="${nombres}">
            <p> <c:out value="${i}"/><p> 
        </c:forEach>
        
    </body>
</html>
