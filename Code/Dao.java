
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
    public void cadastrarDoadorBanco(DoadorModel doador) {
        String sql = "INSERT INTO USUARIO (NOME, TELEFONE, EMAIL) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, doador.getNomeDoador());
            ps.setString(2, doador.getTelefoneDoador());
            ps.setString(3, doador.getEmailDoador());

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}