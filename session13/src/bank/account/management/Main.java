package bank.account.management;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        BankAccount account1 = new BankAccount("Vlada Andrei", "C0011", 50000);

        bank.addAccount(account1);

        ArrayList<BankAccount> accounts = bank.getAccounts();

        for(BankAccount account:accounts) {
            System.out.println(account.accountHolderName());
        }

        System.out.println("\nAfter depositing 1000 into account1: ");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.accountHolderName());
    }
}
