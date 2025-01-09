package menus;

import controllers.BolsaSangueController;
import java.util.Scanner;

public class MenuBolsa {
    public void main(String[] args) {

        BolsaSangueController controller = new BolsaSangueController();

        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while(opcao != 5) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Escolha a opcao desejada:");
            System.out.println("1 - Cadastrar uma nova bolsa");
            System.out.println("2 - Listar bolsas");
            System.out.println("3 - Atualizar o registro de uma bolsa");
            System.out.println("4 - Deletar o registro de uma bolsa");
            System.out.println("5 - Sair");

            System.out.println("--------------------------------------------------------------");
            System.out.println("");

            System.out.print("Digite o número da sua escolha: ");
            opcao = scanner.nextInt();

            System.out.println("");
            System.out.println("");

            switch (opcao) {
                case 1:
                    controller.criar();
                    System.out.println("");
                    break;
    
                case 2:
                    controller.ler();
                    System.out.println("");
                    break;
    
                case 3:
                    controller.editar();
                    System.out.println("");
                    break;
                
                case 4:
                    controller.remover();
                    System.out.println("");
                    break;
    
                case 5:
                    System.out.println("Encerrando o menu de bolsas de sangue.........");
                    System.out.println("");
                    break;
    
                default:
                    System.out.println("Opção invalida. Tente novamente.");
                    System.out.println("");
            }
        }

    }
}
