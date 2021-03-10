package com.company;

import com.company.Shapes.Shapes;

public class Main {

    public static final String db = "/Users/leandro/Desktop/le/douglas_college/CSIS_2175/code/TodoList/src/com/company/db/OOP.accdb";

    public static void main(String[] args) {
        // Shapes shapes = new Shapes();
        Square square = new Square();
        square.setLength(10);
        System.out.println("Length: " + square.getLength());
        System.out.println(square.Area(2));
    }
}
