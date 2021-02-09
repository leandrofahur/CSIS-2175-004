package com.company;

public class TaxPay {
    private String sin;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private Double annualIncome;
    private Double tax;

    // Setter for the tax variable:
    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    // Constructor:
    public TaxPay(String sin, String firstName, String lastName, String streetAddress, String city, String state, String zipCode) {
        this.sin = sin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Calculate the tax rate:
    private Double calculateTaxRate() {
        if(this.annualIncome >= 0 && this.annualIncome <= 41725.00) {
            this.tax = (double)(5.06/100.00)*this.annualIncome;
            return tax;
        } else if(this.annualIncome > 41725.00 && this.annualIncome <= 83451.00) {
            this.tax = (double)(7.70/100.00)*this.annualIncome;
            return tax;
        } else if(this.annualIncome > 83451.00 && this.annualIncome <= 95812) {
            this.tax = (double)(10.50/100.00)*this.annualIncome;
            return tax;
        } else if(this.annualIncome > 95812 && this.annualIncome <= 116344.00) {
            this.tax = (double)(12.29/100.00)*this.annualIncome;
            return tax;
        } else if(this.annualIncome > 116344.00 && this.annualIncome <= 157748.00) {
            this.tax = (double)(14.70/100.00)*this.annualIncome;
            return tax;
        } else if(this.annualIncome > 157748 && this.annualIncome <= 220000.00) {
            this.tax = (double)(16.80/100.00)*this.annualIncome;
            return tax;
        } else {
            this.tax = (double)(20.50/100.00)*this.annualIncome;
            return tax;
        }
    }

    @Override
    public String toString() {
        return String.format("Details of the Tax payer:\n" +
                "======================================\n" +
                "Social Security Number: %s\n" +
                "Last Name: %s\n" +
                "First Name: %s\n" +
                "Street: %s\n" +
                "City: %s\n" +
                "State: %s\n" +
                "Annual Income: %.1f\n" +
                "Tax: %.1f", this.sin, this.lastName, this.firstName, this.streetAddress, this.city, this.state, this.annualIncome, calculateTaxRate());
    }
}
