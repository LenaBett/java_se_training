package com.systechafrica.assignments.shoppos;

public class Item {
    private final String code;
    private final String name;
    private final double unitPrice;

    public Item(String code, String name, double unitPrice) {
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}