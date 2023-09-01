package com.systechafrica.variables;

import java.util.logging.Logger;

//A variable is a container in which data values can be stored.
public class variablesDemo {
    private static final Logger LOGGER = Logger.getLogger(variablesDemo.class.getName());

     private void variableDeclaration() {
        //To declare a variable, the syntax is: 
        //Data type then the name of the variable
        //? int number; - this declares a variable named 'number that will store an integer value
        // Initialization of a variable is the assignment of a value to the variable
         int score = 0;
         LOGGER.info("Score integer variable value is" + score);
    }

        //Constant variables
     private void constantVariables() {
        //? Constant variables
         //They cannot be changed and are declared using the final key-word
         // the variable name is always in Capital letters
        final double PI_VALUE = 3.14159;
        LOGGER.info("The value of pi is" + PI_VALUE);
    }


    //? Primitive data types
    // they represent basic values and have fixed sizes and ranges

     private void integerTypes(){
        // There are 4 types of integers; byte, short, long, int

         // int values range
         int c = 23;
         LOGGER.info("Maximum integer value is " + Integer.MAX_VALUE);
         LOGGER.info("Minimum integer value is " + Integer.MIN_VALUE);


        // Short values range
         short s = 23;
         LOGGER.info("Maximum Short value is " + Short.MAX_VALUE);
         LOGGER.info("Minimum Short value is " + Short.MIN_VALUE);

        // Long values range - Provides a range of values wider than those provided by int
         long d = 23;
         LOGGER.info("Maximum Long value is " + Long.MAX_VALUE);
         LOGGER.info("Minimum Long value is " + Long.MIN_VALUE);

         //byte is an 8-bit signed two's complement integer
         byte number = 23;
         LOGGER.info("The Maximum byte value is: "+ Byte.MAX_VALUE);
         LOGGER.info("The Minimum byte value is: "+ Byte.MIN_VALUE);
     }

    private void floatingTypes(){
    // float type -- decimal accuracy of up to 7 decimal places. Float type rounds up numbers
    float floatRate = 2.1457454F; //the capital F specifies that the value is a float and not double
    double doubleRate2 = 2.1457454;
    LOGGER.info("Float value is " + floatRate);
    LOGGER.info("Float value is " + doubleRate2);

    }

    private void characterTypes(){
       // character type
       char grade = 'A';
       LOGGER.info("The student's grade is : " + grade);
        //character type
        Character studentGrade = 'G';
    }

     private void booleanTypes(){
       // Boolean type
       // When using boolean variable, the variable name should start with 'is'

       boolean isPromoted = true;
       boolean isProcessed = false;

       LOGGER.info("False value: " + isProcessed);
       LOGGER.info("True value: " + isPromoted);
    }

    //? Wrapper classes
    //A wrapper class is a class that contains the primitive data types.
    //They provide a way to use primitive data types as objects.
    //objects are necessary  to modify the arguments passed into the method
    //(because primitive types are passed by value).
    //wrapper classes provide access to more methods that can be applied to primitive data types
    // Autoboxing
    // Unboxing

    private void wrapperClass(){
         // Autoboxing - primitive types -> objects
         //int wrapper class
        int intPrimitive = 23;
        Integer aIntWrapper = 23;

        aIntWrapper.equals(intPrimitive);

        //byte wrapper class
        byte bytePrimitive = 15;
        Byte aByteWrapper = 15;

        aByteWrapper.compareTo(bytePrimitive);

        //short wrapper class
        short shortPrimitive = 23;
        Short aShortWrapper = 23;
        aShortWrapper.equals(shortPrimitive);

        //Long wrapper class
        long longPrimitive = 65;
        //! you need to explicitly suffix the long wrapper with an 'L'
        Long aLongWrapper = 23L;
        aLongWrapper.notify();

        //character wrapper class
        char studentGrade = 'D';
        Character aStudentGrade = 'D';
        aStudentGrade.equals(studentGrade);

        // float wrapper class
        float price = 0.2365F;
        Float priceFloat = 0.2365F;

        //double wrapper class
        double prtPrice = 0.2365;
        Double priceDouble = 0.2365;
    }

    private void typeCasting(){


    }

    public static void main(String[] args) {
        variablesDemo demo = new variablesDemo();
    
        demo.variableDeclaration();
        demo.constantVariables();
        demo.integerTypes();
        demo.floatingTypes();
        demo.characterTypes();
        demo.booleanTypes();
        demo.wrapperClass();

        long a = 2147483648L;
        
        int b = (int) a;
        LOGGER.info("int value value is:" + b);
    
    }      
}
    

