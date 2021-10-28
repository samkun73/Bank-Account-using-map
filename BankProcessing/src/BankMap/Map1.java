package BankMap;

import java.util.List;

import java.util.Map;
import java.util.TreeMap;

import com.bank.list.Account;

public class Map1 {

	private static Map<Integer, Account> map = new TreeMap<Integer, Account>();

	public void createAccount(int accountNo, String name) {
		double initalbalance = 0.0;
		Account account = new Account();
		account.setAccountNumber(accountNo);
		account.setName(name);
		account.setBalance(initalbalance);
		map.put(account.getAccountNumber(), account);
		System.out.println("<<<<<<<<<<<<<< Account created>>>>>>>>>>>>>>");
		System.out.println(" AccountNumber = " + account.getAccountNumber());
		System.out.println(" Account Name = " + account.getName());
		System.out.println(" Account Balance = " + account.getBalance());
		System.out.println("<<<<<<<<<<<<<< Account creating  Process Closed >>>>>>>>>>>>>>");

	}

	public void deposit(int accno, double amount) {
		Account account = map.get(accno);
		try {
			if (account.getAccountNumber() == accno) {

				account.setBalance(account.getBalance() + amount);
				System.out.println("<<<<<<<<<<<<<< Deposit sucessful>>>>>>>>>>>>>>");
				System.out.println(" AccountNumber = " + account.getAccountNumber() + " Account Balance = "
						+ account.getBalance());
				System.out.println("<<<<<<<<<<<<<< Deposit Process Closed >>>>>>>>>>>>>>");

			}

		} catch (Exception e) {
			System.out.println("Failed to Deposit!");
		}
	}

	public void withDraw(int accno, double amount) {
		Account account = map.get(accno);
		try {
			if (account.getAccountNumber() == accno) {
				if (amount < account.getBalance()) {

				account.setBalance(account.getBalance() - amount);
				System.out.println("<<<<<<<<<<<<<< WithDraw sucessful>>>>>>>>>>>>>>");
				System.out.println(" AccountNumber = " + account.getAccountNumber() + " Account Balance = "
						+ account.getBalance());
				System.out.println("<<<<<<<<<<<<<< WithDraw Process Closed >>>>>>>>>>>>>>");
			}else {
				System.out.println("Inefficient Balance");
			}
			}
		} catch (Exception e) {
			System.out.println("Failed to with Draw!");
		}
	}

	

	public void display_By_Accno(int accno) {
		Account account = map.get(accno);
		try {
			if (account.getAccountNumber() == accno) {
				System.out.println("<<<<<<<<<<<<<< Accounts Display >>>>>>>>>>>>>>");
				System.out.println(" AccountNumber = " + account.getAccountNumber());
				System.out.println(" Account Name = " + account.getName());
				System.out.println(" Account Balance = " + account.getBalance());
				System.out.println("<<<<<<<<<<<<<< display_By_Accno Process Closed >>>>>>>>>>>>>>");

			}

		} catch (Exception e) {
			System.out.println("Invalid Account number");
		}
	}

	public void display() {
		for (Map.Entry<Integer, Account> entry : map.entrySet()) {
			int key = entry.getKey();
			Account account = entry.getValue();
			System.out.println("<<<<<<<<<<<<<< Accounts Display >>>>>>>>>>>>>>");
			System.out.println(" AccountNumber = " + account.getAccountNumber());
			System.out.println(" Account Name = " + account.getName());
			System.out.println(" Account Balance = " + account.getBalance());
			System.out.println("<<<<<<<<<<<<<< Accounts Display Process Closed >>>>>>>>>>>>>>");

		}

	}
}