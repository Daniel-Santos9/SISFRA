package View;

import Controller.FuncionarioController;
import Model.BEAN.UsuarioBEAN;
import Model.BEAN.DisciplinaBEAN;
import Model.BEAN.FaltaBEAN;
import Model.BEAN.FuncionarioBEAN;

public class JframeFuncionario extends javax.swing.JFrame {
    FuncionarioController funcC = null;
    FaltaBEAN faltaB = null;
    DisciplinaBEAN discB = null;
    String status = "ESP";
    String data = null;
    FuncionarioBEAN funcB = null;
    
    public JframeFuncionario() {
        initComponents();
    }
    
    public JframeFuncionario(UsuarioBEAN u) {
        initComponents();
        funcC = new FuncionarioController();
        funcC.loadFaltasTable(jTableFaltas, u.getUser_id(), status);
        funcC.loadCursoCombo(jCbCursos);
        funcB = funcC.recuperaFunc(u);
        jCbDisciplinas.setEnabled(false);
        jCbProfessores.setEnabled(false);
        jCbTurmas.setEnabled(false);
        jCbTurnos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackGround = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jTituloLabel = new javax.swing.JLabel();
        jTabbedPaneProfessor = new javax.swing.JTabbedPane();
        jPanelCadastrarFaltas = new javax.swing.JPanel();
        jPanelDadosCad = new javax.swing.JPanel();
        jCursoLabel = new javax.swing.JLabel();
        jCbCursos = new javax.swing.JComboBox<>();
        jTurmaLabel = new javax.swing.JLabel();
        jTurnoLabel = new javax.swing.JLabel();
        jDisciplinaLabel = new javax.swing.JLabel();
        jProfessorLabel = new javax.swing.JLabel();
        jCbTurmas = new javax.swing.JComboBox<>();
        jCbProfessores = new javax.swing.JComboBox<>();
        jCbTurnos = new javax.swing.JComboBox<>();
        jCbDisciplinas = new javax.swing.JComboBox<>();
        jFTData = new javax.swing.JFormattedTextField();
        jDataLabel = new javax.swing.JLabel();
        jTFQtd = new javax.swing.JTextField();
        jQtdLabel = new javax.swing.JLabel();
        jObsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaObs = new javax.swing.JTextArea();
        jBtnCadastrarF = new javax.swing.JButton();
        jScrollPaneFaltas = new javax.swing.JScrollPane();
        jTableFaltas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanelBackGround.setBackground(new java.awt.Color(255, 255, 255));

        jPanelMenu.setBackground(new java.awt.Color(0, 153, 102));

        jTituloLabel.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jTituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        jTituloLabel.setText("TELA FUNCIONÁRIO");

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTituloLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTituloLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPaneProfessor.setBackground(new java.awt.Color(255, 0, 0));

        jPanelCadastrarFaltas.setBackground(new java.awt.Color(255, 255, 255));

        jPanelDadosCad.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosCad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 1, true));

        jCursoLabel.setText("CURSO:");

        jCbCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "PROFESSOR", "FUNCIONÁRIO" }));
        jCbCursos.setSelectedIndex(-1);
        jCbCursos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCbCursosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jCbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbCursosActionPerformed(evt);
            }
        });

        jTurmaLabel.setText("TURMA:");

        jTurnoLabel.setText("TURNO:");

        jDisciplinaLabel.setText("DISCIPLINA:");

        jProfessorLabel.setText("PROFESSOR:");

        jCbTurmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "PROFESSOR", "FUNCIONÁRIO" }));
        jCbTurmas.setSelectedIndex(-1);
        jCbTurmas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCbTurmasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jCbTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTurmasActionPerformed(evt);
            }
        });

        jCbProfessores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "PROFESSOR", "FUNCIONÁRIO" }));
        jCbProfessores.setSelectedIndex(-1);
        jCbProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbProfessoresActionPerformed(evt);
            }
        });

        jCbTurnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "PROFESSOR", "FUNCIONÁRIO" }));
        jCbTurnos.setSelectedIndex(-1);
        jCbTurnos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCbTurnosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jCbTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTurnosActionPerformed(evt);
            }
        });

        jCbDisciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "PROFESSOR", "FUNCIONÁRIO" }));
        jCbDisciplinas.setSelectedIndex(-1);
        jCbDisciplinas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCbDisciplinasPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jCbDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbDisciplinasActionPerformed(evt);
            }
        });

        try {
            jFTData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFTDataFocusLost(evt);
            }
        });

        jDataLabel.setText("DATA:");

        jTFQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFQtdActionPerformed(evt);
            }
        });
        jTFQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFQtdKeyTyped(evt);
            }
        });

        jQtdLabel.setText("QUANTIDADE:");

        jObsLabel.setText("OBS:");

        jTaObs.setColumns(20);
        jTaObs.setRows(5);
        jScrollPane1.setViewportView(jTaObs);

        javax.swing.GroupLayout jPanelDadosCadLayout = new javax.swing.GroupLayout(jPanelDadosCad);
        jPanelDadosCad.setLayout(jPanelDadosCadLayout);
        jPanelDadosCadLayout.setHorizontalGroup(
            jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                        .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jQtdLabel)
                            .addComponent(jProfessorLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(14, 14, 14)
                        .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCbProfessores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                                .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDataLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFTData, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTurmaLabel)
                            .addComponent(jCursoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCbTurmas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCbCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTurnoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCbTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                        .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDisciplinaLabel)
                            .addComponent(jObsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCbDisciplinas, 0, 202, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(22, 22, 22))
        );
        jPanelDadosCadLayout.setVerticalGroup(
            jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCursoLabel)
                    .addComponent(jTurnoLabel)
                    .addComponent(jCbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTurmaLabel)
                    .addComponent(jDisciplinaLabel)
                    .addComponent(jCbDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                        .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCbProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProfessorLabel)
                            .addComponent(jObsLabel))
                        .addGap(15, 15, 15)
                        .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFTData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDataLabel))
                            .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jQtdLabel))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnCadastrarF.setText("CADASTRAR");
        jBtnCadastrarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarFActionPerformed(evt);
            }
        });

        jTableFaltas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTableFaltas.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTableFaltas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Disciplina", "Turno", "Turma", "Curso", "Periodo", "Professor", "Dia", "Quantidade", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFaltas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableFaltas.setGridColor(new java.awt.Color(189, 195, 199));
        jTableFaltas.setRowHeight(20);
        jTableFaltas.getTableHeader().setReorderingAllowed(false);
        jTableFaltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFaltasjTableTurmasMouseClicked(evt);
            }
        });
        jScrollPaneFaltas.setViewportView(jTableFaltas);

        javax.swing.GroupLayout jPanelCadastrarFaltasLayout = new javax.swing.GroupLayout(jPanelCadastrarFaltas);
        jPanelCadastrarFaltas.setLayout(jPanelCadastrarFaltasLayout);
        jPanelCadastrarFaltasLayout.setHorizontalGroup(
            jPanelCadastrarFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastrarFaltasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastrarFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneFaltas)
                    .addComponent(jPanelDadosCad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastrarFaltasLayout.createSequentialGroup()
                        .addComponent(jBtnCadastrarF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCadastrarFaltasLayout.setVerticalGroup(
            jPanelCadastrarFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastrarFaltasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDadosCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPaneFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCadastrarF, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneProfessor.addTab("CADASTRAR FALTAS", jPanelCadastrarFaltas);

        javax.swing.GroupLayout jPanelBackGroundLayout = new javax.swing.GroupLayout(jPanelBackGround);
        jPanelBackGround.setLayout(jPanelBackGroundLayout);
        jPanelBackGroundLayout.setHorizontalGroup(
            jPanelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneProfessor)
                .addContainerGap())
        );
        jPanelBackGroundLayout.setVerticalGroup(
            jPanelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackGroundLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPaneProfessor)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbCursosActionPerformed
    }//GEN-LAST:event_jCbCursosActionPerformed

    private void jCbTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTurmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbTurmasActionPerformed

    private void jCbProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbProfessoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbProfessoresActionPerformed

    private void jCbTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTurnosActionPerformed

    }//GEN-LAST:event_jCbTurnosActionPerformed

    private void jCbDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbDisciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbDisciplinasActionPerformed

    private void jFTDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTDataFocusLost

    }//GEN-LAST:event_jFTDataFocusLost

    private void jTFQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFQtdActionPerformed

    }//GEN-LAST:event_jTFQtdActionPerformed

    private void jTFQtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFQtdKeyTyped
        funcC.isNumeric(evt);
    }//GEN-LAST:event_jTFQtdKeyTyped

    private void jTableFaltasjTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFaltasjTableTurmasMouseClicked

    }//GEN-LAST:event_jTableFaltasjTableTurmasMouseClicked

    private void jCbCursosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCbCursosPopupMenuWillBecomeInvisible
        funcC.loadTurnoCombo(jCbCursos, jCbTurnos);
    }//GEN-LAST:event_jCbCursosPopupMenuWillBecomeInvisible

    private void jCbTurnosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCbTurnosPopupMenuWillBecomeInvisible
        funcC.loadTurmaCombo(jCbCursos,jCbTurmas, jCbTurnos);
    }//GEN-LAST:event_jCbTurnosPopupMenuWillBecomeInvisible

    private void jCbTurmasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCbTurmasPopupMenuWillBecomeInvisible
        funcC.loadDisciplinaCombo(jCbTurmas,jCbDisciplinas);
    }//GEN-LAST:event_jCbTurmasPopupMenuWillBecomeInvisible

    private void jCbDisciplinasPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCbDisciplinasPopupMenuWillBecomeInvisible
        funcC.loadProfessorCombo(jCbDisciplinas,jCbProfessores);
    }//GEN-LAST:event_jCbDisciplinasPopupMenuWillBecomeInvisible

    private void jBtnCadastrarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarFActionPerformed
        data = funcC.converterDataBD(jFTData);
        faltaB = new FaltaBEAN();
        
        faltaB.setData(data);
        if(jTFQtd.getText().equals("")){
            faltaB.setQtd(0);
        }else{
            faltaB.setQtd(Integer.parseInt(jTFQtd.getText()));
        }
        faltaB.setObs(jTaObs.getText());
        faltaB.setStatus("ESP");
        funcC.cadastrarFalta(faltaB,jCbDisciplinas,
                jCbTurmas,jCbCursos,jCbProfessores,
                jCbTurnos, funcB.getFunc_id(),jTFQtd,jFTData );
        
    }//GEN-LAST:event_jBtnCadastrarFActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        funcC.loadFaltasTable(jTableFaltas, funcB.getUser_id(), status);
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JframeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrarF;
    private javax.swing.JComboBox<String> jCbCursos;
    private javax.swing.JComboBox<String> jCbDisciplinas;
    private javax.swing.JComboBox<String> jCbProfessores;
    private javax.swing.JComboBox<String> jCbTurmas;
    private javax.swing.JComboBox<String> jCbTurnos;
    private javax.swing.JLabel jCursoLabel;
    private javax.swing.JLabel jDataLabel;
    private javax.swing.JLabel jDisciplinaLabel;
    private javax.swing.JFormattedTextField jFTData;
    private javax.swing.JLabel jObsLabel;
    private javax.swing.JPanel jPanelBackGround;
    private javax.swing.JPanel jPanelCadastrarFaltas;
    private javax.swing.JPanel jPanelDadosCad;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel jProfessorLabel;
    private javax.swing.JLabel jQtdLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneFaltas;
    private javax.swing.JTextField jTFQtd;
    private javax.swing.JTextArea jTaObs;
    private javax.swing.JTabbedPane jTabbedPaneProfessor;
    private javax.swing.JTable jTableFaltas;
    private javax.swing.JLabel jTituloLabel;
    private javax.swing.JLabel jTurmaLabel;
    private javax.swing.JLabel jTurnoLabel;
    // End of variables declaration//GEN-END:variables
}
