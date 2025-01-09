package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.MedicoModel;

public class DaoMedico {

    public void cadastrarMedicoBanco(MedicoModel medico) {
        String sql = "INSERT INTO MEDICO (NOME, CRM, ESPECIALIDADE, TELEFONE, EMAIL) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getCrm());
            ps.setString(3, medico.getEspecialidade());
            ps.setString(4, medico.getTelefone());
            ps.setString(5, medico.getEmail());

            ps.execute();
            ps.close();

            System.out.println("Medico cadastrado com sucesso");
        } catch (SQLException e) {
            System.out.println("Falha ao fazer o cadastro do medico: " + e.getMessage());
        }
    }

    public ArrayList<MedicoModel> listarMedicos(ArrayList<MedicoModel> medicos) {
        String sql = "SELECT * FROM MEDICO";
        Connection conn = null;
        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                String crm = resultSet.getString(3);
                String especialidade = resultSet.getString(4);
                String telefone = resultSet.getString(5);
                String email = resultSet.getString(6);

                medicos.add(new MedicoModel(id, nome, crm, especialidade, telefone, email));
            }
        } catch (SQLException e) {
            System.out.println("Não foi possivel fazer a listagem dos medicos" + e.getMessage());
        }
        return medicos;
    }
    
    public void deletarMedicoBanco(int id) {
        String sql = "DELETE FROM MEDICO WHERE ID = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {

            ps = Conexao.getConexao(conn).prepareStatement(sql);

            ps.setInt(1, id);
            ps.execute();
            ps.close();

            System.out.println("Registro do medico deletado com sucesso");
        } catch (SQLException e) {
            System.out.println("Nao foi possivel deletar esse registro do medico" + e.getMessage());
        }
    }

    public void atualizarMedicoBanco(int id, String especialidade, String telefone, String email) {
        String sql = "UPDATE MEDICO SET ESPECIALIDADE = ?, TELEFONE = ?, EMAIL = ? WHERE ID = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setString(1, especialidade);
            ps.setString(2, telefone);
            ps.setString(3, email);
            ps.setInt(4, id);

            ps.execute();
            ps.close();

            System.out.println("Medico atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Nao foi possivel atualizar o registro do medico" + e.getMessage());
        }
    }
}
