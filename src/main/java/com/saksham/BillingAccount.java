package com.saksham;

public class BillingAccount {
    private double balance;

    public BillingAccount() { this.balance = 0.0; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }
    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Payment amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
            System.out.println(" Available: Rs. " + balance);
            System.out.println(" Requested: Rs. " + amount);
        } else {
            balance -= amount;
            System.out.println("Payment of Rs. " + amount + " successful.");
        }
    }
    public double getBalance() { return balance; }
    public void displayBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }
}
