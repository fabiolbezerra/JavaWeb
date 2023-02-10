package br.edu.ufra.javaweb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OlaMundo extends HttpServlet {
    private String message;

    public void init() {
        message = "Olá Mundo";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String nome = request.getParameter("nome");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + (nome != null ? " " + nome : "") + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}