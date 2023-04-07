package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Professor extends Pessoa implements Interface_Professor, Serializable{
    protected String siape;
    protected String materia;
    protected String senha;

    public Professor(String siape, String materia, String senha, String nome, String cpf, int idade, LocalDate dataNasc) {
        super(nome, cpf, idade, dataNasc);
        this.siape = siape;
        this.materia = materia;
        this.senha = senha;
    }

    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String recado(String tipo, LocalDate data, String assunto) {
        String recado = null;
        if (tipo.equals("Prova")) {
            recado = "Professor "+nome+" marcou uma prova para o dia "+data+", sobre: "+assunto;
        }else if (tipo.equals("Trabalho")) {
            recado = "Professor "+nome+" marcou um trabalho para o dia "+data+", sobre: "+assunto;
        }
        return recado;
    }

    @Override
    public String toString() {
        return "Professor{" + "siape=" + siape + ", materia=" + materia + ", senha=" + senha + '}';
    }

    
    
    
    
}
