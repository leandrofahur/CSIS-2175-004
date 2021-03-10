package com.company;

import com.company.Shapes.Shapes;

public class Square extends Shapes {
    public Square() {
        super();
        System.out.println("I am a square");
    }

    public int Area(int length) {
        super.setLength(length);
        return super.getLength()*super.getLength();
    }

}
