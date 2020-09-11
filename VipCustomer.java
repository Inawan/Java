package com.project;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName , creditLimit , "DefaultEmail");
    }

    public VipCustomer(){
        this("Default name" , 50000.0 , "Default Email");
    }

    public String getCustomerName() { 
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
