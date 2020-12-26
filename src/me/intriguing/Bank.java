package me.intriguing;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<BankAccount> bankAccounts;

    public Bank(String name) {
        this.name = name;
        this.bankAccounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean addAccount(BankAccount bankAccount) {
        if (!bankAccounts.contains(bankAccount)) {
            bankAccounts.add(bankAccount);
            return true;
        }

        return false;
    }

    public boolean removeAccount(BankAccount bankAccount) {
        if (bankAccounts.contains(bankAccount)) {
            bankAccounts.remove(bankAccount);
            return true;
        }

        return false;
    }

    public void listAccounts() {
        System.out.println("Bank Accounts at " + this.getName() + ": ");
        for(BankAccount bankAccount : bankAccounts) {
            System.out.print("\t- " + bankAccount.getName() + "\n");
        }
    }

}
