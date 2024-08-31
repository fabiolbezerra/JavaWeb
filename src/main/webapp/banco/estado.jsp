<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Estado</title>
</head>
<body>
    <h1>Cadastro de Estado</h1>
    <form action="" method="POST">
        <fieldset>
            ID: <input type="text" id="id" readonly="true" value="<%= request.getAttribute("id") %>"> <br>
            NOME: <input type="text" id="nome" value="<%= request.getAttribute("nome") %>"> <br>
            SIGLA: <input type="text" id="sigla" value="<%= request.getAttribute("sigla") %>"> <br>
        </fieldset>
        <button id="btbSalvar" type="submit" value="Salvar" />
        <button id="btbCancelar" type="submit" value="Cancelar" />
    </form>
</body>
</html>
