/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Юрий
 */
public class MainLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bird Eagle; //Объявление переменной Eagle  
        Eagle = new Bird(); //Создание обекта Eagle
        Bird Sparrow = new Bird(); //Объявление переменной и создание объекта
        Bird Ostrich = new Bird("Страус", 2.0f, 0); //Создание объекта с инициализацией свойств

        Eagle.setName("Орел"); //Устанавливаем значение свойства Name объекта Eagle равное "Орел"
        Eagle.setWingsLength(2.1f); //Устанавливаем значение свойства Length объекта Eagle равное 2.1

        Sparrow.setName("Воробей"); //Устанавливаем значение свойства Name объекта Sparrow равное "Воробей"
        Sparrow.setWingsLength(0.17f); //Устанавливаем значение свойства Length объекта Sparrow равное 0.17

        System.out.println("Размах крыльев птицы " + Eagle.getName() + " равен " + Eagle.getWingsLength() + " м.");
        System.out.println("Размах крыльев птицы " + Sparrow.getName() + " равен " + Sparrow.getWingsLength() + " м.");
        System.out.println("Размах крыльев птицы " + Ostrich.getName() + " равен " + Ostrich.getWingsLength() + " м.");
        
        //Связывание объектов по ассоциациям классов
        Discipline OOP = new Discipline("Объектно-ориентированное программирование", 180);
        Discipline TDB = new Discipline("Теория баз данных", 108);
        Group Gr1 = new Group("КИ19-16Б");
        Gr1.setGrDiscipline(OOP);//Связывание объекта Gr1 c объектом OOP
        Gr1.setGrDiscipline(TDB);//Связывание объекта Gr1 c объектом TDB
        Student St = new Student("Иван", 
                                 "Сидоров", 
                                 new GregorianCalendar(2001,11,30), 
                                 "0404 557886", 
                                 Gr1);//Создание объекта St и связывание с объектом Gr1
        //Вывод информации по объекту St и связанному с ним объекту группы
        System.out.println("Студент " + St.getName() + " " + St.getSurname() + 
                           ", д/р: " + St.getDoB().get(Calendar.DAY_OF_MONTH) + "."
                                     + St.getDoB().get(Calendar.MONTH) + "."
                                     + St.getDoB().get(Calendar.YEAR) + 
                           ", пасспорт: " + St.getPassport() +
                           ", группа: " + St.getStGroup().getName());
        System.out.println("Изучаемые дисциплины:");
        //Перебор всех объектов коллекции дисциплин в свойстве grDiscipline объекта Gr1
        //и отображене для них наименования и объема
        Gr1.getDisciplineArray().forEach(Discipline -> 
            System.out.println(Discipline.getName() + " " + Discipline.getValue() + " ч."));
    }

}
