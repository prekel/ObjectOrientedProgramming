/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Юрий
 */
public abstract class Person {
    private String Name;
    private String Patronymic;
    private String Surname;
    private Calendar DoB;
    //Статтическое свойство-коллекция для обектов классов наследников Person
    private static ArrayList<Person> Persons;
    
    //Добавляет объект в статическую коллекцию
    public static void AddPerson(Person p) {
        if(Persons == null) Persons = new ArrayList<Person>();
        Persons.add(p);
    }
    //Возвращает объект из статической коллекции
    public static Person GetPerson(int Index) {
        return Persons.get(Index);
    }

    public static String getPersonsInfo() {
        if(Persons == null) return "Нет данных в коллекци Persons";
        
        String InfoString = new String();
        for (int i = 0; i < Persons.size(); i++) {
            InfoString = InfoString + "\n" + Persons.get(i).getInfo();
        }  
        
        return InfoString;         
    }

    public String getName() {
        return Name;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public String getSurname() {
        return Surname;
    }

    public Person(String Name, String Patronymic, String Surname, Calendar DoB) {
        this.Name = Name;
        this.Patronymic = Patronymic;
        this.Surname = Surname;
        this.DoB = DoB;
    }

    public String getInfo() {
        return Name + " " + Patronymic + " " + Surname + ", д/р: " 
               + DoB.get(Calendar.DAY_OF_MONTH) + "."
               + DoB.get(Calendar.MONTH) + "."
               + DoB.get(Calendar.YEAR);
    }
}