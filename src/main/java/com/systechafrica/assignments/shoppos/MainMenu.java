package com.systechafrica.assignments.shoppos;

import java.util.Scanner;

public class MainMenu {
    private Scanner scanner;

    private final Shop shop;

    private final Receipt receipt = new Receipt();

    public MainMenu(Scanner scanner, Shop shop) {
        this.scanner = scanner;
        this.shop = shop;
    }

    public void displayMenu() {
        scanner = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println(" SYSTECH POS SYSTEM");
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("1. Add Item");
        System.out.println("2. Make Payment");
        System.out.println("3. Display Receipt");
        System.out.println("");
        System.out.println("Choose an Option");

        String selectedOption = scanner.nextLine();

        switch (selectedOption) {
            case "1":
                addReceiptItem();
                break;
            case "2":
                makePayment();
                break;
            case "3":
                receipt.printReceipt();
                return;
        }

        displayMenu();
    }

    private void addReceiptItem() {
        System.out.println("Enter the item code");
        String code = scanner.next();
        Item item = shop.getItem(code);

        if (item == null) {
            System.out.println("Item not found. Please Try Again.");
            addReceiptItem();
        }

        System.out.println("Enter the quantity ");
        int quantity = scanner.nextInt();
        ReceiptItem receiptItem = new ReceiptItem(item.getCode(), item.getName(), item.getUnitPrice(), quantity);
        receipt.addItem(receiptItem);

        System.out.println("Add another Item: Y. Yes N. No");
        String addAnotherItem = scanner.next();
        if ("Y".equals(addAnotherItem)) {
            addReceiptItem();
        }
    }

    private void makePayment() {
        System.out.println("Please Enter Valid Payment Amount: ");
        double payment = scanner.nextDouble();
        if (receipt.makePayment(payment)) {
            receipt.makePayment(payment);
        } else {
            System.out.println("Please enter a greater payment amount than the total bill.");
            makePayment();
        }
    }
}
