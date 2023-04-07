package view;

import controller.Controller_Aluno;
import controller.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Aluno;
import model.Boletim;

public class Painel_Aluno extends javax.swing.JPanel {

    Controller_Aluno ca = new Controller_Aluno();
    String nome;
    
    public Painel_Aluno(String nome) {
        initComponents();
        this.nome = nome;
        ImageIcon imagemBase =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brasao.png")).getImage().getScaledInstance(147, 116, Image.SCALE_SMOOTH));
        imagem.setIcon(imagemBase);
        jLabel1.setText("Olá, " + nome);
        pnNotas.setVisible(false);
        pnPerfil.setVisible(false);
        try {
            ftfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void trocarCorBotao(String botao){
        if(botao.equals("perfil")){
            btEditarPerfil.setBackground(new Color(51,0,0));
            btNotas.setBackground(new Color(93,0,0));
        }
        if(botao.equals("nota")){
            btNotas.setBackground(new Color(51,0,0));
            btEditarPerfil.setBackground(new Color(93,0,0));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btVoltar1 = new javax.swing.JButton();
        btEditarPerfil = new javax.swing.JButton();
        btNotas = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnPerfil = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        lbNasc = new javax.swing.JLabel();
        ftfDataNasc = new javax.swing.JFormattedTextField();
        lbMatricula = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        lbSeries = new javax.swing.JLabel();
        cbSerie = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        pnNotas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBoletim = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btBoletim = new javax.swing.JButton();

        setBackground(new java.awt.Color(225, 223, 223));

        jPanel1.setBackground(new java.awt.Color(93, 0, 0));

        btVoltar1.setBackground(new java.awt.Color(93, 0, 0));
        btVoltar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVoltar1.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar1.setText("Voltar");
        btVoltar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltar1.setFocusable(false);
        btVoltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltar1MouseClicked(evt);
            }
        });

        btEditarPerfil.setBackground(new java.awt.Color(93, 0, 0));
        btEditarPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btEditarPerfil.setText("Editar Perfil");
        btEditarPerfil.setBorder(null);
        btEditarPerfil.setFocusable(false);
        btEditarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditarPerfilMouseClicked(evt);
            }
        });

        btNotas.setBackground(new java.awt.Color(93, 0, 0));
        btNotas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btNotas.setForeground(new java.awt.Color(255, 255, 255));
        btNotas.setText("Vizualizar Notas");
        btNotas.setBorder(null);
        btNotas.setFocusable(false);
        btNotas.setMaximumSize(new java.awt.Dimension(90, 22));
        btNotas.setMinimumSize(new java.awt.Dimension(90, 22));
        btNotas.setPreferredSize(new java.awt.Dimension(90, 22));
        btNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNotasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addComponent(btEditarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btNotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(225, 223, 223));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Olá,");

        pnPerfil.setBackground(new java.awt.Color(225, 223, 223));

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNome.setText("Nome:");

        lbCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCpf.setText("CPF:");

        lbNasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNasc.setText("Data de Nascimento(yyyy-mm-dd):");

        ftfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####-##-##"))));

        lbMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMatricula.setText("Matrícula:");

        lbSeries.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSeries.setText("Série:");

        cbSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1° ano", "2° ano", "3° ano" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Editar Perfil:");

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSalvar.setFocusable(false);
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnPerfilLayout = new javax.swing.GroupLayout(pnPerfil);
        pnPerfil.setLayout(pnPerfilLayout);
        pnPerfilLayout.setHorizontalGroup(
            pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPerfilLayout.createSequentialGroup()
                        .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(pnPerfilLayout.createSequentialGroup()
                                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnPerfilLayout.createSequentialGroup()
                                            .addComponent(lbMatricula)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfMatricula))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnPerfilLayout.createSequentialGroup()
                                            .addComponent(lbCpf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfCpf))
                                        .addComponent(lbNasc, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(pnPerfilLayout.createSequentialGroup()
                                        .addComponent(lbSeries)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnPerfilLayout.createSequentialGroup()
                        .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnPerfilLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnPerfilLayout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        pnPerfilLayout.setVerticalGroup(
            pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPerfilLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNasc)
                    .addComponent(ftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatricula)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSeries)
                    .addComponent(cbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSalvar))
                .addGap(51, 51, 51))
        );

        pnNotas.setBackground(new java.awt.Color(225, 223, 223));

        tbBoletim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Artes", null, null, null},
                {"Biologia", null, null, null},
                {"Educação Física", null, null, null},
                {"Filosofia", null, null, null},
                {"Física", null, null, null},
                {"Geografia", null, null, null},
                {"História", null, null, null},
                {"Inglês", null, null, null},
                {"Matemática", null, null, null},
                {"Português", null, null, null},
                {"Química", null, null, null},
                {"Sociologia", null, null, null}
            },
            new String [] {
                "Matéria", "1° Semestre", "2° Semestre", "Média"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBoletim);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Boletim:");

        btBoletim.setText("Imprimir Boletim");
        btBoletim.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBoletim.setFocusable(false);
        btBoletim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBoletimMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnNotasLayout = new javax.swing.GroupLayout(pnNotas);
        pnNotas.setLayout(pnNotasLayout);
        pnNotasLayout.setHorizontalGroup(
            pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addGroup(pnNotasLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnNotasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btBoletim, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnNotasLayout.setVerticalGroup(
            pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNotasLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btBoletim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarPerfilMouseClicked
        pnNotas.setVisible(false);
        pnPerfil.setVisible(true);
        trocarCorBotao("perfil");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.setSize(800,650);
        for (int i = 0; i < Login.listaAlunos.size(); i++) {
            Aluno a = Login.listaAlunos.get(i);
            if (a.getNome().equalsIgnoreCase(nome)) {
                tfNome.setText(nome);
                tfCpf.setText(a.getCpf());
                ftfDataNasc.setText(a.getDataNasc().toString());
                tfMatricula.setText(a.getMatricula());
                ((DefaultComboBoxModel) cbSerie.getModel()).setSelectedItem(a.getSerie());
            }
        }
    }//GEN-LAST:event_btEditarPerfilMouseClicked

    private void btNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNotasMouseClicked
        pnNotas.setVisible(true);
        pnPerfil.setVisible(false);
        trocarCorBotao("nota");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        //janela.pack();
        janela.setSize(800,650);
        ca.boletim(tbBoletim);
    }//GEN-LAST:event_btNotasMouseClicked

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        nome = ca.edita(nome, tfMatricula.getText(), cbSerie.getSelectedItem().toString(), tfNome.getText(), 
                tfCpf.getText(),ftfDataNasc.getText(), Arrays.toString(pfSenha.getPassword()));
        jLabel1.setText("Olá, "+ nome);
    }//GEN-LAST:event_btSalvarMouseClicked

    private void btVoltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltar1MouseClicked
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.pLogin, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btVoltar1MouseClicked

    private void btBoletimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBoletimMouseClicked
       Boletim relatorioExemplo = new Boletim();
       try{
           relatorioExemplo.gerarPdf(nome);
           JOptionPane.showMessageDialog(null, "Boletim salvo com sucesso", "Download concluído", JOptionPane.INFORMATION_MESSAGE);
       }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Erro ao salvar boletim", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       
    }//GEN-LAST:event_btBoletimMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoletim;
    private javax.swing.JButton btEditarPerfil;
    private javax.swing.JButton btNotas;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar1;
    private javax.swing.JComboBox<String> cbSerie;
    private javax.swing.JFormattedTextField ftfDataNasc;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNasc;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSeries;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnNotas;
    private javax.swing.JPanel pnPerfil;
    private javax.swing.JTable tbBoletim;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
