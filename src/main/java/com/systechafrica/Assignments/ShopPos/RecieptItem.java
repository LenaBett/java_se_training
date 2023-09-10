package com.systechafrica.Assignments.ShopPos;

public class RecieptItem extends Item{

    private final int quantity;

    public RecieptItem(String code, String name, double unitPrice, int quantity) {
        super(code, name, unitPrice);
        this.quantity = quantity;
    }
}
