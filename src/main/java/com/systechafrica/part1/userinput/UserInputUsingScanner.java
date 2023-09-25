package com.systechafrica.part1.userinput;

import java.util.logging.Logger;
import java.util.Scanner; // importing the Scanner class in order to access the methods to input data

public class UserInputUsingScanner {
    private static final Logger LOGGER = Logger.getLogger(UserInputUsingScanner.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //The Scanner class uses the System.in parameter
        final String EXP_USERNAME = "Lena";
        final String EXP_PASSWORD = "Admin123";

        // Reading a String Input use .nextLine()
        System.out.println("Enter your username ");
        String userName = scanner.nextLine();

        System.out.println("Enter your password ");
        String userPassword = scanner.nextLine();

        if (userName.equals(EXP_USERNAME) && userPassword.equals(EXP_PASSWORD)) {
            System.out.println("Welcome, Karibu");
        } else {
            System.err.println("Oops! Try Again");
        }

        //Reading Integers
        int idNumber = scanner.nextInt();
        System.out.println("ID is: " + idNumber);

        //Reading Doubles
        double price = scanner.nextDouble();
        System.out.println("The cost is: " + price);

        //Reading Boolean values
        double isPossible = scanner.nextDouble();
        System.out.println("Task complexity is: " + isPossible);

        //Closing the scanner
        //Scanner.close();

    }
    
}
