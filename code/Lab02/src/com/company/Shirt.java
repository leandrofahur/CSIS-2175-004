package com.company;

public class Shirt {
    private int collarSize = 0;
    private int sleeveLenght = 0;
    private final String MATERIAL = "cotton";

//    public Shirt(int collarSize) {
//        this.collarSize = collarSize;
//    }
//
//    public Shirt(int sleeveLenght) {
//        this.sleeveLenght = sleeveLenght;
//    }

    public Shirt(int collarSize, int sleeveLenght) {
        this.collarSize = collarSize;
        this.sleeveLenght = sleeveLenght;
    }

    public int getCollarSize() {
        return collarSize;
    }

    public void setCollarSize(int collarSize) {
        this.collarSize = collarSize;
    }

    public int getSleeveLenght() {
        return sleeveLenght;
    }

    public void setSleeveLenght(int sleeveLenght) {
        this.sleeveLenght = sleeveLenght;
    }

    public void displayData()
    {
        System.out.println("Collar size: " + this.getCollarSize());
        System.out.println("Sleeve Lenght: " + this.getSleeveLenght());
        System.out.println("Material: " + this.MATERIAL);
    }
}
