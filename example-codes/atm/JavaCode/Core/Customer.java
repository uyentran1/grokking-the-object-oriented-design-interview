package Core;

import Account.Account;
import DataType.*;
import Transaction.Transaction;

public class Customer {
	private String name;
	private String email;
	private String phone;
	private Address address;
	private CustomerStatus status;

	private Card card;
	private Account account;

	public Customer(String name, String email, String phone, Address address) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.status = CustomerStatus.ACTIVE;
	}

	public boolean makeTransaction(Transaction transaction) {
		if (status != CustomerStatus.ACTIVE) {
			return false;
		}
		
		// Implementation
		return true;
	}

	public Address getBillingAddress() {
		return address;
	}

	public CustomerStatus getStatus() {
		return status;
	}

	public void setStatus(CustomerStatus status) {
		this.status = status;
	}
}