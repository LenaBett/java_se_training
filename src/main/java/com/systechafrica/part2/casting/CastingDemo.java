package com.systechafrica.part2.casting;

import com.systechafrica.part2.inheritance.animals.Animal;
import com.systechafrica.part2.inheritance.animals.Cat;
import com.systechafrica.part2.inheritance.animals.Dog;

public class CastingDemo {
    public static void main(String[] args) {
        CastingDemo app = new CastingDemo();
        Animal animal = new Dog(); // Upcasting(implicit casting)
//        Animal animal = new Animal();
//        Animal animal = new Cat();
        app.printInfo(animal);
//       System.out.println(animal.printName()); //will not compile because printName is a function in the child class
        System.out.println(((Dog) animal).printName());
    }

//    Dog dog = new  Animal(); // cannot compile because dog is not the super class for the Animal class

    public void printInfo(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  //Converting the object 'animal' to be an object of the Dog class
            // Downcasting(Explicit casting)
            dog.makeSound();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println(cat.printName());
        }
    }

}
