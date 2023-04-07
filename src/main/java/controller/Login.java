package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;

public class Login {

    public static ArrayList<Aluno> listaAlunos = new ArrayList();
    public static ArrayList<Professor> listaProfessores = new ArrayList();
    static MulticastSocket socket;
    static InetAddress multicastAddr;
    static int porta = 50000;
    
    
    public void carregarDados(){
        String nomeArquivo1 = "alunos.ser";
        String nomeArquivo2 = "professores.ser";
        
        try {
            FileInputStream file1 = new FileInputStream(nomeArquivo1);
            ObjectInputStream in = new ObjectInputStream(file1);
            
            listaAlunos = (ArrayList<Aluno>) in.readObject();
            in.close();
            file1.close();
            
            FileInputStream file2 = new FileInputStream(nomeArquivo2);
            in = new ObjectInputStream(file2);
            
            listaProfessores = (ArrayList<Professor>) in.readObject();
            in.close();
            file2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na desserialização do objeto!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public String comparaProf(String usuario, String senha){
        for (int i = 0; i < listaProfessores.size(); i++) {
            Professor p = listaProfessores.get(i);
            try{
            if(p.getSiape().equalsIgnoreCase(usuario)){
                if (p.getSenha().equalsIgnoreCase(senha)) {
                    return p.getNome();
                }else{
                throw new Excecao("Senha incorreta!");
            }
            }else{
                throw new Excecao("SIAPE não encontrado!");
            }
            }catch(Excecao e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }
    
    public String comparaAluno(String usuario, String senha){
        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno a = listaAlunos.get(i);
            try{
            if(a.getMatricula().equalsIgnoreCase(usuario)){
                if (a.getSenha().equalsIgnoreCase(senha)) {
                    return a.getNome();
                }else{
                throw new Excecao("Senha incorreta!");
            }
            }else{
                throw new Excecao("Matrícula não encontrado!");
            }
            }catch(Excecao e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }
    
    public void joinGrupo(){
        try {
            multicastAddr = InetAddress.getByName("224.1.1.4");
        } catch (UnknownHostException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            socket = new MulticastSocket(porta);
            
            socket.joinGroup(multicastAddr);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void leaveGrupo(){
        try {
            socket.leaveGroup(multicastAddr);
            socket.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro no socket", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
