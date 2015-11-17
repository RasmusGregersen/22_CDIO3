/*
* Balance
*
* Version info
*
* Copyright notice */

package game;

public class Balance {
	
	// Balance variable, starting at 30000.
	private int balance = 30000;

	// Method to withdraw from the balance
	public void withdraw(int balance) {
		this.balance = this.balance - balance;
	}
	// Method to deposit to the balance
	public void deposit(int balance) {
		this.balance = this.balance + balance;
	}
	// Method to get the current balance, and corrects it to 0 or 3000 if less or more.
	public int getBalance()	{
		if (balance>30000)
			balance = 30000;
		else if (balance<0)
			balance = 0;
		return balance;
	}
	// toString method to keep track of variables in the class - For troubleshooting.
	@Override
	public String toString() {
		return "Balance [balance=" + balance + "]";
	}
}