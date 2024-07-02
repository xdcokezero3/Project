/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pullandentalclinic;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Rebecca
 */
public class Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Inventory() {
        initComponents();
        displayInventory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        invname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        invdoe = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        invremarks = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invTable = new javax.swing.JTable();
        invsave = new javax.swing.JButton();
        invedit = new javax.swing.JButton();
        invdelete = new javax.swing.JButton();
        invquantity = new javax.swing.JSpinner();
        invtype = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        reportsedit1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        patname4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Inventory");

        jLabel6.setText("Item Name");

        invname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invnameActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantity");

        jLabel7.setText("Expiration Date");

        jLabel10.setText("Category or Type");

        invremarks.setText("None");
        invremarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invremarksActionPerformed(evt);
            }
        });

        jLabel11.setText("Remarks");

        invTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Quantity", "Expiration Date", "Classification", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        invTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(invTable);

        invsave.setText("Save");
        invsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invsaveMouseClicked(evt);
            }
        });
        invsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invsaveActionPerformed(evt);
            }
        });

        invedit.setText("Edit");
        invedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inveditMouseClicked(evt);
            }
        });

        invdelete.setText("Delete");
        invdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invdeleteMouseClicked(evt);
            }
        });

        invtype.setText("None");
        invtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invtypeActionPerformed(evt);
            }
        });

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });

        reportsedit1.setText("Generate Report");
        reportsedit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsedit1MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel17.setText("ID");

        patname4.setFocusable(false);
        patname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patname4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(invquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invname, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patname4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(invdoe, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(invtype, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(invremarks, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(invsave)
                            .addGap(12, 12, 12)
                            .addComponent(invedit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(invdelete)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reportsedit1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invremarks, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(invdoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(24, 24, 24)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportsedit1)
                    .addComponent(invsave)
                    .addComponent(invedit)
                    .addComponent(invdelete))
                .addContainerGap(15, Short.MAX_VALUE))
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

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dashboard");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
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
                            .addComponent(jLabel13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel13)
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void invtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invtypeActionPerformed

    private void invdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invdeleteMouseClicked

        int selectedRow = invTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an item to delete.");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String username = "root";
                String password = "root";

                Connection Con = DriverManager.getConnection(dbUrl, username, password);
                int invid = (int) invTable.getValueAt(selectedRow, 0);

                String query = "DELETE FROM inventory WHERE invid = ?";
                PreparedStatement delete = Con.prepareStatement(query);
                delete.setInt(1, invid);

                delete.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item deleted successfully");
                Con.close();
                displayInventory();
            } catch (HeadlessException | SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_invdeleteMouseClicked

    private void inveditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inveditMouseClicked
        int selectedRow = invTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an item to edit.");
    } else {
        if (invname.getText().isEmpty() || invquantity.getValue() == null || invdoe.getDate() == null || invtype.getText().isEmpty() || invremarks.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String username = "root";
                String password = "root";

                Connection Con = DriverManager.getConnection(dbUrl, username, password);

                // Assuming there is a way to get the ID of the item being edited
                int invid = Integer.parseInt(invTable.getValueAt(selectedRow, 0).toString()); // Assuming ID is in the first column

                // Prepare the SQL query for updating
                String query = "UPDATE inventory SET invname = ?, invquantity = ?, invdoe = ?, invtype = ?, invremarks = ? WHERE invid = ?";
                PreparedStatement update = Con.prepareStatement(query);
                update.setString(1, invname.getText());
                update.setInt(2, (Integer) invquantity.getValue());
                update.setDate(3, new java.sql.Date(invdoe.getDate().getTime()));
                update.setString(4, invtype.getText());
                update.setString(5, invremarks.getText());
                update.setInt(6, invid);

                // Execute the update query
                int rowsUpdated = update.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Inventory updated successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Inventory not found");
                }

                // Close connection
                Con.close();
                displayInventory();

                // Clear the fields after successful update
                invname.setText("");
                invquantity.setValue(0);
                invdoe.setDate(null);
                invtype.setText("");
                invremarks.setText("None");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_inveditMouseClicked

    private void invsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invsaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invsaveActionPerformed

    private void invsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invsaveMouseClicked
        if (invname.getText().isEmpty() || invquantity.getValue() == null || invdoe.getDate() == null || invtype.getText().isEmpty() || invremarks.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String username = "root";
                String password = "root";

                Connection Con = DriverManager.getConnection(dbUrl, username, password);

                // Retrieve the next available invid
                Statement stmt = Con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(invid) FROM inventory");
                int nextinvid = 1;
                if (rs.next()) {
                    nextinvid = rs.getInt(1) + 1;
                }

                // Prepare the SQL query for insertion
                String query = "INSERT INTO inventory (invid, invname, invquantity, invdoe, invtype, invremarks) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement add = Con.prepareStatement(query);
                add.setInt(1, nextinvid);
                add.setString(2, invname.getText());
                add.setInt(3, (Integer) invquantity.getValue()); // Cast to Integer because invquantity is a JSpinner with SpinnerNumberModel
                add.setDate(4, new java.sql.Date(invdoe.getDate().getTime())); // Corrected index to 4 for invdoe
                add.setString(5, invtype.getText());
                add.setString(6, invremarks.getText());

                // Execute the insertion query
                add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Inventory added successfully");

                // Close connection
                Con.close();
                displayInventory();

                // Clear the fields after successful insertion
                invname.setText("");
                invquantity.setValue(0); // Assuming 0 as a default value for quantity after insertion
                invdoe.setDate(null);
                invtype.setText("");
                invremarks.setText("None");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_invsaveMouseClicked

    private void invTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invTableMouseClicked

        int selectedRow = invTable.getSelectedRow();
        if (selectedRow != -1) { // Ensure a row is selected
            TableModel model = invTable.getModel();

            // Populate the text fields with data from the selected row
            invname.setText(model.getValueAt(selectedRow, 1).toString());
            Object quantityValue = model.getValueAt(selectedRow, 2);
            if (quantityValue instanceof Integer) {
                invquantity.setValue(quantityValue);
            } else if (quantityValue instanceof String) {
                try {
                    int quantity = Integer.parseInt((String) quantityValue);
                    invquantity.setValue(quantity);
                } catch (NumberFormatException e) {
                    // Handle parsing error appropriately
                    JOptionPane.showMessageDialog(this, "Error parsing quantity: " + e.getMessage());
                }
            } else {
                // Handle other data types as necessary
                JOptionPane.showMessageDialog(this, "Unsupported data type for quantity");
            }

            // Date conversion for Date of Birth
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date date = dateFormat.parse(model.getValueAt(selectedRow, 3).toString());
                invdoe.setDate(date);
            } catch (Exception e) {
                e.printStackTrace();
            }

            invtype.setText(model.getValueAt(selectedRow, 4).toString());
            invremarks.setText(model.getValueAt(selectedRow, 5).toString());
        }
    }//GEN-LAST:event_invTableMouseClicked

    private void invremarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invremarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invremarksActionPerformed

    private void invnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invnameActionPerformed

    private void reportsedit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsedit1MouseClicked
        InventoryReportGenerator.generateInventoryReport();
    }//GEN-LAST:event_reportsedit1MouseClicked

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
    String searchText = searchField.getText().trim();
if (!searchText.isEmpty()) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "root";

        Connection Con = DriverManager.getConnection(dbUrl, username, password);
        String query = "SELECT LPAD(CAST(invid AS CHAR), 3, '0') AS formatted_invid, invname, invquantity, invdoe, invtype, invremarks " +
                       "FROM inventory " +
                       "WHERE invname LIKE ? " +
                       "   OR CAST(invid AS CHAR) LIKE ?";
        PreparedStatement searchStmt = Con.prepareStatement(query);
        searchStmt.setString(1, "%" + searchText + "%");
        searchStmt.setString(2, "%" + searchText + "%");

        ResultSet Rs = searchStmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) invTable.getModel();
        model.setRowCount(0);

        while (Rs.next()) {
            model.addRow(new Object[]{
                Rs.getString("formatted_invid"),
                Rs.getString("invname"),
                Rs.getInt("invquantity"),
                Rs.getDate("invdoe"),
                Rs.getString("invtype"),
                Rs.getString("invremarks")
            });
        }
        Con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
} else {
    // If search text is empty, display all inventory
    displayInventory();
}
    }//GEN-LAST:event_searchFieldKeyTyped

    private void patname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patname4ActionPerformed

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

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        new Reports().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked
    private void displayInventory() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3306/pullandentalclinic?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "root";

        Connection Con = DriverManager.getConnection(dbUrl, username, password);
        
        // Get the next available invid
        String query = "SELECT LPAD(CAST(IFNULL(MAX(CAST(invid AS SIGNED)), 0) + 1 AS CHAR), 3, '0') AS next_id FROM inventory";
        PreparedStatement St = Con.prepareStatement(query);
        ResultSet Rs = St.executeQuery();
        
        String nextId = "";
        if (Rs.next()) {
            nextId = Rs.getString("next_id");
        }
        
        // Set the next ID in the patname4 text field
        patname4.setText(nextId);

        // Fetch and display the inventory data
        query = "SELECT LPAD(CAST(invid AS CHAR), 3, '0') AS formatted_invid, invname, invquantity, invdoe, invtype, invremarks FROM inventory";
        St = Con.prepareStatement(query);
        Rs = St.executeQuery();

        DefaultTableModel model = (DefaultTableModel) invTable.getModel();
        model.setRowCount(0);

        while (Rs.next()) {
            model.addRow(new Object[]{
                Rs.getString("formatted_invid"),
                Rs.getString("invname"),
                Rs.getInt("invquantity"),
                Rs.getDate("invdoe"),
                Rs.getString("invtype"),
                Rs.getString("invremarks")
            });
        }
        Con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
    }
}
    public class InventoryReportGenerator {

    public static void generateInventoryReport() {
        String jrxmlFilePath = "C:\\Users\\Rebecca\\JaspersoftWorkspace\\MyReports\\inventory_report.jrxml";
        String outputPdfPath = "C:\\Users\\Rebecca\\Desktop\\Output\\inventory_report.pdf";

        Map<String, Object> parameters = new HashMap<>();
        // Add any parameters you need to pass to the report here

        JasperReportUtil.generateReport(jrxmlFilePath, outputPdfPath, parameters);
    }
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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable invTable;
    private javax.swing.JButton invdelete;
    private com.toedter.calendar.JDateChooser invdoe;
    private javax.swing.JButton invedit;
    private javax.swing.JTextField invname;
    private javax.swing.JSpinner invquantity;
    private javax.swing.JTextField invremarks;
    private javax.swing.JButton invsave;
    private javax.swing.JTextField invtype;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patname4;
    private javax.swing.JButton reportsedit1;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
