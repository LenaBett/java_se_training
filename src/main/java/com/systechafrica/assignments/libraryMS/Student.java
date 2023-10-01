package com.systechafrica.assignments.libraryMS;

import java.util.Objects;

public class Student {
    private String number;
    private String name;
    private String status;

    public Student(String number, String name, String status) {
        this.number = number;
        this.name = name;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAllowed() {
        if (Objects.equals(status, "Allowed")){
            return true;
        } else {
            return false;
        }
    }
}
