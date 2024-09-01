package br.edu.ufra.javaweb.banco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletExcluirEstado", value = "/ServletExcluirEstado")
public class ServletExcluirEstado extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Lendo parâmetros de entrada
        Integer id = Integer.parseInt(request.getParameter("id"));
        //Realizando o processamento
        try {
            BancoDeDados bancoDeDados = new BancoDeDados();
            bancoDeDados.excluirEstado(id);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
            request.setAttribute("erro", ("Erro: " + e));
        }
        //Gerando saída
        response.sendRedirect("/JavaWeb/ServletListarEstados");
    }


}
