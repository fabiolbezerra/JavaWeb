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
        System.out.println(btnSalvar);
        String btnCancelar = request.getParameter("btnCancelar");
        System.out.println(btnCancelar);
        String resultado = "/";
        if (btnSalvar != null) {
            resultado = "/ServletListarEstados";
            //Lendo parâmetros de entrada
            String nome = request.getParameter("nome");
            String sigla = request.getParameter("sigla");
            //Realizando o processamento
            Connection mydb = null;
            try {
                System.out.println("Conectando com o MySQL ...");
                //Class.forName("com.mysql.jdbc.Driver"); //MySQL 5
                Class.forName("com.mysql.cj.jdbc.Driver"); //MySQL 8
                String url = "jdbc:mysql://localhost:3306/aula_db";

                mydb = DriverManager.getConnection(url, "root", "root");

                PreparedStatement ps = mydb.prepareStatement("insert into estado (nome, sigla) values (?, ?)");
                ps.setString(1, nome);
                ps.setString(2, sigla);
                int linhasAfetadas = ps.executeUpdate();
                System.out.println("Linhas afetadas: " + linhasAfetadas);
            } catch (Exception e) {
                System.out.println("Erro: " + e);
                request.setAttribute("erro", ("Erro: " + e));
            } finally {
                try {
                    if (mydb != null && !mydb.isClosed()) {
                        mydb.close();
                    }
                } catch (Exception e2) {
                    System.out.println(e2);
                }
            }
        } else {
            resultado = "/index.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(resultado);
        rd.forward(request, response);
    }


}
