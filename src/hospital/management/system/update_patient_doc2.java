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
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author 7oda
 */
public class update_patient_doc2 extends javax.swing.JFrame {

    String s;

    public update_patient_doc2() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

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
        panel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        join = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        bed = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        disease = new javax.swing.JComboBox<>();
        view_data = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        blood = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        logout3 = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        medicine = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        dialy = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ref = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        dose = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        se = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        company = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD Patient");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1230, 700));
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 176, 216));
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

        panel2.setBackground(new java.awt.Color(92, 211, 184));
        panel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        panel2.add(jLabel4);
        jLabel4.setBounds(10, 130, 95, 40);

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel2.add(id);
        id.setBounds(230, 20, 120, 50);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Patient ID");
        panel2.add(jLabel5);
        jLabel5.setBounds(50, 20, 180, 40);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Second Name");
        panel2.add(jLabel6);
        jLabel6.setBounds(370, 130, 130, 40);

        lname.setEditable(false);
        lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel2.add(lname);
        lname.setBounds(520, 130, 210, 40);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Age");
        panel2.add(jLabel10);
        jLabel10.setBounds(10, 210, 50, 40);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Blood Group");
        panel2.add(jLabel7);
        jLabel7.setBounds(370, 210, 120, 40);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Joining Date");
        panel2.add(jLabel18);
        jLabel18.setBounds(370, 270, 120, 40);

        join.setEditable(false);
        join.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel2.add(join);
        join.setBounds(520, 270, 210, 34);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");
        panel2.add(jLabel12);
        jLabel12.setBounds(10, 270, 80, 40);

        age.setEditable(false);
        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel2.add(age);
        age.setBounds(130, 210, 160, 34);

        fname.setEditable(false);
        fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel2.add(fname);
        fname.setBounds(130, 130, 160, 40);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Address");
        panel2.add(jLabel14);
        jLabel14.setBounds(10, 320, 90, 50);

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel2.add(address);
        address.setBounds(130, 330, 600, 34);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bed No.");
        panel2.add(jLabel15);
        jLabel15.setBounds(380, 470, 120, 40);

        phone.setEditable(false);
        phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panel2.add(phone);
        phone.setBounds(130, 400, 160, 34);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone No");
        panel2.add(jLabel16);
        jLabel16.setBounds(10, 390, 90, 40);

        days.setEditable(false);
        days.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        days.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daysMouseClicked(evt);
            }
        });
        panel2.add(days);
        days.setBounds(130, 470, 160, 34);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Days");
        panel2.add(jLabel17);
        jLabel17.setBounds(10, 460, 90, 40);

        bed.setBackground(new java.awt.Color(153, 255, 153));
        bed.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bed", "01-Gatch Beds", "02-Electric Beds", "03-Low Beds.", "04-Air fluidized beds . ", "05-Air Loss Mattresses.", "06-ICU Bed.", "07-Semi- Fowler Bed.", "08-Plain Bed." }));
        bed.setFocusable(false);
        bed.setOpaque(false);
        panel2.add(bed);
        bed.setBounds(520, 470, 210, 40);

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Disease Type");
        panel2.add(jLabel19);
        jLabel19.setBounds(370, 390, 120, 40);

        disease.setBackground(new java.awt.Color(153, 255, 153));
        disease.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        disease.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Disease", "Gastritis", "Gastric ulcer/Peptic ulcer.", "Cholecystitis", "Gall stones", "Intestinal Colic", "Renal failure", "Hepato cellular failure.", "Epidemic Hepatitis", "Gastroenteritis", "Appendicitis", "Liver Cirrhosis", "Diarrhea" }));
        disease.setFocusable(false);
        disease.setOpaque(false);
        panel2.add(disease);
        disease.setBounds(520, 390, 210, 40);

        view_data.setBackground(new java.awt.Color(255, 255, 255));
        view_data.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        view_data.setText("View Patient");
        view_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                view_dataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                view_dataMouseExited(evt);
            }
        });
        view_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_dataActionPerformed(evt);
            }
        });
        panel2.add(view_data);
        view_data.setBounds(520, 30, 200, 50);

        gender.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "male", "female" }));
        panel2.add(gender);
        gender.setBounds(130, 270, 160, 40);

        blood.setBackground(new java.awt.Color(153, 255, 153));
        blood.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Blood", "A+", "A-", "B+", "B-", "O+", "O-" }));
        blood.setFocusable(false);
        blood.setOpaque(false);
        panel2.add(blood);
        blood.setBounds(520, 210, 210, 40);

        kGradientPanel1.add(panel2);
        panel2.setBounds(20, 160, 740, 530);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/patientdetals.png"))); // NOI18N
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 150, 130);

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

        txt1.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText(" Update Patient");
        kGradientPanel1.add(txt1);
        txt1.setBounds(440, 20, 290, 60);

        txt2.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("MEDICINE DISCRIPTION");
        kGradientPanel1.add(txt2);
        txt2.setBounds(790, 100, 420, 60);

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 204));
        jLabel20.setText("Company");
        kGradientPanel1.add(jLabel20);
        jLabel20.setBounds(800, 570, 100, 24);

        medicine.setBackground(new java.awt.Color(153, 255, 153));
        medicine.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        medicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Medicine", " Povidone iodine", " Chloroxylenol", " Glutaral", " Amiloride", " Furosemide", " Hydrochlorothiazide", " Mannitol", " Spironolactone", " Aluminium hydroxide", " Ranitidine", " Magnesium hydroxide", " Metoclopramide", " Promethazine", " Hydrocortisone ", " Sulfasalazine" }));
        medicine.setFocusable(false);
        medicine.setOpaque(false);
        kGradientPanel1.add(medicine);
        medicine.setBounds(980, 200, 210, 40);

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 204));
        jLabel21.setText("Name Of Tablet");
        kGradientPanel1.add(jLabel21);
        jLabel21.setBounds(810, 210, 127, 24);

        dialy.setEditable(false);
        dialy.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kGradientPanel1.add(dialy);
        dialy.setBounds(980, 350, 210, 30);

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 204));
        jLabel22.setText("REF #");
        kGradientPanel1.add(jLabel22);
        jLabel22.setBounds(810, 280, 51, 24);

        ref.setEditable(false);
        ref.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kGradientPanel1.add(ref);
        ref.setBounds(980, 280, 210, 30);

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 204));
        jLabel23.setText("Dialy Dose");
        kGradientPanel1.add(jLabel23);
        jLabel23.setBounds(810, 350, 100, 24);

        dose.setEditable(false);
        dose.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kGradientPanel1.add(dose);
        dose.setBounds(980, 410, 210, 30);

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 204));
        jLabel24.setText("Dose(mg)");
        kGradientPanel1.add(jLabel24);
        jLabel24.setBounds(810, 410, 100, 24);

        se.setEditable(false);
        se.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        kGradientPanel1.add(se);
        se.setBounds(980, 510, 210, 30);

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 204));
        jLabel25.setText("Possible SlideEffects");
        kGradientPanel1.add(jLabel25);
        jLabel25.setBounds(800, 510, 170, 24);

        company.setEditable(false);
        company.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        kGradientPanel1.add(company);
        company.setBounds(980, 570, 210, 30);

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
        new doctor_control().setVisible(true);
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

    private void view_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_dataActionPerformed

        String getID = id.getText();

        if (getID.isEmpty()) {
            Toolkit.getDefaultToolkit().beep();   // alert
            JOptionPane.showMessageDialog(this, "Please Insert your ID !!", "Failure", JOptionPane.ERROR_MESSAGE);

        } else {

            try {

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "");
                String sqlStmt = "SELECT `id`, `fname`, `lname`, `age`, `blood`, `gender`, `joinDate`, `address`, `phone`, `disease`, `days`, `BedNO`, `Name_of_tablet`, `ref`, `dialy_dos`, `dosMG`, `Slide_Effect`, `Company` FROM `patient_for_doctor`  WHERE id = " + getID + "";
                PreparedStatement stmt = con.prepareStatement(sqlStmt);

                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {

                    JOptionPane.showMessageDialog(this, "Your Id : " + getID + " is found Poress Ok to show data");
                    fname.setText(rs.getString("fname"));
                    lname.setText(rs.getString("lname"));
                    age.setText(rs.getString("age"));
                    blood.setSelectedItem(rs.getString("blood"));
                    gender.setSelectedItem(rs.getString("gender"));
                    phone.setText(rs.getString("phone"));
                    disease.setSelectedItem(rs.getString("disease"));
                    address.setText(rs.getString("address"));
                    bed.setSelectedItem(rs.getString("BedNO"));
                    days.setText(rs.getString("days"));
                    join.setText(rs.getString("joinDate"));
                    medicine.setSelectedItem(rs.getString("Name_of_tablet"));
                    ref.setText(rs.getString("ref"));
                    dialy.setText(rs.getString("dialy_dos"));
                    dose.setText(rs.getString("dosMG"));
                    se.setText(rs.getString("Slide_Effect"));
                    company.setText(rs.getString("Company"));
                } else {
                    Toolkit.getDefaultToolkit().beep();   // alert
                    JOptionPane.showMessageDialog(this, "Your Id : " + getID + "  isn't  found !", "Failure", JOptionPane.ERROR_MESSAGE);

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_view_dataActionPerformed

    private void view_dataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dataMouseExited
        // TODO add your handling code here:
        view_data.setBackground(Color.WHITE);
    }//GEN-LAST:event_view_dataMouseExited

    private void view_dataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_dataMouseEntered

        view_data.setBackground(new Color(153, 255, 153));

    }//GEN-LAST:event_view_dataMouseEntered

    private void daysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daysMouseClicked

        String getJoin = join.getText();
        try {
            java.util.Date date = new java.util.Date();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String dat = format.format(date);

            java.util.Date pcDate = format.parse(dat);
            java.util.Date joindate = format.parse(getJoin);
            if (joindate.after(pcDate)) {

                Toolkit.getDefaultToolkit().beep();   // alert
                JOptionPane.showMessageDialog(this, "please Fill out 'Join Date' less than Current Date", "Failure", JOptionPane.ERROR_MESSAGE);
            } else {
                long diffSocond = Math.abs(pcDate.getTime() - joindate.getTime());  // diffrence with tow dates  with millisecond
                long diffDays = TimeUnit.DAYS.convert(diffSocond, TimeUnit.MILLISECONDS);   // result with days
                days.setText(Long.toString(diffDays));
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_daysMouseClicked

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyActionPerformed
    public void resetData() {
        id.setText("");
        blood.setSelectedItem("Select Blood");
        bed.setSelectedItem("Select Bed");
        disease.setSelectedItem("Select Disease");
        fname.setText("");
        lname.setText("");
        age.setText("");
        gender.setSelectedItem("Select");
        phone.setText("");
        address.setText("");
        days.setText("");
        join.setText("");
        medicine.setSelectedItem("Select Medicine");
        ref.setText("");
        dialy.setText("");
        dose.setText("");
        se.setText("");
        company.setText("");

    }

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
            java.util.logging.Logger.getLogger(update_patient_doc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_patient_doc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_patient_doc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_patient_doc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new update_patient_doc2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> bed;
    private javax.swing.JComboBox<String> blood;
    private javax.swing.JTextField company;
    private javax.swing.JTextField days;
    private javax.swing.JTextField dialy;
    private javax.swing.JComboBox<String> disease;
    private javax.swing.JTextField dose;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton home;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField join;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout3;
    private javax.swing.JComboBox<String> medicine;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField ref;
    private javax.swing.JTextField se;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JButton view_data;
    // End of variables declaration//GEN-END:variables
}