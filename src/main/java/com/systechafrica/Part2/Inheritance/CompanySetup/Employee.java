package com.systechafrica.Part2.Inheritance.CompanySetup;

public class Employee {
    private String employeeNo;
    private String employeeName;
    private String employeeAddress;

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String toString() {
        return "Name:" +employeeName + "Number:" + "Address: " + employeeAddress;
    }
}
