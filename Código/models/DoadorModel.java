package models;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class DoadorModel {
    
    protected int id;
    protected String nomeDoador;
    protected String telefoneDoador;
    protected String emailDoador;
    protected String cpf;
    protected Date dataNascimento;
    protected String sexo;
    protected String tipoSanguineo;
    protected Date ultimaDoacao;
    protected boolean aptoDoar;
    protected String endereco;

    public DoadorModel() {
    }

    public DoadorModel(int id, String nome, String cpf, Date dataNascimento, String sexo, String tipoSanguineo, String telefone, String endereco, Date ultimaDoacao, Boolean aptoDoar) {
        this.id = id;
        this.nomeDoador = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
        this.telefoneDoador = telefone;
        this.endereco = endereco;
        this.ultimaDoacao = ultimaDoacao;
        this.aptoDoar = aptoDoar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public String getTelefoneDoador() {
        return telefoneDoador;
    }

    public void setTelefoneDoador(String telefoneDoador) {
        this.telefoneDoador = telefoneDoador;
    }

    public String getEmailDoador() {
        return emailDoador;
    }

    public void setEmailDoador(String emailDoador) {
        this.emailDoador = emailDoador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date dataUtil = formato.parse(dataNascimento);

            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            this.dataNascimento = dataSql;
        } catch (Exception e) {
            System.out.println("Press f");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Date getUltimaDoacao() {
        return ultimaDoacao;
    }

    public void setUltimaDoacao(String ultimaDoacao) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date dataUtil = formato.parse(ultimaDoacao);

            java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            this.ultimaDoacao = dataSql;
        } catch (Exception e) {
            System.out.println("Press f");
        }
    }

    public boolean isAptoDoar() {
        return aptoDoar;
    }

    public void setAptoDoar(Boolean opcao) {
        this.aptoDoar = aptoDoar;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}