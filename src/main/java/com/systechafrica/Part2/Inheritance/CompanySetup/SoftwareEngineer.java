package com.systechafrica.Part2.Inheritance.CompanySetup;

public class SoftwareEngineer extends  Employee{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Name:" + getEmployeeName() + "  Number: " + getEmployeeNo() + "  Address: " + getEmployeeAddress() + "  Title: " + getTitle();
    }

}
