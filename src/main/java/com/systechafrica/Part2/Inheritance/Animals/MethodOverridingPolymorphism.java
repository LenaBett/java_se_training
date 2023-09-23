package com.systechafrica.Part2.Inheritance.Animals;

public class MethodOverridingPolymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal anyAnimal = new Animal();
        dog.makeSound();
        cat.makeSound();

        Animal dog2 = new Animal();
        dog2.makeSound();
    }
}
