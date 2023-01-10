package Modelo;

import java.util.Date;

public class Aluno {
 
    //Atributos
    public String nomealuno;
    public String cpf;
    public String telefone;
    public double peso;
    public double altura;
    public int idade; 
    public Date mensalidade;
    
    //Construtor

    public Aluno(String nomealuno, String cpf, String telefone, double peso, double altura, int idade, Date mensalidade) {
        this.nomealuno = nomealuno;
        this.cpf = cpf;
        this.telefone = telefone;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.mensalidade = mensalidade;
    }
    
    //Get/Set

    public String getNomealuno() {
        return nomealuno;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public Date getMensalidade() {
        return mensalidade;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setMensalidade(Date mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
    
    
}
