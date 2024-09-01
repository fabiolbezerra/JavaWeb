package br.edu.ufra.javaweb.sessao;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletCookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        try {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCookie</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Visitas</h1>");
            Integer visitas = 1;
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visitas")) {
                    visitas = Integer.parseInt(cookie.getValue()) + 1;
                    cookie.setValue(visitas.toString());
                }
            }
            Cookie cookie = new Cookie("visitas", visitas.toString());
            cookie.setMaxAge(30);
            cookie.setComment("Número de visitas em 30s");
            response.addCookie(cookie);
            out.println(visitas);
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
