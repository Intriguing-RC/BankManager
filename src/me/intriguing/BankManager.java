package me.intriguing;

import java.util.ArrayList;
import java.util.List;

public class BankManager {

    private List<Bank> banks;

    public BankManager() {
        this.banks = new ArrayList<>();
    }

    public boolean addBank(Bank bank) {
        if (!banks.contains(bank)) {
            banks.add(bank);
            return true;
        }

        return false;
    }

    public boolean removeBank(Bank bank) {
        if (banks.contains(bank)) {
            banks.remove(bank);
            return true;
        }

        return false;
    }

    public void listBanks() {
        System.out.println("Banks:");
        for(Bank bank : banks) {
            System.out.print("\t- " + bank.getName() + "\n");
        }
    }

}
