<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "Hello World!" %></h1>

    <h2>Primeiros exemplos</h2>
    <a href="simples/index.html">Exemplo simples</a> <br/>
    <a href="hello-servlet">Hello World Servlet</a> <br/>
    <a href="ServletOlaMundo">ServletOlaMundo</a> <br/>
    <a href="olamundo?nome=Fabio">Olá Mundo Servlet</a> <br/>

    <h2>Exemplos de requisição</h2>
    <a href="parametros-inicializacao">Parâmetros de Inicialização</a> <br/>
    <a href="parametros?nome=Fabio&sobrenome=Bezerra&profissao=Professor">Parâmetros</a> <br/>
    <a href="requisicao/formulario-get.html">Requisição GET</a> <br/>
    <a href="requisicao/formulario-post.html">Requisição POST</a> <br/>

    <h2>Exercícios</h2>
    <a href="requisicao/ola-mundo-elaborado.html">Olá Mundo Elaborado</a> <br/>
    <a href="requisicao/calculadora.html">Calculadora</a> <br/>

    <h2>Exemplos de sessão</h2>
    <a href="ultimo-acesso">Último Acesso</a> <br/>
    <a href="visitas">Número de Visitas - Cookies</a> <br/>
    <a href="inscricao/pagina01.jsp">Formulário de inscrição</a> <br/>

    <h2>Exemplo com BD MySQL</h2>
    <a href="banco/estado.jsp">Cadastrar estado</a> <br/>
    <a href="ServletListarEstados">Listar estados cadastrados</a> <br/>
</body>
</html>