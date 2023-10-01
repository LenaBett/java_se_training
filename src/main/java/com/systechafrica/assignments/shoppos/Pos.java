package com.systechafrica.assignments.shoppos;

import java.util.Scanner;

public class Pos {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Pos pos = new Pos();

        if (!pos.loginAttempt()) {
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