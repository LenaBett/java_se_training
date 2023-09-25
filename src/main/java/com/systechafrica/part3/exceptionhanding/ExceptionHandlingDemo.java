package com.systechafrica.part3.exceptionhanding;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        ExceptionHandlingDemo app = new ExceptionHandlingDemo();
        // workingWithBasicException(calculator);

        app.workingWithException();
    }

    private Student readStudentDetails(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter your details space separated:");
            String name = scanner.next();
            student.setName(name);
            String regNo = scanner.next();
            student.setName(regNo);
            String email = scanner.next();
            student.setEmail(email);

            System.out.println("Enter your age:");
            int age = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid input");

        }finally{
            System.out.println("Releasing resources...");
        }
        return student;
    }

    private void workingWithException() {
        StudentController studentController = new StudentController();
        try {

            studentController.addStudent(readStudentDetails());
            //send message
            SMSSender sender = new SMSSender();
            sender.sendMessage("You details have been saved");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            //release resources
            studentController = null;
            System.out.println(("Executes no matter what"));
        }
    }


    private static void workingWithBasicException() {
        Calculator calculator = new Calculator();
        try {
            double result = calculator.divide(6L, 0);
            System.out.println(result);
            try {
                calculator.divide(0, 0);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            calculator.sum(2, 2);
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }

}
