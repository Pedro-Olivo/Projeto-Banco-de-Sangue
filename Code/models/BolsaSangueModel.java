package models;
import javax.xml.crypto.Data;

public class BolsaSangueModel {
    protected int id;
    protected String tipoSanguineo;
    protected String fatorRh;
    protected Data dataColeta;
    protected Data validade;
    protected String quantidadeMl;
    protected String status;
    protected int idDoador;

    public BolsaSangueModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getFatorRh() {
        return fatorRh;
    }

    public void setFatorRh(String fatorRh) {
        this.fatorRh = fatorRh;
    }

    public Data getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(Data dataColeta) {
        this.dataColeta = dataColeta;
    }

    public Data getValidade() {
        return validade;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    public String getQuantidadeMl() {
        return quantidadeMl;
    }

    public void setQuantidadeMl(String quantidadeMl) {
        this.quantidadeMl = quantidadeMl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }
}
