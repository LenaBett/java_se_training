package com.systechafrica.variables;

import java.util.logging.Logger;

public class variablesDemo {
    private static final Logger LOGGER = Logger.getLogger(variablesDemo.class.getName());

     private void variableDeclaration() {
        //integer values
                int score = 0;
                LOGGER.info("score integer variable value is" + score);
    }

     private void constantVariables() {
        //? Constant variables
        final double PI_VALUE = 3.14159;
        LOGGER.info("The PI_VALUE is" + PI_VALUE);
    }

    private void integerTypes(){

        LOGGER.info("Maximumm integer value is " + Integer.MAX_VALUE);
        LOGGER.info("Minimumm integer value is " + Integer.MIN_VALUE);

        LOGGER.info("Maximumm Long value is " + Long.MAX_VALUE);
        LOGGER.info("Minimumm Long value is " + Long.MIN_VALUE);
    }

    private void floatingTypes(){
    // float type
    float floatrate = 3.1475694F;
    double doublerate2 = 3.147569854; 
    LOGGER.info("Float value is " + floatrate);
    LOGGER.info("Float value is " + doublerate2);
    }

    private void characterTypes(){
       // character type
       char grade = 'A';
       LOGGER.info("The student's grade is : " + grade);
    }

     private void booleanTypes(){
       // Boolean type
       // When using boolean variable, the variable name should start with 'is'
       boolean isPromoted = true;
       boolean isProcessed = false;
       LOGGER.info("False value: " + isProcessed);
       LOGGER.info("True value: " + isPromoted);
    }

    public static void main(String[] args) {
        variablesDemo demo = new variablesDemo();
    
        demo.variableDeclaration();
        demo.constantVariables();
        demo.integerTypes();
        demo.floatingTypes();
        demo.characterTypes();
        demo.booleanTypes();
    }      
}
    

