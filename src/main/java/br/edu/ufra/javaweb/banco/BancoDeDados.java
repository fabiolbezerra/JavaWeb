package br.edu.ufra.javaweb.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BancoDeDados {
    private final static String BANCO = "javaweb";
    private final static String USUARIO = "root";
    private final static String SENHA = "root";

    private Connection conexao;

    public BancoDeDados() throws SQLException, ClassNotFoundException {
        System.out.println("Conectando com o MySQL ...");
        //Class.forName("com.mysql.jdbc.Driver"); //MySQL 5
        Class.forName("com.mysql.cj.jdbc.Driver"); //MySQL 8
        String url = "jdbc:mysql://localhost:3306/javaweb";

        conexao = DriverManager.getConnection(url, "root", "root");
    }


    public void inserirEstado(String nome, String sigla) throws SQLException {
        String sql = "insert into estado (nome,sigla) values (?,?)";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, sigla);

        int linhasAfetadas = ps.executeUpdate();
        System.out.println("Linhas afetadas: " + linhasAfetadas);
    }

    public void alterarEstado(int id, String nome, String sigla) throws SQLException {
        String sql = "update estado set nome = ?, sigla = ? where id = ?";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, sigla);
        ps.setInt(3, id);

        int linhasAfetadas = ps.executeUpdate();
        System.out.println("Linhas afetadas: " + linhasAfetadas);
    }

    public void excluirEstado(int id) throws SQLException {
        String sql = "delete from estado where id = ?";

        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, id);

        int linhasAfetadas = ps.executeUpdate();
        System.out.println("Linhas excluídas: " + linhasAfetadas);
    }

    public List<String> listarEstados() {
        return null;
    }
}
