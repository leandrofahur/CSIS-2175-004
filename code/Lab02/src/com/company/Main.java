package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 01:
        // Scanner input = new Scanner(System.in);
        // double celsius = 0.0;

        // System.out.print("Please, insert a temperature in Celsius for conversion: ");
        // celsius = input.nextDouble();

        // ConvertTemp convertTemp = new ConvertTemp(celsius);
        // convertTemp.Convert2Fahrenheit();
        // convertTemp.DisplayFahrenheit();

        // 02:
        // EmployeeSalary employeeSalary = new EmployeeSalary();
        // employeeSalary.DisplayInfo();
        // System.out.println("\n");
        // employeeSalary.GetInfo(15.0F, 3.0F, 8.0F);
        // employeeSalary.DisplayInfo();

        // 03:
        // Box line = new Box(1);
        // Box rectangle = new Box(1, 1);
        // Box box = new Box(1,1,1);

        // 04:
        // Shirt shirt = new Shirt(1,1);
        // shirt.displayData();

        // 05:
        // Circle circle = new Circle(1);
        // circle.displayInfo();
        // circle.setRadius(2);
        // circle.displayInfo();



        int a = 0;
        if(a++ <= 0)
        {
            System.out.println(a);
        }

        int score = 0;
        switch (score)
        {
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Great");
            case 3:
                System.out.println("Good");
                break;
            case 2:
                System.out.println("Fair");
            case 1:
                System.out.println("Needs Improvement");
                break;
            default:
                System.out.println("Retake test");
        }

        int maxValue = 0;
        if(maxValue == 100) {
            System.out.println("Max reached");
        } else {
            System.out.println("Keep trying");
        }

        for (int loop = 1; loop <3; ++loop){
            System.out.print(1);

            for (int loop2 = 1; loop2<3; ++loop2) {

                System.out.print(2);
            }
        }

        while(4>2)
            System.out.println ("Hi there");


        if(qtySold > QTY_QUOTA) {
            if (totalSales > SALES_QUOTA) {
                double bonus = BONUSAMT;
            }
        } else {

        }

    }
}
