package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    // 01:
        // String ageStr = JOptionPane.showInputDialog(null, "Enter your age:");
        // int  age = Integer.parseInt(ageStr);
        // System.out.println("Your age is " + age);


        // 02:
        // String[] dish = new String[4];
        // String[] price = new String[4];
        // double sum = 0.00;
        // for (int i = 0; i < 4; i++)
        // {
        //     dish[i] = JOptionPane.showInputDialog("Enter the name of the dish:");
        //     price[i] = JOptionPane.showInputDialog("Enter the price of the dish:");
        //     sum += Double.parseDouble(price[i]);
        // }
        // sum = 1.02*sum;
        // System.out.println(sum);


        // 03:
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter a four digit number: ");
        Integer number = inputDevice.nextInt();

        Integer num1 = 0;
        Integer num2 = 0;
        Integer num3 = 0;
        Integer num4 = 0;

        num4 = number % 10;
        num3 = (number / 10) % 10;
        num2 = (number / 100) % 10;
        num1 = (number / 1000) % 10;

        System.out.println("The " + number + " digits are: " + num1 + " " + num2 + " " + num3 + " " + num4);

        // 04:
        // Scanner inputDevice = new Scanner(System.in);
        // System.out.println("Please enter the number of chickens: ");
        // Integer numberOfChickens = inputDevice.nextInt();
        // System.out.println("Please enter the number of cows: ");
        // Integer numberOfCows = inputDevice.nextInt();
        // System.out.println("Please enter the number of sheeps: ");
        // Integer numberOfSheeps = inputDevice.nextInt();

        // System.out.println("The number of legs are: " + (numberOfChickens*2 + numberOfCows*4 + numberOfSheeps*4));
    }
}
