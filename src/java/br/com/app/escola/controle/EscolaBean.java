package br.com.app.escola.controle;

import br.com.app.escola.modelo.Coordenador;
import br.com.app.escola.modelo.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean (name = "bean")
@SessionScoped
public class EscolaBean {
    
    private Professor prof;
    private Coordenador coord;
    private List<String> titulo;
    private String dadosProfessor;
    private String mensagem;
    
    //metodo construtor
    
    public EscolaBean(){
        
        prof = new Professor();
        coord = new Coordenador();
        titulo = new ArrayList<String>();
        titulo.add("Especialista");
        titulo.add("Mestre");
        titulo.add("Doutor");
        titulo.add("PHD");
        mensagem = "";
               
    }
    
    //clicar com botão direito e inserir códigos get e set

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public Coordenador getCoord() {
        return coord;
    }

    public void setCoord(Coordenador coord) {
        this.coord = coord;
    }

    public List<String> getTitulo() {
        return titulo;
    }

    public void setTitulo(List<String> titulo) {
        this.titulo = titulo;
    }

    public String getDadosProfessor() {
        return dadosProfessor;
    }

    public void setDadosProfessor(String dadosProfessor) {
        this.dadosProfessor = dadosProfessor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    
    
    public void calcProf(){
        prof.calcularSalario();
        mensagem = prof.toString();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Sucesso", mensagem));
}
    }


