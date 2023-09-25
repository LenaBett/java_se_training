package com.systechafrica.part2.inheritance.Animals;

public class Cat extends Animal {
    @Override
    public void  makeSound(){
        System.out.println("Cat meows");
    }
    public String printName(){
        return "Cat";
    }
}
