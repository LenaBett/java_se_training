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

        // Objects of the QualityAssurance class are treated as objects of the Employee class(the parent class)
        Employee james = new QualityAssurance("001", "James",
                "047", "Quality Assurance Chief Engineer");

        //Objects of the SoftwareEngineer class are treated as objects of the Employee class(the parent class)
        Employee ivy = new SoftwareEngineer("002", "Ivy",
                "035", "Senior Software Engineer");

        // Objects of the DatabaseEngineer class are treated as objects of the Employee class(the parent class)
        Employee lena = new DatabaseEngineer("003", "Lena",
                "035", "Senior Database Engineer");

        System.out.println(james);
        System.out.println(ivy);
        System.out.println(lena);


        Kingdom species = new Species(); // objects of species are objects of Kingdom
        Kingdom genus = new Genus();


    }
}