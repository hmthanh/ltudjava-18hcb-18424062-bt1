/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaForm;

import Entities.Account;
import JavaCode.CSVReader;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sieus
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public FormLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnLogin = new javax.swing.JButton();
        jtext_Username = new javax.swing.JTextField();
        jlabel_Username = new javax.swing.JLabel();
        jlabel_Password = new javax.swing.JLabel();
        jtext_Password = new javax.swing.JPasswordField();
        jlabel_Username1 = new javax.swing.JLabel();
        cmbPermit = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setLocation(new java.awt.Point(300, 300));
        setName("frmLogin"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jbtnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnLogin.setText("Đăng nhập");
        jbtnLogin.setName("Login"); // NOI18N
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });

        jtext_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_UsernameActionPerformed(evt);
            }
        });

        jlabel_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Username.setText("Tên đăng nhập");
        jlabel_Username.setToolTipText("");

        jlabel_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Password.setText("Mật khẩu");
        jlabel_Password.setToolTipText("");

        jtext_Password.setToolTipText("");

        jlabel_Username1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Username1.setText("Quyền hạn");
        jlabel_Username1.setToolTipText("");

        cmbPermit.setEditable(true);
        cmbPermit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbPermit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabel_Username)
                            .addComponent(jlabel_Password)
                            .addComponent(jlabel_Username1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtext_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jtext_Password)
                            .addComponent(cmbPermit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jlabel_Username1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cmbPermit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtext_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_Username))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Password)
                    .addComponent(jtext_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jbtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String UsernameLogin = "";
    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        // TODO add your handling code here:
        String username = jtext_Username.getText();
        UsernameLogin = username;
        String password = jtext_Password.getText();
        Boolean hasPermit = checkLogin(username, password);
        
        if (hasPermit) {
            this.setVisible(false);

            int idx = cmbPermit.getSelectedIndex();
            if (idx == 0) {
                java.awt.EventQueue.invokeLater(() -> {
                    new StudentPermittion().setVisible(true);
                });
            } else {
                java.awt.EventQueue.invokeLater(() -> {
                    new AdminPermittion().setVisible(true);
                });
            }

        } else {
            JOptionPane.showMessageDialog(null, "Đăng nhập không thành công", "Vui lòng xem lại mật khẩu\n\"Tài khoản hoặc mật khẩu không đúng\"", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jtext_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_UsernameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cmbPermit.removeAllItems();
        cmbPermit.addItem("Sinh viên");
        cmbPermit.addItem("Giáo vụ");
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormLogin().setVisible(true);
        });
    }

    private Boolean checkLogin(String username, String password) {
        CSVReader<Account> reader = new CSVReader<>();
        String permit = cmbPermit.getSelectedIndex() == 0 ? "Student" : "Admin";
        List<Account> data = reader.readCSV("/Data/Account/" + permit + ".csv", new Account());
        for (int i = 0; i < data.size(); i++) {
            Boolean trueUsername = data.get(i).getUserName().equals(username);
            Boolean truePassword = data.get(i).getPassword().equals(password);

            if (trueUsername && truePassword) {
                return true;
            }
        }

        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPermit;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JLabel jlabel_Password;
    private javax.swing.JLabel jlabel_Username;
    private javax.swing.JLabel jlabel_Username1;
    private javax.swing.JPasswordField jtext_Password;
    private javax.swing.JTextField jtext_Username;
    // End of variables declaration//GEN-END:variables

}
