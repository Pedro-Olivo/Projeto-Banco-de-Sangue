package menus;

import controllers.ConsultaController;
import java.util.Scanner;

public class MenuConsultas {
    public void main(String[] args) {

        ConsultaController controller = new ConsultaController();

        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while(opcao != 5) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Escolha a opcao desejada:");
            System.out.println("1 - Cadastrar uma nova consulta");
            System.out.println("2 - Listar consultas");
            System.out.println("3 - Atualizar uma consulta");
            System.out.println("4 - Deletar uma consulta");
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
                    System.out.println("Encerrando o menu de consultas.........");
                    System.out.println("");
                    break;
    
                default:
                    System.out.println("Opção invalida. Tente novamente.");
                    System.out.println("");
            }
        }

    }
}
