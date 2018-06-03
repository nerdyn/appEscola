package br.com.app.escola.modelo;

import java.io.Serializable;


public class Coordenador extends Funcionario implements Serializable{
    
    private String curso;
    private Double gratificacao;

    //clicar com botão direito e inserir códigos get e set
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public void calcularSalario(){
        if (curso.equals("Administração")){
            gratificacao = salario * 0.30;
            salario += gratificacao;
       } else if (curso.equals("Contabilidade")){
            gratificacao = salario * 0.35;
            salario += gratificacao;
       } else if (curso.equals("Direito")){
            gratificacao = salario * 0.40;
            salario += gratificacao;
    }
  } 
    @Override
    public String toString(){
        return super.toString()+ " Curso "+curso+
               " Gratificação "+gratificacao;
    }
}
