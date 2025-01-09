package view;

import java.util.ArrayList;
import java.util.Scanner;
import models.BolsaSangueModel;

public class BolsaSangueView {
    Scanner scanner = new Scanner(System.in);

    public void obterInfosCadastro(BolsaSangueModel bolsa) {
        System.out.println("Insira o tipo sanguineo do doador (Formato: 'A+'): ");
        String tipoSanguineo = scanner.nextLine();
        bolsa.setTipoSanguineo(tipoSanguineo);

        System.out.println("Insira o fator RH do doador (Formato: 'Positivo', 'Negativo'): ");
        String fatorRh = scanner.nextLine();
        bolsa.setFatorRh(fatorRh);

        System.out.println("Insira a data da coleta (DD-MM-AAAA): ");
        String dataColeta = scanner.nextLine();
        bolsa.setDataColeta(dataColeta);

        System.out.println("Insira a validade da bolsa (DD-MM-AAAA): ");
        String dateValidade = scanner.nextLine();
        bolsa.setValidade(dateValidade);

        System.out.println("Insira a quantidade da bolsa (Formato: 500): ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        bolsa.setQuantidadeMl(quantidade);

        System.out.println("Insira o status da bolsa (Formato: 'Utilizada', 'Expirada'): ");
        String status = scanner.nextLine();
        bolsa.setStatus(status);

        System.out.println("Insira o id do doador (Formato: '2', '34', '105'): ");
        int idDoador = scanner.nextInt();
        scanner.nextLine();
        bolsa.setIdDoador(idDoador);

        System.out.println("");
    }

    public String obterStatus() {
        System.out.println("Qual o novo status da bolsa (Formato: 'Utilizada', 'Expirada'): ");
        String status = scanner.nextLine();
        return status;
    }

    public int obterIdDoador() {
        System.out.println("Insira o novo id do doador (Formato: '2', '34', '105'): ");
        int idDoador = scanner.nextInt();
        return idDoador;
    }

    public int obterId() {
        System.out.println("Qual o id da bolsa (Formato: '2', '34', '105'): ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public void exibirBolsas( ArrayList<BolsaSangueModel> bolsas) {
        System.out.printf(" %-10s %-15s %-15s %-15s %-15s %-15s %-15s %-10s%n", "ID", "Tipo Sanguineo",
        "Fator RH", "Data Coleta", "Validade", "Quantidade Ml", "Status", "ID doador");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for (BolsaSangueModel bolsaModel: bolsas) {
            System.out.printf(" %-10s %-15s %-15s %-15s %-15s %-15s %-15s %-10s%n", bolsaModel.getId(), bolsaModel.getTipoSanguineo(),
            bolsaModel.getFatorRh(), bolsaModel.getDataColeta(), bolsaModel.getValidade(), bolsaModel.getQuantidadeMl(), bolsaModel.getStatus(),
            bolsaModel.getIdDoador());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
    }
   
}
