import java.util.Date;

public class Transaction {
    private String id;
    private TransactionType type;
    private Double amount; // nullable for inquiry/PIN change
    private Date timestamp;
    private TransactionStatus status; // PENDING, SUCCESS, FAILED
    private Account account;
    private String atmID;
}
