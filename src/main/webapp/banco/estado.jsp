<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Estado</title>
</head>
<body>
<h1>Cadastro de Estado</h1>
<form action="/JavaWeb/ServletSalvarEstado" method="POST">
    <fieldset>
        ID: <input type="text" name="id" readonly="true"
                   value="<%= request.getAttribute("id") == null ? "0" : request.getAttribute("id") %>"> <br>
        NOME: <input type="text" name="nome"
                     value="<%= request.getAttribute("nome") == null ? "" : request.getAttribute("nome") %>"> <br>
        SIGLA: <input type="text" name="sigla"
                      value="<%= request.getAttribute("sigla") == null ? "" : request.getAttribute("sigla") %>"
                      size="2"> <br>
    </fieldset>
    <fieldset>
        <input name="btnSalvar" type="submit" value="Salvar"/>
        <input name="btnCancelar" type="submit" value="Cancelar"/>
    </fieldset>
</form>
</body>
</html>
