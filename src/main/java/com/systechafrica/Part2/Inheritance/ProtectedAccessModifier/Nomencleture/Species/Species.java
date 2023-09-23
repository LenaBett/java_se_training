package com.systechafrica.Part2.Inheritance.ProtectedAccessModifier.Nomencleture.Species;

import com.systechafrica.Part2.Inheritance.ProtectedAccessModifier.Nomencleture.Genus.Genus;

public class Species extends Genus {
    public void printInfo(){
        System.out.println(randomString);
    }
    public void callSampleMethod(){
        System.out.println(sampleMethod());
    }
}
