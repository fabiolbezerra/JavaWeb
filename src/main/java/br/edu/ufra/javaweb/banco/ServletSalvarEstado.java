package br.edu.ufra.javaweb.banco;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletSalvarEstado", value = "/ServletSalvarEstado")
public class ServletSalvarEstado extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String btnSalvar = request.getParameter("btnSalvar");
        String btnCancelar = request.getParameter("btnCancelar");
        String resultado = "/JavaWeb";
        if (btnSalvar != null) {
            resultado += "/ServletListarEstados";
            //Lendo parâmetros de entrada
            Integer id = Integer.parseInt(request.getParameter("id"));
            String nome = request.getParameter("nome");
            String sigla = request.getParameter("sigla");
            //Realizando o processamento
            try {
                BancoDeDados bancoDeDados = new BancoDeDados();
                if (id > 0) {
                    bancoDeDados.alterarEstado(id, nome, sigla);
                } else {
                    bancoDeDados.inserirEstado(nome, sigla);
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e);
                request.setAttribute("erro", ("Erro: " + e));
            }
        } else if (btnCancelar != null) {
            resultado += "/index.jsp";
        }
        response.sendRedirect(resultado);
    }


}
