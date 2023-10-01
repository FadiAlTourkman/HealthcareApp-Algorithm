/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.healthcareapp;

import javax.swing.JOptionPane;
import java.io.IOException;


/**
 * Creates new form HealthcareGUI 
 * author: Fadi-Al-Tourkman 
 * Student Number: 21487366 
 * date: 16/03/2023
 */
public class HealthcareGUI extends javax.swing.JFrame {

    /**
     * Creates new form HealthcareGUI
     */
    private HealthcareInterface healthcarePQ;

    public HealthcareGUI() {
        healthcarePQ = new HealthcarePriorityQueue();
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

        DisplayPanel = new javax.swing.JPanel();
        TitleLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageTf = new javax.swing.JTextField();
        medicalConditionLbl = new javax.swing.JLabel();
        MedicalConditionBox = new javax.swing.JComboBox<>();
        patientAddBtn = new javax.swing.JButton();
        PatientListBtn = new javax.swing.JButton();
        patientNumberOfPatientBtn = new javax.swing.JButton();
        patientNextBtn = new javax.swing.JButton();
        patientExitBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisplayPanel.setBackground(new java.awt.Color(255, 255, 255));
        DisplayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        TitleLbl.setText("Healthcare Flu Vaccine Tracker");
        DisplayPanel.add(TitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 580, -1));

        nameLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nameLbl.setText("Patient Name:");
        DisplayPanel.add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        nameTf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameTf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DisplayPanel.add(nameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 80, 240, -1));

        ageLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ageLbl.setText("Patient Age:");
        DisplayPanel.add(ageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        ageTf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ageTf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DisplayPanel.add(ageTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 130, 240, -1));

        medicalConditionLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        medicalConditionLbl.setText("Medical Condition:");
        DisplayPanel.add(medicalConditionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        MedicalConditionBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MedicalConditionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "No", "Yes" }));
        MedicalConditionBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MedicalConditionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalConditionBoxActionPerformed(evt);
            }
        });
        DisplayPanel.add(MedicalConditionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 240, -1));

        patientAddBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        patientAddBtn.setText("ADD");
        patientAddBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        patientAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientAddBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientAddBtnMouseExited(evt);
            }
        });
        patientAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientAddBtnActionPerformed(evt);
            }
        });
        DisplayPanel.add(patientAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 50));

        PatientListBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        PatientListBtn.setText("LIST");
        PatientListBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        PatientListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientListBtnActionPerformed(evt);
            }
        });
        DisplayPanel.add(PatientListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 90, 50));

        patientNumberOfPatientBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        patientNumberOfPatientBtn.setText("NUMBER OF PATIENTS");
        patientNumberOfPatientBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        patientNumberOfPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNumberOfPatientBtnActionPerformed(evt);
            }
        });
        DisplayPanel.add(patientNumberOfPatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, 50));

        patientNextBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        patientNextBtn.setText("NEXT PATIENT ");
        patientNextBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        patientNextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNextBtnActionPerformed(evt);
            }
        });
        DisplayPanel.add(patientNextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 130, 50));

        patientExitBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        patientExitBtn.setText("EXIT");
        patientExitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        patientExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientExitBtnActionPerformed(evt);
            }
        });
        DisplayPanel.add(patientExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 90, 50));

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        textArea.setRows(5);
        textArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jScrollPane2.setViewportView(textArea);

        DisplayPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 503, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientAddBtnActionPerformed
        // TODO add your handling code here:
        //set variables below:
        String patientName;  // variable to store the patient name
        int patientAge;      // variable to store the patient age as an integer
        String patientAgeString;    // variable to store the patient age as a string
        int iPriority;   // variable to store the patient priority as an integer
        Integer priorityINT = null; // variable to store the patient priority as an Integer

        // Create a new patient section
        PatientSection newPatient = new PatientSection();
        // Get the patient name and age from the text fields
        patientName = nameTf.getText();
        patientAgeString = ageTf.getText();

        // Validate the patient name and age
        try {
            if (patientName.trim().isEmpty() && patientAgeString.trim().isEmpty()) {
                throw new IOException("Please fill in the Name and Age: ");
                //return;
            } else if (patientName.trim().isEmpty()) {
                throw new IOException("Please fill in the Name: ");
                //return;
            } else if (!patientName.matches("^[a-zA-Z ]+$")) {
                throw new IOException("Name must be a valid string: ");
                //return;
            } else if (patientAgeString.equals("")) {
                throw new IOException("Please fill in the Age: ");
                //return;
            } else if (!patientAgeString.matches("^[0-9]+$")) {
                throw new IOException("Age must be a valid number.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }
        

        // Parse the patient age from the string to an integer
        try {
            patientAge = Integer.parseInt(patientAgeString);
            if (patientAge <= 0) {
                JOptionPane.showMessageDialog(null, "Age cannot be below than zero: ");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age must be a valid number: ");
            return;
        }

        // Get the medical condition selection from the combo box
        //medicalConditionSection valid/invalid
        String medicalConditionSelection;
        medicalConditionSelection = (String) MedicalConditionBox.getSelectedItem();

        
         // Calculate the patient priority based on their age and medical condition
        if (patientAge >= 90) {
            priorityINT = 10;
        } else if (patientAge >= 80) {
            priorityINT = 9;
        } else if (patientAge >= 70) {
            priorityINT = 8;
        } else if (patientAge >= 65 && patientAge <= 69) {
            priorityINT = 7;
        } else if (patientAge >= 18 && patientAge <= 64) {
            if (medicalConditionSelection.equals("Yes")) {
                priorityINT = 6;
            } else {
                if (patientAge >= 55 && patientAge <= 64) {
                    priorityINT = 5;
                } else if (patientAge >= 45 && patientAge <= 54) {
                    priorityINT = 4;
                } else if (patientAge >= 30 && patientAge <= 44) {
                    priorityINT = 3;
                } else if (patientAge >= 18 && patientAge <= 29) {
                    priorityINT = 2;
                }
            }
        } else if (patientAge < 18) {
            priorityINT = 1;
        }

         // Assign the integer priority value to the priority variable itself
        iPriority = priorityINT;

        // Validating the patient age and medical condition combination
        try {
            if ((patientAge < 18 && medicalConditionSelection.equals("Yes")) || (patientAge > 64 && medicalConditionSelection.equals("Yes"))) {
                throw new IOException("Error with the Age and Medical Condition");
                //return;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }
        

        //seting the name and age
        newPatient.setPatientName(patientName);
        newPatient.setPatientAge(patientAge);

        // Validating the medical condition for a selection option from the user
        try {
            if (medicalConditionSelection.equals("")) {
                throw new IOException("Please fill in the medical condition: ");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }

        //setting medical condition
        newPatient.setMedicalConditionSelection(medicalConditionSelection);

        //Placement within the arraylist and message in the textArea of the Patient inserted
        healthcarePQ.enqueue(iPriority, newPatient);
        textArea.append("*****************************************************************\n");
        textArea.append(nameTf.getText() + " has been inserted onto the List" + "\n");
        textArea.append("*****************************************************************\n");
        nameTf.setText("");
        ageTf.setText("");
        MedicalConditionBox.setSelectedIndex(0);

    }//GEN-LAST:event_patientAddBtnActionPerformed

    private void PatientListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientListBtnActionPerformed
        // TODO add your handling code here:
        //validating the list of patients within the arraylist
        try {
            if (healthcarePQ.isEmpty()) {
                throw new IOException("No patients available on the list.");
            } else {
                textArea.append("*****************************************************************\n");
                textArea.append("The patients on the list are: \n");
                textArea.append(healthcarePQ.printPQueue() + "\n");
                textArea.append("*****************************************************************\n");;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_PatientListBtnActionPerformed

    private void patientNumberOfPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNumberOfPatientBtnActionPerformed
        // TODO add your handling code here:
        //validating the number of patients within the arraylist
        try {
            if (!healthcarePQ.isEmpty()) {
                textArea.append("*****************************************************************\n");
                textArea.append("Total Number of Patients: " + healthcarePQ.size() + "\n");
                textArea.append("*****************************************************************\n");
            } else {
                throw new IOException("No Patient Available.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_patientNumberOfPatientBtnActionPerformed

    private void patientNextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNextBtnActionPerformed
        // TODO add your handling code here:
        //Check if the healthcare priority queue is not empty
        try {
            if (!healthcarePQ.isEmpty()) {
                // Dequeue the highest priority patient from the queue and extract their information
                HealthcareKeyElement pqElement = (HealthcareKeyElement) healthcarePQ.dequeue();
                PatientSection patient = (PatientSection) pqElement.getPatient();
                textArea.append("*****************************************************************\n");
                textArea.append("Next Patient Below:\n");
                textArea.append("Name: " + patient.getPatientName() + "\n");
                textArea.append("Age: " + patient.getPatientAge() + "\n");
                textArea.append("Medical Condition: " + patient.getMedicalConditionSelection() + "\n");
                textArea.append("Priority Number: " + pqElement.getikey() + "\n");
                textArea.append("*****************************************************************\n");
            } else {
                throw new IOException("No More Patients Left.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_patientNextBtnActionPerformed

    private void MedicalConditionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalConditionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicalConditionBoxActionPerformed

    private void patientExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientExitBtnActionPerformed
        // TODO add your handling code here:
        //exit out the system 
        System.exit(0);
    }//GEN-LAST:event_patientExitBtnActionPerformed

    private void patientAddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientAddBtnMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_patientAddBtnMouseEntered

    private void patientAddBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientAddBtnMouseExited
        // TODO add your handling code here:


    }//GEN-LAST:event_patientAddBtnMouseExited

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
            java.util.logging.Logger.getLogger(HealthcareGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthcareGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthcareGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthcareGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthcareGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JComboBox<String> MedicalConditionBox;
    private javax.swing.JButton PatientListBtn;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTf;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel medicalConditionLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JButton patientAddBtn;
    private javax.swing.JButton patientExitBtn;
    private javax.swing.JButton patientNextBtn;
    private javax.swing.JButton patientNumberOfPatientBtn;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}