package com.bank.challan;

public class InvalidAccount extends Exception {
	
	public InvalidAccount() {
		super("Invalid Account Numer");
		
	}
	public InvalidAccount(String message) {
		super(message);
		
	}

}
