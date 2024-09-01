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
        String id = "";
        String nome = "";
        String sigla = "";
        String parametros = null;
        List<String> estados = (List<String>) request.getAttribute("estados");
        for (String estado :
                estados) {
            parametros = "";
            //Extraindo os dados
            id = estado.split(",")[0].trim();
            parametros += "id=" + id + "&";
            nome = estado.split(",")[1].trim();
            parametros += "nome=" + nome + "&";
            sigla = estado.split(",")[2].trim();
            parametros += "sigla=" + sigla;
            //Imprimindo as linhas
            out.print("<a href='/JavaWeb/banco/estado.jsp?" + parametros + "'>");
            out.print(estado);
            out.print("</a> --- ");
            out.print("<a href='/JavaWeb/ServletExcluirEstado?id=" + id + "'>Excluir</a>");
            out.println("<br>");
        }
    }
%>
<br>
<br>
<a href="/JavaWeb/index.jsp">Início</a>
</body>
</html>
