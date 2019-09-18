/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author Юрий
 */
public class Bird {
    private String name;
    private float wingsLength; 
    private float tonality;
    
    public float getBirdSinging() {
        return tonality;
    }

    public float getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(float wingsLength) {
        if(wingsLength > 0 && wingsLength < 10) this.wingsLength = wingsLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Bird () {
        this.name = "Орел";
        this.wingsLength = 2.1f;
        this.tonality = 150.5f;
    }

    public Bird (String Name, float wingsLength, float Tonality) {
        this.name = Name;
        this.wingsLength = wingsLength;
        this.tonality = Tonality;
    }
}
