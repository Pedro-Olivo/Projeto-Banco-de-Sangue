

public class Principal {
    public static void main (String[] args) {
        DoadorController controller = new DoadorController();
        controller.cadastrarDoador();

        System.out.println("Cadastro realizado com sucesso!");

        controller.listarDoadores();
    }
}