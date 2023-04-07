package view;

import controller.Login;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Painel_Inicial extends javax.swing.JPanel {

    Login l = new Login();
    
    public Painel_Inicial() {
        initComponents();
        ImageIcon imagemBase =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brasao.png")).getImage().getScaledInstance(280, 223, Image.SCALE_SMOOTH));
        imagem2.setIcon(imagemBase);
        l.joinGrupo();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btLoginProfessor = new javax.swing.JButton();
        btLoginAluno = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btCadastrarProfessor = new javax.swing.JButton();
        btCadastrarAluno = new javax.swing.JButton();
        imagem2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(93, 0, 0));

        jLabel1.setFont(new java.awt.Font("Barlow Condensed Light", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seja Bem-Vindo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fazer o Login como:");

        btLoginProfessor.setBackground(new java.awt.Color(93, 0, 0));
        btLoginProfessor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btLoginProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btLoginProfessor.setText("Professor");
        btLoginProfessor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLoginProfessor.setFocusable(false);
        btLoginProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLoginProfessorMouseClicked(evt);
            }
        });

        btLoginAluno.setBackground(new java.awt.Color(93, 0, 0));
        btLoginAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btLoginAluno.setForeground(new java.awt.Color(255, 255, 255));
        btLoginAluno.setText("Aluno");
        btLoginAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLoginAluno.setFocusable(false);
        btLoginAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLoginAlunoMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Me cadastrar como:");

        btCadastrarProfessor.setBackground(new java.awt.Color(93, 0, 0));
        btCadastrarProfessor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrarProfessor.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrarProfessor.setText("Professor");
        btCadastrarProfessor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCadastrarProfessor.setFocusable(false);
        btCadastrarProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarProfessorMouseClicked(evt);
            }
        });

        btCadastrarAluno.setBackground(new java.awt.Color(93, 0, 0));
        btCadastrarAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrarAluno.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrarAluno.setText("Aluno");
        btCadastrarAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCadastrarAluno.setFocusable(false);
        btCadastrarAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarAlunoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btLoginProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btLoginAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(252, 252, 252)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(imagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLoginProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLoginAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarProfessorMouseClicked
        Janela.pCadastro = new Painel_Cadastro("Professor");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.pCadastro, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btCadastrarProfessorMouseClicked

    private void btCadastrarAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarAlunoMouseClicked
        Janela.pCadastro = new Painel_Cadastro("Aluno");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.pCadastro, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btCadastrarAlunoMouseClicked

    private void btLoginProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoginProfessorMouseClicked
        l.carregarDados();
        Janela.pLogin = new Painel_Login("Professor");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.pLogin, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btLoginProfessorMouseClicked

    private void btLoginAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoginAlunoMouseClicked
        l.carregarDados();
        Janela.pLogin = new Painel_Login("Aluno");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.pLogin, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btLoginAlunoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarAluno;
    private javax.swing.JButton btCadastrarProfessor;
    private javax.swing.JButton btLoginAluno;
    private javax.swing.JButton btLoginProfessor;
    private javax.swing.JLabel imagem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
