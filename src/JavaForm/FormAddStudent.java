/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaForm;

import Entities.Student;
import JavaCode.CSVWriter;
import JavaCode.Utils;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sieus
 */
public class FormAddStudent extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmStudent
     */
    public FormAddStudent() {
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

        jPanel1 = new javax.swing.JPanel();
        cmbClass = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtStdID = new javax.swing.JTextField();
        jlabel_Username = new javax.swing.JLabel();
        jlabel_Password = new javax.swing.JLabel();
        jlabel_Password1 = new javax.swing.JLabel();
        jlabel_Password2 = new javax.swing.JLabel();
        jlabel_Password3 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        txtCardID = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(600, 500));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        cmbClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClass.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClassItemStateChanged(evt);
            }
        });
        cmbClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbClassMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Thêm sinh viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtStdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStdIDActionPerformed(evt);
            }
        });

        jlabel_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Username.setText("Mã số sinh viên");
        jlabel_Username.setToolTipText("");

        jlabel_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Password.setText("CMND");
        jlabel_Password.setToolTipText("");

        jlabel_Password1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Password1.setText("Giới tính");
        jlabel_Password1.setToolTipText("");

        jlabel_Password2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Password2.setText("Họ và tên");
        jlabel_Password2.setToolTipText("");

        jlabel_Password3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabel_Password3.setText("Lớp học");
        jlabel_Password3.setToolTipText("");

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbGender.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGenderItemStateChanged(evt);
            }
        });
        cmbGender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbGenderMouseClicked(evt);
            }
        });

        txtCardID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardIDActionPerformed(evt);
            }
        });

        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabel_Password2)
                            .addComponent(jlabel_Password1)
                            .addComponent(jlabel_Username)
                            .addComponent(jlabel_Password3)
                            .addComponent(jlabel_Password))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCardID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Password3)
                    .addComponent(cmbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Username)
                    .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Password2)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel_Password)
                    .addComponent(txtCardID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final String[] strGender = {"Nam", "Nữ"};
    public static List<String> classNames = Utils.listAllCSVFile(Student.getString());


    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cmbGender.removeAllItems();
        cmbGender.addItem(strGender[0]);
        cmbGender.addItem(strGender[1]);
        cmbClass.removeAllItems();
        for (int i = 0; i < classNames.size(); i++) {
            cmbClass.addItem(classNames.get(i));
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtStdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStdIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdIDActionPerformed

    private void cmbClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbClassMouseClicked
        // TODO add your handling code here:
        classNames = Utils.listAllCSVFile(Student.getString());
        cmbClass.removeAllItems();
        for (int i = 0; i < classNames.size(); i++) {
            cmbClass.addItem(classNames.get(i));
        }
    }//GEN-LAST:event_cmbClassMouseClicked

    private void cmbClassItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClassItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbClassItemStateChanged

    private void cmbGenderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGenderItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderItemStateChanged

    private void cmbGenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbGenderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String stdID = txtStdID.getText();
        String fullName = txtFullname.getText();
        String gender = cmbGender.getSelectedItem().toString();
        String IDCard = txtCardID.getText();

        String className = cmbClass.getSelectedItem().toString();
        Student std = new Student("", stdID, fullName, gender, IDCard);
        String fileName = "/Data/Student/" + className + ".csv";
        CSVWriter writer = new CSVWriter();
        Boolean isS = writer.addItem(fileName, std);
        if (isS) {
            JOptionPane.showMessageDialog(null, "Thành công", "Thêm sinh viên thành công !", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Thất bại", "Thêm sinh viên thất bại !", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCardIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardIDActionPerformed

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbClass;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel_Password;
    private javax.swing.JLabel jlabel_Password1;
    private javax.swing.JLabel jlabel_Password2;
    private javax.swing.JLabel jlabel_Password3;
    private javax.swing.JLabel jlabel_Username;
    private javax.swing.JTextField txtCardID;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtStdID;
    // End of variables declaration//GEN-END:variables
}
