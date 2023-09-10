package com.systechafrica.Assignments.ShopPos;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        App app = new App(); // instance of the App class

        // calling the methods
        if (!app.loginAttempt()) {
            return;
        }

        MainMenu mainMenu = new MainMenu(scanner, new Shop());
        mainMenu.displayMenu();

    }

    public boolean loginAttempt() {
        Login login = new Login();
        return login.login();
    }
}