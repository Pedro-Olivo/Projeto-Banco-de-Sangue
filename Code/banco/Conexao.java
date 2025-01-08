package banco;
import java.sql.*;

public class Conexao {
    
    public static Connection getConexao(Connection conn) {
        try {
            if (conn == null || conn.isClosed()) {
                System.out.println("CALMA CALABRESO");
                conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poobancosanguebd", "root", "ostoma23#PP");
                System.out.println("RECEBAAAA");
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            System.out.println("Falha ao obter a conexão");
            return null;
        }
    }
}