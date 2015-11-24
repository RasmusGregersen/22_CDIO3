/*
* Player
*
* Version info
*
* Copyright notice */

package game;

public class Player {
	private String name;
	private Balance balance = new Balance(30000);
	private int fleets = 0;
	private int FieldPos = 0;
	private int laborcamps = 0;
	
	public Player(String name){
		this.name = name;
	}
	
	public int getBalance() {
		return balance.getBalance();
	}
	// Method to withdraw from the balance
	public int withdrawBalance(int i) {
		balance.withdraw(i);
		return balance.getBalance();
	}
	// Method to deposit from the balance
	public int depositBalance(int i) {
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

	public int getLaborcamps() {
		return laborcamps;
	}
	public void setLaborcamps() {
		laborcamps++;
	}
	public int getFieldPos() {
		return FieldPos;
	}
	public void setFieldPos(int FieldPos) {
		this.FieldPos = FieldPos + this.FieldPos;
		if (this.FieldPos > 21)
			this.FieldPos = this.FieldPos - 21;
	}
	
	@Override
	public String toString() {
		return "Player [" + (name != null ? "name=" + name + ", " : "")
				+ (balance != null ? "balance=" + balance + ", " : "") + "fleets=" + fleets + ", FieldPos=" + FieldPos
				+ "]";
	}
	
	
	
}
