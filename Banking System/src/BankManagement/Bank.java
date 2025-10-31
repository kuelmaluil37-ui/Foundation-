package BankManagement;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<BankAccount> accounts;

    {
        accounts = new ArrayList<>();
        System.out.println("Bank IIB: Accounts list created");
    }

    public Bank(String bankName) {
        this.bankName = bankName;
        System.out.println("Bank Constructor: " + bankName + " bank created");
    }

    public void addAccount(BankAccount account) {
        if (account != null) {
            accounts.add(account);
            System.out.println("Account #" + account.getAccountNumber(GetAccount) + " added to " + bankName);
        }
    }

    public BankAccount createAccount(String ownerName, String accountType, double initialBalance) {
        BankAccount newAccount = new BankAccount(ownerName, accountType, initialBalance);
        accounts.add(newAccount);
        return newAccount;
    }

    public BankAccount findAccount(long accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public BankAccount findAccountByOwner(String ownerName AccountNumber) {
        for (BankAccount account : accounts) {
            if (account.getOwnerName().equalsIgnoreCase(ownerName)) {
                return account;
            }
        }
        return null;
    }

    public boolean transfer(long fromAccountNumber, long toAccountNumber, double amount) {
        BankAccount fromAccount = findAccount(fromAccountNumber);
        BankAccount toAccount = findAccount(toAccountNumber);

        if (fromAccount != null && toAccount != null && fromAccount.withdraw(amount, "Transfer to account #" + toAccountNumber)) {
            toAccount.deposit(amount, "Transfer from account #" + fromAccountNumber);
            System.out.println("Transfer successful: $" + amount + " from #" + fromAccountNumber + " to #" + toAccountNumber);
            return true;
        }
        System.out.println("Transfer failed");
        return false;
    }

    public void displayAllAccounts() {
        System.out.println("\n" + "═".repeat(70));
        System.out.println("           " + bankName + " - ALL ACCOUNTS (" + accounts.size() + ")");
        System.out.println("═".repeat(70));
        for (BankAccount account : accounts) {
            account.displayAccountInfo();
        }
    }

    public double getTotalBankBalance() {
        double total = 0;
        for (BankAccount account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    public String getBankName() {
        return bankName;
    }

    public int getTotalAccounts() {
        return accounts.size();
    }

    public List<BankAccount> getAccounts() {
        return new ArrayList<>(accounts);
    }
}