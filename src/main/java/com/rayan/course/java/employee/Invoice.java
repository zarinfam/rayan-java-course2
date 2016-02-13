package com.rayan.course.java.employee;

/**
 * Created by saeed on 2/13/16.
 */
public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    // constructor
    public Invoice(String partNumber, String partDescription, int quantity,
                   double pricePerItem)
    {
        if (quantity < 0) // validate quantity
            throw new IllegalArgumentException("Quantity must be >= 0");
        if (pricePerItem < 0.0) // validate pricePerItem
            throw new IllegalArgumentException(
                    "Price per item must be >= 0");
        this.quantity = quantity;
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.pricePerItem = pricePerItem;
    }

    public double costs()
    {
        return quantity * pricePerItem; // calculate total cost
    }

    @Override
    public double getPaymentAmount() {
        return costs();
    }
}
