package Accounts;

abstract public class Account {
    private final String accountHolder;
    private int idAccount, currentBalance;

    public Account(String accountHolder, int idAccount, int currentBalance) {
        this.accountHolder = accountHolder;
        this.idAccount = idAccount;
        this.currentBalance = currentBalance;
    }


    /* Getters */

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    /* Setters */

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }
}
