package com.company;

class Car {
    private static int numOfCars = 0;
    public Car()
    {
        numOfCars++;
    }

    public static void ShowNumOfCars()
    {
        System.out.println(numOfCars);
    }
}