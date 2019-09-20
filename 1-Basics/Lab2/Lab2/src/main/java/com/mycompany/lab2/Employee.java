package com.mycompany.lab2;

import java.util.Calendar;

public class Employee extends Person {
    private String Post;

    private String Occupation;

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public Employee(String Name, String Patronymic, String Surname, Calendar DoB, String Post, String Occupation) {
        super(Name, Patronymic, Surname, DoB);
        this.Post = Post;
        this.Occupation = Occupation;
    }

    @Override
    public String getInfo() {
        return "Работник " + super.getInfo() + " Должность: " + Post + " Род деятельности: " + Occupation;
    }
}
