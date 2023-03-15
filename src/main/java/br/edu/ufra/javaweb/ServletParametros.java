package br.edu.ufra.javaweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ServletParametros extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletRequisicao</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Nomes dos Parâmetros</h3>");
            Enumeration<String> parameterNames = request.getParameterNames();
            while (parameterNames.hasMoreElements()) {
                out.println(parameterNames.nextElement() + "<br>");
            }
            out.println("<h3>Request URL:</h3>" + request.getRequestURL());
            out.println("<h3>Request URI:</h3>" + request.getRequestURI());
            out.println("<h3>Query String:</h3>" + request.getQueryString());
            out.println("<h3>Contexto da Aplicação:</h3>" + request.getContextPath());
            out.println("<h3>Caminho do Servlet:</h3>" + request.getServletPath());
            out.println("</body>");
            out.println("</html>");
        }
    }
}
