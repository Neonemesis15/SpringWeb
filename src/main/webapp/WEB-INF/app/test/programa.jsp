<%-- 
    Document   : programa
    Created on : 13/09/2014, 08:37:28 AM
    Author     : SABADO-MANHANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Programa</title>
        <style>
            label {display: block; margin-top: 20px;}            
            .btn {display: block; margin-top: 20px;}
        </style>
        
    </head>
    <body>
        <h1>Programa</h1>
        <form method="post" action="guardarPrograma">
            <label> Nombre </label>
            <input type="text" name="nombre"/>
            
            <label> Descripcion </label>
            <input type="text" name="Descripcion"/>
            
            <label> Codigo </label>
            <input type="text" name="Codigo"/>
            
            <input type="submit" value="Guardar" class="btn"/>
                
        </form>
    </body>
</html>
