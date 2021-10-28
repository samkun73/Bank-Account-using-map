package com.bank.list;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BankOperations {

	List<Account> list = new ArrayList<Account>();
	// Map<Integer, Account> map = new TreeMap<Integer, Account>();

	public void createAccount(int accountNo, String name) {
		double initalbalance = 0.0;
		Account account = new Account();
		account.setAccountNumber(accountNo);
		account.setName(name);
		account.setBalance(initalbalance);
		list.add(account);
		// map.put(account.getAccountNumber(), account);
		System.out.println("<<<<<<<<<<<<<< Account created>>>>>>>>>>>>>>");
		System.out.println(" AccountNumber = " + account.getAccountNumber());
		System.out.println(" Account Name = " + account.getName());
		System.out.println(" Account Balance = " + account.getBalance());

	}

	public void deposit(int accountNo, double depositamount) {
		System.out.println("<<<<<<<<<<<<<<Deposit method>>>>>>>>>>>>>>");
		for (Account a : list) {
			if (a.getAccountNumber() == accountNo) {
				// if (map.containsKey(accountNo)) {

				System.out.println("<<<<<<<<<<<<<<AccountNo is valid>>>>>>>>>>>>>>");

				a.setBalance(a.getBalance() + depositamount);
				System.out.println(" Account No = " + a.getAccountNumber() + " Amount Deposited = " + depositamount
						+ " Balance = " + a.getBalance());

				System.out.println("<<<<<<<<<<<<<<Deposite successfull.");
			} else {
				System.out.println("?????????????? Failed To Deposit ??????????????");

			}
		}
		System.out.println("<<<<<<<<<<<<<< End Process>>>>>>>>>>>>>>");
		System.out.println("============================================================================");

	}

	public void withdraw(int accountNo, double withdrawAmount) {
		System.out.println("<<<<<<<<<<<<<<WithDraw method>>>>>>>>>>>>>>");
		for (Account a : list) {
			if (a.getAccountNumber() == accountNo && withdrawAmount < a.getBalance()) {
				// if ((map.containsKey(accountNo)) && withdrawAmount < a.getBalance()) {

				System.out.println("<<<<<<<<<<<<<<AccountNo is valid>>>>>>>>>>>>>>");

				a.setBalance(a.getBalance() - withdrawAmount);
				System.out.println(" Account No = " + a.getAccountNumber() + " Amount withDraw = " + withdrawAmount
						+ " Balance = " + a.getBalance());

				System.out.println("<<<<<<<<<<<<<<WithDraw successfull>>>>>>>>>>>>>>");

			} else {
				System.out.println("?????????????? Failed To WithDraw ??????????????");
				System.out.println("============================================================================");
			}
		}
		System.out.println("<<<<<<<<<<<<<< End Process>>>>>>>>>>>>>>");
		System.out.println("============================================================================");

	}

	/*
	 * public Account display_By_accountNo(int accountNo) { for (Account a :list) {
	 * if (a.getAccountNumber() == accountNo) {
	 * 
	 * 
	 * 
	 * return accountNo;
	 * 
	 * } else { System.out.
	 * println("??????????????????? Account Number Not Found ???????????????????");
	 * System.out.println(
	 * "============================================================================"
	 * ); } }
	 * 
	 * return 0;
	 * 
	 * }
	 */

	/*
	 * public void display_By_accountNo(int accountNo) {
	 * System.out.println("<<<<<<<<<<<<<<Display_By_accountNo >>>>>>>>>>>>>>"); for
	 * (Account a : list) { if (a.getAccountNumber() == accountNo) {
	 * 
	 * System.out.println("<<<<<<<<<<<<<<AccountNo is valid >>>>>>>>>>>>>>");
	 * System.out.println(" AccountNumber = " + a.getAccountNumber());
	 * System.out.println(" Account Name = " + a.getName());
	 * System.out.println(" Account Balance = " + a.getBalance());
	 * 
	 * } else { System.out.
	 * println("??????????????????? Account Number Not Found ???????????????????");
	 * System.out.println(
	 * "============================================================================"
	 * ); } }System.out.println("<<<<<<<<<<<<<< End Process >>>>>>>>>>>>>>");
	 * System.out.println(
	 * "============================================================================"
	 * );
	 * 
	 * 
	 * }
	 */

	public void display() {
		System.out.println("<<<<<<<<<<<<<< Display All Account Details >>>>>>>>>>>>>>");
		for (Account a : list) {

			System.out.println(" AccountNumber = " + a.getAccountNumber());
			System.out.println(" Account Name = " + a.getName());
			System.out.println(" Account Balance = " + a.getBalance());
			System.out.println("<<<<<<<<<<<<<< End Process >>>>>>>>>>>>>>");
			System.out.println("============================================================================");

		}

	}

}
