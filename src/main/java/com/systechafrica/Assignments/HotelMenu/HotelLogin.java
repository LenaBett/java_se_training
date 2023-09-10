package com.systechafrica.Assignments.HotelMenu;

import java.util.Scanner;

public class HotelLogin {
    private final Scanner scanner = new Scanner(System.in);

    public boolean login() {
        // Set the expected password
        String expectedPwd = "Admin123";

        // initialize a boolean variable to compare the expected password to the password provided by the user
        boolean isPasswordMatch = false;

        // Prompt user for password
        // Create a loop that gives the user 3 attempts to enter their password before quiting
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Enter your password");
            String userInput = scanner.nextLine();

            if (expectedPwd.equals(userInput)) {
                isPasswordMatch = true;
                break;
            }

        }

        // When correct password is provided, the POS menu is displayed
        if (isPasswordMatch) {
            System.out.println("Login Successful");

        }

        return isPasswordMatch;
    }
}
