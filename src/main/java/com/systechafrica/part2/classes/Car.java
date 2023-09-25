package com.systechafrica.part2.classes;

public class Car {
    // Class variables(attributes)
    String color;
    int speed;

    //Class methods(behaviors)
    void startEngine(){
        System.out.println("Engine has started");
    }

    void accelerate(){
        speed += 10;
        System.out.println("Speed has increased to" + speed + "Km/h");
    }

}