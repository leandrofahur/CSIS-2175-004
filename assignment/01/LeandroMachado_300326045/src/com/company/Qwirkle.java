package com.company;

import java.awt.*;

public class Qwirkle {
    private int color;
    // Const values for the random generation:
    private final int MAXIMUMCOLOR = 6;
    private final int MINIMUMCOLOR = 1;

    private int shape;
    // Const values for the random generation:
    private final int MAXIMUMSHAPE = 4;
    private final int MINIMUMSHAPE = 1;


    // The ENUM Class for Color and Shape is intended to help mapping between number and name:
    // i.g., if 1 == Red for color and if 1 == Square for shape.
    public static enum Color {
        // Mapping between numbers and color names.
        Default(0),
        Red(1),
        Green(2),
        Blue(3),
        Yellow(4),
        Orange(5),
        Pink(6);

        public int value;

        // Constructor to associate a value to the color
        Color(int value) {
            this.value = value;
        }

        // Getter for the value function:
        public int getValue() {
            return this.value;
        }

        // Function to return string name of the value:
        public static Color forValue(int value) {
            for(Color colorName: values()) {
                // if finds the color with the number, return the color name:
                if(colorName.getValue() == value) {
                    return colorName;
                }
            }
            return Default;
        }
    }

    public static enum Shape {
        Default(0),
        Square(1),
        Rectangle(2),
        Oval(3),
        Triangle(4);

        public int value;

        // Constructor to associate a value to the color
        Shape(int value) {
            this.value = value;
        }

        // Getter for the value function:
        public int getValue() {
            return this.value;
        }

        // Function to return string name of the value:
        public static Shape forValue(int value) {
            for(Shape shapeName: values()) {
                // if finds the color with the number, return the color name:
                if(shapeName.getValue() == value) {
                    return shapeName;
                }
            }
            return Default;
        }
    }

    public int getColor() {
        return color;
    }

    public int getShape() {
        return shape;
    }

    public Qwirkle(Color color, Shape shape) {
        this.color = color.getValue();
        this.shape = shape.getValue();
    }

    // Constructor for random values:
    public Qwirkle() {
        this.color = (int)(Math.random()*MAXIMUMCOLOR+MINIMUMCOLOR);
        this.shape = (int)(Math.random()*MAXIMUMSHAPE+MINIMUMSHAPE);
    }

    // This boolean method compare two Qwirkle objects:
    public boolean isEqual(Qwirkle qwirkle)
    {
        if(this.getColor() == qwirkle.getColor() &&
           this.getShape() == qwirkle.getShape()) {
            return true;
        }
        else {
            return false;
        }
    }

    // The toString method was overwritten to exhibit the mapping between numbers and names for shapes and colors:
    @Override
    public String toString() {
        return "Qwirkle { " +
                "color=" + Color.forValue(this.color) +
                ", shape=" + Shape.forValue(this.shape) +
                " }";
    }
}
