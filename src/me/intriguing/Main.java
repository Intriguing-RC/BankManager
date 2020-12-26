package me.intriguing;

public class Main {

    private static BankManager manager;

    public static void main(String[] args) {
        manager = new BankManager();
        Bank superiorBank = new Bank("Superior Bank");
        BankAccount kenny = new BankAccount("Kenny");
        // Add banks to Manager and add account to bank
        manager.addBank(superiorBank);
        superiorBank.addAccount(kenny);

        // List banks
        manager.listBanks();
        // List accounts
        superiorBank.listAccounts();
        System.out.println("Kenny has balance of $" + kenny.getBalance() + "!");

        // Should be okay.
        kenny.deposit(100.32);
        // Not okay, less than 0
        kenny.deposit(-32.3);
        // Should be okay.
        kenny.withdraw(3.3);
        // Not okay, we don't have this much.
        kenny.withdraw(2100);
    }
}
