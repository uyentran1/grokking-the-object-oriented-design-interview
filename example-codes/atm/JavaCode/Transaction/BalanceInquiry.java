package Transaction;

public class BalanceInquiry extends Transaction {
    private int accountId;

    public double getAccountId() {
        return accountId;
    }

    @Override
    public boolean makeTransaction() {
        // Implementation
        return true;
    }
}
