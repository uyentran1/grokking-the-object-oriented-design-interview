package Transaction;

import DataType.TransactionStatus;
import java.util.Date;

public abstract class Transaction {
    private int transactionId;
    private Date creationTime;
    private TransactionStatus status;

    public abstract boolean makeTransaction();
}
