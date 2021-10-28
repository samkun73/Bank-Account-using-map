package com.bank.challan;

public class Account {
	private int accountno;
	private String name;
	private double Balance;
	private double fee;
	public Account(int accountno, String name, double balance,double fee) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.fee= fee;
		Balance = balance;
	}
	public int getAccountno() {
		return accountno;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	

}
