package com.systechafrica.Part2.Encapsulation;

import java.util.Scanner;

public class StudentMs {
    public static void main(String[] args) {
        // register students 3
        // you have the total number of students

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int noOfStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[noOfStudents];
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the student id: ");
            int studentId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the student regNo: ");
            String regNo = scanner.nextLine();
            System.out.print("Enter the student name: ");
            String name = scanner.nextLine();
            Student s = new Student(studentId, regNo, name);
            students[i] = s;

        }
        System.out.println(students[0].toString());
        System.out.println(students[1].toString());


        scanner.close();
    }
}