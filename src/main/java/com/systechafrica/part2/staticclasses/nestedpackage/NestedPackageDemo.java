package com.systechafrica.part2.staticclasses.nestedpackage;

import com.systechafrica.part2.staticclasses.ATMUtils;

import static com.systechafrica.part2.staticclasses.ATMUtils.maskCardNumber;

public class NestedPackageDemo {
    public static void main (String[] args) {
        String cardNumber = "1234567892456789";
        System.out.println(maskCardNumber(cardNumber));//XXXXXXXXXXXX6789
    }
}
