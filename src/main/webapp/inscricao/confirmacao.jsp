<%-- 
    Document   : confirmacao
    Created on : 4 de set. de 2024, 18:30:45
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmação</title>
    </head>
    <body>
        <h1>Confirmação da inscrição</h1>
<%
    String nome = (String)session.getAttribute("nome");
    String telefone = (String)session.getAttribute("telefone");
    String nascimento = (String)session.getAttribute("nascimento");
    String endereco = (String)session.getAttribute("endereco");
    String[] areas = (String[])session.getAttribute("areas");
%>        
        Nome: <%= nome == null ? "" : nome %> <br> 
        Telefone: <%= telefone == null ? "" : telefone %> <br> 
        Data de nascimento: <%= nascimento == null ? "" : nascimento %> <br> 
        Endereço: <%= endereco == null ? "" : endereco %> <br> 
        Áreas de atuação: <br> 
        <ul>
<%
    for (String area : areas) {
        out.print("<li>");
        out.print(area);
        out.println("</li>");
    }
%>
        </ul>
    </body>
</html>
