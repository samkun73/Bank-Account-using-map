package com.bank.list;



public class Main {

	public static void main(String[] args) {

		BankOperations bankOperations = new BankOperations();
		bankOperations.createAccount(111, "sampath");
		bankOperations.createAccount(112, "Tom");
		System.out.println();

		
		  System.out.println("********  End  Process********"); System.out.println();
		  System.out.println(); System.out.println();
		  
		  bankOperations.deposit(111, 20000); 
		 // bankOperations.deposit(112, 20000);
		  System.out.println();
		  
		  System.out.println("********  End  Process********"); System.out.println();
		  System.out.println(); System.out.println();
		 
		
		/*
		 * bankOperations.withdraw(111, 15000); bankOperations.withdraw(112, 10000);
		 * System.out.println();
		 * 
		 * System.out.println("********  End  Process********"); System.out.println();
		 * System.out.println(); System.out.println();
		 * 
		 * 
		 * 
		 * bankOperations.display(); System.out.println();
		 * 
		 * System.out.println("********  End  Process********"); System.out.println();
		 * System.out.println(); System.out.println();
		 */
		  
		  
			/*
			 * 
			 * 
			 * 
			 * double d=bankOperations.display_By_accountNo(111);
			 * 
			 * System.out.println(d);
			 */
			
		 

	}

}
