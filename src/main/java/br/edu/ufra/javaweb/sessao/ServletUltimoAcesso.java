package br.edu.ufra.javaweb.sessao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ServletUltimoAcesso extends HttpServlet {
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
            out.println("<title>Servlet ServletSessao</title>");
            out.println("</head>");
            out.println("<body>");
            HttpSession session = request.getSession();
            Date ultimoAcesso = (Date) session.getAttribute("ultimoAcesso");
            out.println("SID: " + session.getId());
            out.println("<h1>Último acesso: " + ultimoAcesso + "</h1>");
            session.setAttribute("ultimoAcesso", new Date());
            out.println("</body>");
            out.println("</html>");
        }
    }


}
