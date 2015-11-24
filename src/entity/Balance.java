/*
 * Balance
 *
 * Version info
 *
 * Copyright notice */

package entity;

public class Balance {

	// Balance variable
	private int balance;

	public Balance(int balance){
		this.balance = balance;
	}

	// Method to withdraw from the balance
	public void withdraw(int balance) {
		if (balance <0)
			System.out.println("You can't withdraw negative balance");
		else if (balance > this.balance)
			this.balance = 0;
		else
			this.balance = this.balance - balance;
	}
	// Method to deposit to the balance
	public void deposit(int balance) {
		if (balance <0)
			System.out.println("You can't deposit negative balance");
		else
			this.balance = this.balance + balance;
	}
	// Method to get the current balance, and corrects it to 0 or 3000 if less or more.
	public int getBalance()	{
		return balance;
	}
	// toString method to keep track of variables in the class - For troubleshooting.
	@Override
	public String toString() {
		return "Balance [balance=" + balance + "]";
	}
}