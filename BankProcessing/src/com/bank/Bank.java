package com.bank;

public class Bank {
	private int accountNumber;
	private String name;
	private double balance;

	public void account(int accountNumber, String name, double balance) {

		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public void display() {
		System.out.println(accountNumber + " " + name + " " + balance);

	}

	public void deposit(double d) {

		balance= balance + d;
		System.out.println("Amount Deposited = "+d);

	}

	public void withdraw(double d) {

		if(balance<d) {
			System.out.println("in efficient balance");
		}else {
			balance= balance-d;
			System.out.println("withdraw amount = "+d);
		}

	}
	public void checkBalance() {
		System.out.println("Total Balance = "+balance);
	}

}
