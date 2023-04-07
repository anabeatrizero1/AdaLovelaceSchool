package view;

import controller.Controller_Professor;
import controller.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Aluno;
import model.Professor;

public class Painel_Professor extends javax.swing.JPanel {

    String nome;
    Controller_Professor cp = new Controller_Professor();
    public static String turmaRecado;
    
    public Painel_Professor(String nome) {
        initComponents();
        ImageIcon imagemBase =new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brasao.png")).getImage().getScaledInstance(147, 116, Image.SCALE_SMOOTH));
        imagem.setIcon(imagemBase);
        this.nome = nome;
        jLabel1.setText("Olá, "+nome);
        ltAlunos.setModel(new DefaultListModel());
        ltAlunos1.setModel(new DefaultListModel());
        pnAlunos.setVisible(false);
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
            btVerAlunos.setBackground(new Color(93,0,0));
        }
        if(botao.equals("nota")){
            btNotas.setBackground(new Color(51,0,0));
            btEditarPerfil.setBackground(new Color(93,0,0));
            btVerAlunos.setBackground(new Color(93,0,0));
        }
        if(botao.equals("aluno")){
            btVerAlunos.setBackground(new Color(51,0,0));
            btEditarPerfil.setBackground(new Color(93,0,0));
            btNotas.setBackground(new Color(93,0,0));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        btVerAlunos = new javax.swing.JButton();
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
        jLabel3 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        lbSiape = new javax.swing.JLabel();
        tfSiape = new javax.swing.JTextField();
        lbMateria = new javax.swing.JLabel();
        cbMaterias = new javax.swing.JComboBox<>();
        pnAlunos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltAlunos = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        pnNotas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ltAlunos1 = new javax.swing.JList<>();
        lbNomeAluno = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btFecharNotas = new javax.swing.JButton();
        tfSemestre1 = new javax.swing.JTextField();
        tfSemestre2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(225, 223, 223));

        jPanel1.setBackground(new java.awt.Color(93, 0, 0));

