package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;

public class Cadastro {
    
    ArrayList<Aluno> listaAlunos = new ArrayList();
    ArrayList<Professor> listaProfessores = new ArrayList();

    public static boolean validaCpf(String CPF) {
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48);
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
                }
    }
    
    public void validaCamposAluno(String matricula, String serie, String nome, String cpf, String dataNasc, String senha){
        System.out.println(listaAlunos.toString());
        try {
            if (matricula.length()!=0 && serie.equals("Selecione")==false && dataNasc.length()!=0 
                    && nome.length()!=0 && cpf.length()!=0 && senha.length()!=0) {
                if (validaCpf(cpf)==true) {
                    try {
                        LocalDate data = LocalDate.parse(dataNasc);
                        cadastraAluno(matricula, serie, nome, cpf, data, senha);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Digite a data de nascimento no formato(yyyy-mm-dd)!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    throw new Excecao("CPF inválido!");
                }
            }else{
                throw new Excecao("Preencha todos os campos!");
            }
        } catch (Excecao e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cadastraAluno(String matricula, String serie, String nome, String cpf, LocalDate dataNasc, String senha){
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNasc, hoje);
        Aluno aluno = new Aluno(matricula, serie, nome, cpf, periodo.getYears(), dataNasc, senha);
        listaAlunos.add(aluno);
        String fileName = "alunos.ser";
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(listaAlunos);
            out.close();
            file.close();
            JOptionPane.showMessageDialog(null, "Perfil salvo com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro no salvar o perfil", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void validaCamposProfessor(String siape, String materia, String nome, String cpf, String dataNasc, String senha){
        System.out.println(listaProfessores.toString());
        try {
            if (siape.length()!=0 && materia.equals("Selecione")==false && dataNasc.length()!=0 
                    && nome.length()!=0 && cpf.length()!=0 && senha.length()!=0) {
                if (validaCpf(cpf)==true) {
                    try {
                        LocalDate data = LocalDate.parse(dataNasc);
                        cadastraProfessor(siape, materia, nome, cpf, data, senha);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Digite a data de nascimento no formato(yyyy-mm-dd)!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    throw new Excecao("CPF inválido!");
                }
            }else{
                throw new Excecao("Preencha todos os campos!");
            }
        } catch (Excecao e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cadastraProfessor(String siape, String materia, String nome, String cpf, LocalDate dataNasc, String senha){
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNasc, hoje);
        Professor professor = new Professor(siape, materia, senha, nome, cpf, periodo.getYears(), dataNasc);
        listaProfessores.add(professor);
        String fileName = "professores.ser";
            try (FileOutputStream file = new FileOutputStream(fileName); 
                ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(listaProfessores);
                JOptionPane.showMessageDialog(null, "Perfil salvo com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
         catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro no salvar o perfil", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}

