package BankManagement;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final long accountNumber;
    private double balance;
    private final String accountType;
    private final String ownerName;
    private boolean isActive;
    private List<Transaction> transactionHistory;
    {
        accountNumber = AccountNumber.AccountNumber(AccountNumber);
        isActive = true;
        transactionHistory = new ArrayList<>();
        System.out.println("IIB: Account #" + accountNumber + " is being initialized");
    }

    public BankAccount(String ownerName, String accountType, double initialBalance AccountNumber) {
        this.ownerName = ownerName;
        this.accountType = (accountType != null && !accountType.trim().isEmpty()) ? accountType : "Savings";
        this.balance = Math.max(initialBalance, 0.0);

        if (initialBalance > 0) {
            Transaction initialDeposit = new Transaction(accountNumber, "INITIAL_DEPOSIT",
                    initialBalance, balance, "Account opening deposit");
            transactionHistory.add(initialDeposit);
        }

        System.out.println("Constructor: Account created for " + ownerName);
    }

    public BankAccount(String ownerName) {
        this(ownerName, "Savings", 0.0);
    }

    public BankAccount(String ownerName, double initialBalance) {
        this(ownerName, "Savings", initialBalance);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isActive() {
        return isActive;
    }

    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactionHistory);
    }

    public int getTransactionCount() {
        return transactionHistory.size();
    }

    public void deposit(double amount) {
        if (amount > 0 && isActive) {
            balance += amount;
            Transaction depositTransaction = new Transaction(accountNumber, "DEPOSIT",
                    amount, balance, "Cash deposit");
            transactionHistory.add(depositTransaction);
            System.out.println("Deposited: $" + amount + " to account #" + accountNumber);
        } else {
            System.out.println("Invalid deposit amount or inactive account");
        }
    }

    public void deposit(double amount, String description) {
        if (amount > 0 && isActive) {
            balance += amount;
            Transaction depositTransaction = new Transaction(accountNumber, "DEPOSIT",
                    amount, balance, description);
            transactionHistory.add(depositTransaction);
            System.out.println("Deposited: $" + amount + " to account #" + accountNumber + " - " + description);
        } else {
            System.out.println("Invalid deposit amount or inactive account");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount && isActive) {
            balance -= amount;
            Transaction withdrawalTransaction = new Transaction(accountNumber, "WITHDRAWAL",
                    amount, balance, "Cash withdrawal");
            transactionHistory.add(withdrawalTransaction);
            System.out.println("Withdrawn: $" + amount + " from account #" + accountNumber);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
            return false;
        }
    }

    public boolean withdraw(double amount, String description) {
        if (amount > 0 && balance >= amount && isActive) {
            balance -= amount;
            Transaction withdrawalTransaction = new Transaction(accountNumber, "WITHDRAWAL",
                    amount, balance, description);
            transactionHistory.add(withdrawalTransaction);
            System.out.println("Withdrawn: $" + amount + " from account #" + accountNumber + " - " + description);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
            return false;
        }
    }

    public void deactivateAccount() {
        isActive = false;
        Transaction deactivationTransaction = new Transaction(accountNumber, "ACCOUNT_DEACTIVATION",
                0, balance, "Account deactivated");
        transactionHistory.add(deactivationTransaction);
        System.out.println("Account" + accountNumber + " has been deactivated");
    }

    public void activateAccount() {
        isActive = true;
        Transaction activationTransaction = new Transaction(accountNumber, "ACCOUNT_ACTIVATION",
                0, balance, "Account activated");
        transactionHistory.add(activationTransaction);
        System.out.println("Account #" + accountNumber + " has been activated");
    }

    public void displayAccountInfo() {
        System.out.println("\n" + "═".repeat(50));
        System.out.println("           ACCOUNT INFORMATION");
        System.out.println("═".repeat(50));
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + String.format("%.2f", balance));
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Total Transactions: " + transactionHistory.size());
        System.out.println("═".repeat(50));
    }

    public void displayTransactionHistory() {
        System.out.println("\n" + "═".repeat(60));
        System.out.println("      TRANSACTION HISTORY - Account #" + accountNumber);
        System.out.println("═".repeat(60));

        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            for (int i = 0; i < transactionHistory.size(); i++) {
                Transaction transaction = transactionHistory.get(i);
                System.out.printf("%2d. %-12s $%-8.2f %-12s %s%n",
                        i + 1,
                        transaction.getType(),
                        transaction.getAmount(),
                        "$" + String.format("%.2f", transaction.getBalanceAfterTransaction()),
                        transaction.getFormattedTimestamp());
            }
        }
        System.out.println("═".repeat(60));
    }

    @Override
    public String toString() {
        return "BankAccount[#" + accountNumber + ", " + ownerName + ", " + accountType + ", $" + balance + "]";
    }
}