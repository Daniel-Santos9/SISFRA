package View;

import Controller.CoordenadorController;
import Model.BEAN.UsuarioBEAN;

public class JframeCoordenador extends javax.swing.JFrame {
    CoordenadorController coordC = null;
    String status = "ESP";
    int user ;
    
    public JframeCoordenador(UsuarioBEAN u) {
        initComponents();
        coordC = new CoordenadorController();
        user = u.getUser_id();
        coordC.loadFaltasTable(jTableFaltas, user, status);
        coordC.loadFaltasTableProf(jTableFaltas1, user, "ACC");
        
        coordC.loadReposicaoTable(jTableReposicao, user, status);
        coordC.loadReposicaoTableProf(jTableReposicao1, user, status);
    }

    public JframeCoordenador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneCoordenador = new javax.swing.JTabbedPane();
        jPanelFaltas = new javax.swing.JPanel();
        jScrollPaneFaltas = new javax.swing.JScrollPane();
        jTableFaltas = new javax.swing.JTable();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPanelFaltas1 = new javax.swing.JPanel();
        jScrollPaneFaltas1 = new javax.swing.JScrollPane();
        jTableFaltas1 = new javax.swing.JTable();
        jBtnMarcarR = new javax.swing.JButton();
        jPanelReposicoes = new javax.swing.JPanel();
        jPanelReposicao = new javax.swing.JPanel();
        jBtnConfirmarR = new javax.swing.JButton();
        jBtnCancelarR = new javax.swing.JButton();
        jScrollPaneFaltas2 = new javax.swing.JScrollPane();
        jTableReposicao = new javax.swing.JTable();
        jPanelReposicoes1 = new javax.swing.JPanel();
        jPanelReposicao1 = new javax.swing.JPanel();
        jBtnCancelarR1 = new javax.swing.JButton();
        jScrollPaneFaltas3 = new javax.swing.JScrollPane();
        jTableReposicao1 = new javax.swing.JTable();
        jPanelMenu = new javax.swing.JPanel();
        jTituloLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Coordenador");
        setBackground(new java.awt.Color(255, 255, 255));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbedPaneCoordenador.setBackground(new java.awt.Color(0, 153, 102));

        jPanelFaltas.setBackground(new java.awt.Color(255, 255, 255));

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
        if (jTableFaltas.getColumnModel().getColumnCount() > 0) {
            jTableFaltas.getColumnModel().getColumn(6).setHeaderValue("Professor");
        }

