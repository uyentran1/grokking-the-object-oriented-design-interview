package Transaction;

public abstract class Deposit extends Transaction {
    private double amount;
    
    public double getAmount() {
        return amount;
    }
}
