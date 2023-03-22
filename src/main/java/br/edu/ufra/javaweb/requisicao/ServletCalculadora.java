package br.edu.ufra.javaweb.requisicao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletCalculadora", value = "/calculadora")
public class ServletCalculadora extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int resultado = 0;
        String va = request.getParameter("va");
        String vb = request.getParameter("vb");
        String operacao = request.getParameter("operacao");
        try {
            int a = Integer.parseInt(va);
            int b = Integer.parseInt(vb);
            switch (operacao) {
                case "+":
                    resultado = a + b;
                    break;
                case "-":
                    resultado = a - b;
                    break;
                case "x":
                    resultado = a * b;
                    break;
                case ":":
                    resultado = a / b;
                    break;
                default:
                    throw new ServletException("Nenhuma operação válida");
            }
        } catch (Exception e) {
            throw new ServletException(e.getMessage());
        }
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/requisicao/resultado.jsp");
        dispatcher.forward(request, response);
    }
}
