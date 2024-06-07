package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        final String url= "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true"; //string de conexao
        final String usuario = "root";
        final String senha = "1987";

        Connection conexao = DriverManager.getConnection(url, usuario, senha); //precisa ser tratada

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
