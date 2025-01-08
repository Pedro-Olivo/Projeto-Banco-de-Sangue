package menus;
import controllers.DoadorController;
import java.util.Scanner;
public class MenuDoador {
    public void main(String[] args) {

        DoadorController controller = new DoadorController();
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while(opcao != 5) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Escolha a opcao desejada:");
            System.out.println("1 - Criar cadastro de doador");
            System.out.println("2 - Listar doadores");
            System.out.println("3 - Deletar doador");
            System.out.println("4 - Atualizar cadastro do doador");
            System.out.println("5 - Sair");
            System.out.println("--------------------------------------------------------------");
            System.out.println("");

            System.out.print("Digite o número da sua escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    controller.criar();
                    break;
    
                case 2:
                    controller.ler();
                    break;
    
                case 3:
                    controller.remover();
                    break;
                
                case 4:
                    controller.editar();
                    break;
    
                case 5:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
