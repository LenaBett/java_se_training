package com.systechafrica.Assignments.ShopPos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
private final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        App app = new App(); // instance of the App class

        // calling the methods
        if (app.loginAttempt()) {
            Shop shop = app.createShop();
        }


    }

    public boolean loginAttempt() {
        Login login = new Login();
        return login.login();
    }

    public Shop createShop() {
        Shop shop = new Shop();
        return shop;
    }

    public Reciept customerReciept(){
        Reciept reciept = new Reciept("str008");

        System.out.println("Enter the item code");
        String code = scanner.nextLine();

        System.out.println(" Enter the quantity");
        int quantity = scanner.nextInt();

        RecieptItem recieptItem = new RecieptItem(Item.getCode(), Item.getName(),Item.getUnitPrice());

        return reciept;
    }
}
