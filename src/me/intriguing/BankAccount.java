package me.intriguing;


public class BankAccount {

    private String name;
    private double balance;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double amount) {
        if(amount <= 0) {
            System.out.println("You must deposit an amount greater than $0!");
            return false;
        }

        this.balance += amount;
        System.out.println("Successfully deposited $" + amount + " to " + this.getName() + "'s balance. New Balance: $" + this.getBalance());
        return true;
    }

    public boolean withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("You must withdraw an amount greater than $0!");
            return false;
        }

        if (amount >= this.balance) {
            System.out.println("You must withdraw an amount less than or equal to your account balance!");
            return false;
        }

        this.balance -= amount;
        System.out.println("Successfully withdrew $" + amount + " from " + this.getName() + "'s balance. New Balance: $" + this.getBalance());
        return true;
    }
}
