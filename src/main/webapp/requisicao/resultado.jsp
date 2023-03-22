<%--
  Created by IntelliJ IDEA.
  User: Fabio
  Date: 22/03/2023
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
<h1>Calculadora</h1>
<%= request.getParameter("va") %>
<%= request.getParameter("operacao") %>
<%= request.getParameter("vb") %>
=
<%= request.getAttribute("resultado") %>
</body>
</html>
