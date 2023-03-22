<%--
  Created by IntelliJ IDEA.
  User: Fabio
  Date: 22/03/2023
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exemplo de Requisição <%= request.getAttribute("formulario") %></title>
</head>
<body>
  <h1>Parâmetros da Requisição - Via <%= request.getAttribute("formulario") %></h1>

  <h2>Nome</h2>
  <%= request.getParameter("nome") %>

  <h2>Instituição</h2>
  <%= request.getParameter("instituicao") %>
</body>
</html>
