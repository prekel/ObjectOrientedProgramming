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
public class Discipline {
    private String Name;
    private int Value;
    
    public Discipline(String pName, int pValue) {
        this.Name = pName;
        this.Value = pValue;
    }

    public String getName() {
        return Name;
    }

    public int getValue() {
        return Value;
    }
}
