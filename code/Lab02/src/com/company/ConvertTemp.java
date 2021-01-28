package com.company;

import java.util.Scanner;

public class ConvertTemp {
    private double celsius;
    private double fahrenheith;

    public ConvertTemp(double celsius)
    {
        this.SetCelsius(celsius);
        this.SetFahrenheith(0.0);
    }

    public double GetFahrenheith() {
        return this.fahrenheith;
    }

    public double GetCelsius() {
        return this.celsius;
    }

    public void SetCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void SetFahrenheith(double fahrenheith) {
        this.fahrenheith = fahrenheith;
    }

    public void Convert2Fahrenheit()
    {
         this.SetFahrenheith((9.0/5.0)*this.GetCelsius()+32);
    }

    public void DisplayFahrenheit()
    {
        System.out.println("Fahrenheit: " + this.GetFahrenheith());
    }
}
