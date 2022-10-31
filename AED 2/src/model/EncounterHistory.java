/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 
 */

public class EncounterHistory {
    ArrayList EncounterHis=new ArrayList<Encounter>();
     public EncounterHistory(){
         EncounterHis=new ArrayList<Encounter>();
     }
       public ArrayList<Encounter> getInformation() {
        return EncounterHis;
    }

    public void setData(ArrayList<Encounter> EncounterHis) {
        this.EncounterHis = EncounterHis;
    }
    public Encounter addNewEncounter(){
        Encounter newEncounter =new Encounter();
        EncounterHis .add(newEncounter);
        return newEncounter;
    }
    public void deleteEncounter(int ed){
       EncounterHis .remove(ed); 
    }
    
    
}
