package controllers;

import banco.DaoConsulta;
import java.sql.Timestamp;
import java.util.ArrayList;
import models.ConsultaModel;
import view.ConsultaView;

public class ConsultaController implements Icrud{
    
    private ConsultaView view =  new ConsultaView();
    private DaoConsulta daoConsulta = new DaoConsulta(); 

    @Override
    public void criar() {
        ConsultaModel consulta = new ConsultaModel();
        view.obeterInfosConsulta(consulta);
        daoConsulta.cadastrarConsultaBanco(consulta);
    }

    @Override
    public void ler() {
        ArrayList<ConsultaModel> consultaModels = new ArrayList<>();
        daoConsulta.listarConsultas(consultaModels);
        view.exibirConsultas(consultaModels);
    }

    @Override
    public void editar() {
        ConsultaModel consulta = new ConsultaModel();
        int id = view.obterId();
        String dataInutil = view.obterAtualizacaoDataConsulta();
        Timestamp dataUtil = consulta.converteData(dataInutil);
        int idMedico = view.obterNovoIdMedico();
        String motivoConsulta = view.novoMotivoConsulta();
        String resultado = view.novoResultado();

        try {
            daoConsulta.atualizarConsultaBanco(id, dataUtil, idMedico, motivoConsulta, resultado);
            
        } catch (Exception e) {
            System.out.println("");
        }
    }

    @Override
    public void remover() {
        int id = view.obterId();
        daoConsulta.deletarConsultaBanco(id);
    }
    
}
