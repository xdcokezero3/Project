/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pullandentalclinic;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;


/**
 *
 * @author Rebecca
 */
public class Appointments extends javax.swing.JFrame {

    /**
     * Creates new form Appointments
     */
    public Appointments() {
        initComponents();
        GetPatients();
        displayAppointment();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        appdate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        appTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        apppatient = new javax.swing.JComboBox<>();
        appsave = new javax.swing.JButton();
        appedit = new javax.swing.JButton();
        appdelete = new javax.swing.JButton();
        appointmentreport = new javax.swing.JButton();
        patname2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        apptime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Appointments");

        jLabel7.setText("Date");

        appdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appdateMouseClicked(evt);
            }
        });

        appTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appTable);

        jLabel13.setText("Time");

        jLabel14.setText("Patient");

        appsave.setText("Save");
        appsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appsaveMouseClicked(evt);
            }
        });
        appsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appsaveActionPerformed(evt);
            }
        });

        appedit.setText("Edit");
        appedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appeditMouseClicked(evt);
            }
        });

        appdelete.setText("Delete");
        appdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appdeleteMouseClicked(evt);
            }
        });

        appointmentreport.setText("Generate Report");
        appointmentreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentreportMouseClicked(evt);
            }
        });

        patname2.setFocusable(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel17.setText("ID");

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });

        apptime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apptimeKeyTyped(evt);
            }
        });

        jButton1.setText("Reschedule ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(appsave)
                                        .addGap(12, 12, 12)
                                        .addComponent(appedit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(appdelete)
                                        .addGap(273, 273, 273)
                                        .addComponent(appointmentreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17)
                                                    .addComponent(patname2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(apppatient, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(appdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(apptime, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton1))))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apppatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apptime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGap(17, 17, 17)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appsave)
                    .addComponent(appedit)
                    .addComponent(appdelete)
                    .addComponent(appointmentreport))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patients");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Appointments");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Staff");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Inventory");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dashboard");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Procedures");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Logout");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15)
                            .addComponent(jLabel20)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel8)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addGap(20, 20, 20)
                .addComponent(jLabel20)
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection Con = null;
    Statement St = null,St1=null;
    ResultSet Rs = null,Rs1=null;
    
