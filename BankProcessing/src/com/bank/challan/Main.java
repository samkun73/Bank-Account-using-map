package com.bank.challan;

import com.bank.list.Account;

public class Main {

	public static void main(String[] args) throws InvalidAccount {
		
		Map1 map1=new Map1();
		map1.createAccount(1422, "Tom",1000);
		map1.createAccount(4741, "sampath",1000);
		map1.display();
		map1.deposit(1422, 78555);
		map1.withDraw(1422, 5000);
		
		
		
		
		
		
		
		
		
		
	}

}
