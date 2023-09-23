package com.systechafrica.Part2.Polymorphism;


import com.systechafrica.Part2.Inheritance.CompanySetup.DatabaseEngineer;
import com.systechafrica.Part2.Inheritance.CompanySetup.Employee;
import com.systechafrica.Part2.Inheritance.CompanySetup.QualityAssurance;
import com.systechafrica.Part2.Inheritance.CompanySetup.SoftwareEngineer;
import com.systechafrica.Part2.Inheritance.ProtectedAccessModifier.Nomencleture.Genus.Genus;
import com.systechafrica.Part2.Inheritance.ProtectedAccessModifier.Nomencleture.Kingdom.Kingdom;
import com.systechafrica.Part2.Inheritance.ProtectedAccessModifier.Nomencleture.Species.Species;

public class PolymorphismDemo {
    public static void main(String[] args) {

        Employee james = new QualityAssurance("001", "James",
                "047", "Quality Assurance Chief Engineer");

        Employee ivy = new SoftwareEngineer("002", "Ivy",
                "035", "Senior Software Engineer");

        Employee lenna = new DatabaseEngineer("003", "Lenna",
                "035", "Senior Database Engineer");

        System.out.println(james);
        System.out.println(ivy);
        System.out.println(lenna);


        Kingdom species = new Species();
        Kingdom genus = new Genus();


    }
}