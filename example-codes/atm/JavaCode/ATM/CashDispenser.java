package ATM;

public class CashDispenser {
    private int totalFiveDollarBills;
    private int totalTwentyDollarBills;

    public boolean dispenseCash(double amount) {
        // Implementation
        return true;
    }

    public boolean canDispenseCash() {
        return totalFiveDollarBills > 0 || totalTwentyDollarBills > 0;
    } 
}
