package models;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class BolsaSangueModel {
    protected int id;
    protected String tipoSanguineo;
    protected String fatorRh;
    protected Date dataColeta;
    protected Date validade;
    protected int quantidadeMl;
    protected String status;
    protected int idDoador;

    public BolsaSangueModel() {
    }

    public BolsaSangueModel(int id, String tipoSanguineo, String fatorRh, Date dataColeta, Date validade, int quantidadeMl, 
    String status, int idDoador) {
        this.id = id;
        this.tipoSanguineo = tipoSanguineo;
        this.fatorRh = fatorRh;
        this.dataColeta = dataColeta;
        this.validade = validade;
        this.quantidadeMl = quantidadeMl;
        this.status = status;
        this.idDoador = idDoador;
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

    public Date getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(String dataColeta) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date dataUtil = formato.parse(dataColeta);

            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            this.dataColeta = dataSql;
        } catch (Exception e) {
            System.out.println("Press f");
        }
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date dataUtil = formato.parse(validade);

            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            this.validade = dataSql;
        } catch (Exception e) {
            System.out.println("Press f");
        }
    }

    public int getQuantidadeMl() {
        return quantidadeMl;
    }

    public void setQuantidadeMl(int quantidadeMl) {
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
