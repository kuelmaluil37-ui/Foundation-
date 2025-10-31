package BankManagement;

public class AccountNumber {
    private static long lastAccountNumber = 005000000070L;

    public static synchronized long AccountNumber(Account) {
        return ++lastAccountNumber;
    }

    public static long getLastGeneratedAccountNumber() {
        return lastAccountNumber;
    }

    public static synchronized void reset() {
        lastAccountNumber = 005000000070L;
    }
}