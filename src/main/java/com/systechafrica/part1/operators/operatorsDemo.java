package com.systechafrica.part1.operators;

import java.util.logging.Logger;

public class operatorsDemo {
    // operators are symbols that perform operations on operands.
    // Operands can be Variables, Constants or expressions

    private static final Logger LOGGER = Logger.getLogger(operatorsDemo.class.getName());

    public void arithmeticOperators() {
        // Assignment Operator
        int studentOneAge = 23;
        int studentTwoAge = 19;

        // Addition operator
        int totalClassAge = studentOneAge + studentTwoAge;
        LOGGER.info("Total class Age: " + totalClassAge);

        // Subtraction operator
        int ageDifference = studentOneAge - studentTwoAge;
        LOGGER.info("Age difference: " + ageDifference);

        // Multiplication operator, product of ages
        int ageProduct = studentOneAge * studentTwoAge;
        LOGGER.info("Age product: " + ageProduct);

        // Division operator
        // ? division between integers result to an integer value otherwise double value
        int divisionResult = studentOneAge / studentTwoAge;
        LOGGER.info("Division: " + divisionResult);

        // ! To ensure correct values with precision use double data type
        double divisionResultInDouble = (double) studentOneAge / studentTwoAge;
        LOGGER.info("Division with precision: " + divisionResultInDouble);

        // Modulus operator => give the remainder of division result
        int remainder = studentOneAge % studentTwoAge;
        LOGGER.info("Remainder: " + remainder);

    }

    public void assignmentOperators() {
        // simple assignment operator
        int quantity = 35;

        // addition assignment operator
        quantity += 10; // quantity = quantity + 10;
        LOGGER.info("Quantity: " + quantity);

        // multiplication assignment operator
        quantity *= 100; // quantity = quantity * 100;
        LOGGER.info("Quantity: " + quantity);

        // division assignment operator
        quantity /= 20; // quantity = quantity / 20;
        LOGGER.info("Quantity: " + quantity);
    }

    public void comparisonOperators() {
        int studentOneAge = 20;
        int studentTwoAge = 25;

        // Equality operator
        boolean isStudentOneAgeEqualToStudentTwoAge = studentOneAge == studentTwoAge;
        LOGGER.info("isStudentOneAgeEqualToStudentTwoAge: " + isStudentOneAgeEqualToStudentTwoAge);

        // Inequality (Not Equal) operator
        boolean isStudentOneAgeNotEqualToStudentTwoAge = studentOneAge != studentTwoAge;
        LOGGER.info("isStudentOneAgeNotEqualToStudentTwoAge: " + isStudentOneAgeNotEqualToStudentTwoAge);

        // less-than operator
        boolean isStudentOneAgeLessThanStudentTwoAge = studentOneAge < studentTwoAge;
        LOGGER.info("isStudentOneAgeLessThanStudentTwoAge: " + isStudentOneAgeLessThanStudentTwoAge);

        // greater-than operator
        boolean isStudentOneAgeGreaterThanStudentTwoAge = studentOneAge > studentTwoAge;
        LOGGER.info("isStudentOneAgeGreaterThanStudentTwoAge: " + isStudentOneAgeGreaterThanStudentTwoAge);

        //! DONE: Do one for less than or equal to operator
        boolean isStudentOneAgeLessThanOrEqualToStudentTwoAge = studentOneAge <= studentTwoAge;
        LOGGER.info("IsStudentOneAgeLessThanOrEqualToStudentTwoAge: " + isStudentOneAgeLessThanOrEqualToStudentTwoAge);

        //! DONE: Do one for greater than or equal to operator
        boolean isStudentOneAgeGreaterThanOrEqualToStudentTwoAge = studentOneAge >= studentTwoAge;
        LOGGER.info("IsStudentOneAgeGreaterThanOrEqualToStudentTwoAge: " + isStudentOneAgeGreaterThanOrEqualToStudentTwoAge);
    }

    public void andLogicalOperator() { // the statement is true only if both statements are true
        int studentOneAge = 17;
        int studentTwoAge = 25;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        boolean isStudentTwoAllowed = studentTwoAge >= 18;

        // AND operator
        if (isStudentOneAllowed && isStudentTwoAllowed) {
            LOGGER.info("Student allowed for ID registration");
        } else {
            LOGGER.info("Not allowed for registration");
        }

    }

    public void orLogicalOperator() { // if one statement is true, the entire expression is true
        int studentOneAge = 17;
        int studentTwoAge = 25;

        boolean isStudentOneAllowed = studentOneAge >= 18;
        boolean isStudentTwoAllowed = studentTwoAge >= 18;
        // or operator
        if (isStudentOneAllowed || isStudentTwoAllowed) {
            LOGGER.info("Student allowed  for ID registration");
        } else {
            LOGGER.info("Not allowed  for ID registration");
        }
    }

    public void notLogicalOperator() { //negates a statement
        int studentOneAge = 17;
        boolean isStudentOneAllowed = studentOneAge >= 18;
        // not operator
        if (!isStudentOneAllowed) {
            LOGGER.info("Student allowed  for ID registration");
        } else {
            LOGGER.info("Not allowed  for ID registration");
        }
    }

    public static void main(String[] args) {
        operatorsDemo app = new operatorsDemo();
        app.arithmeticOperators();
        app.assignmentOperators();
        app.comparisonOperators();
        app.andLogicalOperator();
        app.orLogicalOperator();
        app.notLogicalOperator();
    }
}