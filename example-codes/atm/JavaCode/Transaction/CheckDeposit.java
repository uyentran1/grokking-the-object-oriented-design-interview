package Transaction;

public class CheckDeposit extends Deposit {
    private String checkNumber;
    private String bankCode;

    public String getCheckNumber() {
        return checkNumber;
    }

    @Override
    public boolean makeTransaction() {
        // Implementation
        return true;
    }
}
