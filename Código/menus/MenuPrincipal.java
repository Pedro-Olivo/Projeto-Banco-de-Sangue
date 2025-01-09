package menus;
import java.util.Scanner;

public class MenuPrincipal {
    public void main(String[] args) {

        MenuDoador menuDoador = new MenuDoador();
        MenuConsultas menuConsultas = new MenuConsultas();
        MenuBolsa menuBolsa = new MenuBolsa();
        MenuMedico menuMedico = new MenuMedico();
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while(opcao != 5) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Escolha a opcao desejada:");
            System.out.println("1 - Doadores");
            System.out.println("2 - Medicos");
            System.out.println("3 - Consultas");
            System.out.println("4 - Bolsa de sangue");
            System.out.println("5 - Sair");
            System.out.println("--------------------------------------------------------------");
            System.out.println("");

            System.out.print("Digite o número da sua escolha: ");
            opcao = scanner.nextInt();

            System.out.println("");
            System.out.println("");

            switch (opcao) {
                case 1:
                    menuDoador.main(args);
                    System.out.println("");
                    break;
    
                case 2:
                    menuMedico.main(args);
                    System.out.println("");
                    break;
    
                case 3:
                    menuConsultas.main(args);
                    System.out.println("");
                    break;
                
                case 4:
                    menuBolsa.main(args);
                    System.out.println("");
                    break;
    
                case 5:
                    System.out.println("Encerrando o programa. Ate logo!");
                    break;
    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("");
            }
        }

    }
}
