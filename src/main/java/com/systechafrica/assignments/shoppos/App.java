package com.systechafrica.assignments.shoppos;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        App app = new App(); // instance of the App class

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