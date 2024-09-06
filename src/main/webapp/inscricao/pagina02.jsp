<%-- 
    Document   : pagina02
    Created on : 4 de set. de 2024, 18:30:27
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscrição - P2</title>
    </head>
    <body>
        <h1>Inscrição - P2</h1>
        
<%
    String nascimento = (String)session.getAttribute("nascimento");
    String endereco = (String)session.getAttribute("endereco");
%> 
        
        <form method="GET" action="/JavaWeb/p3">
            Data de nascimento: <input name="nascimento" value="<%= nascimento == null ? "" : nascimento %>" type="text"> <br> 
            Endereço: <input name="endereco" value="<%= endereco == null ? "" : endereco %>" type="text"> <br> 
            <input type="submit" name="anterior" value="Anterior">
            <input type="submit" name="proximo" value="Próximo">
        </form>
    </body>
</html>
