public class Card {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;
    private String pin;

    public Card(String cardNumber, String cardHolderName, String expirationDate, String cvv, String pin) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.pin = pin;
    }
}
