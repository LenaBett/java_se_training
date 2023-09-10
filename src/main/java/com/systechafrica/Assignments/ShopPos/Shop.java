package com.systechafrica.Assignments.ShopPos;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final List<Item> inventory;


    public Shop() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("code-1", "Chips", 1000));

        inventory = items;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public Item getItem(String code) {
        return inventory.stream().
                filter(item -> item.getCode().equals(code))
                .findAny()
                .orElse(null);
    }
}
