package com.systechafrica.Assignments.ShopPos;

public class ReceiptItem extends Item{

    private final int quantity;

    public ReceiptItem(String code, String name, double unitPrice, int quantity) {
        super(code, name, unitPrice);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
