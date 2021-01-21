package com.company;

public class Box {
    private int lenght;
    private int width;
    private int height;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Box(int lenght)
    {
        this.setLenght(lenght);
        this.setWidth(0);
        this.setHeight(0);
        System.out.println("Line Created.");
    }

    public Box(int lenght, int width)
    {
        this.setLenght(lenght);
        this.setWidth(width);
        this.setHeight(0);
        System.out.println("Rectangle Created.");
    }

    public Box(int lenght, int width, int height)
    {
        this.setLenght(lenght);
        this.setWidth(width);
        this.setHeight(height);
        System.out.println("Box Created.");
    }
}
