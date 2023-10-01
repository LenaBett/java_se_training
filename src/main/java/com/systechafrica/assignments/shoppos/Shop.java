package com.systechafrica.assignments.shoppos;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final List<Item> inventory;



    public Shop() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("a-1", "Apple", 25));
        items.add(new Item("a-2", "Avocado", 30));
        items.add(new Item("a-3", "Apricot", 12.5));
        items.add(new Item("b-1", "Banana", 3.33));
        items.add(new Item("b-2", "Basket", 40.5));
        items.add(new Item("b-3", "Bacon", 400));

        items.forEach(Item::save);


        inventory = items;
    }

    public Item getItem(String code) {
        return inventory.stream().
                filter(item -> item.getCode().equals(code))
                .findAny()
                .orElse(null);
    }

}
