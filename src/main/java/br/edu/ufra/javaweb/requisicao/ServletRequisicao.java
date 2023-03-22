package br.edu.ufra.javaweb.requisicao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletRequisicao", value = "/ServletRequisicao")
public class ServletRequisicao extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("formulario", "GET");
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("formulario", "POST");
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Poderia ter algum processamento com os parâmetros aqui
        RequestDispatcher dispatcher = request.getRequestDispatcher("resposta-formulario.jsp");
        dispatcher.forward(request, response);
    }
}
