<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Estados</title>
</head>
<body>
<h1>Lista de Estados</h1>
<%
    Object erro = request.getAttribute("erro");
    if (erro != null) {
        out.print("<h2>Erro</h2>");
        out.print("<h3 style='color: red'>" + erro + "</h3>");
    } else {
        List estados = (List) request.getAttribute("estados");
        for (Object estado :
                estados) {
            out.print(estado);
            out.println("<br>");
        }
    }
%>

</body>
</html>
