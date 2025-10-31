package BankManagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private final String transactionId;
    private final long accountNumber;
    private final String type;
    private final double amount;
    private final LocalDateTime timestamp;
    private final String description;
    private final double balanceAfterTransaction;

    private static long lastTransactionId = 1000L;

    {
        transactionId = "TXN" + (++lastTransactionId);
        timestamp = LocalDateTime.now();
        System.out.println("Transaction IIB: Transaction " + transactionId + " initialized");
    }

    public Transaction(long accountNumber, String type, double amount,
                       double balanceAfterTransaction, String description AccountNumber) {
        this.accountNumber = accountNumber;
        this.type = (type != null) ? type.toUpperCase() : "UNKNOWN";
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.description = (description != null) ? description : "";
        System.out.println("Transaction Constructor: " + type + " transaction created for account #" + accountNumber);
    }

    public Transaction(long accountNumber, String type, double amount, double balanceAfterTransaction) {
        this(accountNumber, type, amount, balanceAfterTransaction, "");
    }

    public String getTransactionId() {
        return transactionId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    public double getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }

    public String getFormattedTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return timestamp.format(formatter);
    }

    public void displayTransactionInfo() {
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("║                  TRANSACTION RECORD               ║");
        System.out.println("╠═══════════════════════════════════════════════════╣");
        System.out.println("║ Transaction ID: " + transactionId + "                          ║");
        System.out.println("║ Account #: " + accountNumber + "                              ║");
        System.out.println("║ Type: " + String.format("%-12s", type) + "                                 ║");
        System.out.println("║ Amount: $" + String.format("%-10.2f", amount) + "                         ║");
        System.out.println("║ Balance After: $" + String.format("%-8.2f", balanceAfterTransaction) + "                    ║");
        System.out.println("║ Date: " + getFormattedTimestamp() + "                   ║");
        if (!description.isEmpty()) {
            System.out.println("║ Description: " + String.format("%-30s", description) + " ║");
        }
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    @Override
    public String toString() {
        return String.format("Transaction[%s, Acc#%d, %s, $%.2f, %s]",
                transactionId, accountNumber, type, amount, getFormattedTimestamp());
    }

    public static long getLastTransactionId() {
        return lastTransactionId;
    }

    public static void resetTransactionCounter() {
        lastTransactionId = 1000L;
    }
}