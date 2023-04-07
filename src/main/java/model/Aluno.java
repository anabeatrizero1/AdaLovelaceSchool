package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa implements Serializable{
    protected String matricula;
    protected String serie;
    protected String senha;
    protected float nota1;
    protected float nota2;
    public static Map<String, Integer> listaNotas1 = new HashMap<String, Integer>();
    public static Map<String, Integer> listaNotas2 = new HashMap<String, Integer>();
    public static ArrayList<String> listaRecados = new ArrayList();

    public Aluno(String matricula, String serie, String nome, String cpf, int idade, LocalDate dataNasc, String senha) {
        super(nome, cpf, idade, dataNasc);
        this.matricula = matricula;
        this.serie = serie;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    public void recebeRecado(String recado){
        listaRecados.add(recado);
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", serie=" + serie + ", senha=" + senha + ", nota1=" + nota1 + ", nota2=" + nota2 + '}';
    }
    
    

    
    
    
    
}
