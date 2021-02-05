package com.company;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        // Declare the matrix A:
        int[][] matrixA = { {2,8},
                            {1,9}};

        // Declare the matrix B:
        int[][] matrixB = { {1,2},
                            {8,3}};

        Matrix mat01 = new Matrix(matrixA);
        Matrix mat02 = new Matrix(matrixB);

        // Uncomment to see output:
        System.out.println("Matrix 01:");
        System.out.println(mat01.toString());
        System.out.println("Matrix 02:");
        System.out.println(mat02.toString());

        // System.out.println(mat01.isEqual(mat02.getMatrix()));
        System.out.println("Multiplication:");
        Matrix multiplicationResult = new Matrix(mat01.multiply(mat02.getMatrix()));
        System.out.println(multiplicationResult);

        System.out.println("Summation:");
        Matrix sumResult = new Matrix(mat01.sum(mat02.getMatrix()));
        System.out.println(sumResult);

        System.out.println("Subtraction:");
        Matrix subtractionResult = new Matrix(mat01.subtract(mat02.getMatrix()));
        System.out.println(subtractionResult);

        System.out.println("Inverse:");
        Matrix inversionResult = new Matrix(mat01.inverse());
        System.out.println(inversionResult);

        System.out.println("Inverse:");
        Matrix inversionResult2 = new Matrix(mat02.inverse());
        System.out.println(inversionResult2);
    }
}
