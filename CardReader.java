public class CardReader {
    Screen screen = new Screen();
    public void readCard(Card card) {
        // Simulate reading a card
        System.out.println("Card has been read.");
        screen.displayMessage("Please enter your PIN.");

    }
}
