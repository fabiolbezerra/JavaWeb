package br.edu.ufra.javaweb;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletParametrosInicializacao extends HttpServlet {

    private String professor;
    private String instituto;

    @Override
    public void init() throws ServletException {
        super.init();
        //Obtendo os parâmetros de inicialização do Servlet
        ServletConfig servletConfig = getServletConfig();
        professor = servletConfig.getInitParameter("professor");
        //Obtendo os parâmetros de inicialização da Aplicação
        ServletContext servletContext = getServletContext();
        instituto = servletContext.getInitParameter("instituto");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletParametrosInicializacao</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + instituto + "</h1>");
            out.println("<h2>" + professor + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
