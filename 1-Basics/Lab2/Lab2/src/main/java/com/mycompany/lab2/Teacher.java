/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.Calendar;

/**
 *
 * @author Юрий
 */
public class Teacher extends Person {
    private String Post;
    
    public Teacher(String Name, String Patronymic, String Surname, Calendar DoB, String Post) {
        super(Name,Patronymic,Surname,DoB);
        this.Post = Post;
    }

    public String getInfo() {
        return "Преподаватель " + super.getInfo() + " Должность: " + Post;
    }
}
