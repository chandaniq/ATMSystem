public class ATMMain {
    public static void main(String args[])
    {
        Account account = new Account("123456789", AccountType.SAVINGS, 1000.0);
        Card card = new Card("987654321", "John Doe", "1234", "12/25", "123");
        Address address = new Address("123 Main St", "Cityville", "Stateville", "12345", "Countryland");
        Customer customer = new Customer("John Doe", "john@gmail.com","123-456-7890", address, account, card);

        ATM atm = new ATM("ATM001", "123 Main St, Cityville", 5000.0);
        customer.insertCardIntoATM(atm, card);
        customer.enterPinIntoATM(atm, "1234");
        customer.selectTransactionInATM(atm, TransactionType.WITHDRAWAL);
        customer.enterAmountIntoATM(atm, 200.0);
    }
}
