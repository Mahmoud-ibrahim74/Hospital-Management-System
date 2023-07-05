/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import static java.lang.System.in;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author 7oda
 */
public class view_doctor2 extends javax.swing.JFrame {

    String s;

    public view_doctor2() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        table.setShowGrid(true);
        table.getTableHeader().setReorderingAllowed(false);
        search_id.hide();
        // panel2.setBackground(new Color(100, 255, 255, 150)); // to Opacity Jpanel 2
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        logout = new javax.swing.JButton();
        home = new javax.swing.JButton();
        txt = new javax.swing.JLabel();
        logout3 = new javax.swing.JButton();
        display_data = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search_id = new javax.swing.JTextField();
        display = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Patient");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1230, 700));
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(109, 73, 243));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setLayout(null);

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        logout.setToolTipText("Exit Program");
        logout.setBorder(null);
        logout.setContentAreaFilled(false);
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
        kGradientPanel1.add(logout);
        logout.setBounds(1190, 10, 40, 30);

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hou.png"))); // NOI18N
        home.setToolTipText("Back to Home");
        home.setBorder(null);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        kGradientPanel1.add(home);
        home.setBounds(1060, 10, 40, 30);

        txt.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setText("  View Doctor");
        kGradientPanel1.add(txt);
        txt.setBounds(0, 0, 290, 60);

        logout3.setBackground(new java.awt.Color(255, 255, 255));
        logout3.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        logout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mini.png"))); // NOI18N
        logout3.setToolTipText("Minimize");
        logout3.setBorder(null);
        logout3.setContentAreaFilled(false);
        logout3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout3MouseExited(evt);
            }
        });
        logout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(logout3);
        logout3.setBounds(1151, 11, 30, 30);

        display_data.setBackground(new java.awt.Color(255, 255, 255));
        display_data.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        display_data.setText("Display Data");
        display_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                display_dataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                display_dataMouseExited(evt);
            }
        });
        display_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_dataActionPerformed(evt);
            }
        });
        kGradientPanel1.add(display_data);
        display_data.setBounds(50, 420, 160, 50);

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "department", "first name", "last name", "age", "blood", "gender", "email", "address", "city", "Join Date", "leave Date", "username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(29);
        table.setSelectionBackground(new java.awt.Color(109, 73, 243));
        table.setSelectionForeground(new java.awt.Color(232, 231, 231));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 1210, 290);

        search_id.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        search_id.setToolTipText("");
        search_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_idActionPerformed(evt);
            }
        });
        search_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_idKeyReleased(evt);
            }
        });
        kGradientPanel1.add(search_id);
        search_id.setBounds(120, 560, 240, 50);

        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(display);
        display.setBounds(850, 390, 360, 290);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ser.gif"))); // NOI18N
        jLabel3.setToolTipText("Search in Doctor");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(60, 560, 50, 50);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(60, 530, 100, 30);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1240, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:


    }//GEN-LAST:event_logoutMouseExited

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logoutActionPerformed

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        home.setBackground(Color.YELLOW);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
        home.setBackground(Color.WHITE);
    }//GEN-LAST:event_homeMouseExited

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.hide();
        new reception_control().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed


    private void logout3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logout3MouseEntered

    private void logout3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logout3MouseExited

    private void logout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout3ActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_logout3ActionPerformed

    private void display_dataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_dataMouseEntered
        // TODO add your handling code here:
        display_data.setBackground(new Color(109, 73, 243));
        display_data.setForeground(Color.WHITE);

    }//GEN-LAST:event_display_dataMouseEntered

    private void display_dataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_dataMouseExited
        // TODO add your handling code here:
        display_data.setBackground(Color.WHITE);
        display_data.setForeground(Color.BLACK);


    }//GEN-LAST:event_display_dataMouseExited

    private void display_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_dataActionPerformed
        // TODO add your handling code here:

        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "");
            String sqlStmt = "SELECT `id`, `department`, `fname`, `lname`, `age`, `blood`, `gender`, `phone`, `email`, `address`, `city`, `days`, `joinDate`, `leaveDate`, `username` FROM `doctor` ";
            PreparedStatement stmt = con.prepareStatement(sqlStmt);
            ResultSet rs = stmt.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs)); // to show data from db to jtable by (rs2xml) jar

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_display_dataActionPerformed

    private void search_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_idActionPerformed

    private void search_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_idKeyReleased
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        String search = search_id.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_search_idKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        search_id.show();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        search_id.hide();

        search_id.setText("");

    }//GEN-LAST:event_jLabel3MouseReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int select = -1;  // if user doesn't select any row
        select = table.getSelectedRow();  // get number of selected row

        if (select >= 0) {
            try {
                String id = table.getValueAt(select, 0).toString(); // get id from jtable
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "");
                String sqlStmt = "SELECT `image` FROM `doctor` WHERE id = '" + id + "'";
                PreparedStatement stmt = con.prepareStatement(sqlStmt);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    BufferedImage im = ImageIO.read(rs.getBinaryStream("image")); // to to retrieve image from database  in jlabel
                    display.setIcon(new ImageIcon(im));
                } else {
                    Toolkit.getDefaultToolkit().beep();   // alert
                    JOptionPane.showMessageDialog(this, "No photo to show it !!", "Failure", JOptionPane.ERROR_MESSAGE);

                }

            } catch (SQLException ex) {
                Toolkit.getDefaultToolkit().beep();   // alert
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);

            } catch (IOException e) {
                Toolkit.getDefaultToolkit().beep();   // alert
                JOptionPane.showMessageDialog(this, e.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Toolkit.getDefaultToolkit().beep();   // alert
            JOptionPane.showMessageDialog(this, "Please Select Row !!", "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(view_doctor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_doctor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_doctor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_doctor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_doctor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel display;
    private javax.swing.JButton display_data;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout3;
    private javax.swing.JTextField search_id;
    private javax.swing.JTable table;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
