package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException{
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = ler.nextLine();
        //String sql = "INSERT INTO pessoas (nome) VALUES ('" + nome + "')"; causa sql injection!!!

        Connection conexao = FabricaConexao.getConexao();
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql); //evita o sql injection
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa incluida com sucesso!");
        System.out.println(sql);

        ler.close();
    }
}
