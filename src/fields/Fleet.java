package fields;

import desktop_resources.GUI;
import game.Player;

public class Fleet extends Ownable {
	private int RENT_1 = 500;
	private int RENT_2 = 1000;
	private int RENT_3 = 2000;
	private int RENT_4 = 4000;
	private int rent;


	public Fleet(String name, int RENT_1, int price) 
	{
		super(name, price);
		this.RENT_1 = RENT_1;
	}

	@Override
	public void landOnField(Player player) {
		if (player.getBalance() < super.getPrice()) {
			GUI.displayChanceCard(player.getName() + ": You cannot afford this property.");
		}

		else if (super.getOwner() == null) { // IKKE HAR EJER
			if (GUI.getUserLeftButtonPressed(player.getName() + ": This Fleet has no owner, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				player.setFleets();
				GUI.setOwner(player.getFieldPos(), player.getName());
			}
		}
		else if (super.getOwner().getBalance() == 0) {
			if (GUI.getUserLeftButtonPressed(player.getName() + ": This Fleet's owner is bankrupt, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
			}
		}
		else if (player == super.getOwner()) {
			GUI.displayChanceCard(player.getName() + ": Welcome back!");
		}
		else { // HAR EJER
			if (super.getOwner().getFleets() == 1)
				rent = RENT_1;
			else if (super.getOwner().getFleets() == 2)
				rent = RENT_2;
			else if (super.getOwner().getFleets() == 3)
				rent = RENT_3;
			else if (super.getOwner().getFleets() == 4)
				rent = RENT_4;
			GUI.displayChanceCard(player.getName() + ": You have landed on " + super.getOwner().getName() + "'s Fleet. Rent is " + rent);
			player.withdrawBalance(rent);
			super.getOwner().depositBalance(rent);
		}
	}

	@Override
	public String toString() {
		return "Fleet [getName()=" + getName() + ", getOwner()=" + getOwner() + ", getPrice()=" + 
				getPrice() + ", getRent()=" + getRent() + "]\n";
	}

	@Override
	public int getRent() {
		return RENT_1;
	}
}
