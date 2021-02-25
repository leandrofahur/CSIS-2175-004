package com.company;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.attribute.*;


public class EmployeePlay {
    public static Employee[] bubleeSort(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j].getSalary() > arr[j+1].getSalary()) {
                    Employee tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        String path = "//Users//leandro//Desktop//le//douglas_college//CSIS_2175//code//Chapter07//src//Assets//Emp.txt";
        // Retrieving information about the path:
        Path filePath = Paths.get(path);
        int count = filePath.getNameCount();
        System.out.println("Path: " + filePath.toString());

        String str = "";

        // Creating and reading sequential data files:


            Scanner scanner = new Scanner(System.in);

            int numberOfEMployees = 0;
            System.out.println("How many employees");
            str = "How many employees\n";
            numberOfEMployees = scanner.nextInt();
            str = numberOfEMployees + "\n";
            Employee[] employees = new Employee[numberOfEMployees];

            for(int i = 0; i < employees.length; i++) {
                System.out.println("Enter information for Employee " + (i+1));
                str = "Enter information for Employee\n";
                String name = "";
                System.out.println("Enter employee name");
                str = "Enter employee name\n";
                name = scanner.next();
                str = name + "\n";

                int age = 0;
                System.out.println("Enter employee age");
                str = "Enter employee age\n";
                age = scanner.nextInt();
                str = age + "\n";

                double salary = 0.00;
                System.out.println("Enter employee salary (thousand)");
                str = "Enter employee salary (thousand)\n";
                salary = scanner.nextDouble();
                str = salary + "\n";

                Employee employee = new Employee(name, salary, age);
                employees[i] = employee;

                //System.out.println(employees[i].toString());
            }

            Employee[] sortedArray = new Employee[numberOfEMployees];
            int ctrl = 0;
            do {
                System.out.println("Enter 1 to List information about all the employees");
                System.out.println("Enter 2 to Search for an employee and display its information");
                System.out.println("Enter 3 to Display Sorted employee information on basis of their salary");
                str = "Enter 1 to List information about all the employees\n";
                str = "Enter 2 to Search for an employee and display its information\n";
                str = "Enter 3 to Display Sorted employee information on basis of their salary\n";

                ctrl = scanner.nextByte();
                str = ctrl + "\n";

                switch (ctrl) {
                    case 1:
                        for (int i = 0; i < employees.length; i++) {
                            System.out.println(employees[i].toString());
                            str = employees[i].toString() + "\n";
                        }
                        break;

                    case 2:
                        String searchEmployee = "";
                        System.out.println("Which employee to be searched");
                        str = "Which employee to be searched\n";
                        searchEmployee = scanner.next();
                        str = searchEmployee;
                        for (int i = 0; i < employees.length; i++) {
                            if(employees[i].getName() == searchEmployee) {
                                System.out.println(employees[i].toString());
                                str = employees[i].toString() + "\n";
                            }
                        }
                        break;

                    case 3:
                        sortedArray = bubleeSort(employees);
                        for (int i = 0; i < employees.length; i++) {
                            System.out.println(sortedArray[i].toString());
                            str = employees[i].toString() + "\n";
                        }
                        // to break the loop and write to file;
                        ctrl = -1;
                        break;
                }

            } while(ctrl != -1);

            byte[] data = str.getBytes();
            OutputStream outputStream = null;
            try {
                outputStream = new BufferedOutputStream(Files.newOutputStream(filePath, CREATE));
                outputStream.write(data);
                outputStream.flush();
                outputStream.close();
            } catch (Exception ex) {
                System.out.println("Exception message: " + ex);
            }
    }
}
