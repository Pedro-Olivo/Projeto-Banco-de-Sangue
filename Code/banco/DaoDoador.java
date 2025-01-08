package banco;
import java.sql.*;
import java.util.ArrayList;
import models.DoadorModel;

public class DaoDoador {
    public void cadastrarDoadorBanco(DoadorModel doador) {
        String sql = "INSERT INTO doador (NOME, cpf, DATA_NASCIMENTO, SEXO, TIPO_SANGUINEO, TELEFONE, ENDERECO, ULTIMA_DOACAO, ELEGIVEL_PARA_DOACAO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        Connection conn = null;

        PreparedStatement ps;

        try {

            ps =  Conexao.getConexao(conn).prepareStatement(sql);
            ps.setString(1, doador.getNomeDoador());
            ps.setString(2, doador.getCpf());
            ps.setDate(3, doador.getDataNascimento());
            ps.setString(4, doador.getSexo());
            ps.setString(5, doador.getTipoSanguineo());
            ps.setString(6, doador.getTelefoneDoador());
            ps.setString(7, doador.getEndereco());
            ps.setDate(8, doador.getUltimaDoacao());
            ps.setBoolean(9, doador.isAptoDoar());
            ps.execute();
            ps.close();


            System.out.println("Cadastro realizado com sucesso");
            
        } catch (SQLException e) {
            System.out.println("Falha ao fazer o cadastro: " + e.getMessage());
        }
    }

    public ArrayList<DoadorModel> listarDoadores(ArrayList<DoadorModel> doadores) {

        String sql = "SELECT * FROM DOADOR";
        
        PreparedStatement ps;
        Connection conn = null;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                String cpf = resultSet.getString(3);
                Date dataNascimento = resultSet.getDate(4);
                String sexo = resultSet.getString(5);
                String tipoSanguineo = resultSet.getString(6);
                String telefone = resultSet.getString(7);
                String endereco = resultSet.getString(8);
                Date ultimaDoacao =  resultSet.getDate(9);
                boolean aptoDoar = resultSet.getBoolean(10);

                doadores.add(new DoadorModel(id, nome, cpf, dataNascimento, sexo, tipoSanguineo, telefone, endereco, ultimaDoacao, aptoDoar));
            }
        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }

        return doadores;
    }

    public void deletarDoadorBd(int id) {

        String sql = "DELETE FROM DOADOR WHERE ID = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível deletar o doador =(");
        }

    }

    public void atualizarDoadorBd(int id, String telefone) {
        String sql = "UPDATE DOADOR SET TELEFONE = ? WHERE ID = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {

            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setString(1, telefone);
            ps.setInt(2, id);
            

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            System.out.println("Não foi possivel atualizar o registro do doador.");
        }
    }
}