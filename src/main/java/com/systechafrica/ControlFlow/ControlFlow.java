package com.systechafrica.ControlFlow;

import java.util.logging.Logger;

public class ControlFlow {
    private static final Logger LOGGER = Logger.getLogger(ControlFlow.class.getName());

    public void ifelseStatement() {
        int maths = 36;
        char grade;

        if (maths >= 70) {
            grade = 'A';
        }
        //! Assignment: add conditions here to assign grade variable as expected
        // Solution:
        else if (maths >=60) {
                grade = 'B';
        }
        else if (maths >= 50){
                grade = 'C';
        }
        else if (maths >= 40){
                grade = 'D';
        }
        else {
            grade = 'F';
        }
    
        LOGGER.info("Student grade: " + grade); // + grade
    }
    public void switchStatement(){
        String day = "Unknown";
        switch(day){
            case "MONDAY":
                LOGGER.info("Monday working day");
                break;
            case "TUESDAY":
                LOGGER.info("Tuesday working day");
                break;
            case "WEDNESDAY":
                LOGGER.info("Wednesday  working day");
                break;
            case "THURSDAY":
                LOGGER.info("Thursday working day");
                break;
            case "FRIDAY":
                LOGGER.info("Friday working day");
                break;
            case "SATURDAY":
            case "SUNDAY":
                LOGGER.info("Sherehe");
                break;          
            default:
                LOGGER.info("Please specify a valid day");

        }

        
    }
    public static void main(String[] args) {
        ControlFlow app = new ControlFlow();
        app.ifelseStatement();
        app.switchStatement();

    }
}