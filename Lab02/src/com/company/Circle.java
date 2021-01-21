package com.company;

public class Circle {
    private double radius;
    private double diameter = 0.0;
    private double area = 0.0;

    public Circle(double radius) {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = 2*Math.PI*this.getRadius();
        this.area = 2*Math.PI*Math.pow(this.getRadius(), 2);
    }

    public void displayInfo()
    {
        System.out.println("Radius: " + this.getRadius());
        System.out.println("Diameter: " + this.diameter);
        System.out.println("Area: " + this.area);
    }
}
