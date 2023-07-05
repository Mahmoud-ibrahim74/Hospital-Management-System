/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author 7oda
 */
public class doctor_control extends javax.swing.JFrame {

    /**
     * Creates new form admin_control
     */
    public doctor_control() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        logout1 = new javax.swing.JButton();
        logout2 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        patient_det = new javax.swing.JButton();
        doctor_det = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Control");
        setMinimumSize(new java.awt.Dimension(1230, 650));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 177, 227));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                Hospital Management System");

        logout1.setBackground(new java.awt.Color(255, 255, 255));
        logout1.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini.png"))); // NOI18N
        logout1.setToolTipText("Minimize");
        logout1.setBorder(null);
        logout1.setContentAreaFilled(false);
        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout1MouseExited(evt);
            }
        });
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        logout2.setBackground(new java.awt.Color(255, 255, 255));
        logout2.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        logout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        logout2.setToolTipText("Exit Program");
        logout2.setBorder(null);
        logout2.setContentAreaFilled(false);
        logout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout2MouseExited(evt);
            }
        });
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1260, 100);

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 102, 255));
        logout.setText("LOGOUT");
        logout.setBorder(null);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(250, 470, 150, 47);

        patient_det.setBackground(new java.awt.Color(255, 255, 255));
        patient_det.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        patient_det.setForeground(new java.awt.Color(0, 102, 255));
        patient_det.setText("PATIENT DETAILS");
        patient_det.setBorder(null);
        patient_det.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patient_det.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patient_detMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patient_detMouseExited(evt);
            }
        });
        patient_det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_detActionPerformed(evt);
            }
        });
        getContentPane().add(patient_det);
        patient_det.setBounds(170, 360, 300, 60);

        doctor_det.setBackground(new java.awt.Color(255, 255, 255));
        doctor_det.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        doctor_det.setForeground(new java.awt.Color(0, 102, 255));
        doctor_det.setText("APPOINTMENT");
        doctor_det.setBorder(null);
        doctor_det.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctor_det.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doctor_detMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doctor_detMouseExited(evt);
            }
        });
        doctor_det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_detActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_det);
        doctor_det.setBounds(170, 250, 300, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/drback.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.hide();
        new HMS().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(new Color(0, 102, 255));
        logout.setForeground(Color.WHITE);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        logout.setBackground(Color.WHITE);
        logout.setForeground(new Color(0, 102, 255));


    }//GEN-LAST:event_logoutMouseExited

    private void logout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1MouseEntered

    private void logout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1MouseExited

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_logout1ActionPerformed

    private void logout2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logout2MouseEntered

    private void logout2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logout2MouseExited

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logout2ActionPerformed

    private void patient_detMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patient_detMouseEntered
        patient_det.setBackground(new Color(0, 102, 255));
        patient_det.setForeground(Color.WHITE);
    }//GEN-LAST:event_patient_detMouseEntered

    private void patient_detMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patient_detMouseExited
        patient_det.setBackground(Color.WHITE);
        patient_det.setForeground(new Color(0, 102, 255));
    }//GEN-LAST:event_patient_detMouseExited

    private void doctor_detMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctor_detMouseEntered
        doctor_det.setBackground(new Color(0, 102, 255));
        doctor_det.setForeground(Color.WHITE);
    }//GEN-LAST:event_doctor_detMouseEntered

    private void doctor_detMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctor_detMouseExited
        doctor_det.setBackground(Color.WHITE);
        doctor_det.setForeground(new Color(0, 102, 255));
    }//GEN-LAST:event_doctor_detMouseExited

    private void patient_detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_detActionPerformed
        this.hide();
        new patient_portal().setVisible(true);
    }//GEN-LAST:event_patient_detActionPerformed

    private void doctor_detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_detActionPerformed
        this.hide();
        new view_appointment2().setVisible(true);
    }//GEN-LAST:event_doctor_detActionPerformed

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
            java.util.logging.Logger.getLogger(doctor_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor_control().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doctor_det;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout1;
    private javax.swing.JButton logout2;
    private javax.swing.JButton patient_det;
    // End of variables declaration//GEN-END:variables
}