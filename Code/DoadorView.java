import java.util.Scanner;

public class DoadorView {

    Scanner scanner = new Scanner(System.in);

    public void obterInfos(DoadorModel usuario) {
        System.out.println("Insira o seu nome: ");
        String nome = scanner.nextLine(); 
        usuario.setNomeDoador(nome);

        System.out.println("Insira o seu telefone: ");
        String telefone = scanner.nextLine(); 
        usuario.setTelefoneDoador(telefone);

        System.out.println("Insira o seu email: ");
        String email = scanner.nextLine(); 
        usuario.setEmailDoador(email);

        System.out.println("");
    }
}