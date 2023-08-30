package com.systechafrica.LoopingStatements;

import java.util.logging.Logger;

public class LoopingStatements {
    private static final Logger LOGGER = Logger.getLogger(LoopingStatements.class.getName());

    public void forLoop() {
        // initialize condition update
        for (int counter = 0; counter <= 10; counter = counter + 1) {
            LOGGER.info("Count = " + counter);
        }
        for (int counter = 0; counter <= 10; counter += 1) {
            LOGGER.info("Count = " + counter);
        }
        for (int counter = 0; counter <= 10; counter++) {
            LOGGER.info("Count = " + counter);
        }
        // for (int counter = 10; counter <= 0; counter--){
           //  LOGGER.info("Count = " + counter);
         // }
    }

    public void whileLoop() {
        int studentCount = 0;
        int counter = 0;
        while (studentCount < 10) {
            LOGGER.info("Student Count = " + studentCount);
            studentCount++; // studentCount = studentCount + 1
        }
        LOGGER.info("Counter = " + counter);
    }

    public void doWhileLoop() {

        int myNumber = 0;
        int counter = 0;
        do {
            LOGGER.info("My number is: " + myNumber);
            myNumber++; // myNumber = myNumber + 1
            counter++;
        } while (myNumber < 10);
        LOGGER.info("Counter = " + counter);

    }

    public void breakJumpStatements() {
        LOGGER.info("Before my loop ");
        for (int index = 0; index < 10; index++) {
            if (index == 5) {
                break;
            }
            LOGGER.info("My index is: " + index);
        }
        LOGGER.info("After my loop ");
    }

    public void continueJumpStatements() {
        LOGGER.info("Before my loop ");
        for (int index = 0; index < 10; index++) {
            if (index == 5) {
                continue;
            }
            LOGGER.info("My index is: " + index);
        }
        LOGGER.info("After my loop ");

    }

    public int search(int numberToSearch){
        for (int index = 1; index <= 50; index++) {
            if(index == numberToSearch){
                return index;
            }
        }
        return 0;
    }

    public void returnJumpStatements() {
        LOGGER.info("Before my loop ");
        for (int index = 0; index < 10; index++) {
            if (index == 4) {
                return;
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
        app.breakJumpStatements();
        app.continueJumpStatements();
        app.returnJumpStatements();
       

    }
}