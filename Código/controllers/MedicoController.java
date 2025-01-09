package controllers;

import banco.DaoMedico;
import java.util.ArrayList;
import models.MedicoModel;
import view.MedicoView;

public class MedicoController implements Icrud{
    
    MedicoView view = new MedicoView();
    DaoMedico dao = new DaoMedico();

    @Override
    public void criar() {
        MedicoModel model = new MedicoModel();
        view.obterInfosCadastro(model);
        dao.cadastrarMedicoBanco(model);
    }

    @Override
    public void ler() {
        ArrayList<MedicoModel> medicos = new ArrayList<>();
        dao.listarMedicos(medicos);
        view.exibirMedicos(medicos);
    }
    
    @Override
    public void editar() {

        int id = view.obterId();
        String especialidade = view.obterEspecialidade();
        String telefone = view.obterTelefone();
        String email = view.obterEmail();

        try {
            dao.atualizarMedicoBanco(id, especialidade, telefone, email);
        } catch (Exception e) {
            System.out.println("");
        }
    }

    @Override
    public void remover() {
        int id = view.obterId();
        dao.deletarMedicoBanco(id);
    }
}
