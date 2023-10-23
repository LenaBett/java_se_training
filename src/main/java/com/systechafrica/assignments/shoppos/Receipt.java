package com.systechafrica.assignments.shoppos;

import com.systechafrica.assignments.shoppos.ReceiptItem;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<ReceiptItem> items = new ArrayList<>();
    private double customerPayment;


    public void addItem(ReceiptItem receiptItem) {
        items.add(receiptItem);
    }

    public Double computeTotalAmount (){
        double totalAmount = 0.0;
        for (ReceiptItem item : items) {
            totalAmount += item.getQuantity() * item.getUnitPrice();
        }

        return totalAmount;
    }

    public boolean makePayment(double payment){

        if (payment < computeTotalAmount()){
            return  false;
        }else{
            customerPayment = payment;
            return true;
        }
    }

    public boolean receiptIsEmpty(){
        return items.isEmpty();
    }

    public void printReceipt() {
        System.out.println("Item Code    Quantity    Unit Price  Total Value");

        for (ReceiptItem item : items) {
            double totalValue = item.getQuantity() * item.getUnitPrice();
            System.out.println(item.getCode() + "\t" + item.getQuantity() + "\t" + item.getUnitPrice() + "\t" + totalValue);

        }
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("Total " + computeTotalAmount() );
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("");
        System.out.println("Change: " + (customerPayment - computeTotalAmount()));
        System.out.println("***************************************");
        System.out.println("");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("***************************************");
    }


}