        jBtnConfirmar.setText("CONFIRMAR FALTA");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("CANCELAR FALTA");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFaltasLayout = new javax.swing.GroupLayout(jPanelFaltas);
        jPanelFaltas.setLayout(jPanelFaltasLayout);
        jPanelFaltasLayout.setHorizontalGroup(
            jPanelFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFaltasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneFaltas)
                    .addGroup(jPanelFaltasLayout.createSequentialGroup()
                        .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 330, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFaltasLayout.setVerticalGroup(
            jPanelFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFaltasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPaneCoordenador.addTab("FALTAS", jPanelFaltas);

        jPanelFaltas1.setBackground(new java.awt.Color(255, 255, 255));

        jTableFaltas1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTableFaltas1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTableFaltas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Disciplina", "Turno", "Turma", "Curso", "Periodo", "Dia", "Quantidade", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFaltas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableFaltas1.setGridColor(new java.awt.Color(189, 195, 199));
        jTableFaltas1.setRowHeight(20);
        jTableFaltas1.getTableHeader().setReorderingAllowed(false);
        jTableFaltas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFaltas1jTableTurmasMouseClicked(evt);
            }
        });
        jScrollPaneFaltas1.setViewportView(jTableFaltas1);

        jBtnMarcarR.setText("MARCAR REPOSIÇÃO");
        jBtnMarcarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMarcarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFaltas1Layout = new javax.swing.GroupLayout(jPanelFaltas1);
        jPanelFaltas1.setLayout(jPanelFaltas1Layout);
        jPanelFaltas1Layout.setHorizontalGroup(
            jPanelFaltas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFaltas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFaltas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneFaltas1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(jPanelFaltas1Layout.createSequentialGroup()
                        .addComponent(jBtnMarcarR)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFaltas1Layout.setVerticalGroup(
            jPanelFaltas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFaltas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneFaltas1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnMarcarR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPaneCoordenador.addTab("MINHAS FALTAS", jPanelFaltas1);

        jPanelReposicao.setBackground(new java.awt.Color(255, 255, 255));

        jBtnConfirmarR.setText("CONFIRMAR REPOSIÇÃO");
        jBtnConfirmarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarRActionPerformed(evt);
            }
        });

        jBtnCancelarR.setText("CANCELAR REPOSIÇÃO");
        jBtnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarRActionPerformed(evt);
            }
        });

        jTableReposicao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTableReposicao.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTableReposicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Disciplina", "Turno", "Turma", "Curso", "Periodo", "Professor", "Dia", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableReposicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableReposicao.setGridColor(new java.awt.Color(189, 195, 199));
        jTableReposicao.setRowHeight(20);
        jTableReposicao.getTableHeader().setReorderingAllowed(false);
        jTableReposicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReposicaojTableTurmasMouseClicked(evt);
            }
        });
        jScrollPaneFaltas2.setViewportView(jTableReposicao);
        if (jTableReposicao.getColumnModel().getColumnCount() > 0) {
            jTableReposicao.getColumnModel().getColumn(6).setHeaderValue("Professor");
        }

        javax.swing.GroupLayout jPanelReposicaoLayout = new javax.swing.GroupLayout(jPanelReposicao);
        jPanelReposicao.setLayout(jPanelReposicaoLayout);
        jPanelReposicaoLayout.setHorizontalGroup(
            jPanelReposicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReposicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReposicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReposicaoLayout.createSequentialGroup()
                        .addComponent(jBtnConfirmarR)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelarR)
                        .addGap(0, 313, Short.MAX_VALUE))
                    .addComponent(jScrollPaneFaltas2))
                .addContainerGap())
        );
        jPanelReposicaoLayout.setVerticalGroup(
            jPanelReposicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReposicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneFaltas2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelReposicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmarR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelarR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanelReposicoesLayout = new javax.swing.GroupLayout(jPanelReposicoes);
        jPanelReposicoes.setLayout(jPanelReposicoesLayout);
        jPanelReposicoesLayout.setHorizontalGroup(
            jPanelReposicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
            .addGroup(jPanelReposicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelReposicoesLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanelReposicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(8, 8, 8)))
        );
        jPanelReposicoesLayout.setVerticalGroup(
            jPanelReposicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
            .addGroup(jPanelReposicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelReposicoesLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanelReposicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        jTabbedPaneCoordenador.addTab("REPOSIÇÕES", jPanelReposicoes);

        jPanelReposicao1.setBackground(new java.awt.Color(255, 255, 255));

        jBtnCancelarR1.setText("CANCELAR REPOSIÇÃO");
        jBtnCancelarR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarR1ActionPerformed(evt);
            }
        });

        jTableReposicao1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTableReposicao1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTableReposicao1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Disciplina", "Turno", "Turma", "Curso", "Periodo", "Dia", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableReposicao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableReposicao1.setGridColor(new java.awt.Color(189, 195, 199));
        jTableReposicao1.setRowHeight(20);
        jTableReposicao1.getTableHeader().setReorderingAllowed(false);
        jTableReposicao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReposicao1jTableTurmasMouseClicked(evt);
            }
        });
        jScrollPaneFaltas3.setViewportView(jTableReposicao1);

        javax.swing.GroupLayout jPanelReposicao1Layout = new javax.swing.GroupLayout(jPanelReposicao1);
        jPanelReposicao1.setLayout(jPanelReposicao1Layout);
        jPanelReposicao1Layout.setHorizontalGroup(
            jPanelReposicao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReposicao1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReposicao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReposicao1Layout.createSequentialGroup()
                        .addComponent(jBtnCancelarR1)
                        .addGap(0, 486, Short.MAX_VALUE))
                    .addComponent(jScrollPaneFaltas3))
                .addContainerGap())
        );
        jPanelReposicao1Layout.setVerticalGroup(
            jPanelReposicao1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReposicao1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneFaltas3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCancelarR1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelReposicoes1Layout = new javax.swing.GroupLayout(jPanelReposicoes1);
        jPanelReposicoes1.setLayout(jPanelReposicoes1Layout);
        jPanelReposicoes1Layout.setHorizontalGroup(
            jPanelReposicoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
            .addGroup(jPanelReposicoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelReposicoes1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanelReposicao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(8, 8, 8)))
        );
        jPanelReposicoes1Layout.setVerticalGroup(
            jPanelReposicoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
            .addGroup(jPanelReposicoes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelReposicoes1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanelReposicao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        jTabbedPaneCoordenador.addTab("MINHAS REPOSIÇÕES", jPanelReposicoes1);

        jPanelMenu.setBackground(new java.awt.Color(0, 153, 102));

        jTituloLabel.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jTituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        jTituloLabel.setText("TELA COORDENADOR");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneCoordenador)
                .addContainerGap())
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jTabbedPaneCoordenador)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        coordC.loadFaltasTable(jTableFaltas, user, status);
        coordC.loadFaltasTableProf(jTableFaltas1, user, "ACC");
        coordC.loadReposicaoTable(jTableReposicao, user, status);
        coordC.loadReposicaoTableProf(jTableReposicao1, user, status);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jBtnMarcarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMarcarRActionPerformed
        coordC.marcarReposi(jTableFaltas1, user);
    }//GEN-LAST:event_jBtnMarcarRActionPerformed

    private void jTableFaltas1jTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFaltas1jTableTurmasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableFaltas1jTableTurmasMouseClicked

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        coordC.atualizaFaltaStatus(jTableFaltas, "CAN");
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        coordC.atualizaFaltaStatus(jTableFaltas, "ACC");
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jTableFaltasjTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFaltasjTableTurmasMouseClicked

    }//GEN-LAST:event_jTableFaltasjTableTurmasMouseClicked

    private void jTableReposicaojTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReposicaojTableTurmasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableReposicaojTableTurmasMouseClicked

    private void jTableReposicao1jTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReposicao1jTableTurmasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableReposicao1jTableTurmasMouseClicked

    private void jBtnConfirmarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarRActionPerformed
        coordC.atualizaReposicaoStatus(jTableReposicao, "ACC");
    }//GEN-LAST:event_jBtnConfirmarRActionPerformed

    private void jBtnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarRActionPerformed
        coordC.atualizaReposicaoStatus(jTableReposicao, "CAN");
    }//GEN-LAST:event_jBtnCancelarRActionPerformed

    private void jBtnCancelarR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarR1ActionPerformed
        coordC.atualizaReposicaoStatus(jTableReposicao1, "CAN");
    }//GEN-LAST:event_jBtnCancelarR1ActionPerformed

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
            java.util.logging.Logger.getLogger(JframeCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeCoordenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnCancelarR;
    private javax.swing.JButton jBtnCancelarR1;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnConfirmarR;
    private javax.swing.JButton jBtnMarcarR;
    private javax.swing.JPanel jPanelFaltas;
    private javax.swing.JPanel jPanelFaltas1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelReposicao;
    private javax.swing.JPanel jPanelReposicao1;
    private javax.swing.JPanel jPanelReposicoes;
    private javax.swing.JPanel jPanelReposicoes1;
    private javax.swing.JScrollPane jScrollPaneFaltas;
    private javax.swing.JScrollPane jScrollPaneFaltas1;
    private javax.swing.JScrollPane jScrollPaneFaltas2;
    private javax.swing.JScrollPane jScrollPaneFaltas3;
    private javax.swing.JTabbedPane jTabbedPaneCoordenador;
    private javax.swing.JTable jTableFaltas;
    private javax.swing.JTable jTableFaltas1;
    private javax.swing.JTable jTableReposicao;
    private javax.swing.JTable jTableReposicao1;
    private javax.swing.JLabel jTituloLabel;
    // End of variables declaration//GEN-END:variables
}
