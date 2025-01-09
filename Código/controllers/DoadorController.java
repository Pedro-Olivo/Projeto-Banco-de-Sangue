package controllers;
import banco.DaoDoador;
import java.util.ArrayList;
import models.DoadorModel;
import view.DoadorView;

public class DoadorController implements Icrud {

    private DoadorView view = new DoadorView();
    private DaoDoador daoDoador = new DaoDoador();
    
    @Override
    public void criar() {
        DoadorModel model = new DoadorModel();
        view.obterInfos(model);
        daoDoador.cadastrarDoadorBanco(model);
    }

    @Override
    public void remover() {
        int id = view.obterId();
        daoDoador.deletarDoadorBd(id);
    }

    @Override
    public void editar() {
        int id = view.obterId();
        String telefone = view.obterTelefone();

        try {
            daoDoador.atualizarDoadorBd(id, telefone);
        } catch (Exception e) {
            System.out.println("");
        }
    }
    
    @Override
    public void ler() {
        ArrayList<DoadorModel> doadores = new ArrayList<>();
        daoDoador.listarDoadores(doadores);
        view.exibirDoadores(doadores);
    }
}