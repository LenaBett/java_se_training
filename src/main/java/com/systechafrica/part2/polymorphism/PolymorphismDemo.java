package com.systechafrica.part2.polymorphism;


import com.systechafrica.part2.inheritance.CompanySetup.DatabaseEngineer;
import com.systechafrica.part2.inheritance.CompanySetup.Employee;
import com.systechafrica.part2.inheritance.CompanySetup.QualityAssurance;
import com.systechafrica.part2.inheritance.CompanySetup.SoftwareEngineer;
import com.systechafrica.part2.inheritance.ProtectedAccessModifier.nomencleture.Genus.Genus;
import com.systechafrica.part2.inheritance.ProtectedAccessModifier.nomencleture.Kingdom.Kingdom;
import com.systechafrica.part2.inheritance.ProtectedAccessModifier.nomencleture.Species.Species;

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