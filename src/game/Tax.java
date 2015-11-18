package game;

import desktop_resources.GUI;

public class Tax extends Field {

	private int tax;

	public Tax(String name, int tax) 
	{
		super(name);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	@Override
	public void landOnField(Player player) {
		if (GUI.getUserLeftButtonPressed("You landed on the tax field. Pay either " + tax + " or 10% of your assets.", "Fixed Tax", "10%" ))
			player.withdraw(tax);
		else
			player.withdraw(player.getBalance()/10);
	}
}
