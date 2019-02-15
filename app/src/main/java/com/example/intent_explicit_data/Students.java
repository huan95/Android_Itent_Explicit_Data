package com.example.intent_explicit_data;

import java.io.Serializable;

public class Students implements Serializable {
    private String Name;
    private int Birthdays;

    public Students(String name, int birthdays) {
        Name = name;
        Birthdays = birthdays;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBirthdays() {
        return Birthdays;
    }

    public void setBirthdays(int birthdays) {
        Birthdays = birthdays;
    }
}
