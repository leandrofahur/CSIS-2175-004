package com.company;

public class Student {
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
