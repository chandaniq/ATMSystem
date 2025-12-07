public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private Address address;
    private Account account;
    private Card card;

    public Customer(String name, String email, String phoneNumber, Address address, Account account, Card card) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.account = account;
        this.card = card;
    }

    public void insertCardIntoATM(ATM atm, Card card) {
        atm.insertCard(card);
    }

    public void enterPinIntoATM(ATM atm, String number) {
        atm.enterPin(number);
    }

    public void selectTransactionInATM(ATM atm, TransactionType transactionType) {
        atm.selectTransaction(transactionType);
    }

    public void enterAmountIntoATM(ATM atm, double v) {
        atm.enterAmount(v);
    }
}
