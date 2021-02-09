package com.company;

import java.util.Comparator;

public class Student {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return String.format("Student Id: %d Student Name: %s Student marks: %.1f", id, name, marks);
    }
}
