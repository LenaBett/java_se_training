package com.systechafrica.part3.exceptionhanding;

public class Student {
    private String id;
    private String name;
    private String regNo;
    private String email;

    public Student(String id, String name, String regNo, String email) {
        this.id = id;
        this.name = name;
        this.regNo = regNo;
        this.email = email;
    }

    public Student(){

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
