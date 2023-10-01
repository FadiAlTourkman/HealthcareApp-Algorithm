/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthcareapp;

import java.util.*;

/**
* Creates new form HealthcareGUI
* author: Fadi-Al-Tourkman
* Student Number: 21487366
* date: 16/03/2023
*/
public class HealthcarePriorityQueue implements HealthcareInterface {

    private ArrayList<HealthcareKeyElement> healthcarePQ;   //this is the ArrayList of HealthcareKeyElement objects used to the store the priority queue

    public HealthcarePriorityQueue() {
        healthcarePQ = new ArrayList<HealthcareKeyElement>();    //the Constructor that would initializes the priority queue as an empty ArrayList
    }

    public void enqueue(int iPriorityKey, Object patient) { //this is the method to add the new patient to the priority queue with the  priority key too combined.
        int IndexPrint;
        HealthcareKeyElement newElement = new HealthcareKeyElement(iPriorityKey, (PatientSection) patient); //Creates a new HealthcareKeyElement object with the given priority key and patient information
        IndexPrint = findPosition(iPriorityKey);  //it Finds the position to insert the new element within the priority query
        if (IndexPrint == size()) {
            healthcarePQ.add(newElement);   //this insert the new element at the end of the priority queue only if the new element has the highest priority key on the list
        } else {
            healthcarePQ.add(IndexPrint, newElement);   //this would insert the new element to its adjusted position in the priority queue
        }
    }

    private int findPosition(int iNewKey) {    //this is the method to find the appropriate position to insert a new element in the priority queue
        boolean fTest = false;
        int positionIndex = 0;
        HealthcareKeyElement currentElement;
        while (positionIndex < healthcarePQ.size() && !fTest) { //it Loops through each element in the priority queue until a position is found to insert the new element.
            currentElement = healthcarePQ.get(positionIndex);   //this gets the current element at the current position within the priority queue
            if (currentElement.getikey() > iNewKey) {   // If the priority key of the current element is greater than the priority key of the new element, then it would increment the position index to check the next element on the list.
                positionIndex = positionIndex + 1;
            } else {
                fTest = true;   // If the priority key of the current element is less than or equal to the priority key of the new element. the appropriate position to insert the new element has been found
            }
        }
        return positionIndex;   //Returns the index to insert the new element
    }

    public int size() {  //this method to get the size of the priority queue
        return healthcarePQ.size();
    }

    public boolean isEmpty() {  //this method to check if the priority queue is empty
        return healthcarePQ.isEmpty();
    }

    public Object dequeue() {   //this method to remove and return the element with the highest priority from the priority queue
        return healthcarePQ.remove(0);
    }

    public String printPQueue() {   //this method to return a string representation of the priority queue
        int numberIndex;
        String patientDetails = new String();
        HealthcareKeyElement curHealthcareElement;
        for (numberIndex = 0; numberIndex < healthcarePQ.size(); numberIndex++) {    //this would Loop through each element in the priority queue to get its patient information and priority key together
            curHealthcareElement = healthcarePQ.get(numberIndex);
            patientDetails = patientDetails.concat(curHealthcareElement.printPatientSection() + " * Patient Priority Number = " + curHealthcareElement.getikey() + "\n");    // Adds the patient information and priority key to a string
        }
        return patientDetails;   //Returns the string representation of the priority queue
    }

}
