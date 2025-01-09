package banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.BolsaSangueModel;

public class DaoBolsaSangue {
    public void cadastrarBolsaBanco(BolsaSangueModel bolsa) {
        String sql = "INSERT INTO bolsa_sangue (TIPO_SANGUINEO, FATOR_RH, DATA_COLETA, VALIDADE, QUANTIDADE_ML, STATUS, ID_DOADOR) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;

        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setString(1, bolsa.getTipoSanguineo());
            ps.setString(2, bolsa.getFatorRh());
            ps.setDate(3, bolsa.getDataColeta());
            ps.setDate(4, bolsa.getValidade());
            ps.setInt(5, bolsa.getQuantidadeMl());
            ps.setString(6, bolsa.getStatus());
            ps.setInt(7, bolsa.getId());

            ps.execute();
            ps.close();

            System.out.println("Bolsa de sangue cadastrada com sucesso");
        } catch (SQLException e) {
            System.out.println("Falha ao fazer o cadastro da bolsa: " + e.getMessage());
        }
    }

    public ArrayList<BolsaSangueModel> listarConsultas(ArrayList<BolsaSangueModel> bolsas) {
        String sql = "SELECT * FROM BOLSA_SANGUE";
        Connection conn = null;
        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String tipoSanguineo = resultSet.getString(2);
                String fatorRh = resultSet.getString(3);
                Date coleta = resultSet.getDate(4);
                Date validade = resultSet.getDate(5);
                int quantidade = resultSet.getInt(6);
                String status = resultSet.getString(7);
                int idDoador = resultSet.getInt(8);

                bolsas.add(new BolsaSangueModel(id, tipoSanguineo, fatorRh, coleta, validade, quantidade, status, idDoador));
            }
        } catch (SQLException e) {
            System.out.println("Não foi possivel fazer a listagem das bolsas" + e.getMessage());
        }
        return bolsas;
    }

    public void deletarBolsaBanco(int id) {
        String sql = "DELETE FROM BOLSA_SANGUE WHERE ID = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {

            ps = Conexao.getConexao(conn).prepareStatement(sql);

            ps.setInt(1, id);
            ps.execute();
            ps.close();

            System.out.println("Bolsa deletada com sucesso");
            System.out.println("");

        } catch (SQLException e) {
            System.out.println("Nao foi possivel deletar o registro da bolsa" + e.getMessage());
            System.out.println("");
        }
    }

    public void atualizarConsultaBanco(int id, String status, int idDoador) {
        String sql = "UPDATE BOLSA_SANGUE SET STATUS = ?, ID_DOADOR = ? WHERE ID = ?";
        Connection conn = null;
        PreparedStatement ps;

        try {
            ps = Conexao.getConexao(conn).prepareStatement(sql);
            ps.setString(1, status);
            ps.setInt(2, idDoador);
            ps.setInt(3, id);

            ps.execute();
            ps.close();

            System.out.println("Registro da bolsa atualizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Nao foi possivel atualizar o registro da bolsa" + e.getMessage());
        }
    }

}
