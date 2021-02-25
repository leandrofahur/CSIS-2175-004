package com.company;

import java.util.List;
import java.util.Scanner;

public class Q02 {
    public static String encode(String line) {
        String out = "";
        int count = 1;

        for(int i = 1; i < line.length(); i++) {
            if(line.charAt(i-1) == line.charAt(i)) {
                count++;
            } else {
                out += count + "" + line.charAt(i-1);
                count = 1;
            }
        }

        return out;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the N");
        int N = scanner.nextInt();

        String[] stringList = new String[N];

        for(int i = 0; i < N; i++) {
            System.out.println("Input the line number " + (i+1));
            stringList[i] = scanner.next();
        }

        for(int i = 0; i < N; i++) {
            System.out.println(encode(stringList[i]));
        }
    }
}
