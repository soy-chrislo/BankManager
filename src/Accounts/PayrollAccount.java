package Accounts;

public class PayrollAccount extends Account {

    private String company;
    String accountHolder = "Hellouda";
    public PayrollAccount(String accountHolder, int idAccount, int currentBalance, String company) {
        super(accountHolder, idAccount, currentBalance);
        this.company = company;
    }
    /* Getters */

    public String getCompany() {
        return company;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    /* Setters */
    public void setCompany(String company) {
        this.company = company;
    }
}
