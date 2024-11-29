
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoacaoController extends Doador implements Cadastro {
    public List<Doador> listaDoador = new ArrayList<>();
    @Override
    public void nomeUsuario(Scanner scanner) {
        Doador doador = new Doador();
        System.out.println("digita ai");
        doador.setNomeDoador(scanner.nextLine());
        listaDoador.add(doador);
}