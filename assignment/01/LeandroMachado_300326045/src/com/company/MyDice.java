package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyDice {
    public static void main(String[] args) {
        final int MAXIMUM = 6;
        final int MINIMUM = 1;

        // Everytime I se a six, I add a value here:
        List<Integer> listOfOnceOccurence = new ArrayList<Integer>();
        boolean itHasSix = false;

        Scanner input = new Scanner(System.in);
        System.out.println("How many times to roll the dice");
        int numberOfRow = input.nextInt();

        // Loop the number of times it throws the dice:
        for (int i = 0; i < numberOfRow; i++) {
            // Throw the 5 dices:
            for (int j = 0; j < 5; j++) {
                int randomNumber = (int)(Math.random()*MAXIMUM+MINIMUM);
                if(randomNumber == 6) {
                    itHasSix = true;
                }
                System.out.print(randomNumber + " ");
            }
            // Check if there is a 6 among the 5 dices:
            if(itHasSix) {
                listOfOnceOccurence.add(1);
                itHasSix = false;
            }
            System.out.println();
        }
        System.out.println("6 appeared at least once " + listOfOnceOccurence.size());
    }
}