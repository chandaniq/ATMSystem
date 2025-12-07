public class ATM {
    private String atmID;
    private Address address;
    private CashDispenser cashDispenser;
    private ReceiptPrinter receiptPrinter;
    private KeyPad keyPad;
    private Screen screen;
    private CardReader cardReader;
    private DepositSlot depositSlot;
    private ATMController controller;
    private BankService bankService;
    private NotificationService notificationService;

    public ATM(String atm001, String s, double v) {
    }

    public void insertCard(Card card) {
        cardReader.readCard(card);
        screen.displayMessage("Enter Pin Number:");
    }

    public void enterPin(String pin) {
        keyPad.enterPIN(pin);
        controller.validatePin(pin);
        screen.displayMessage("select transaction:");

    }

    public void selectTransaction(TransactionType transactionType) {
        switch (transactionType) {
            case WITHDRAWAL:
                screen.displayMessage("Enter amount to withdraw:");
                break;
            case DEPOSIT:
                screen.displayMessage("Enter amount to deposit:");
                break;
            case BALANCE_INQUIRY:
                double balance = bankService.getAccountBalance();
                screen.displayMessage("Your balance is: " + balance);
                break;
            default:
                screen.displayMessage("Invalid transaction type.");
        }
    }

    public void enterAmount(double v) {
        keyPad.enterAmount(v);
        controller.processTransaction(v);
    }
}
