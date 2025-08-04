package Transaction;

public class Withdraw extends Transaction {
    private double amount;

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean makeTransaction() {
        // Implementation
        return true;
    }
}
