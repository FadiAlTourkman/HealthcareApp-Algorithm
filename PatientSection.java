/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapp;

/**
* Creates new form HealthcareGUI
* author: Fadi-Al-Tourkman
* Student Number: 21487366
* date: 16/03/2023
*/
public class PatientSection {

    // Instance variables
    private String patientName;
    private int patientAge;
    private String medicalConditionSelection;
    
    // Default constructor, initializes all variables to empty values
    public PatientSection() {
        patientName = " ";
        patientAge = 0;
        medicalConditionSelection =" ";
    }

    // Constructor to initialize instance variables with provided values
    public PatientSection(String patientName, int patientAge, String medicalConditionSelection) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.medicalConditionSelection = medicalConditionSelection;
    }
    
    // Setter method for patientName variable
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    // Setter method for patientAge variable
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    // Getter method for patientName variable
    public String getPatientName() {
        return patientName;
    }

    // Getter method for patientAge variable
    public int getPatientAge() {
        return patientAge;
    }

    // Getter method for medicalConditionSelection variable
    public String getMedicalConditionSelection() {
        return medicalConditionSelection;
    }

    // Setter method for medicalConditionSelection variable
    public void setMedicalConditionSelection(String medicalConditionSelection) {
        this.medicalConditionSelection = medicalConditionSelection;
    }

}
