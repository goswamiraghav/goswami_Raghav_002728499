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
public class Patient extends Person{
    
    
    private int avail;
    private String DoctorName;
    
    private Encounter encounter;
    
    public Patient() {
        this.encounter = new Encounter();
    }
    
    public String getDoctorName() {
        return DoctorName;
    }
    
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public Encounter getEncounter() {
        return encounter;
    }
    
    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.avail);
    }
}
