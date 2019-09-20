/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.Calendar;

/**
 * @author Юрий
 */
public class Student extends Person {
    private int IdTicket;

    public Student(String Name, String Patronymic, String Surname, Calendar DoB, int IdTicket) {
        super(Name, Patronymic, Surname, DoB);
        this.IdTicket = IdTicket;
    }

    public String getInfo() {
        return "Студент " + super.getInfo() + " Номер студенческого билета: " + IdTicket;
    }
}
