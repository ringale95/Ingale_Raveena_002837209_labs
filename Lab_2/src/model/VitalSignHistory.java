/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ingale.r
 */
public class VitalSignHistory {
    
       private ArrayList<VitalSigns> history;
       //As array list is object we need to initialize it before using but for other variables we need not so using constructor
       
       public VitalSignHistory(){
           this.history = new ArrayList<VitalSigns>(); //Creating new arraylist to store vitalsigns
       }
       
       //getter and setter

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
       
       //to add items to Arraylist
    public VitalSigns addnewVital(){
        VitalSigns newVitals = new VitalSigns(); //create empty vitalsigns
        history.add(newVitals); // add empty vitalsigns to history
        return newVitals;
    }
    
    public void deleteVitals(VitalSigns vs){
        history.remove(vs);
    }
    
}
