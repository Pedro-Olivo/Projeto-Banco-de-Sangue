package view;
import java.util.ArrayList;
import java.util.Scanner;
import models.DoadorModel;

public class DoadorView {

    Scanner scanner = new Scanner(System.in);

    public void obterInfos(DoadorModel usuario) {
        System.out.println("Insira o nome do doador: ");
        String nome = scanner.nextLine(); 
        usuario.setNomeDoador(nome);

        System.out.println("Insira o telefone do doador (Formato: XXXXXXXXX): ");
        String telefone = scanner.nextLine(); 
        usuario.setTelefoneDoador(telefone);

        System.out.println("Insira o email do doador: ");
        String email = scanner.nextLine(); 
        usuario.setEmailDoador(email);

        System.out.println("Insira o cpf do doador: ");
        String cpf = scanner.nextLine(); 
        usuario.setCpf(cpf);

        System.out.println("Insira a data de nascimento doador (Formarto: YYYY-MM-DD): ");
        String dataprovisório = scanner.nextLine();
        usuario.setDataNascimento(dataprovisório);

        System.out.println("Insira o sexo do doador: ");
        String sexo = scanner.nextLine(); 
        usuario.setSexo(sexo);

        System.out.println("Insira o tipo sanguineo do doador: ");
        String tipoSanguineo = scanner.nextLine(); 
        usuario.setTipoSanguineo(tipoSanguineo);

        System.out.println("Insira a ultima doacao do doador: ");
        String ultimaDoacao = scanner.nextLine(); 
        usuario.setUltimaDoacao(ultimaDoacao);

        System.out.println("Insira se o doador esta apto a doar: ");
        Boolean aptoDoar = scanner.nextBoolean(); 
        usuario.setAptoDoar(aptoDoar);
        scanner.nextLine();

        System.out.println("Insira o endereco do doador: ");
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
        System.out.println("Digite o telefone do doador: ");
        String telefone = scanner.nextLine();
        return telefone;
    }

    public String obterEmail() {
        System.out.println("Digite o email do doador: ");
        String email = scanner.nextLine();
        return email;
    }

    public void exibirDoadores( ArrayList<DoadorModel> doadores) {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s%n", "ID", "Nome",
        "CPF", "Data Nascimento", "Sexo", "Tipo Sanguineo", "Telefone", "Endereco", "Ultima Doacao", "Apto a doar");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for (DoadorModel doadorModel: doadores) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s%n", doadorModel.getId(), doadorModel.getNomeDoador(),
            doadorModel.getCpf(), doadorModel.getDataNascimento(), doadorModel.getSexo(), doadorModel.getTipoSanguineo(), doadorModel.getTelefoneDoador(),
            doadorModel.getEndereco(), doadorModel.getUltimaDoacao(), doadorModel.isAptoDoar());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        
    }

    
}




//for (DoadorModel doadorModel: doadores) {
    //System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
    //System.out.println("id: " + doadorModel.getId() + " nome: " + doadorModel.getNomeDoador() + " CPF: " + doadorModel.getCpf() + 
                        //" Data nascimento: " + doadorModel.getDataNascimento() + " Sexo: " + doadorModel.getSexo() + " Tipo sanguineo: " 
                        //+ doadorModel.getTipoSanguineo() + " Telefone: " + doadorModel.getTelefoneDoador() + " Endereco: " + doadorModel.getEndereco()
                        //+ " Ultima doaçao: " + doadorModel.getUltimaDoacao() + " Apto a doar: " + doadorModel.isAptoDoar());
//}
//System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
//System.out.println("");