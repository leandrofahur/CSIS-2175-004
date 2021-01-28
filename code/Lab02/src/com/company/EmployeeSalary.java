package com.company;

public class EmployeeSalary {
    private float hourlyPayRate;
    private float regularHours;
    private float overtimeHours;

    public float GetHourlyPayRate() {
        return hourlyPayRate;
    }

    public void SetHourlyPayRate(float hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public float GetRegularHours() {
        return regularHours;
    }

    public void SetRegularHours(float regularHours) {
        this.regularHours = regularHours;
    }

    public float GetOvertimeHours() {
        return overtimeHours;
    }

    public void SetOvertimeHours(float overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public EmployeeSalary()
    {
        this.SetHourlyPayRate(0.0F);
        this.SetOvertimeHours(0.0F);
        this.SetRegularHours(0.0F);
    }

    public void GetInfo(float hourlyPayRate, float overtimeHours, float regularHours)
    {
        this.SetHourlyPayRate(hourlyPayRate);
        this.SetOvertimeHours(overtimeHours);
        this.SetRegularHours(regularHours);
    }

    private float CalculateOvertime()
    {
        return (this.GetHourlyPayRate() + this.GetOvertimeHours()*1.5F);
    }

    public void DisplayInfo()
    {
        System.out.println("Hourly Pay Rate: " + this.GetHourlyPayRate());
        System.out.println("Overtime Hours: " + this.GetOvertimeHours());
        System.out.println("Regular Hours: " + this.GetRegularHours());

        System.out.println("Weekly: " + (float)(this.GetRegularHours()*40 + this.CalculateOvertime()));
    }
}
