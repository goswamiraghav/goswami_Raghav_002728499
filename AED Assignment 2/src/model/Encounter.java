/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author RaghavGoswami
 */
public class Encounter {
    Vitals vitals;
   
    public ArrayList<Vitals> encounterhistory;

    
    public Encounter() {
        
        encounterhistory= new ArrayList<>();
        this.vitals = new Vitals();
        
      }

    public ArrayList<Vitals> getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(ArrayList<Vitals> encounterhistory) {
        this.encounterhistory = encounterhistory;
    }

    public Vitals createvitals()
    {  
    Vitals vital = new Vitals();
    encounterhistory.add(vital);
    return vital;
    }

    
    public void deleteVitalSign(Vitals vitalSign) {
        encounterhistory.remove(vitalSign);
    }
    
    public Vitals getVitals(){
        return this.vitals;
    }
    
    public Vitals setVitals(Vitals vi){
        return  this.vitals = vi;
    }
    
}
