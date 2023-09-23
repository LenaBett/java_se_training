package com.systechafrica.Part2.Inheritance.Animals;

public class Cat extends Animal {
    @Override
    public void  makeSound(){
        System.out.println("Cat meows");
    }
    public String printName(){
        return "Cat";
    }

}
