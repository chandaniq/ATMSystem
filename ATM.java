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
}
