package game;

import desktop_resources.GUI;

public class Territory extends Ownable {

	private int rent;

	public Territory(String name, int rent, int price) 
	{
		super(name, price);
		this.rent = rent;
	}


	@Override
	public void landOnField(Player player) {
		if (super.getOwner().equals("")) { // IKKE HAR EJER
			if (GUI.getUserLeftButtonPressed("This Territory has no owner, would you like to buy it?", "Yes", "No")) 
			{
				player.withdraw(super.getPrice());
				super.setOwner(player);
			}
		}
		else if (player == super.getOwner()) {
			GUI.showMessage("Welcome back!");
		}
		else { // HAR EJER
			GUI.showMessage("You have landed on " + super.getOwner() + "'s Territory. Rent is " + rent);
			player.withdraw(rent);
			super.getOwner().deposit(rent);
		}	
	}
	@Override
	public int getRent() {
		return rent;
	}
}
