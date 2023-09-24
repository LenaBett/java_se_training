package com.systechafrica.Part2.Constructors;


import java.util.HashMap;
import java.util.Map;

public class ConstructorsDemo {

    public static void main(String[] args) {
        Book book1 = new Book(23, "Introduction", true);
        Book book2 = new Book(23, "Introduction", true);


        if (book1.equals(book2)) {
            System.out.println("Are equal");
        } else {
            System.out.println("Not equal");
        }

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        Map<Integer, Book> books = new HashMap<>();
        books.put(book1.getIsbn(), book1);
        books.put(book2.getIsbn(), book2);
    }
}
