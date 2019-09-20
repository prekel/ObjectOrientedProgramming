/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Юрий
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Пример работы с полиморфными объектами
        Student Author1 = new Student("Максим", 
                                      "Олегович",
                                      "Димухаметов", 
                                      new GregorianCalendar(1991,9,21), 21121426);
        
        Teacher Author2 = new Teacher("Юрий",
                                      "Юрьевич",
                                      "Якунин", 
                                      new GregorianCalendar(1978,12,24), "Заведующий кафедрой");
        
        ArrayList<Person> Authors = new ArrayList<Person>();
        Authors.add(Author1);
        Authors.add(Author2);
        Publication Pub = new Publication("Мотивация к обучению в персональной образовательной среде",
                                          "Конференция",  
                                          "Информатизация образования и методика электронного обучения: материалы II Международной конференции, 25-28 сентября 2018 г. – Красноярск: ИПК СФУ, 2018. – с. 289-293.",
                                          Authors);
        System.out.println(Pub.GetPublicationInfo());
        
        //Пример работы со статическими методами
        Student St = new Student("Сергей", 
                                 "Александрович",
                                 "Есенин", 
                                 new GregorianCalendar(1895,9,21), 28121925);
        
        Teacher Tch = new Teacher("Федор",
                                  "Михайлович",
                                  "Достоевский", 
                                  new GregorianCalendar(1821, Calendar.NOVEMBER,30), "Профессор");
        Person.AddPerson(St);
        Person.AddPerson(Tch);
        
        System.out.println(Person.getPersonsInfo());

    }
    
}
