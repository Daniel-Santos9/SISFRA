package View;

import Controller.AdministradorController;
import Model.BEAN.UsuarioBEAN;
import javax.swing.JOptionPane;

public class JframeAdministrador extends javax.swing.JFrame {
        AdministradorController admin_control = null;
        UsuarioBEAN userB = null;
        
    public JframeAdministrador() {
        initComponents();
        //jCbCursos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCursoLabel = new javax.swing.JLabel();
        jCbCursos = new javax.swing.JComboBox<>();
        jPanelBackGround = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jTituloLabel1 = new javax.swing.JLabel();
        jTabbedPaneAdministrador = new javax.swing.JTabbedPane();
        jPanelCadastrarUsers = new javax.swing.JPanel();
        jPanelDadosCad = new javax.swing.JPanel();
        jNomeLabel = new javax.swing.JLabel();
        jCargoLabel = new javax.swing.JLabel();
        jLoginLabel = new javax.swing.JLabel();
        jSenhaLabel = new javax.swing.JLabel();
        jCbCargos = new javax.swing.JComboBox<>();
        jTFLogin = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jTFNome = new javax.swing.JTextField();
        jBtnExcluirF = new javax.swing.JButton();
        jBtnCadastrarF = new javax.swing.JButton();

        jCursoLabel.setText("CURSO:");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBackGround.setBackground(new java.awt.Color(255, 255, 255));

        jPanelMenu.setBackground(new java.awt.Color(0, 153, 102));

        jTituloLabel1.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jTituloLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jTituloLabel1.setText("TELA ADMINISTRADOR");

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTituloLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTituloLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPaneAdministrador.setBackground(new java.awt.Color(255, 0, 0));

        jPanelCadastrarUsers.setBackground(new java.awt.Color(255, 255, 255));

        jPanelDadosCad.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosCad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 102), 1, true));

        jNomeLabel.setText("NOME:");

        jCargoLabel.setText("CARGO:");

        jLoginLabel.setText("LOGIN:");

        jSenhaLabel.setText("SENHA:");

        jCbCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "PROFESSOR", "FUNCIONÁRIO" }));
        jCbCargos.setSelectedIndex(-1);
        jCbCargos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCbCargosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jCbCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbCargosActionPerformed(evt);
            }
        });

        jTFLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFLoginActionPerformed(evt);
            }
        });
        jTFLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFLoginKeyTyped(evt);
            }
        });

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });
        jTFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNomeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosCadLayout = new javax.swing.GroupLayout(jPanelDadosCad);
        jPanelDadosCad.setLayout(jPanelDadosCadLayout);
        jPanelDadosCadLayout.setHorizontalGroup(
            jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCargoLabel)
                    .addComponent(jNomeLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCbCargos, 0, 206, Short.MAX_VALUE)
                    .addComponent(jTFNome))
                .addGap(49, 49, 49)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLoginLabel)
                    .addComponent(jSenhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jTFLogin))
                .addGap(24, 24, 24))
        );
        jPanelDadosCadLayout.setVerticalGroup(
            jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCadLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeLabel)
                    .addComponent(jLoginLabel)
                    .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCargoLabel)
                    .addComponent(jSenhaLabel)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnExcluirF.setText("CANCELAR");
        jBtnExcluirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirFActionPerformed(evt);
            }
        });

        jBtnCadastrarF.setText("CADASTRAR");
        jBtnCadastrarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastrarUsersLayout = new javax.swing.GroupLayout(jPanelCadastrarUsers);
        jPanelCadastrarUsers.setLayout(jPanelCadastrarUsersLayout);
        jPanelCadastrarUsersLayout.setHorizontalGroup(
            jPanelCadastrarUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastrarUsersLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelCadastrarUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDadosCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCadastrarUsersLayout.createSequentialGroup()
                        .addComponent(jBtnCadastrarF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCadastrarUsersLayout.setVerticalGroup(
            jPanelCadastrarUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastrarUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDadosCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastrarUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastrarF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPaneAdministrador.addTab("CADASTRAR USUÁRIOS", jPanelCadastrarUsers);

        javax.swing.GroupLayout jPanelBackGroundLayout = new javax.swing.GroupLayout(jPanelBackGround);
        jPanelBackGround.setLayout(jPanelBackGroundLayout);
        jPanelBackGroundLayout.setHorizontalGroup(
            jPanelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelBackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneAdministrador)
                .addContainerGap())
        );
        jPanelBackGroundLayout.setVerticalGroup(
            jPanelBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackGroundLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPaneAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnExcluirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirFActionPerformed
       jTFNome.setText("");
       jPFSenha.setText("");
       jTFLogin.setText("");
       jCbCargos.setSelectedIndex(-1);
       jCbCursos.removeAllItems();
       jCbCursos.setSelectedIndex(-1);
       jCbCursos.setEnabled(false);
    }//GEN-LAST:event_jBtnExcluirFActionPerformed

    private void jBtnCadastrarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarFActionPerformed
        String nome = jTFNome.getText();
        String senha = jPFSenha.getText();
        String login = jTFLogin.getText();
        int acesso = jCbCargos.getSelectedIndex();
        
        if(!nome.equals("") || !senha.equals("") || !login.equals("") || acesso !=-1){
            admin_control = new AdministradorController();
            userB = new UsuarioBEAN();
            userB.setAcesso(acesso);
            userB.setLogin(login);
            userB.setSenha(senha);
            
            admin_control.cadastrarUser(userB, nome, jCbCargos);
            jBtnExcluirFActionPerformed(evt);
        }
        else{
            JOptionPane.showMessageDialog(null, "Preenchar todos os dados!!");
        }
    }//GEN-LAST:event_jBtnCadastrarFActionPerformed

    private void jTFLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFLoginKeyTyped

    }//GEN-LAST:event_jTFLoginKeyTyped

    private void jTFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFLoginActionPerformed

    }//GEN-LAST:event_jTFLoginActionPerformed

    private void jCbCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbCargosActionPerformed
        
       /* switch (jCbCargos.getSelectedIndex()) {
                    case 3:
                        admin_control = new AdministradorController();
                        jCbCursos.setEnabled(true);
                        jCbCursos.removeAllItems();
                        admin_control.loadCursoCombo(jCbCursos);
                        break;
        }*/
    }//GEN-LAST:event_jCbCargosActionPerformed

    private void jCbCargosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCbCargosPopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_jCbCargosPopupMenuWillBecomeInvisible

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeKeyTyped

    private void jCbCursosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCbCursosPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbCursosPopupMenuWillBecomeInvisible

    private void jCbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbCursosActionPerformed

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
            java.util.logging.Logger.getLogger(JframeAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrarF;
    private javax.swing.JButton jBtnExcluirF;
    private javax.swing.JLabel jCargoLabel;
    private javax.swing.JComboBox<String> jCbCargos;
    private javax.swing.JComboBox<String> jCbCursos;
    private javax.swing.JLabel jCursoLabel;
    private javax.swing.JLabel jLoginLabel;
    private javax.swing.JLabel jNomeLabel;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPanelBackGround;
    private javax.swing.JPanel jPanelCadastrarUsers;
    private javax.swing.JPanel jPanelDadosCad;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel jSenhaLabel;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTabbedPane jTabbedPaneAdministrador;
    private javax.swing.JLabel jTituloLabel1;
    // End of variables declaration//GEN-END:variables
}
