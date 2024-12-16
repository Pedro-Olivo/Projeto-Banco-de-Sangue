import java.util.ArrayList;

public class DoadorController {

    private DoadorView view = new DoadorView();
    private DoadorModel model = new DoadorModel();
    private Dao dao = new Dao();
    private ArrayList <DoadorModel> doadores = new ArrayList<>();

    public void cadastrarDoador() {
        view.obterInfos(model);
        doadores.add(model);
        dao.cadastrarDoadorBanco(model);
    }

    public void listarDoadores() {
        if (doadores.isEmpty()) {
            System.out.println("Nenhum doador cadastrado");
        } else {
            System.out.println("Lista de Doadores:");
            for (DoadorModel doador : doadores) {
                System.out.println("*********************************************************************");
                System.err.println("Nome: " + doador.getNomeDoador());
                System.out.println("Telefone: " + doador.getTelefoneDoador());
                System.out.println("E-mail: " + doador.getEmailDoador());
                System.out.println("*********************************************************************");

            }
        }
    }
}