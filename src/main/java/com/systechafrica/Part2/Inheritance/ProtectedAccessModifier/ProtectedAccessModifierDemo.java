package com.systechafrica.Part2.Inheritance.ProtectedAccessModifier;

import com.systechafrica.Part2.Inheritance.ProtectedAccessModifier.Nomencleture.Kingdom.Kingdom;

public class ProtectedAccessModifierDemo {


    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        //kingdom.sampleMethod(); //! does not compile
    }

}
