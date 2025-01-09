package view;
import java.util.ArrayList;
import java.util.Scanner;
import models.DoadorModel;

public class DoadorView {

    Scanner scanner = new Scanner(System.in);

    public void obterInfos(DoadorModel usuario) {
        System.out.println("Insira o nome do doador (Formato: Xxxxxxxxx): ");
        String nome = scanner.nextLine(); 
        usuario.setNomeDoador(nome);

        System.out.println("Insira o telefone do doador (Formato: XXXXXXXXXXX): ");
        String telefone = scanner.nextLine(); 
        usuario.setTelefoneDoador(telefone);

        System.out.println("Insira o email do doador (Formato: XXXXXXXXXXXX@XXXXXX): ");
        String email = scanner.nextLine(); 
        usuario.setEmailDoador(email);

        System.out.println("Insira o cpf do doador (Formato: XXXXXXXXXXX): ");
        String cpf = scanner.nextLine(); 
        usuario.setCpf(cpf);

        System.out.println("Insira a data de nascimento doador (Formarto: DD-MM-AAAA): ");
        String dataprovisório = scanner.nextLine();
        usuario.setDataNascimento(dataprovisório);

        System.out.println("Insira o sexo do doador (Formato: 'Masculino', 'Feminino'): ");
        String sexo = scanner.nextLine(); 
        usuario.setSexo(sexo);

        System.out.println("Insira o tipo sanguineo do doador (Formato: 'A+'): ");
        String tipoSanguineo = scanner.nextLine(); 
        usuario.setTipoSanguineo(tipoSanguineo);

        System.out.println("Insira a ultima doacao do doador (DD-MM-AAAA): ");
        String ultimaDoacao = scanner.nextLine(); 
        usuario.setUltimaDoacao(ultimaDoacao);

        System.out.println("Insira se o doador esta apto a doar (Formato: 'true', 'false'): ");
        Boolean aptoDoar = scanner.nextBoolean(); 
        usuario.setAptoDoar(aptoDoar);
        scanner.nextLine();

        System.out.println("Insira o endereco do doador(Formato: Xxxxx Xxxxxx n19): ");
        String endereco = scanner.nextLine(); 
        usuario.setEndereco(endereco);
        
        System.out.println("");
    }

    public int obterId() {
        System.out.println("Qual o id do doador: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public String obterTelefone() {
        System.out.println("Digite o novo telefone do doador: ");
        String telefone = scanner.nextLine();
        return telefone;
    }

    public String obterEmail() {
        System.out.println("Digite o novo email do doador: ");
        String email = scanner.nextLine();
        return email;
    }

    public void exibirDoadores( ArrayList<DoadorModel> doadores) {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s%n", "ID", "Nome",
        "CPF", "Data Nascimento", "Sexo", "Tipo Sanguineo", "Telefone", "Endereco", "Ultima Doacao", "Apto a doar");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (DoadorModel doadorModel: doadores) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s%n", doadorModel.getId(), doadorModel.getNomeDoador(),
            doadorModel.getCpf(), doadorModel.getDataNascimento(), doadorModel.getSexo(), doadorModel.getTipoSanguineo(), doadorModel.getTelefoneDoador(),
            doadorModel.getEndereco(), doadorModel.getUltimaDoacao(), doadorModel.isAptoDoar());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
   
}