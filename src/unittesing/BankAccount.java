package unittesing;

public class BankAccount {
	private String firstName;
	private String lastName;
	private double balance;
	
	public static final int CHECKING = 1;
	public static final int SAVINGS = 2;
	
	private int accounType;
	
	public BankAccount(String firstName, String lastName, double balance, int accountType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.accounType = accountType;
	}
	
	// branch true if customer is performing the transaction with a teller
	// false if at an ATM
	public double deposit(double amount, boolean branch) {
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount, boolean branch) {
		if (amount > 500 && !branch) {
			throw new IllegalArgumentException();
		}
		balance -= amount;
			return balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean isChecking() {
		return accounType == CHECKING;
	}
}