        btVoltar.setBackground(new java.awt.Color(93, 0, 0));
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("Voltar");
        btVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltar.setFocusable(false);
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });

        btVerAlunos.setBackground(new java.awt.Color(93, 0, 0));
        btVerAlunos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btVerAlunos.setForeground(new java.awt.Color(255, 255, 255));
        btVerAlunos.setText("Ver Alunos");
        btVerAlunos.setBorder(null);
        btVerAlunos.setFocusable(false);
        btVerAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVerAlunosMouseClicked(evt);
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
        btNotas.setText("Adicionar notas");
        btNotas.setBorder(null);
        btNotas.setFocusable(false);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(btEditarPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btVerAlunos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVerAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Olá,");

        pnPerfil.setBackground(new java.awt.Color(225, 223, 223));

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNome.setText("Nome:");

        lbCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCpf.setText("CPF:");

        lbNasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNasc.setText("Data de Nascimento(yyyy-mm-dd):");

        ftfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####-##-##"))));

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

        lbSiape.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSiape.setText("Número SIAPE:");

        lbMateria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMateria.setText("Matéria:");

        cbMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Artes", "Biologia", "Educação Física", "Filosofia", "Física", "Geografia", "História", "Inglês", "Matemática", "Português", "Química", "Sociologia" }));

        javax.swing.GroupLayout pnPerfilLayout = new javax.swing.GroupLayout(pnPerfil);
        pnPerfil.setLayout(pnPerfilLayout);
        pnPerfilLayout.setHorizontalGroup(
            pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPerfilLayout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPerfilLayout.createSequentialGroup()
                                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnPerfilLayout.createSequentialGroup()
                                        .addComponent(lbCpf)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCpf))
                                    .addComponent(lbNasc, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPerfilLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(pnPerfilLayout.createSequentialGroup()
                        .addComponent(lbMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPerfilLayout.createSequentialGroup()
                        .addComponent(lbSiape)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSiape, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
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
                    .addComponent(lbSiape)
                    .addComponent(tfSiape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMateria)
                    .addComponent(cbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar)
                .addGap(34, 34, 34))
        );

        pnAlunos.setBackground(new java.awt.Color(225, 223, 223));

        jScrollPane1.setViewportView(ltAlunos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Alunos:");

        javax.swing.GroupLayout pnAlunosLayout = new javax.swing.GroupLayout(pnAlunos);
        pnAlunos.setLayout(pnAlunosLayout);
        pnAlunosLayout.setHorizontalGroup(
            pnAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnAlunosLayout.setVerticalGroup(
            pnAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlunosLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnNotas.setBackground(new java.awt.Color(225, 223, 223));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setText("Adicionar notas:");

        ltAlunos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltAlunos1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ltAlunos1);

        lbNomeAluno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeAluno.setText("Aluno: ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("1° semestre:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("2° semestre:");

        btFecharNotas.setText("<html><center>Fechar<br>Notas</center>");
        btFecharNotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btFecharNotas.setFocusable(false);
        btFecharNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFecharNotasMouseClicked(evt);
            }
        });

        tfSemestre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSemestre1KeyTyped(evt);
            }
        });

        tfSemestre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSemestre2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnNotasLayout = new javax.swing.GroupLayout(pnNotas);
        pnNotas.setLayout(pnNotasLayout);
        pnNotasLayout.setHorizontalGroup(
            pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNotasLayout.createSequentialGroup()
                .addGroup(pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnNotasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnNotasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnNotasLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSemestre1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNomeAluno)
                            .addGroup(pnNotasLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSemestre2)))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNotasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btFecharNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        pnNotasLayout.setVerticalGroup(
            pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNomeAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfSemestre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfSemestre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFecharNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.pLogin, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btEditarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditarPerfilMouseClicked
        pnAlunos.setVisible(false);
        pnNotas.setVisible(false);
        pnPerfil.setVisible(true);
        trocarCorBotao("perfil");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.setSize(800,650);
        for (int i = 0; i < Login.listaProfessores.size(); i++) {
            Professor p = Login.listaProfessores.get(i);
            if (p.getNome().equalsIgnoreCase(nome)) {
                tfNome.setText(nome);
                tfCpf.setText(p.getCpf());
                ftfDataNasc.setText(p.getDataNasc().toString());
                tfSiape.setText(p.getSiape());
                ((DefaultComboBoxModel) cbMaterias.getModel()).setSelectedItem(p.getMateria());
            }
        }
    }//GEN-LAST:event_btEditarPerfilMouseClicked

    private void btVerAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVerAlunosMouseClicked
        pnAlunos.setVisible(true);
        pnNotas.setVisible(false);
        pnPerfil.setVisible(false);
        trocarCorBotao("aluno");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.setSize(800,650);
        ((DefaultListModel) ltAlunos.getModel()).removeAllElements();
        for (int i = 0; i < Login.listaAlunos.size(); i++) {
            Aluno a = Login.listaAlunos.get(i);
            ((DefaultListModel) ltAlunos.getModel()).addElement(a.getNome()+" - "+a.getSerie());
        }
    }//GEN-LAST:event_btVerAlunosMouseClicked

    private void btNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNotasMouseClicked
        pnAlunos.setVisible(false);
        pnNotas.setVisible(true);
        pnPerfil.setVisible(false);
        trocarCorBotao("nota");
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.setSize(800,650);
        ((DefaultListModel) ltAlunos1.getModel()).removeAllElements();
        for (int i = 0; i < Login.listaAlunos.size(); i++) {
            Aluno a = Login.listaAlunos.get(i);
            ((DefaultListModel) ltAlunos1.getModel()).addElement(a.getNome()+" - "+a.getSerie());
        }
    }//GEN-LAST:event_btNotasMouseClicked

    private void btFecharNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFecharNotasMouseClicked
        for (int i = 0; i < Login.listaProfessores.size(); i++) {
            Professor p = Login.listaProfessores.get(i);
            if (p.getNome().equalsIgnoreCase(nome)) {
                for (i = 0; i < Login.listaAlunos.size(); i++) {
                    Aluno a = Login.listaAlunos.get(i);
                    String aluno = a.getNome()+" - "+a.getSerie();
                    if (aluno.equals(ltAlunos1.getSelectedValue())) {
                        cp.notas(a, p.getMateria(), Integer.parseInt(tfSemestre1.getText()), Integer.parseInt(tfSemestre2.getText()));
                        tfSemestre1.setText(null);
                        tfSemestre2.setText(null);
                        lbNomeAluno.setText("Aluno: ");
                    }
                } 
            }
        }
        
         
    }//GEN-LAST:event_btFecharNotasMouseClicked

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        nome = cp.edita(nome, tfSiape.getText(), cbMaterias.getSelectedItem().toString(), tfNome.getText(), 
                tfCpf.getText(),ftfDataNasc.getText(), Arrays.toString(pfSenha.getPassword()));
        jLabel1.setText("Olá, "+nome);
    }//GEN-LAST:event_btSalvarMouseClicked

    private void ltAlunos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltAlunos1MouseClicked
        lbNomeAluno.setText("Aluno: "+ltAlunos1.getSelectedValue());
    }//GEN-LAST:event_ltAlunos1MouseClicked

    private void tfSemestre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSemestre1KeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfSemestre1KeyTyped

    private void tfSemestre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSemestre2KeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfSemestre2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarPerfil;
    private javax.swing.JButton btFecharNotas;
    private javax.swing.JButton btNotas;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVerAlunos;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbMaterias;
    public static javax.swing.JFormattedTextField ftfDataNasc;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbMateria;
    private javax.swing.JLabel lbNasc;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeAluno;
    private javax.swing.JLabel lbSiape;
    private javax.swing.JList<String> ltAlunos;
    private javax.swing.JList<String> ltAlunos1;
    public static javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnAlunos;
    private javax.swing.JPanel pnNotas;
    private javax.swing.JPanel pnPerfil;
    public static javax.swing.JTextField tfCpf;
    public static javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSemestre1;
    private javax.swing.JTextField tfSemestre2;
    private javax.swing.JTextField tfSiape;
    // End of variables declaration//GEN-END:variables
}
