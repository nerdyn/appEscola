package br.com.app.escola.modelo;

import java.io.Serializable;


public class Professor extends Funcionario implements Serializable{
    
    private String titulacao;
    private Integer numHorasTrab;

    //clicar com botão direito e inserir códigos get e set
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Integer getNumHorasTrab() {
        return numHorasTrab;
    }

    public void setNumHorasTrab(Integer numHorasTrab) {
        this.numHorasTrab = numHorasTrab;
    }
    
    public void calcularSalario(){
          if(titulacao.equals("Especialista")){
            salario = 30.00 * numHorasTrab;
        } else if(titulacao.equals("Meste")){
            salario = 38.00 * numHorasTrab;
        } else if(titulacao.equals("Doutor")){
            salario = 45.00 * numHorasTrab;
        } else if(titulacao.equals("PHD")){
            salario = 70.00 * numHorasTrab;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()  +" Titulação "+titulacao+
               " Nº Horas Trabalhadas "+numHorasTrab;
    }
}
