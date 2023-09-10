package com.systechafrica.Assignments.ShopPos;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        App app = new App(); // instance of the App class

        // calling the methods
        if (!app.loginAttempt()) {
            return;
        }

        Shop shop = app.createShop();
        Reciept salesReciept = app.createReciept();

        boolean itemExists = false;

        do {
            System.out.println("Enter the item code");
            String code = scanner.nextLine();
            Item item = shop.getItem(code);
            itemExists = item != null;
            if (!itemExists) {
                break;
            }

            System.out.println("Enter the quantity ");
            int quantity = scanner.nextInt();
            RecieptItem recieptItem = new RecieptItem(item.getCode(), item.getName(),item.getUnitPrice(),quantity);
        } while(!itemExists);


    }

    public boolean loginAttempt() {
        Login login = new Login();
        return login.login();
    }

    public Shop createShop() {
        Shop shop = new Shop();
        return shop;
    }

    public Reciept createReciept(){
    Reciept reciept = new Reciept("b3452");
    return reciept;
    }





}
