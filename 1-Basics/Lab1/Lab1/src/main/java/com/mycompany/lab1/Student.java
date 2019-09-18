/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.Calendar;

/**
 *
 * @author Юрий
 */
public class Student {
    private String Name;
    private String Surname;
    private Calendar DoB;
    private String Passport;
    private Group stGroup; //Реализация ассоциации в класс Group с мощностью 1
    
    public Student(String pName, String pSurname, Calendar pDoB, String pPassport, Group pGroup) {
        this.Name = pName;
        this.Surname = pSurname;
        this.DoB = pDoB;
        this.Passport = pPassport;
        this.stGroup = pGroup; // Связывание объектов
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public Calendar getDoB() {
        return DoB;
    }

    public String getPassport() {
        return Passport;
    }

    public Group getStGroup() {
        return stGroup;//Возвращение ссылки на связанный объект
    }
}
