package com.systechafrica.assignments.hotelmenu;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Item> menu;

    public Hotel() {
        List<Item> drinks = new ArrayList<>();
        drinks.add(new Item("Soda", 50));
        drinks.add(new Item("Chai", 30));
        drinks.add(new Item("Water", 20));
        drinks.add(new Item("Coffee", 40));

        List<Item> meals = new ArrayList<>();
        meals.add(new Item("Githeri", 30));
        meals.add(new Item("Ndengu + accompaniment", 70));
        meals.add(new Item("Beans + accompaniment", 80));
        meals.add(new Item("Beef stew + accompaniment", 120));

        menu = new ArrayList<>();
        menu.addAll(drinks);
        menu.addAll(meals);
    }

    public Item getItem(int itemNumber) {
        return menu.get(itemNumber - 1);
    }
}
