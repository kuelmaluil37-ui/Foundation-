package BankManagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BANKING MANAGEMENT SYSTEM===");

        AccountNumber.reset();
        Transaction.resetTransactionCounter();

        System.out.println("Creating bank instance...");
        Bank IvoryBank = new Bank("Ivory Bank");
        System.out.println();

        System.out.println("=== CREATING BANK ACCOUNTS ===");

        BankAccount accountJ = new BankAccount("Johnson", "Checking", 3000.0);
        IvoryBank.addAccount(accountJ);
        System.out.println();

        BankAccount accountM = new BankAccount("Martha", "Savings", 5000.0);
        IvoryBank.addAccount(accountM);
        System.out.println();

        BankAccount accountW = new BankAccount("Williams", 2500.0);
        IvoryBank.addAccount(accountW);
        System.out.println();

        BankAccount accountA = new BankAccount("Ajok");
        IvoryBank.addAccount(accountA);
        System.out.println();

        System.out.println("=== VERIFYING UNIQUE ACCOUNT NUMBERS ===");
        System.out.println("Account J 2255J3344e: " + accountJ.getAccountNumber());
        System.out.println("Account M 3344M5567e: " + accountM.getAccountNumber());
        System.out.println("Account W 334466W68e: " + accountW.getAccountNumber());
        System.out.println("Account A 667890A43e: " + accountA.getAccountNumber());

        boolean allUnique = areAllAccountNumbersUnique(IvoryBank);
        System.out.println("All account numbers are unique: " + allUnique);
        System.out.println("Last generated account number: " + AccountNumber.AccountNumber());

        System.out.println("=== BANKING OPERATIONS ===");

        accountJ.deposit(5000.0);
        accountJ.withdraw(2000.0);
        accountJ.deposit(3000.0, "Paycheck deposit");

        accountA.deposit(10000.0);
        accountA.withdraw(15000.0);
        accountA.withdraw(5000.0, "Rent payment");

        System.out.println("=== TRANSFER OPERATION ===");
        IvoryBank.transfer(accountM.getAccountNumber(), accountW.getAccountNumber(), 1000.0);

        IvoryBank.displayAllAccounts();

        System.out.println("=== TRANSACTION HISTORY ===");
        accountJ.displayTransactionHistory();

        System.out.println("=== BANK SUMMARY ===");
        System.out.println("Bank Name: " + IvoryBank.getBankName());
        System.out.println("Total Accounts: " + IvoryBank.getTotalAccounts());
        System.out.println("Total Bank Balance: $" + IvoryBank.getTotalBankBalance());
        System.out.println("Total Transactions Processed: " + Transaction.getLastTransactionId());

        System.out.println("=== INSTANCE VARIABLE VERIFICATION ===");
        displayAccountDetails(accountJ);
        displayAccountDetails(accountA);
    }

    private static boolean areAllAccountNumbersUnique(Bank bank) {
        java.util.List<BankAccount> accounts = bank.getAccounts();
        for (int i = 0; i < accounts.size(); i++) {
            for (int j = i + 1; j < accounts.size(); j++) {
                if (accounts.get(i).getAccountNumber() == accounts.get(j).getAccountNumber()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void displayAccountDetails(BankAccount account) {
        System.out.println("Account Details - Owner: " + account.getOwnerName() +
                ", Type: " + account.getAccountType() +
                ", Balance: $" + account.getBalance() +
                ", Active: " + account.isActive() +
                ", Account #: " + account.getAccountNumber() +
                ", Transactions: " + account.getTransactionCount());
    }
}