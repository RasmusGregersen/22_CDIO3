/*
* Player
*
* Version info
*
* Copyright notice */

package game;

public class Player {
	private String name;
	private Balance balance = new Balance();
	private int fleets = 0;
	
	public int getBalance() {
		return balance.getBalance();
	}
	// Method to withdraw from the balance
	public int withdraw(int i) {
		balance.withdraw(i);
		return balance.getBalance();
	}
	// Method to deposit from the balance
	public int deposit(int i) {
		balance.deposit(i);
		return balance.getBalance();
	}
	// method to return player name.
	public String getName()	{
		return name;
	}
	// method to set player name.
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFleets() {
		return fleets;
	}
	public void setFleets() {
		fleets++;
	}
	@Override
	public String toString() {
		return "##############################\nPlayer [name=" + name + ", balance=" + balance + "]\n##############################";
		//return "Player [name=" + name + ", balance=" + balance + "]";
	}
	
}
