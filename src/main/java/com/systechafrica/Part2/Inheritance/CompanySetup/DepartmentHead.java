package com.systechafrica.Part2.Inheritance.CompanySetup;

public class DepartmentHead extends Employee {
    private String title;

    public DepartmentHead(String employeeNo, String employeeName, String employeeAddress) {
        super(employeeNo, employeeName, employeeAddress);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
