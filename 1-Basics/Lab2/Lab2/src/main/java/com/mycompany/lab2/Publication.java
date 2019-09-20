/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.ArrayList;

/**
 * @author Юрий
 */
public class Publication {
    private String Name;
    private String Type;
    private String OutPutInfo;
    private ArrayList<Person> Authors;

    public Publication(String Name, String Type, String OutPutInfo, ArrayList<Person> Authors) {
        this.Name = Name;
        this.Type = Type;
        this.OutPutInfo = OutPutInfo;
        this.Authors = Authors;
    }

    public String GetPublicationInfo() {
        String PubString = new String();
        if (Authors != null) {
            PubString = Authors.get(0).getSurname() + " " +
                    Authors.get(0).getName().charAt(0) + "." +
                    Authors.get(0).getPatronymic().charAt(0) + ".";
            for (int i = 1; i < Authors.size(); i++) {
                PubString = PubString + " " +
                        Authors.get(i).getSurname() + " " +
                        Authors.get(i).getName().charAt(0) + "." +
                        Authors.get(i).getPatronymic().charAt(0) + ".";
            }
            PubString = PubString + " " + Name + " // " + OutPutInfo;
        }

        return PubString;
    }
}
