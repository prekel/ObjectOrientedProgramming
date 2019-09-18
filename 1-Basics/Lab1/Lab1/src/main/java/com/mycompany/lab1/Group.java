/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.ArrayList;

/**
 *
 * @author Юрий
 */
public class Group {
    private String Name;
    //Реализация ассоциации, направленной в класс Discipline, с мощностью n
    private ArrayList<Discipline> grDiscipline;
    
    public Group(String pName) {
        this.Name = pName;
        this.grDiscipline = new ArrayList<Discipline>();
    } 

    public ArrayList<Discipline> getDisciplineArray() {
        return grDiscipline;
    }

    public String getName() {
        return Name;
    }

    public void setGrDiscipline(Discipline grDiscipline) {
        this.grDiscipline.add(grDiscipline);
    }

    public Discipline getDiscipline(int pos) {
        return grDiscipline.get(pos); //Возвращение ссылки связанного объекта по позиции в коллекции
    }
}
