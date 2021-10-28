package BankMap;

import com.bank.list.Account;

public class Main {

	public static void main(String[] args) {
		
		Map1 map1=new Map1();
		map1.createAccount(1422, "Tom");
		map1.createAccount(4741, "sampath");
		System.out.println();
		System.out.println("*****************");
		//map1.deposit(1422, 5000);
		
		//map1.withDraw(4741, 74);
		map1.display_By_Accno(1424);
		System.out.println();
		System.out.println("******1422***********");
		map1.display_By_Accno(1422);
		
		
		
		
		
		
		
		
		
	}

}
