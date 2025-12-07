public class Account {
    private String accountNumber;
    private AccountType accountType;
    private double balance;

    public Account(String accountNumber, AccountType accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}
