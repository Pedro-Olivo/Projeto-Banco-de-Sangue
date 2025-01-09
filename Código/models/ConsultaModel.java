package models;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsultaModel {
    protected int id;
    protected Timestamp dataConsulta;
    protected int idDoador;
    protected int idMedico;
    protected String motivoConsulta;
    protected String resultado;

    public ConsultaModel(int id, Timestamp dataConsulta, int idDoador, int idMedico, String motivoConsulta, String resultado) {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.idDoador = idDoador;
        this.idMedico = idMedico;
        this.motivoConsulta = motivoConsulta;
        this.resultado = resultado;
    }

    public ConsultaModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        try {
            // Define o formato esperado da data e hora
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            // Converte a String para LocalDateTime
            LocalDateTime localDateTime = LocalDateTime.parse(dataConsulta, formatter);

            // Converte LocalDateTime para java.sql.Timestamp
            this.dataConsulta = Timestamp.valueOf(localDateTime);

            System.out.println("Data e hora convertidas: " + this.dataConsulta);
        } catch (Exception e) {
            System.out.println("Erro ao converter data e hora.");
            e.printStackTrace();
        }
    }

    public Timestamp converteData(String data) {
        try {
            // Define o formato esperado da data e hora
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            // Converte a String para LocalDateTime
            LocalDateTime localDateTime = LocalDateTime.parse(data, formatter);

            // Converte LocalDateTime para java.sql.Timestamp
            this.dataConsulta = Timestamp.valueOf(localDateTime);

        } catch (Exception e) {
            System.out.println("Erro ao converter data e hora.");
            e.printStackTrace();
        }
        return dataConsulta;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
