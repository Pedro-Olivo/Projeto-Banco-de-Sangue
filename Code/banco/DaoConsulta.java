package banco;
import java.sql.*;
import java.util.ArrayList;
import models.ConsultaModel;

public class DaoConsulta {
    public void cadastrarConsultaBanco(ConsultaModel consulta) {
        String sql = "INSERT INTO consulta (DATA_CONSULTA, ID_DOADOR, ID_MEDICO, MOTIVO_CONSULTA, RESULTADO) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setTimestamp(1, consulta.getDataConsulta());
            ps.setInt(2, consulta.getIdDoador());
            ps.setInt(3, consulta.getIdMedico());
            ps.setString(4, consulta.getMotivoConsulta());
            ps.setString(5, consulta.getResultado());

            ps.execute();
            ps.close();

            System.out.println("Consulta cadastrada com sucesso");
        } catch (SQLException e) {
            System.out.println("Falha ao fazer o cadastro da consulta: " + e.getMessage());
        }
    }

    public ArrayList<ConsultaModel> listarConsultas(ArrayList<ConsultaModel> consultas) {
        String sql = "SELECT * FROM CONSULTA";
        Connection conn = null;
        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                Timestamp dataConsulta = resultSet.getTimestamp(2);
                int idDoador = resultSet.getInt(3);
                int idMedico = resultSet.getInt(4);
                String motivoConsulta = resultSet.getString(5);
                String resultado = resultSet.getString(6);

                consultas.add(new ConsultaModel(id, dataConsulta, idDoador, idMedico, motivoConsulta, resultado));
            }
        } catch (SQLException e) {
            System.out.println("Não foi possivel fazer a listagem das consultas" + e.getMessage());
        }
        return consultas;
    }

    public void deletarConsultaBanco(int id) {
        String sql = "DELETE FROM CONSULTA WHERE ID = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {

            ps = Conexao.getConexao(conn).prepareStatement(sql);

            ps.setInt(1, id);
            ps.execute();
            ps.close();

            System.out.println("Consulta deletada com sucesso");
        } catch (SQLException e) {
            System.out.println("Nao foi possivel deletar essa consulta" + e.getMessage());
        }
    }

    public void atualizarConsultaBanco(int id, Timestamp dataConsulta, int idMedico, String motivoConsulta, String resultado) {
        String sql = "UPDATE CONSULTA SET DATA_CONSULTA = ?, ID_MEDICO = ?, MOTIVO_CONSULTA = ?, RESULTADO = ? WHERE ID = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setTimestamp(1, dataConsulta);
            ps.setInt(2, idMedico);
            ps.setString(3, motivoConsulta);
            ps.setString(4, resultado);
            ps.setInt(5, id);

            ps.execute();
            ps.close();

            System.out.println("Consulta atualizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Nao foi possivel atualizar a consulta" + e.getMessage());
        }
    }
}
