/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.motorph.payrollsystem.UserManagement;

import Frames.EmployeeMainFrame;
import com.motorph.payrollsystem.UserManagement.LogIn.EmployeeLogIn;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yennie
 */


public class EmployeeLogInFrame extends javax.swing.JFrame {

    public EmployeeLogInFrame() {
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
        exitbtn1 = new javax.swing.JButton();
        usernametf = new javax.swing.JTextField();
        pwtf = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitbtn1.setBackground(new java.awt.Color(204, 204, 255));
        exitbtn1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        exitbtn1.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn1.setText("?");
        exitbtn1.setBorder(null);
        exitbtn1.setMaximumSize(new java.awt.Dimension(9, 9));
        exitbtn1.setMinimumSize(new java.awt.Dimension(9, 9));
        exitbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtn1Exit(evt);
            }
        });
        exitbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 338, 12, 12));

        usernametf.setBackground(new java.awt.Color(246, 245, 244));
        usernametf.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        usernametf.setBorder(null);
        usernametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametfActionPerformed(evt);
            }
        });
        jPanel1.add(usernametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 260, 30));

        pwtf.setBackground(new java.awt.Color(246, 245, 244));
        pwtf.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        pwtf.setBorder(null);
        jPanel1.add(pwtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 260, 30));

        loginbtn.setBackground(new java.awt.Color(249, 182, 17));
        loginbtn.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Log In");
        loginbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 385, 270, 32));

        exitbtn.setBackground(new java.awt.Color(153, 153, 255));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("?");
        exitbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit(evt);
            }
        });
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 20, 20));

        jButton1.setBackground(new java.awt.Color(246, 245, 244));
        jButton1.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Login as Admin");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton1.setMaximumSize(new java.awt.Dimension(138, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(138, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 190, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/trishameiatienza/Downloads/MotorPH Payroll System Program/src/main/java/com/motorph/payrollsystem/UserManagement/Login as Employee.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        // Correctly instantiate the EmployeeLogIn object
     EmployeeLogIn employeeLogin = new EmployeeLogIn(); // Instantiate the login object
    employeeLogin.setusername(usernametf.getText());   // Set the username from the input field
    employeeLogin.setpassword(pwtf.getPassword());     // Set the password from the input field

    try {
        if (employeeLogin.isAuthenticated()) { // Check authentication
            dispose(); // Close the login window
            String authenticatedUsername = employeeLogin.getUsername(); // Get the authenticated username
            EmployeeMainFrame mainframe = new EmployeeMainFrame(authenticatedUsername); // Pass the username to the mainframe
            mainframe.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Username or Password is incorrect. Try Again.", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
    }
    } catch (IOException | CsvValidationException ex) {
        Logger.getLogger(EmployeeLogInFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }//GEN-LAST:event_loginbtnMouseClicked

    private void Exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit
        JOptionPane.showMessageDialog(null, "Contact through email");
    }//GEN-LAST:event_Exit

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitbtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbtnActionPerformed

    private void usernametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Assuming EmployeeLogInFrame is another JFrame that needs to be shown.
    LogInFrame LoginFrame = new LogInFrame();
    LoginFrame.setVisible(true);
    
    // Optionally, if you want to hide or dispose the current LoginFrame, you can call:
     this.dispose(); // to close the current frame
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitbtn1Exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtn1Exit
        JOptionPane.showMessageDialog(null, "Contact admin through website or email.");
    }//GEN-LAST:event_exitbtn1Exit

    private void exitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton exitbtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pwtf;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
