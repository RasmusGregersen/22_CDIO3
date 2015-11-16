package game;

import desktop_resources.GUI;

public class LaborCamp extends Ownable {
	private int baseRent;

	public LaborCamp(String name, int baseRent, int price) 
	{
		super(name, price);
		this.baseRent = baseRent;
	}

	public int getBaseRent() {
		return baseRent;
	}

	@Override
	public void landOnField(Player player) {
		if (super.getOwner().equals("")) { // IKKE HAR EJER
			if (GUI.getUserLeftButtonPressed("This Labor Camp has no owner, would you like to buy it?", "Yes", "No")) 
			{
				player.withdraw(super.getPrice());
				super.setOwner(player);
			}
		}
		else if (player == super.getOwner()) {
			GUI.showMessage("Welcome back!");
		}
		else { // HAR EJER
			GUI.showMessage("You have landed on " + super.getOwner() + "'s Labor Camp. Rent is " + baseRent);
			player.withdraw(baseRent);
			super.getOwner().deposit(baseRent);
		}	
	}

	@Override
	public int getRent() {
		return baseRent;
	}
}
