package com.company;

import java.util.Scanner;

public class Q03 {
    public static boolean questionThree(int[] myArray) {
        for(int i = 0; i < myArray.length-2; i++) {
            if(myArray[i] != myArray[i+1]) {
                if(myArray[i] == myArray[i+2]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int[] myArray = {1,7,7};
        // int[] myArray = {1,7,1,7};
        int[] myArray = {1,7,7,7,5};
        System.out.println(questionThree(myArray));

    }
}
