package view;

import controller.Login;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Painel_Login extends javax.swing.JPanel {

    String tipo;
    Login l = new Login();
    
    public Painel_Login(String tipo) {
        initComponents();
        this.tipo = tipo;
        ImageIcon imagemBase =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brasao.png")).getImage().getScaledInstance(147, 116, Image.SCALE_SMOOTH));
        imagem.setIcon(imagemBase);
        if (tipo.equals("Professor")) {
            lbLogin.setText("SIAPE: ");
        }else if (tipo.equals("Aluno")) {
            lbLogin.setText("Matrícula: ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lbLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        pfSenha = new javax.swing.JPasswordField();
        btVoltar = new javax.swing.JButton();
        btEntrar = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(93, 0, 0));

        lbLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbLogin.setText("<Login>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");

        btVoltar.setBackground(new java.awt.Color(93, 0, 0));
        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("Voltar");
        btVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltar.setFocusable(false);
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });

        btEntrar.setBackground(new java.awt.Color(93, 0, 0));
        btEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("Entrar");
        btEntrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btEntrar.setFocusable(false);
        btEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarMouseClicked(evt);
            }
        });
        btEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btEntrarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLogin)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lbLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.pInicial, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseClicked
        if (tipo.equals("Professor")) {
            String nome = l.comparaProf(tfUsuario.getText(), Arrays.toString(pfSenha.getPassword()));
            if (nome.equals(null)==false) {
                Janela.pProf = new Painel_Professor(nome);
                JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().removeAll();
                janela.add(Janela.pProf, BorderLayout.CENTER);
                janela.setSize(800,650);
            }
        }else if (tipo.equals("Aluno")) {
            String nome = l.comparaAluno(tfUsuario.getText(), Arrays.toString(pfSenha.getPassword()));
            if (nome.equals(null)==false) {
                Janela.pAluno = new Painel_Aluno(nome);
                JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().removeAll();
                janela.add(Janela.pAluno, BorderLayout.CENTER);
                janela.setSize(800,650);
            }
        }
    }//GEN-LAST:event_btEntrarMouseClicked

    private void btEntrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btEntrarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("deu certo");
        }
    }//GEN-LAST:event_btEntrarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
