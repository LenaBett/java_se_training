package com.systechafrica.Part2.Inheritance.CompanySetup;

public class DatabaseEngineer extends SoftwareEngineer{
    private String title;

    public DatabaseEngineer(String employeeNo, String employeeName, String employeeAddress, String title) {
        super(employeeNo, employeeName, employeeAddress, title);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
