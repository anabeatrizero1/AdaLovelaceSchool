package view;

import controller.Cadastro;
import java.awt.BorderLayout;
import java.awt.Image;
import java.text.ParseException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Painel_Cadastro extends javax.swing.JPanel {

    Cadastro c = new Cadastro();
    String tipo;
    
    public Painel_Cadastro(String tipo) {
        initComponents();
        this.tipo = tipo;
        ImageIcon imagemBase =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brasao.png")).getImage().getScaledInstance(147, 116, Image.SCALE_SMOOTH));
        imagem.setIcon(imagemBase);
        if (tipo.equals("Professor")) {
            lbMatricula.setVisible(false);
            tfMatricula.setVisible(false);
            lbSeries.setVisible(false);
            cbSerie.setVisible(false);
            labelTitulo.setText("Cadastro de Professor");
        }else if (tipo.equals("Aluno")) {
            lbSiape.setVisible(false);
            tfSiape.setVisible(false);
            lbMateria.setVisible(false);
            cbMaterias.setVisible(false);
            labelTitulo.setText("Cadastro de Aluno");
        }
        try {
            ftfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbSeries = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbSiape = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        lbMateria = new javax.swing.JLabel();
        ftfDataNasc = new javax.swing.JFormattedTextField();
        tfNome = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfMatricula = new javax.swing.JTextField();
        tfSiape = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        cbSerie = new javax.swing.JComboBox<>();
        lbCpf = new javax.swing.JLabel();
        cbMaterias = new javax.swing.JComboBox<>();
        lbNasc = new javax.swing.JLabel();
        lbMatricula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(93, 0, 0));
        setPreferredSize(new java.awt.Dimension(781, 613));

        btVoltar.setBackground(new java.awt.Color(93, 0, 0));
        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("Voltar");
        btVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltar.setFocusable(false);
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(93, 0, 0));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSalvar.setFocusable(false);
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(225, 223, 223));

        lbSeries.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSeries.setText("Série:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Crie uma senha:");

        lbSiape.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSiape.setText("Número SIAPE:");

        lbMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMateria.setText("Matéria:");

        ftfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####-##-##"))));
        ftfDataNasc.setToolTipText("(yyyy-mm-dd)");

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNome.setText("Nome:");

        cbSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1° ano", "2° ano", "3° ano" }));

        lbCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCpf.setText("CPF:");

        cbMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Artes", "Biologia", "Educação Física", "Filosofia", "Física", "Geografia", "História", "Inglês", "Matemática", "Português", "Química", "Sociologia" }));

        lbNasc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNasc.setText("Data de Nascimento:");

        lbMatricula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMatricula.setText("Matrícula:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("(yyyy-mm-dd)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCpf)
                        .addGap(18, 18, 18)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatricula)
                            .addComponent(lbSeries))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSiape)
                            .addComponent(lbMateria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSiape, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(167, 167, 167))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNasc)
                    .addComponent(ftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSeries))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSiape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSiape))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        imagem.setText("jLabel3");

        labelTitulo.setFont(new java.awt.Font("Barlow Condensed Light", 2, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("<Cadastro de Professor>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(530, 530, 530)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.pInicial, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        if (tipo.equals("Professor")) {
            c.validaCamposProfessor(tfSiape.getText(), cbMaterias.getSelectedItem().toString()
                , tfNome.getText(), tfCpf.getText(),ftfDataNasc.getText(), Arrays.toString(pfSenha.getPassword()));
        }else if (tipo.equals("Aluno")) {
            c.validaCamposAluno(tfMatricula.getText(), cbSerie.getSelectedItem().toString()
                , tfNome.getText(), tfCpf.getText(),ftfDataNasc.getText(), Arrays.toString(pfSenha.getPassword()));
        }
        tfCpf.setText(null);
        tfMatricula.setText(null);
        tfNome.setText(null);
        tfSiape.setText(null);
        pfSenha.setText(null);
        ftfDataNasc.setText(null);
        cbMaterias.setSelectedIndex(0);
        cbSerie.setSelectedIndex(0);
    }//GEN-LAST:event_btSalvarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbMaterias;
    private javax.swing.JComboBox<String> cbSerie;
    private javax.swing.JFormattedTextField ftfDataNasc;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbMateria;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNasc;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSeries;
    private javax.swing.JLabel lbSiape;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSiape;
    // End of variables declaration//GEN-END:variables
}
