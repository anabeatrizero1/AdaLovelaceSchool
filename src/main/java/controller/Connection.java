package controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import javax.swing.JOptionPane;
import model.Aluno;

public class Connection extends Thread{

    MulticastSocket sock;
    
    public Connection(MulticastSocket socket){
        sock = socket;
    }
    
    @Override
    public void run(){
        while (!Thread.interrupted()) {            
            try {
                byte[] rxData = new byte[65507];
                DatagramPacket rxPkt = new DatagramPacket(rxData, rxData.length);
                sock.receive(rxPkt);
                String msg = new String(rxData);
                Aluno.listaRecados.add(msg);
            }catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Thread parada", "Alerta", JOptionPane.WARNING_MESSAGE);
                Thread.currentThread().interrupt();
            }
        }
    }
}
