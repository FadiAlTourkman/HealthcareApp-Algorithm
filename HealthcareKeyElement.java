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
public class HealthcareKeyElement {
    
    // Instance variables
    private int ikey;                    // the priority key (key number)
    private PatientSection patient;     // the patient information (name, age, medical condition)

    // Constructor to initialize instance variables
    public HealthcareKeyElement(int iInPriority, PatientSection inpatient){
        ikey = iInPriority;     // set the priority key
        patient = inpatient;    // set the patient information
    }

    // Getter method for the priority key
    public int getikey() {
        return ikey;
    }

    // Setter method for the priority key
    public void setikey(int iInkey) {
        ikey = iInkey;
    }
    // Getter method for the patient information
    public PatientSection getPatient() {
        return patient;
    }
    // Setter method for the patient information
    public void setPatient(PatientSection inPatient) {
        patient = inPatient;
    }
    // Method to return a string representation of the patient information
    public String printPatientSection() {
        String patientDetailMessage;
        // Build the patient detail message string
        patientDetailMessage = "Patient Name = " + patient.getPatientName() + " ** Patient Age = " + patient.getPatientAge() + " ** Patient Medical Condition: "+patient.getMedicalConditionSelection();
        return patientDetailMessage;
    }
}
