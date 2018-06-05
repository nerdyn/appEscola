package br.apphospital.controle;

import br.apphospital.modelo.Medico;
import br.apphospital.modelo.Psicologo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "bean")
@SessionScoped
public class HospitalBean {
    private Psicologo psic;
    private Medico med;
    private List<String> titulo;
    
    //método construtor
    public HospitalBean(){
        psic = new Psicologo();
        med = new Medico();
        titulo = new ArrayList<String>();
        titulo.add("Pediatra");
        titulo.add("Médico do Trabalho");
        titulo.add("Clínica Geral");
        titulo.add("Ginecologista");
        titulo.add("Psiquiatra");
        titulo.add("Cardiologista");
    }

    public Psicologo getPsic() {
        return psic;
    }

    public void setPsic(Psicologo psic) {
        this.psic = psic;
    }

    public Medico getMed() {
        return med;
    }

    public void setMed(Medico med) {
        this.med = med;
    }

    public List<String> getTitulo() {
        return titulo;
    }

    public void setTitulo(List<String> titulo) {
        this.titulo = titulo;
    }
    public void calcPsic(){
        psic.calculaSalario();
    }
    public void calcMed(){
        med.calculaSalario();
    }
}
