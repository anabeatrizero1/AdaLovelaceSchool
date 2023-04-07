package controller;

import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import view.Imagem;
import view.Painel_Professor;

public class Controller_Aluno {
    
    Cadastro c = new Cadastro();
    Aluno a;

    public String edita(String nome, String matricula, String serie, String nomeNovo, String cpf, String dataNasc, String senha){
        for (int i = 0; i < Login.listaAlunos.size(); i++) {
            a = Login.listaAlunos.get(i);
            if (a.getNome().equalsIgnoreCase(nome)) {
                try {
                Login.listaAlunos.remove(a);
                LocalDate data = LocalDate.parse(dataNasc);
                c.cadastraAluno(matricula, serie, nomeNovo, cpf, data, senha);
                JOptionPane.showMessageDialog(null, "Perfil salvo com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return a.getNome();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no salvar o perfil", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
        return null;
    }

    public void Recado(JTextArea taRecados) {
        taRecados.setText(null);
        for (int i = 0; i < Login.listaAlunos.size(); i++) {
            a = Login.listaAlunos.get(i);
            if (a.getSerie().equals(Painel_Professor.turmaRecado)) {
                taRecados.append(a.listaRecados.get(i)+"\n");
                taRecados.append("_____________________________________________________________________________\n");
            }
        }
         
    }

    public void boletim(JTable tbBoletim) {
        for (int i = 0; i < 12; i++) {
        }
        if (Aluno.listaNotas1.containsKey("Artes") && Aluno.listaNotas2.containsKey("Artes")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Artes"), 0, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Artes"), 0, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Artes"),Aluno.listaNotas2.get("Artes")), 0, 3);
            
        }
        if (Aluno.listaNotas1.containsKey("Biologia") && Aluno.listaNotas2.containsKey("Biologia")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Biologia"), 1, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Biologia"), 1, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Biologia"),Aluno.listaNotas2.get("Biologia")), 1, 3);
        }
        if (Aluno.listaNotas1.containsKey("Educação Física") && Aluno.listaNotas2.containsKey("Educação Física")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Educação Física"), 2, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Educação Física"), 2, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Educação Física"),Aluno.listaNotas2.get("Educação Física")), 2, 3);
        }
        if (Aluno.listaNotas1.containsKey("Filosofia") && Aluno.listaNotas2.containsKey("Filosofia")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Filosofia"), 3, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Filosofia"), 3, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Filosofia"),Aluno.listaNotas2.get("Filosofia")), 3, 3);
           
        }
        if (Aluno.listaNotas1.containsKey("Física") && Aluno.listaNotas2.containsKey("Física")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Física"), 4, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Física"), 4, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Física"),Aluno.listaNotas2.get("Física")), 4, 3);
        }
        if (Aluno.listaNotas1.containsKey("Geografia") && Aluno.listaNotas2.containsKey("Geografia")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Geografia"), 5, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Geografia"), 5, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Geografia"),Aluno.listaNotas2.get("Geografia")), 5, 3);
        }
        if (Aluno.listaNotas1.containsKey("História") && Aluno.listaNotas2.containsKey("História")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("História"), 6, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("História"), 6, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("História"),Aluno.listaNotas2.get("História")), 6, 3);          
        }
        if (Aluno.listaNotas1.containsKey("Inglês") && Aluno.listaNotas2.containsKey("Inglês")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Inglês"), 7, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Inglês"), 7, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Inglês"),Aluno.listaNotas2.get("Inglês")), 7, 3);

        }
        if (Aluno.listaNotas1.containsKey("Matemática") && Aluno.listaNotas2.containsKey("Matemática")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Matemática"), 8, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Matemática"), 8, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Matemática"),Aluno.listaNotas2.get("Matemática")), 8, 3);
        }
        if (Aluno.listaNotas1.containsKey("Português") && Aluno.listaNotas2.containsKey("Português")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Português"), 9, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Português"), 9, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Português"),Aluno.listaNotas2.get("Português")), 9, 3);
        }
        if (Aluno.listaNotas1.containsKey("Química") && Aluno.listaNotas2.containsKey("Química")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Química"), 10, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Química"), 10, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Química"),Aluno.listaNotas2.get("Química")), 10, 3);
        }
        if (Aluno.listaNotas1.containsKey("Sociologia") && Aluno.listaNotas2.containsKey("Sociologia")) {
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas1.get("Sociologia"), 11, 1);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(Aluno.listaNotas2.get("Sociologia"), 11, 2);
            ((DefaultTableModel) tbBoletim.getModel()).setValueAt(media(Aluno.listaNotas1.get("Sociologia"),Aluno.listaNotas2.get("Sociologia")), 11, 3);
        }
        
    }
    
    public float media(float nota1, float nota2){
        
        return (nota1 + nota2)/2;
        
    }

}
