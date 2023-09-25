package com.systechafrica.part2.inheritance;

import com.systechafrica.part2.inheritance.CompanySetup.SoftwareEngineer;

import java.util.logging.Logger;

public class InheritanceDemo {
    private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());

    public static void main(String[] args) {
        InheritanceDemo app = new InheritanceDemo();

        LOGGER.info("app => " + app.hashCode());
        LOGGER.info("app => " + app.toString());
        LOGGER.info("app => " + app.getClass().getPackageName());

        app.companySetup();
    }

    public void companySetup() {
        SoftwareEngineer e1 = new SoftwareEngineer("Emily","324", "Nairobi", "Software Engineer");
//        e1.setEmployeeName("Emily");
//        e1.setEmployeeNo("324");
//        e1.setEmployeeAddress("Nairobi");
//        e1.setTitle("Software Engineer");
        LOGGER.info("SoftwareEngineer => " + e1.toString());

//        QualityAssurance qa = new QualityAssurance();
//        qa.setEmployeeName("John");
//        qa.setEmployeeNo("352");
//        qa.setEmployeeAddress("Nairobi");
//        qa.setTitle("SDET");
//        LOGGER.info("Quality Assurance => " + qa.toString());

//        DatabaseEngineer de = new DatabaseEngineer();
//        de.setEmployeeName("Joe");
//        de.setEmployeeNo("009");
//        de.setTitle("Database engineer");
//        LOGGER.info("Database => " + de.toString());

    }

}
