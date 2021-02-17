package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentSort {
    // Utils: method for sorting:
    // Thanks to https://www.geeksforgeeks.org/bubble-sort/
    public static Student[] bubleeSort(Student[] arr, String method) {
        if(method == "student") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j].getId() < arr[j+1].getId()) {
                        Student tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
        }
        if(method == "name") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j].getName().charAt(j) < arr[j+1].getName().charAt(j)) {
                        Student tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
        }
        if(method == "marks") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j].getMarks() < arr[j+1].getMarks()) {
                        Student tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
        }
        return arr;
    }

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

        System.out.println("Enter student data");
        // Loop to add students into the array:
        for(int i = 0; i < numberOfRecords; i++) {
            System.out.println("Enter data for student " + (i+1));

            System.out.println("Enter student id");
            id = scanner.nextInt();

            System.out.println("Enter student marks");
            marks = scanner.nextDouble();

            System.out.println("Enter student name");
            name = scanner.next();

            Student student = new Student(id, name, marks);
            studentArray[i] = student;
        }

        System.out.println("Information about the student records entered:");
        for(int i = 0; i < numberOfRecords; i++) {
            System.out.println(studentArray[i].toString());
        }

        System.out.println();
        Student[] sortedArray = new Student[numberOfRecords];
        int k = 0;
        do {
            int cmd = 0;
            System.out.println("Enter 1 to sort records by Student Id, 2 to sort by Name, 3 to sort by marks");
            cmd = scanner.nextInt();
            System.out.println();
            switch (cmd) {
                case 1:
                    sortedArray = bubleeSort(studentArray,"student");
                    System.out.println("Information about the student records sorted by Student Id");
                    for(int i = 0; i < numberOfRecords; i++) {
                        System.out.println(sortedArray[i].toString());
                    }
                    System.out.println("Do you want to display sorted student records again? Press 1 to continue");
                    k = scanner.nextInt();
                    break;
                case 2:
                    sortedArray = bubleeSort(studentArray,"name");
                    System.out.println("Information about the student records sorted by Student Name");
                    for(int i = 0; i < numberOfRecords; i++) {
                        System.out.println(sortedArray[i].toString());
                    }
                    System.out.println("Do you want to display sorted student records again? Press 1 to continue");
                    k = scanner.nextInt();
                    break;
                case 3:
                    sortedArray = bubleeSort(studentArray,"marks");
                    System.out.println("Information about the student records sorted by Student Marks");
                    for(int i = 0; i < numberOfRecords; i++) {
                        System.out.println(sortedArray[i].toString());
                    }
                    System.out.println("Do you want to display sorted student records again? Press 1 to continue");
                    k = scanner.nextInt();
                    break;
                default:
                    System.out.println("Enter 1 to sort records by Student Id, 2 to sort by Name, 3 to sort by marks");
                    cmd = scanner.nextInt();
            }
        } while(k == 1);

    }
}
