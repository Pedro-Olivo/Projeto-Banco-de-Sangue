public class DoadorModel {
    protected String nomeDoador;
    protected String telefoneDoador;
    protected String emailDoador;

    public DoadorModel(String nomeDoador, String telefoneDoador, String emailDoador) {
        this.nomeDoador = nomeDoador;
        this.telefoneDoador = telefoneDoador;
        this.emailDoador = emailDoador;
    }

    public DoadorModel() {
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
}