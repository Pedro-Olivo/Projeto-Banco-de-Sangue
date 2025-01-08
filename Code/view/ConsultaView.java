package view;
import java.util.ArrayList;
import java.util.Scanner;
import models.ConsultaModel;

public class ConsultaView {
    Scanner scanner = new Scanner(System.in);

    public void obeterInfosConsulta(ConsultaModel consulta) {
        System.out.println("Insira a data da consulta (Formato: DD-MM-AAAA HH-MM): ");
        String data = scanner.nextLine();
        consulta.setDataConsulta(data);

        System.out.println("Insira o id do doador (Formato: '2', '34', '105'): ");
        int id = scanner.nextInt();
        consulta.setIdDoador(id);
        
        System.out.println("Insira o id do medico (Formato: '2', '34', '105'): ");
        int idMedico = scanner.nextInt();
        consulta.setIdMedico(idMedico);
        scanner.nextLine();

        System.out.println("Insira o motivo da consulta (Formato: 'Coleta', 'Triagem'): ");
        String motivo = scanner.nextLine();
        consulta.setMotivoConsulta(motivo);

        System.out.println("Insira o resultado da consulta (Formato: 'Apto', 'Inapto', 'Bem sucedida'): ");
        String resultado = scanner.nextLine();
        consulta.setResultado(resultado);

        System.out.println("");
    }

    public int obterId() {
        System.out.println("Qual o id da consulta (Formato: '2', '34', '105'): ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public String obterAtualizacaoDataConsulta() {
        System.out.println("Qual a nova data e o novo horario da consulta (Formato: DD-MM-AAAA HH-MM): ");
        String data = scanner.nextLine();
        return data;
    }

    public int obterNovoIdMedico() {
        System.out.println("Digite o id do novo medico: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public String novoMotivoConsulta() {
        System.out.println("Digite o novo motivo da consulta (Formato: 'Coleta', 'Triagem'): ");
        String motivo = scanner.nextLine();
        return motivo;
    }

    public String novoResultado() {
        System.out.println("Digite o novo resultado (Formato: 'Apto', 'Inapto', 'Bem sucedida'): ");
        String resultado = scanner.nextLine();
        return resultado;
    }

    public void exibirConsultas(ArrayList<ConsultaModel> consultas) {
        System.out.printf("%-10s %-30s %-10s %-10s %-15s %-10s%n", "ID", "Data Consulta", "ID Doador", "ID Medico", 
        "Motivo Consulta", "Resultado");
        System.out.println("------------------------------------------------------------------------------------------------------");
        for (ConsultaModel consultaModel: consultas) {
            System.out.printf("%-10s %-30s %-10s %-10s %-15s %-10s%n", consultaModel.getId(), consultaModel.getDataConsulta(),
            consultaModel.getIdDoador(), consultaModel.getIdMedico(), consultaModel.getMotivoConsulta(), consultaModel.getResultado());
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
    }
}
