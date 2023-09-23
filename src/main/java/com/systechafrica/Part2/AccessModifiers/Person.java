package com.systechafrica.Part2.AccessModifiers;

public class Person {
    private String name;
    private String email;
    private boolean promoted;


    //setters and getters
    public boolean isPromoted() {
        return promoted;
    } // be keen on the boolean getter

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person() {
    }

    public String toString() {

        return email + ",  " + name;
    }

    public void printPersonDetails() {
        System.out.println(getPersonalDetails());
    }

    private String getPersonalDetails() {
        return email + ",  " + name;
    }
}

//Understanding access modifiers