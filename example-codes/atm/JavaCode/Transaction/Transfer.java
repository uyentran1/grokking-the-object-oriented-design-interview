package Transaction;

public class Transfer extends Transaction {
    private int destinationAccountNumber;

    public int getDestinationAccount() {
        return destinationAccountNumber;
    }
    
    @Override
    public boolean makeTransaction() {
        // Implementation
        return true;
    }
    
}
