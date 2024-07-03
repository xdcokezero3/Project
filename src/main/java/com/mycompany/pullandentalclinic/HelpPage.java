package com.mycompany.pullandentalclinic;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;

public class HelpPage {

    private final JFrame frame;
    private final JTextArea textArea;
    private final JScrollPane scrollPane;
    private JList<String> menuList;

    public HelpPage() {
        frame = new JFrame("User Manual");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        String[] menuItems = {"Login", "Registration Form", "Patient Registration and Record", "Data Backup and Recovery", "Inventory", "User Information", "About", "Dashboard", "Appointment", "Forgot Password"};
        menuList = new JList<>(menuItems);
        menuList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        menuList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                updateText(menuList.getSelectedValue());
            }
        });

        JScrollPane menuScrollPane = new JScrollPane(menuList);
        menuScrollPane.setPreferredSize(new Dimension(200, frame.getHeight()));

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea);

        // Create a panel for the button
        JPanel buttonPanel = new JPanel();
        JButton returnButton = new JButton("Return to Dashboard");
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dashboard().setVisible(true);
                frame.dispose();
                // Assuming you have a method to show the dashboard
                // Dashboard.showDashboard();
            }
        });
        buttonPanel.add(returnButton);

        frame.add(menuScrollPane, BorderLayout.WEST);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void updateText(String selectedItem) {
        switch (selectedItem) {
            case "Login" ->
                textArea.setText("Login\n\nThis form is used to log in to the system. Users need to enter their username and password to access the system. If the credentials are correct, they will be granted access. Otherwise, an error message will be displayed.");
            case "Registration Form" ->
                textArea.setText("Registration Form\n\nThis form is used for registering new users. It includes fields such as Username, First Name, Middle Initial, Last Name, Email, Password, Confirm Password, Sex, Birth Date, Age, Home Address, City Zip Code, Mobile No, Landline No, Religion, and Access Level. The user must fill all fields and ensure the password meets the security requirements before they can register.");
            case "Patient Registration and Record" ->
                textArea.setText("Patient Registration and Record\n\nThis form allows the registration of new patients and recording their details. It includes fields for personal information, medical history, and current health status. This form helps in maintaining an organized record of patient information.");
            case "Data Backup and Recovery" ->
                textArea.setText("Data Backup and Recovery\n\nThis section provides information on how to back up and recover data. It includes steps to perform regular backups and instructions on how to restore data in case of loss or corruption. This ensures the safety and integrity of the data.");
            case "Inventory" ->
                textArea.setText("Inventory\n\nThis module is used to manage the inventory of medical supplies and equipment. It includes functionalities to add new items, update existing items, and track stock levels. This helps in ensuring that necessary supplies are always available.");
            case "User Information" ->
                textArea.setText("User Information\n\nThis section allows users to view and update their personal information. It includes fields for personal details, contact information, and other relevant data. Users can ensure their information is accurate and up-to-date.");
            case "About" ->
                textArea.setText("About\n\nThis section provides information about the application, including the development team, version, and purpose of the software.");
            case "Dashboard" ->
                textArea.setText("Dashboard\n\nThis dashboard allows users to manage the system. Only Admins can add new users, view existing users, and perform other administrative tasks. Staff users handles the appoinments and inventory. It serves as the central control panel for all users.");
            case "Appointment" ->
                textArea.setText("Appointment\n\nThis form allows users to schedule appointments. Users can enter the date and other relevant information to book an appointment. It helps in managing and keeping track of appointments.");
            case "Forgot Password" ->
                textArea.setText("Forgot Password\n\nThis form is for users who have forgotten their passwords. They can enter their email address to receive instructions on how to reset their password. It helps users regain access to their accounts securely.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HelpPage::new);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

