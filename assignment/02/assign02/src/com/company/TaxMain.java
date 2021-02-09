package com.company;

import java.util.Scanner;

public class TaxMain {

    // Utils: (Methods to check data:
    public static boolean checkSin(String sin)
    // This method check if the sin number inserted is in the appropriate format:
    {
        // check the size:
        if(sin.length() != 11) {
            return true;
        }

        for(int i = 0; i < sin.length(); i++) {
            // check for the '-':
            if(i == 3 || i == 6) {
                if(sin.charAt(i) != '-') {
                    return true;
                }
            } else {
                // check if the other characters are numbers:
                if(!Character.isDigit(sin.charAt(i)) && sin.charAt(i) != '-') {
                    return true;
                };
            }
        }
        return false;
    }
    // This method check if the zip code is note six digits with the format A9A9B9:sin number inserted is in the appropriate format:
    public static boolean checkZip(String zipCode)
    {
        // check the size:
        if(zipCode.length() != 6) {
            return true;
        }

        for(int i = 0; i < zipCode.length(); i++) {
            // check for the odd number of the string (even numbers are letters)'-':
            if(i%2 == 0) {
                if(Character.isDigit(zipCode.charAt(i))) {
                    return true;
                }
            } else {
                // for the case of odd numbers:
                if(!Character.isDigit(zipCode.charAt(i))) {
                    return true;
                };
            }
        }
        return false;
    }

    // This method check if the annual tax is not negative:
    public static boolean checkAnnualIncome(Double annualIncome) {
        return (annualIncome < 0);
    }

    public static void main(String[] args) {

        // method to receive input from user:
        Scanner scanner = new Scanner(System.in);

        // loop for the user input:
        String sin = "";
        Double annualIncome = 0.00;
        String zipCode = "";

        int i = 0;
        do {
            switch (i) {
                case 0:
                    do{
                        System.out.println("Enter Social Security Number");
                        sin = scanner.next();
                    } while (checkSin(sin));
                    i = 1;
                    break;

                case 1:
                    System.out.println("Enter Annual Income");
                    annualIncome = scanner.nextDouble();
                    if(checkAnnualIncome(annualIncome)) {
                        i = 0;
                        break;
                    } else {
                        i = 2;
                        break;
                    }

                case 2:
                    System.out.println("Enter Zip Code");
                    zipCode = scanner.next();
                    if(checkZip(zipCode)) {
                        i = 0;
                        break;
                    } else {
                        i = 3;
                        break;
                    }
            }
        } while (i != 3);

        String lastName;
        System.out.println("Enter Last Name");
        lastName = scanner.next();

        String firstName;
        System.out.println("Enter First Name");
        firstName = scanner.next();

        String streetAddress;
        System.out.println("Enter Street name");
        streetAddress = scanner.next();

        String city;
        System.out.println("Enter City name");
        city = scanner.next();

        String state;
        System.out.println("Enter State name");
        state = scanner.next();


        // Generate the object, set the annual income and display information:
        TaxPay taxPay = new TaxPay(sin, firstName,lastName,streetAddress,city,state, zipCode);
        taxPay.setAnnualIncome(annualIncome);
        System.out.println(taxPay.toString());
    }
}
