package com.company;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public boolean isEqual(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if (this.matrix[i][j] == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Multiply the matrix from this class with the input matrix:
    public int[][] multiply(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                for(int k = 0; k < matrix.length; k++) {
                    newMatrix[i][j] += this.matrix[i][k] * matrix[k][j];
                }
            }
        }
        return newMatrix;
    }

    // Divide the matrix from this class with the input matrix:
    public int[][] divide(int[][] matrix) {
        int[][] newMatrix = {{}};
        return newMatrix;
    }

    // Sum the matrix from this class with the input matrix:
    public int[][] sum(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = this.matrix[i][j] + matrix[i][j];
            }
        }
        return newMatrix;
    }

    // Subtract the matrix from this class with the input matrix:
    public int[][] subtract(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = this.matrix[i][j] - matrix[i][j];
            }
        }
        return newMatrix;
    }

    // Inverse the matrix from this class:
    public int[][] inverse() {
        int[][] newMatrix = new int[this.matrix.length][this.matrix[0].length];
        for(int i = 0; i < this.matrix.length; i++) {
            for(int j = 0; j < this.matrix[i].length; j++) {
                newMatrix[i][j] = this.matrix[j][i];
            }
        }
        return newMatrix;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                str += (matrix[i][j]) + " ";
            }
            str += "\n";
        }
        return str;
    }
}
