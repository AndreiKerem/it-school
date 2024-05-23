package bank.account.management;

import java.util.ArrayList;

public class Bank {

    private ArrayList <BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void removeAccount(BankAccount account) {
        accounts.remove(account);
    }

    public void depositMoney(BankAccount account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
}
