package model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Pessoa implements Serializable{
    protected String nome;
    protected String cpf;
    protected int idade;
    protected LocalDate dataNasc;

    public Pessoa(String nome, String cpf, int idade, LocalDate dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", dataNasc=" + dataNasc + '}';
    }

    
}
