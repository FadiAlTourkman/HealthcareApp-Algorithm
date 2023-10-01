/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.healthcareapp;

/**
* Creates new form HealthcareGUI
* author: Fadi-Al-Tourkman
* Student Number: 21487366
* date: 16/03/2023
*/
//outlines the methods that must be implented by any class that implements this interface.
public interface HealthcareInterface {
    
    //Method to get the size of the queue
    public int size();
    // Method to check if the queue is empty
    public boolean isEmpty();
     // Method to remove and return the element at the front of the queue
    public Object dequeue();
     // Method to get a string representation of the queue
    public String printPQueue();
    // Method to add an element with a given priority to the queue
    public void enqueue(int key, Object element);
}
