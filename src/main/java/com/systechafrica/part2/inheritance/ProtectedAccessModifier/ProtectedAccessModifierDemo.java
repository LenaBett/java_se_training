package com.systechafrica.part2.inheritance.ProtectedAccessModifier;

import com.systechafrica.part2.inheritance.ProtectedAccessModifier.nomencleture.Kingdom.Kingdom;

public class ProtectedAccessModifierDemo {


    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        //kingdom.sampleMethod(); //! does not compile
    }

}
