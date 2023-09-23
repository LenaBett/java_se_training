package com.systechafrica.Part2.Classes;

public class ClassesDemo {
    public static void main(String[] args) {
        ClassesDemo app = new ClassesDemo();
        app.internInstances();
        app.calculator();
    }

    public void carInstances(){
        Car demio = new Car();
        demio.color = "Red";
        demio.speed = 50;

        //drive
        demio.startEngine();
        demio.accelerate();

        Car pajero = new Car();
        pajero.color = "Maroon";
        pajero.speed = 120;

        // drive your Pajero
        pajero.startEngine();
        pajero.accelerate();
    }

    public void internInstances() {
        Intern maria = new Intern();
        maria.name = "Marianna";
        maria.phoneNumber = "08600500";
        maria.email = "hbdjs@jn.com";
        maria.attendClass();
        maria.doAssignment();

        Intern jude = new Intern();
        jude.name = "Judashio";
        jude.phoneNumber = "08600500";
        jude.email = "hbdjs@jn.com";
        jude.attendClass();
        jude.doAssignment();

        Intern bob = new Intern("Bob", "555-tom-98", "tommy@gnail.com" );
        bob.doAssignment();
        bob.attendClass();
    }

    public void calculator(){
        Calculator calc = new Calculator();
        calc.displayWelcomeMessage(); // Calling a method without parameters and return type
        int result = calc.add(5, 3); // Calling a method with parameters and return type
        System.out.println("The sum is: " + result);
    }

}