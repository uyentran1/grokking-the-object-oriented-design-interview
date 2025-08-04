package ATM;

import DataType.TransactionType; 

public class Screen {
    public boolean showMessage(String message) {
        // Show message
        return true;
    }

    public TransactionType getInput() {
        return TransactionType.BALANCE_INQUIRY; // example
    }
}