package br.com.app.escola.modelo;

import java.io.Serializable;

public abstract class Funcionario implements Serializable {
    
    protected String matricula;
    protected String nome;
    protected String email;
    protected Double salario;
    
    //clicar com botão direito e inserir códigos get e set

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    @Override
    public String toString(){
    
        return  " Matricula "+matricula+
                " Nome "+nome+
                " Email "+email+
                " Salário " +salario;
                                
    }
}