package com.systechafrica.part2.accessmodifiers;

import com.systechafrica.part2.accessmodifiers.lms.Book;

public class AccessModifiersDemo {
    // private static final Logger LOGGER = Logger.get.Logger(AccessModifiersDemo.class.getName);

    public static void main(String[] args) {
        Person person1 = new Person("John", "John@gmail.com");
        Person person2 = new Person();
        person1.setName("John"); // cannot be accessed because the variables are private
        person1.setEmail("John@gmail.com");
        person1.printPersonDetails();
        // person.getPersonalDetails(); // cannot be accessed because the method is private
        person2.setName("James");
        person2.setEmail("jamo@example.com");
        person2.getName();
        person2.printPersonDetails();

    }

    public void accessDefault(){
        Book book= new Book();
//        book.isbn = "7368298639798";
//        book.title= "java Programming";
//        book.printBookDetails();
        // cannot be complied because the properties are package-private due to the default access modifier

    }
}
