package com.systechafrica.Assignments.ShopPos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Reciept {
    private final String number;
    private List<RecieptItem> items = new ArrayList<>();
    private double customerPayment;

    public Reciept(String number) {
        this.number = number;
    }


    private void addItem(RecieptItem recieptItem){
        items.add(recieptItem);
    }


}
