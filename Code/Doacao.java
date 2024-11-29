
import java.util.List;

public class Doacao {
    
    private String data;
    private String hora;
    private List<Doador> listaDoador;
    private List<Paciente> listaPaciente;

    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public List<Doador> getListaDoador() {
        return listaDoador;
    }
    public void setListaDoador(List<Doador> listaDoador) {
        this.listaDoador = listaDoador;
    }
    public List<Paciente> getListaPaciente() {
        return listaPaciente;
    }
    public void setListaPaciente(List<Paciente> listaPaciente) {
        this.listaPaciente = listaPaciente;
    }
}
