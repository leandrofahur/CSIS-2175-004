package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfRecords = 0;
        System.out.println("Number of student records to be entered:");
        numberOfRecords = scanner.nextInt();

        // Instatiate an array of the class student:
        Student[] studentArray = new Student[numberOfRecords];

        int id = 0;
        String name = "";
        double marks = 0.00;

        // Loop to add students into the array:
        for(int i = 0; i < numberOfRecords; i++) {
            System.out.println("Enter data for student " + (i+1));

            System.out.println("Enter student id");
            id = scanner.nextInt();

            System.out.println("Enter student name");
            name = scanner.next();

            System.out.println("Enter student marks");
            marks = scanner.nextDouble();

            Student student = new Student(id, name, marks);
            studentArray[i] = student;
        }

        for(int i = 0; i < numberOfRecords; i++) {
            System.out.println(studentArray[i].toString());
        }


    }
}
