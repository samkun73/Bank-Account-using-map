package com.bank.list;

import java.util.ArrayList;

import java.util.List;



public class Bank1 {

	List<Account> list = new ArrayList<Account>();

	public void createAccount(int accountNo, String name, double balance) {
		Account account = new Account();
		account.setAccountNumber(accountNo);
		account.setName(name);
		account.setBalance(balance);
		list.add(account);

	}

	public void deposit(int accountNo, double depositamount) {
		for (Account a : list) {
			if (a.getAccountNumber() == accountNo) {
				System.out.println("AccountNo is valid");
				double total = a.getBalance() + depositamount;
				a.setBalance(total);
				System.out.println("Deposite successfull");
				System.out.println(a.getAccountNumber());
				System.out.println(a.getName());
				System.out.println(a.getBalance());

			} else {
				System.out.println("invalid accno");
			}
		}

	}

	public void withdraw(int accountNo, double withdrawAmount) {
		for (Account a : list) {
			if (a.getAccountNumber() == accountNo && withdrawAmount < a.getBalance()) {
				System.out.println("AccountNo is valid");
				double total = a.getBalance() - withdrawAmount;
				a.setBalance(total);
				System.out.println("withDraw successfull");
				System.out.println(a.getAccountNumber());
				System.out.println(a.getName());
				System.out.println(a.getBalance());

			} else {
				System.out.println("invalid accno");
			}
		}

	}

	public void display_By_accountNo(int accountNo) {
		for (Account a : list) {
			if (a.getAccountNumber() == accountNo) {
				System.out.println("AccountNo is valid");
				System.out.println(a.getAccountNumber());
				System.out.println(a.getName());
				System.out.println(a.getBalance());

			} else {
				System.out.println("invalid Account No");
			}
		}

	}

	public void display() {
		for (Account a : list) {

			System.out.println("AccountNo is valid");
			System.out.println(a.getAccountNumber());
			System.out.println(a.getName());
			System.out.println(a.getBalance());

		}

	}

}
