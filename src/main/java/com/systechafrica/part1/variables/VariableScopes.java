package com.systechafrica.part1.variables;

import java.util.logging.Logger;

public class VariableScopes {

    //A variable is a container in which data values can be stored.
    private static final Logger LOGGER = Logger.getLogger(variablesDemo.class.getName());
    //This variable can be accessed throughout the class - They are global
    //Class variables are defined as variables that have been declared outside the class methods

    private int matchesPlayed = 0;

    public void simpleMethod() {
        LOGGER.info("Simple method output " + matchesPlayed);
        //The matchesPlayed variable can be accessed by non-static methods without using an instance of the class
    }

    public void complexMethod() {
        LOGGER.info("complex method output ");
    }

    public int addTwoNumbers(int a, int b) { //Method variables are defined as parameters
        // They are Local variables and can only be accessed by the method
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        VariableScopes app = new VariableScopes();
        app.simpleMethod();
        app.complexMethod();
        LOGGER.info("Simple method output " + app.matchesPlayed);
        //to access the "matchesPlayed" variable from a static method, you must use the class instance

    }
}
