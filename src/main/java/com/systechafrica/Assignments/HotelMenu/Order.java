package com.systechafrica.Assignments.HotelMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

    List<Item> items = new ArrayList<>();

    private double balance = 0;
    Scanner scanner;
    private double customerPayment;

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double totalAmount = 0;
        for (var item : items) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }

    public void displayOrder() {
        System.out.println("Pay now for ");

        for (var item : items) {
            System.out.println(item.getName() + "............." + item.getPrice());
        }
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("Total " + calculateTotal());
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("Balance is: " + (customerPayment - calculateTotal()));
        System.out.println("***************************************");
    }


    public void payNow() {
        scanner = new Scanner(System.in);
        System.out.println("Please enter valid payment: ");
        double payment = scanner.nextDouble();
        if (payment < calculateTotal()) {
            System.out.println("Amount less than total billed.");
            payNow();
        } else {
            customerPayment = payment;
        }
    }
}
