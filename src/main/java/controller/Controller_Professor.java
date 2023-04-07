package controller;

import static controller.Login.socket;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;

public class Controller_Professor {
    
    Cadastro c = new Cadastro();
    Connection cn;
    
    public String edita(String nome, String siape, String materia, String nomeNovo, String cpf, String dataNasc, String senha){
        for (int i = 0; i < Login.listaProfessores.size(); i++) {
            Professor p = Login.listaProfessores.get(i);
            if (p.getNome().equalsIgnoreCase(nome)) {
                try {
                Login.listaProfessores.remove(p);
                    LocalDate data = LocalDate.parse(dataNasc);
                    c.cadastraProfessor(siape, materia, nome, cpf, data, senha);
                JOptionPane.showMessageDialog(null, "Perfil salvo com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return p.getNome();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no salvar o perfil", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
        return null;
    }
    
    public void recado(String nome, String tipo, LocalDate data, String assunto){
        cn = new Connection(socket);
        cn.start();
        
        
        for (int i = 0; i < Login.listaProfessores.size(); i++) {
            Professor p = Login.listaProfessores.get(i);
            if (p.getNome().equalsIgnoreCase(nome)) {
                String recado = p.recado(tipo, data, assunto);
                // Cria buffers de comunicação
                byte[] txData = new byte[65507];
                // Converte em array de bytes
                txData = recado.getBytes();
                // Cria o pacote de envio
                DatagramPacket txPkt =new DatagramPacket(txData, 
                        txData.length,Login.multicastAddr,Login.porta);
                // Envia a mgs
                try {
                    // Envia a mgs
                    socket.send(txPkt);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao enviar", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public void notas(Aluno aluno, String materia, int nota1, int nota2){
        try {
            Aluno.listaNotas1.put(materia, nota1);
            Aluno.listaNotas2.put(materia, nota2);
            JOptionPane.showMessageDialog(null, "Notas adicionadas com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar notas", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
