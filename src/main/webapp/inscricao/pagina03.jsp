<%-- 
    Document   : pagina03
    Created on : 4 de set. de 2024, 18:30:35
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscrição - P3</title>
    </head>
    <body>
        <h1>Inscrição - P3</h1>

        <h2>Áreas de atuação</h2>
        <form method="GET" action="/JavaWeb/confirmacao">
            <input type="checkbox" name="areas" value="Manutenção de computadores" /> Manutenção de computadores <br>
            <input type="checkbox" name="areas" value="Desenvolvimento de sistemas" /> Desenvolvimento de sistemas <br>
            <input type="checkbox" name="areas" value="Análise de requisitos" /> Análise de requisitos <br>
            <input type="checkbox" name="areas" value="Administração d1e redes" /> Administração de redes <br>
            <input type="submit" name="anterior" value="Anterior">
            <input type="submit" name="proximo" value="Próximo">
        </form>
    </body>
</html>
