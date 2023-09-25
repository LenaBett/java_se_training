package com.systechafrica.part2.inheritance.ProtectedAccessModifier.Nomencleture.Species;

import com.systechafrica.part2.inheritance.ProtectedAccessModifier.Nomencleture.Genus.Genus;

public class Species extends Genus {
    public void printInfo(){
        System.out.println(randomString);
    }
    public void callSampleMethod(){
        System.out.println(sampleMethod());
    }
}
