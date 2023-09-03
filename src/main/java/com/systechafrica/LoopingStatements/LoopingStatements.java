package com.systechafrica.LoopingStatements;

import java.util.logging.Logger;

public class LoopingStatements {
    private static final Logger LOGGER = Logger.getLogger(LoopingStatements.class.getName());

    public void forLoop() { //Executes a block of code for a specified number of times
        // for (initialize; condition; update){}
        for (int counter = 0; counter <= 10; counter = counter + 1) {
            LOGGER.info("Count = " + counter);
        }
        for (int counter = 0; counter <= 10; counter += 1) {
            LOGGER.info("Count = " + counter);
        }
        for (int counter = 0; counter <= 10; counter++) {
            LOGGER.info("Count = " + counter);
        }
    }

    public void whileLoop() {
        // Executes the block of code for as long as the condition is true
        // while (condition){}
        int studentCount = 0;
        int counter = 0;
        while (studentCount < 10) {
            LOGGER.info("Student Count = " + studentCount);
            studentCount++;
        }
        LOGGER.info("Counter = " + counter);
    }

    public void doWhileLoop() {
        // Executes a block of code atleast once before checking the condition
        int myNumber = 0;
        int counter = 0;
        do {
            LOGGER.info("My number is: " + myNumber);
            myNumber++;
            counter++;
        } while (myNumber < 10);
        LOGGER.info("Counter = " + counter);

    }

    public void breakJumpStatement() {
        // Terminates the loop or switch statement and transfers control to the next statement.
        LOGGER.info("Before my loop ");
        for (int index = 0; index < 10; index++) {
            if (index == 5) {
                break; // exit the loop when index == 5
            }
            LOGGER.info("My index is: " + index);
        }
        LOGGER.info("After my loop ");
    }

    public void continueJumpStatement() {
        // Skips the rest of the loop iteration and starts the next iteration

        LOGGER.info("Before my loop ");
        for (int index = 0; index < 10; index++) {
            if (index == 5) {
                continue; // skip the execution of the code when index == 5
                         // but continue with the loop until the condition is satisfied
            }
            LOGGER.info("My index is: " + index);
        }
        LOGGER.info("After my loop ");

    }

    public int search(int numberToSearch) {
        for (int index = 1; index <= 50; index++) {
            if (index == numberToSearch) {
                return index;
            }
        }
        return 0;
    }

    public void returnJumpStatement() {
        // terminates the execution of a method and returns a value
        LOGGER.info("Before my loop ");
        for (int index = 0; index < 10; index++) {
            if (index == 4) {
                return; // terminate the entire method when index == 4
            }
            LOGGER.info("My index is: " + index);
        }
        LOGGER.info("After my loop ");

    }

    public static void main(String[] args) {
        LoopingStatements app = new LoopingStatements();
        app.forLoop();
        app.whileLoop();
        app.doWhileLoop();
        app.breakJumpStatement();
        app.continueJumpStatement();
        app.returnJumpStatement();


    }
}