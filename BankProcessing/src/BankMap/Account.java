package BankMap;

public class Account {
	private int accountno;
	private String name;
	private double Balance;
	public Account(int accountno, String name, double balance) {
		super();
		this.accountno = accountno;
		this.name = name;
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
	
	

}
