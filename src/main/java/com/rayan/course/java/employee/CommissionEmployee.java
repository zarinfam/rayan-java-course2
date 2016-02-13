package com.rayan.course.java.employee;

/**
 * Created by saeed on 2/1/16.
 */
public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // five-argument constructor
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales,
                              double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
// implicit call to Object's default constructor occurs here
// if grossSales is invalid throw exception
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
// if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor


    // set gross sales amount
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    // return gross sales amount
    public double getGrossSales() {
        return grossSales;
    }

    // set commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    // return commission rate
    public double getCommissionRate() {
        return commissionRate;
    }

    // calculate earnings
    @Override
    public double earnings() {
        return commissionRate * grossSales;
    }

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method
    public String toString() {
        return "CommissionEmployee";
    }

} // end class CommissionEmployee
