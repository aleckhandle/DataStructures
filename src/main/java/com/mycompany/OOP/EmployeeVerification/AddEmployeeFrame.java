/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.OOP.EmployeeVerification;

import com.mycompany.OOP.EmployeeVerification.Employees;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yennie
 */
public class AddEmployeeFrame extends javax.swing.JDialog {

    /**
     * Creates new form ViewRecordFrame
     */
    
    
    public AddEmployeeFrame(Employees employees) {
        initComponents();
        this.setModalityType(ModalityType.APPLICATION_MODAL);
                
    }

    private AddEmployeeFrame() {
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lastnametf = new javax.swing.JTextField();
        firstnametf = new javax.swing.JTextField();
        birthdaytf = new javax.swing.JTextField();
        addresstf = new javax.swing.JTextField();
        phonenumtf = new javax.swing.JTextField();
        sssnumtf = new javax.swing.JTextField();
        phnumtf = new javax.swing.JTextField();
        tinnumtf = new javax.swing.JTextField();
        pagibigtf = new javax.swing.JTextField();
        statustf = new javax.swing.JTextField();
        positiontf = new javax.swing.JTextField();
        supervisortf = new javax.swing.JTextField();
        employeenumbertf = new javax.swing.JTextField();
        basicsalarytf = new javax.swing.JTextField();
        ricetf = new javax.swing.JTextField();
        phonetf = new javax.swing.JTextField();
        clothingtf = new javax.swing.JTextField();
        smratetf = new javax.swing.JTextField();
        hourlyratetf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Employee Number:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 11, -1, -1));

        jLabel2.setText("Last Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 39, -1, -1));

        jLabel3.setText("First Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 67, -1, -1));

        jLabel4.setText("Birthday:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 95, -1, -1));

        jLabel5.setText("Address:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 123, -1, -1));

        jLabel6.setText("Phone Number:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 151, -1, -1));

        jLabel7.setText("SSS Number:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 179, -1, -1));

        jLabel8.setText("Philhealth Number:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 207, -1, -1));

        jLabel9.setText("TIN Number:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 235, -1, -1));

        jLabel10.setText("PAGIBIG Number:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 263, -1, -1));

        jLabel11.setText("Status:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 291, -1, -1));

        jLabel12.setText("Position:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 319, -1, -1));

        jLabel13.setText("Immediate Supervisor:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 350, -1, -1));

        jLabel14.setText("Basic Salary:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 375, -1, -1));

        jLabel15.setText("Rice Subsidy:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 403, -1, -1));

        jLabel16.setText("Phone Allowance:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 431, -1, -1));

        jLabel17.setText("Clothing Allowance:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 459, -1, -1));

        jLabel18.setText("Semi-monthly Rate:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 487, -1, -1));

        jLabel19.setText("Hourly Rate:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 515, -1, -1));
        getContentPane().add(lastnametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 36, 387, -1));
        getContentPane().add(firstnametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 64, 387, -1));
        getContentPane().add(birthdaytf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 92, 387, -1));
        getContentPane().add(addresstf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 120, 387, -1));
        getContentPane().add(phonenumtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 148, 387, -1));
        getContentPane().add(sssnumtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 176, 387, -1));
        getContentPane().add(phnumtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 204, 387, -1));
        getContentPane().add(tinnumtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 232, 387, -1));
        getContentPane().add(pagibigtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 260, 387, -1));
        getContentPane().add(statustf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 288, 387, -1));
        getContentPane().add(positiontf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 316, 387, -1));
        getContentPane().add(supervisortf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 344, 387, -1));
        getContentPane().add(employeenumbertf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 8, 387, -1));
        getContentPane().add(basicsalarytf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 372, 387, -1));
        getContentPane().add(ricetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 400, 387, -1));
        getContentPane().add(phonetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 428, 387, -1));
        getContentPane().add(clothingtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 456, 387, -1));
        getContentPane().add(smratetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 484, 387, -1));
        getContentPane().add(hourlyratetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 512, 387, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEmployee(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 60, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Close");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 60, 30));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close
        dispose();
    }//GEN-LAST:event_close

    private void AddEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEmployee
        Employees employees = new Employees();
        
        String nonNumericPattern = "[^0-9]+";
        if (lastnametf.getText().matches(nonNumericPattern) && firstnametf.getText().matches(nonNumericPattern)) {

        employees.setemployeenum(employeenumbertf.getText());
        employees.setlastname(lastnametf.getText());
        employees.setfirstname(firstnametf.getText());
        employees.setbirthday(birthdaytf.getText());
        employees.setaddress(addresstf.getText());
        employees.setphonenum(phonenumtf.getText());
        employees.setsssnum(sssnumtf.getText());
        employees.setphnum(phnumtf.getText());
        employees.settin(tinnumtf.getText());
        employees.setpgbnum(pagibigtf.getText());
        employees.setstatus(statustf.getText());
        employees.setposition(positiontf.getText());
        employees.setsupervisor(supervisortf.getText());
        employees.setbasic(basicsalarytf.getText());
        employees.setriceall(ricetf.getText());
        employees.setphoneall(phonetf.getText());
        employees.setclotheall(clothingtf.getText());
        employees.setsmrate(smratetf.getText());
        employees.sethourlyrate(hourlyratetf.getText());

        String filename = "MotorPH Employee Data.csv";

        try {
            employees.AddEmployee(filename);

            employeenumbertf.setText("");
            firstnametf.setText("");
            lastnametf.setText("");
            birthdaytf.setText("");
            addresstf.setText("");
            phonenumtf.setText("");
            sssnumtf.setText("");
            phnumtf.setText("");
            tinnumtf.setText("");
            pagibigtf.setText("");
            statustf.setText("");
            positiontf.setText("");
            supervisortf.setText("");
            basicsalarytf.setText("");
            ricetf.setText("");
            phonetf.setText("");
            clothingtf.setText("");
            smratetf.setText("");
            hourlyratetf.setText("");

            JOptionPane.showMessageDialog(this, "Employee Record is saved.");

        } catch (IOException ex) {
            Logger.getLogger(AddEmployeeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        } else {
        // Show error message
        JOptionPane.showMessageDialog(this, "Error: Name fields must not contain numbers.");
        }
    }//GEN-LAST:event_AddEmployee

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
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeFrame().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstf;
    private javax.swing.JTextField basicsalarytf;
    private javax.swing.JTextField birthdaytf;
    private javax.swing.JTextField clothingtf;
    private javax.swing.JTextField employeenumbertf;
    private javax.swing.JTextField firstnametf;
    private javax.swing.JTextField hourlyratetf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnametf;
    private javax.swing.JTextField pagibigtf;
    private javax.swing.JTextField phnumtf;
    private javax.swing.JTextField phonenumtf;
    private javax.swing.JTextField phonetf;
    private javax.swing.JTextField positiontf;
    private javax.swing.JTextField ricetf;
    private javax.swing.JTextField smratetf;
    private javax.swing.JTextField sssnumtf;
    private javax.swing.JTextField statustf;
    private javax.swing.JTextField supervisortf;
    private javax.swing.JTextField tinnumtf;
    // End of variables declaration//GEN-END:variables
}
