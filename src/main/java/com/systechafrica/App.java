package com.systechafrica;

import java.util.logging.Logger;
import java.util.Scanner;


public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    private final Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        App appOne = new App(new Scanner(System.in));
        appOne.userLogin();
    }

    public int addNumbers(int a, int b) {
        return a + b;

    }

    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public void userLogin() {
        // Set the expected password
        String expectedPwd = "Admin123";

        // initialize a boolean variable to compare the expected password to the password provided by the user
        boolean ispasswordsMatch = false;

        // Prompt user for password
        // Create a loop that gives the user 3 attempts to enter their password before quiting
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Enter your password");
            String userInput = scanner.nextLine();

            if (expectedPwd.equals(userInput)) {
                ispasswordsMatch = true;
                break;
            }

        }
        if (ispasswordsMatch) {
            homeScreen();
        }

    }

    public void homeScreen() {
    }

}
