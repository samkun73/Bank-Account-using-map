package com.bank;

public class Main {

	public static void main(String args[]) {
		Bank cust1=new Bank();
		cust1.account(1434, "sampath", 1000);
		cust1.display();
		cust1.deposit(10000);
		cust1.withdraw(500);
		cust1.checkBalance();
		cust1.display();
	    
	    
	    
	    System.out.println("******************************************");
	    Bank cust2=new Bank();
	    cust2.account(1435, "sai", 12000);
		cust2.display();
		cust2.deposit(10000);
		cust2.withdraw(500);
		cust2.checkBalance();
	    cust2.display();
	}

	
}
