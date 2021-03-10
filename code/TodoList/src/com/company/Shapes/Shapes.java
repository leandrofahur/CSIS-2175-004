package com.company.Shapes;

public abstract class Shapes {
    private int length;

    public Shapes() {
        System.out.println("I am a shape");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}