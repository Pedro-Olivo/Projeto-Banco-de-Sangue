package controllers;

import banco.DaoBolsaSangue;
import java.util.ArrayList;
import models.BolsaSangueModel;
import view.BolsaSangueView;

public class BolsaSangueController implements Icrud{

    DaoBolsaSangue daoBolsa = new DaoBolsaSangue();
    BolsaSangueView view = new BolsaSangueView();

    @Override
    public void criar() {
        BolsaSangueModel model = new BolsaSangueModel();
        view.obterInfosCadastro(model);
        daoBolsa.cadastrarBolsaBanco(model);
    }

    @Override
    public void ler() {
        ArrayList<BolsaSangueModel> bolsas = new ArrayList<>();
        daoBolsa.listarConsultas(bolsas);
        view.exibirBolsas(bolsas);
    }

    @Override
    public void editar() {
        int id = view.obterId();
        String status = view.obterStatus();
        int idDoador = view.obterIdDoador();

        try {
            daoBolsa.atualizarConsultaBanco(id, status, idDoador);
        } catch (Exception e) {
            System.out.println("");
        }
    }

    @Override
    public void remover() {
        int id = view.obterId();
        daoBolsa.deletarBolsaBanco(id);
    }
}
