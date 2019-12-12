package View;

import Controller.ProfessorController;
import Model.BEAN.UsuarioBEAN;

public class JframeProfessor extends javax.swing.JFrame {
    ProfessorController profC = null;
    int user = 0;
    String status = "ESP";
    
    public JframeProfessor() {
        initComponents();
    }
    
    public JframeProfessor(UsuarioBEAN u) {
        initComponents();
        profC = new ProfessorController();
        user = u.getUser_id();
        profC.loadFaltasTableProf(jTableMinhasFaltas, user, "ACC");
        profC.loadReposicaoTableProf(jTableMinhasReposicoes, user, status);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneProfessor = new javax.swing.JTabbedPane();
        jPanelMinhasFaltas = new javax.swing.JPanel();
        jScrollPaneMinhasFaltas = new javax.swing.JScrollPane();
        jTableMinhasFaltas = new javax.swing.JTable();
        jBtnMarcarR = new javax.swing.JButton();
        jPanelMinhasReposicoes = new javax.swing.JPanel();
        jScrollPaneMinhasReposicoes = new javax.swing.JScrollPane();
        jTableMinhasReposicoes = new javax.swing.JTable();
        jBtnCancelarR = new javax.swing.JButton();
        jPanelMenu = new javax.swing.JPanel();
        jTituloLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbedPaneProfessor.setBackground(new java.awt.Color(0, 153, 102));

        jPanelMinhasFaltas.setBackground(new java.awt.Color(255, 255, 255));

        jTableMinhasFaltas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTableMinhasFaltas.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTableMinhasFaltas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMinhasFaltas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableMinhasFaltas.setGridColor(new java.awt.Color(189, 195, 199));
        jTableMinhasFaltas.setRowHeight(20);
        jTableMinhasFaltas.getTableHeader().setReorderingAllowed(false);
        jTableMinhasFaltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMinhasFaltasjTableTurmasMouseClicked(evt);
            }
        });
        jScrollPaneMinhasFaltas.setViewportView(jTableMinhasFaltas);

        jBtnMarcarR.setText("MARCAR REPOSIÇÃO");
        jBtnMarcarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMarcarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMinhasFaltasLayout = new javax.swing.GroupLayout(jPanelMinhasFaltas);
        jPanelMinhasFaltas.setLayout(jPanelMinhasFaltasLayout);
        jPanelMinhasFaltasLayout.setHorizontalGroup(
            jPanelMinhasFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinhasFaltasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMinhasFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMinhasFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addGroup(jPanelMinhasFaltasLayout.createSequentialGroup()
                        .addComponent(jBtnMarcarR)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMinhasFaltasLayout.setVerticalGroup(
            jPanelMinhasFaltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinhasFaltasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneMinhasFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnMarcarR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneProfessor.addTab("MINHAS FALTAS", jPanelMinhasFaltas);

        jPanelMinhasReposicoes.setBackground(new java.awt.Color(255, 255, 255));

        jTableMinhasReposicoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 160, 224), 1, true));
        jTableMinhasReposicoes.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jTableMinhasReposicoes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMinhasReposicoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableMinhasReposicoes.setGridColor(new java.awt.Color(189, 195, 199));
        jTableMinhasReposicoes.setRowHeight(20);
        jTableMinhasReposicoes.getTableHeader().setReorderingAllowed(false);
        jTableMinhasReposicoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMinhasReposicoesjTableTurmasMouseClicked(evt);
            }
        });
        jScrollPaneMinhasReposicoes.setViewportView(jTableMinhasReposicoes);

        jBtnCancelarR.setText("CANCELAR REPOSIÇÃO");
        jBtnCancelarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMinhasReposicoesLayout = new javax.swing.GroupLayout(jPanelMinhasReposicoes);
        jPanelMinhasReposicoes.setLayout(jPanelMinhasReposicoesLayout);
        jPanelMinhasReposicoesLayout.setHorizontalGroup(
            jPanelMinhasReposicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinhasReposicoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMinhasReposicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMinhasReposicoes, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addGroup(jPanelMinhasReposicoesLayout.createSequentialGroup()
                        .addComponent(jBtnCancelarR)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMinhasReposicoesLayout.setVerticalGroup(
            jPanelMinhasReposicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMinhasReposicoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneMinhasReposicoes, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCancelarR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneProfessor.addTab("MINHAS REPOSIÇÕES", jPanelMinhasReposicoes);

        jPanelMenu.setBackground(new java.awt.Color(0, 153, 102));

        jTituloLabel.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jTituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        jTituloLabel.setText("TELA PROFESSOR");

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
                .addComponent(jTabbedPaneProfessor)
                .addContainerGap())
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jTabbedPaneProfessor)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMinhasFaltasjTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMinhasFaltasjTableTurmasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMinhasFaltasjTableTurmasMouseClicked

    private void jBtnMarcarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMarcarRActionPerformed
        profC.marcarReposi(jTableMinhasFaltas, user);
    }//GEN-LAST:event_jBtnMarcarRActionPerformed

    private void jBtnCancelarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarRActionPerformed
        profC.atualizaReposicaoStatus(jTableMinhasReposicoes, "CAN");
    }//GEN-LAST:event_jBtnCancelarRActionPerformed

    private void jTableMinhasReposicoesjTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMinhasReposicoesjTableTurmasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMinhasReposicoesjTableTurmasMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        profC.loadFaltasTableProf(jTableMinhasFaltas, user, "ACC");
        profC.loadReposicaoTableProf(jTableMinhasReposicoes, user, status);
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
            java.util.logging.Logger.getLogger(JframeProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelarR;
    private javax.swing.JButton jBtnMarcarR;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMinhasFaltas;
    private javax.swing.JPanel jPanelMinhasReposicoes;
    private javax.swing.JScrollPane jScrollPaneMinhasFaltas;
    private javax.swing.JScrollPane jScrollPaneMinhasReposicoes;
    private javax.swing.JTabbedPane jTabbedPaneProfessor;
    private javax.swing.JTable jTableMinhasFaltas;
    private javax.swing.JTable jTableMinhasReposicoes;
    private javax.swing.JLabel jTituloLabel;
    // End of variables declaration//GEN-END:variables
}
