<%-- 
    Document   : pagina01
    Created on : 4 de set. de 2024, 18:30:19
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscrição - P1</title>
    </head>
    <body>
        <h1>Inscrição - P1</h1>
        
<%
    String nome = (String)session.getAttribute("nome");
    String telefone = (String)session.getAttribute("telefone");
%> 
        
        <form method="GET" action="/JavaWeb/p2">
            Nome: <input name="nome" value="<%= nome == null ? "" : nome %>" type="text"> <br> 
            Telefone: <input name="telefone" value="<%= telefone == null ? "" : telefone %>" type="text"> <br> 
            <input type="submit" name="proximo" value="Próximo">
        </form>
    </body>
</html>
