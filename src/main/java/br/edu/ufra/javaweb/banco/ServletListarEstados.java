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

@WebServlet(name = "ServletListarEstados", value = "/ServletListarEstados")
public class ServletListarEstados extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection mydb = null;
        try {
            System.out.println("Conectando com o MySQL ...");
            //Class.forName("com.mysql.jdbc.Driver"); //MySQL 5
            Class.forName("com.mysql.cj.jdbc.Driver"); //MySQL 8
            String url = "jdbc:mysql://localhost:3306/javaweb";

            mydb = DriverManager.getConnection(url, "root", "root");

            Statement stmt = mydb.createStatement();
            ResultSet rs = stmt.executeQuery("select id, nome, sigla from estado");
            String linha = null;
            List<String> estados = new ArrayList<>();
            request.setAttribute("estados", estados);
            while (rs.next()) {
                linha = rs.getString(1) + ", ";
                linha += rs.getString(2) + ", ";
                linha += rs.getString(3);
                estados.add(linha);
            }

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
        RequestDispatcher rd = request.getRequestDispatcher("/banco/estados.jsp");
        rd.forward(request, response);
    }


}
