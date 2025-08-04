package ATM;

import Core.Customer;
import DataType.Address;
import Transaction.Transaction;
import Transaction.CheckDeposit;
import Transaction.CashDeposit;

public class ATM {
    private int atmID;
    private Address location;

    private CashDispenser cashDispenser;
    private Keypad keypad;
    private Screen screen;
    private Printer printer;
    private CheckDeposit checkDeposit;
    private CashDeposit cashDeposit;

    public boolean authenticateUser() {
        // Implemetation
        return true;
    }

    public boolean makeTransaction(Customer customer, Transaction transaction) {
        return customer.makeTransaction(transaction);
    }

}