private void GetPatients() {
    try {
        Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
        Statement St = Con.createStatement();
        ResultSet Rs = St.executeQuery("SELECT patname FROM patients");

        while (Rs.next()) {
            String MyPat = Rs.getString("patname");
            apppatient.addItem(MyPat);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
    }
}


    
    private void appsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appsaveActionPerformed

    }//GEN-LAST:event_appsaveActionPerformed

    private void appsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appsaveMouseClicked
    Date selectedDate = appdate.getDate();
    if (selectedDate == null) {
        JOptionPane.showMessageDialog(this, "Please select a date.");
        return;
    }
    if (!isValidDate(selectedDate)) {
        JOptionPane.showMessageDialog(this, "Selected date is in the past. Please select a valid date.");
        return;
    }

    if (apppatient.getSelectedItem() == null || appdate.getDate() == null || apptime.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing Information");
    } else {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String password = "root";

            Connection Con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = Con.createStatement();

            // Check for double booking
            String checkQuery = "SELECT COUNT(*) FROM appointment WHERE appdate = ? AND apptime = ?";
            PreparedStatement checkStmt = Con.prepareStatement(checkQuery);
            checkStmt.setDate(1, new java.sql.Date(appdate.getDate().getTime()));
            checkStmt.setString(2, apptime.getText());
            ResultSet checkRs = checkStmt.executeQuery();
            if (checkRs.next() && checkRs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "This date and time slot is already booked. Please select a different time.");
                Con.close();
                return;
            }

            // Get the highest appid from the database and increment it
            ResultSet rs = stmt.executeQuery("SELECT MAX(appid) FROM appointment");
            int nextappId = 1;
            if (rs.next()) {
                nextappId = rs.getInt(1) + 1;
            }

            String query = "INSERT INTO appointment (appid, apppatient, appdate, apptime) VALUES (?, ?, ?, ?)";
            PreparedStatement add = Con.prepareStatement(query);
            add.setInt(1, nextappId);
            add.setString(2, apppatient.getSelectedItem().toString());
            add.setDate(3, new java.sql.Date(appdate.getDate().getTime()));
            add.setString(4, apptime.getText());

            add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Appointment added successfully");
            Con.close();
            displayAppointment();

            // Clear the fields after successful insertion
            appdate.setDate(null);
            apppatient.setSelectedIndex(0);
            apptime.setText("");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_appsaveMouseClicked

    private void appTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTableMouseClicked
        int selectedRow = appTable.getSelectedRow();
        if (selectedRow != -1) { // Ensure a row is selected
            TableModel model = appTable.getModel();

        // Populate the text fields with data from the selected row
            String patient = model.getValueAt(selectedRow, 1).toString();
            apppatient.setSelectedItem(patient);
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date date = dateFormat.parse(model.getValueAt(selectedRow, 2).toString());
                appdate.setDate(date);
            } catch (Exception e) {
                e.printStackTrace();
            
            
            }

            apptime.setText(model.getValueAt(selectedRow, 3).toString());
    }
            
    }//GEN-LAST:event_appTableMouseClicked

    private void appdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appdeleteMouseClicked
                                     
                                     
        int selectedRow = appTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an appointment to delete.");
    } else {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String password = "root";

            Connection Con = DriverManager.getConnection(dbUrl, username, password);
            int appid = (int) appTable.getValueAt(selectedRow, 0);

            String query = "DELETE FROM appointment WHERE appid = ?";
            PreparedStatement delete = Con.prepareStatement(query);
            delete.setInt(1, appid);

            delete.executeUpdate();
            JOptionPane.showMessageDialog(this, "Appointment deleted successfully");
            Con.close();
            displayAppointment();
        } catch (HeadlessException | SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_appdeleteMouseClicked

    private void appeditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appeditMouseClicked
                                    
    Date selectedDate = appdate.getDate();
    if (selectedDate == null) {
        JOptionPane.showMessageDialog(this, "Please select a date.");
        return;
    }
    if (!isValidDate(selectedDate)) {
        JOptionPane.showMessageDialog(this, "Selected date is in the past. Please select a valid date.");
        return;
    }
                                                                
    int selectedRow = appTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an appointment to edit.");
    } else {
        try {
            // Populate the form fields with the selected patient data
            int appid = Integer.parseInt(appTable.getValueAt(selectedRow, 0).toString());

            int response = JOptionPane.showConfirmDialog(this, "Do you want to save changes?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                // Update the patient record in the database
                Class.forName("com.mysql.cj.jdbc.Driver");
                String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String username = "root";
                String password = "root";

                Connection Con = DriverManager.getConnection(dbUrl, username, password);
                String query = "UPDATE appointment SET apppatient = ?, appdate = ?, apptime = ? WHERE appid = ?";
                PreparedStatement update = Con.prepareStatement(query);
                update.setString(1, apppatient.getSelectedItem().toString());
                update.setDate(2, new java.sql.Date(appdate.getDate().getTime()));
                update.setString(3, apptime.getText());
                update.setInt(4, appid);

                update.executeUpdate();
                JOptionPane.showMessageDialog(this, "Appointment updated successfully");
                Con.close();
                displayAppointment();

                // Clear the fields after successful update
                apppatient.setSelectedIndex(0);
                appdate.setDate(null);
                apptime.setText("");
            }
        } catch (HeadlessException | SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }        // TODO add your handling code here:     // TODO add your handling code here:
    }//GEN-LAST:event_appeditMouseClicked

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
String searchText = searchField.getText().trim();
if (!searchText.isEmpty()) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "root";

        Connection Con = DriverManager.getConnection(dbUrl, username, password);
        String query = "SELECT LPAD(CAST(appid AS CHAR), 3, '0') AS formatted_appid, apppatient, appdate, apptime " +
                       "FROM appointment " +
                       "WHERE apppatient LIKE ? " +
                       "   OR CAST(appid AS CHAR) LIKE ? " +
                       "   OR DATE_FORMAT(appdate, '%Y-%m-%d') LIKE ?";
        PreparedStatement searchStmt = Con.prepareStatement(query);
        searchStmt.setString(1, "%" + searchText + "%");
        searchStmt.setString(2, "%" + searchText + "%");
        searchStmt.setString(3, "%" + searchText + "%");

        ResultSet Rs = searchStmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) appTable.getModel();
        model.setRowCount(0);

        while (Rs.next()) {
            model.addRow(new Object[]{
                Rs.getString("formatted_appid"),
                Rs.getString("apppatient"),
                Rs.getDate("appdate"),
                Rs.getString("apptime")
            });
        }
        Con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
} else {
    // If search text is empty, display all appointments
    displayAppointment();
}
    }//GEN-LAST:event_searchFieldKeyTyped

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Patients().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Appointments().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Staff().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        new Reports().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
    new Inventory().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void appdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appdateMouseClicked
    
    }//GEN-LAST:event_appdateMouseClicked

    private void appointmentreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentreportMouseClicked
    AppointmentsReportGenerator.generateAppointmentReport();
    }//GEN-LAST:event_appointmentreportMouseClicked

    private void apptimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apptimeKeyTyped
    JTextField textField = (JTextField) evt.getSource();
    char keyChar = evt.getKeyChar();
    String currentText = textField.getText();

    // Allow backspace and delete
    if (keyChar == KeyEvent.VK_BACK_SPACE || keyChar == KeyEvent.VK_DELETE) {
        return;
    }

    // Combine current text with the new character
    String newText = currentText + keyChar;

    // Regular expression for partial input of time in format 8:00AM, 11:35PM
    String partialTimePattern = "^(1[0-2]|0?[1-9])?:?([0-5]?[0-9])?(A|P|AM|PM)?$";

    if (!newText.matches(partialTimePattern)) {
        evt.consume(); // Ignore the input if it doesn't match the partial pattern
    }
    }//GEN-LAST:event_apptimeKeyTyped

    
    
    
    public class AppointmentsReportGenerator {

    public static void generateAppointmentReport() {
        String jrxmlFilePath = "C:\\Users\\Rebecca\\JaspersoftWorkspace\\MyReports\\appointments_report.jrxml";
        String outputPdfPath = "C:\\Users\\Rebecca\\Desktop\\Output\\appointments_report.pdf";

        Map<String, Object> parameters = new HashMap<>();
        // Add any parameters you need to pass to the report here

        JasperReportUtil.generateReport(jrxmlFilePath, outputPdfPath, parameters);
    }
}
    
    private void displayAppointment() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "root";

        Connection Con = DriverManager.getConnection(dbUrl, username, password);
        String query = "SELECT LPAD(CAST(IFNULL(MAX(CAST(appid AS SIGNED)), 0) + 1 AS CHAR), 3, '0') AS next_id FROM appointment";
        PreparedStatement St = Con.prepareStatement(query);
        ResultSet Rs = St.executeQuery();

        String nextId = "";
        if (Rs.next()) {
            nextId = Rs.getString("next_id");
        }

        // Set the next ID in the patname2 text field
        patname2.setText(nextId);

        query = "SELECT LPAD(CAST(appid AS CHAR), 3, '0') AS formatted_appid, apppatient, appdate, apptime FROM appointment";
        St = Con.prepareStatement(query);
        Rs = St.executeQuery();
        DefaultTableModel model = (DefaultTableModel) appTable.getModel();
        model.setRowCount(0);

        while (Rs.next()) {
            model.addRow(new Object[]{
                Rs.getString("formatted_appid"),
                Rs.getString("apppatient"),
                Rs.getDate("appdate"),
                Rs.getString("apptime")
            });
        }
        Con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
    }
}
    
    private boolean isValidDate(Date date) {
    LocalDate selectedLocalDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate currentDate = LocalDate.now();
    return !selectedLocalDate.isBefore(currentDate);
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
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Appointments().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appTable;
    private com.toedter.calendar.JDateChooser appdate;
    private javax.swing.JButton appdelete;
    private javax.swing.JButton appedit;
    private javax.swing.JButton appointmentreport;
    private javax.swing.JComboBox<String> apppatient;
    private javax.swing.JButton appsave;
    private javax.swing.JTextField apptime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patname2;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
