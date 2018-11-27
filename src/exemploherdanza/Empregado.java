
package exemploherdanza;

import java.sql.Time;
import java.util.Date;

public class Empregado {
    private String nome;
    private Date inicioTraballo;
    private Time dataNacemento;
    private String titulacion;
    
    public Empregado() {
    }
   
    public Empregado(String nome, Date inicioTraballo, Time dataNacemento, String titulacion){
        this.nome= nome;
        this.inicioTraballo= inicioTraballo;
        this.dataNacemento= dataNacemento;
        this.titulacion= titulacion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getInicioTraballo() {
        return inicioTraballo;
    }

    public void setInicioTraballo(Date inicioTraballo) {
        this.inicioTraballo = inicioTraballo;
    }

    public Date getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(Time dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", inicioTraballo=" + inicioTraballo + ", dataNacemento=" + dataNacemento + ", titulacion=" + titulacion + '}';
    }
    public float calcularSoldo(String nome){
        return 20f;
    }
}
