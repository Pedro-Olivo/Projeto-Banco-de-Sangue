package view;
import java.util.ArrayList;
import java.util.Scanner;
import models.MedicoModel;

public class MedicoView {
    Scanner scanner = new Scanner(System.in);

    public void obterInfosCadastro(MedicoModel medico) {
        System.out.println("Insira o nome do medico (Formato: Xxxxxxxxx): ");
        String nome = scanner.nextLine();
        medico.setNome(nome);

        System.out.println("Insira o crm do medico (Formato: XXXXXXXXXX): ");
        String crm = scanner.nextLine();
        medico.setCrm(crm);

        System.out.println("Insira a especialidade do medico (Formato: Xxxxxxxxx): ");
        String especialidade = scanner.nextLine();
        medico.setEspecialidade(especialidade);

        System.out.println("Insira o telefone do medico (Formato: XXXXXXXXXXX): ");
        String telefone = scanner.nextLine();
        medico.setTelefone(telefone);

        System.out.println("Insira o email do medico (Formato: XXXXXXXXXXXX@XXXXXX): ");
        String email = scanner.nextLine();
        medico.setEmail(email);

        System.out.println("");
    }

    public int obterId() {
        System.out.println("Qual o id do doador: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public String obterEspecialidade() {
        System.out.println("Digite a nova especialidade do medico (Formato: Xxxxxxxxxxxxxxxx): ");
        String especialidade = scanner.nextLine();
        return especialidade;
    }

    public String obterTelefone() {
        System.out.println("Digite o novo telefone do medico (Formato: XXXXXXXXXXX): ");
        String telefone = scanner.nextLine();
        return telefone;
    }

    public String obterEmail() {
        System.out.println("Digite o novo email do medico (Formato: XXXXXXXXXXXX@XXXXXX): ");
        String email = scanner.nextLine();
        return email;
    }

    public void exibirMedicos( ArrayList<MedicoModel> medicos) {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", "ID", "Nome",
        "CRM", "Especialidade", "Telefone", "Email");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for (MedicoModel medicoModel: medicos) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n", medicoModel.getId(), medicoModel.getNome(), medicoModel.getCrm(),
            medicoModel.getEspecialidade(), medicoModel.getTelefone(), medicoModel.getEmail());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
    }
}
