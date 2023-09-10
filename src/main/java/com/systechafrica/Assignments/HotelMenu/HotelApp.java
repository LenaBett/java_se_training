package com.systechafrica.Assignments.HotelMenu;

import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HotelApp hotelApp = new HotelApp();

        if (!hotelApp.loginAttempt()) {
            return;
        }

        Hotel hotel = new Hotel();

        Order order = new Order();

        boolean loop = true;

        do {
            int itemId = hotelApp.displayMenu();
            Item item = hotel.getItem(itemId);
            order.addItem(item);

            System.out.println("Do you want to add another meal/drink option?");
            System.out.println("Y. Yes ");
            System.out.println("N. No");
            String option = scanner.nextLine();

            if (!"Y".equals(option)) {
                loop = false;
            }
        } while (loop);

        System.out.println("Proceed to payment? ");
        if ("Y".equals(scanner.nextLine())){
            order.payNow();
            order.displayOrder();
        }else{
            return;
        }
    }


    public boolean loginAttempt() {
        HotelLogin login = new HotelLogin();
        return login.login();
    }

    public int displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println(" SYSTECH RESTAURANT:");
        System.out.println("");
        System.out.println("Drinks:");
        System.out.println("1. Soda-------- 50");
        System.out.println("2. Chai-------- 30");
        System.out.println("3. Water-------- 20");
        System.out.println("4. Coffee-------- 40");
        System.out.println("");
        System.out.println("Meals:");
        System.out.println("5. Githeri-----------30");
        System.out.println("6. Ndengu + accompaniments-----------70");
        System.out.println("7. Beans + accompaniments------------80");
        System.out.println("8. Beef Stew + accompaniments--------30");
        System.out.println("9. Quit");
        System.out.println("Enter your Drink/Meal option");

        return scanner.nextInt();
    }



}
