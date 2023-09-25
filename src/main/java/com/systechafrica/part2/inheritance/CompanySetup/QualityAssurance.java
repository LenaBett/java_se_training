package com.systechafrica.part2.inheritance.CompanySetup;

public class QualityAssurance extends  Employee{
    private String title;

    public QualityAssurance(String employeeNo, String employeeName, String employeeAddress, String title) {
        super(employeeNo, employeeName, employeeAddress);
        this.title = title;
    }

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
