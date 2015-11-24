package fields;

import desktop_resources.GUI;
import game.DiceCup;
import game.Player;

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
		if (player.getBalance() < super.getPrice()) {
			GUI.displayChanceCard("You cannot afford this property.");
		}

		else if (super.getOwner() == null) { // IKKE HAR EJER
			if (GUI.getUserLeftButtonPressed("This Labor Camp has no owner, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
				super.getOwner().setLaborcamps();
			}
		}
		else if (super.getOwner().getBalance() == 0) {
			if (GUI.getUserLeftButtonPressed("This Labor Camp's owner is bankrupt, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
			}
		}
		else if (player == super.getOwner()) {
			GUI.displayChanceCard("Welcome back!");
		}
		else { // HAR EJER
			int rent = 0;
			GUI.displayChanceCard("You have landed on " + super.getOwner().getName() + "'s Labor Camp.");
			GUI.getUserButtonPressed("Roll the dice to determine the rent", "Roll Dice");
			DiceCup dicecup = new DiceCup();
			dicecup.newRoll();
			GUI.setDice(dicecup.getDie1(), dicecup.getDie2());
			if (super.getOwner().getLaborcamps() == 1)
				rent = dicecup.getSum() * baseRent;
			else if (super.getOwner().getLaborcamps() == 2)
				rent = dicecup.getSum() * baseRent * 2;
			GUI.displayChanceCard("The rent has been determined to be: " + rent);
			player.withdrawBalance(rent);
			super.getOwner().depositBalance(rent);
		}	
	}

	@Override
	public String toString() {
		return "LaborCamp [getName()=" + getName() + ", getOwner()=" + getOwner() + ", getPrice()=" + 
				getPrice() + ", getRent()=" + getRent() + "]\n";
	}

	@Override
	public int getRent() {
		return baseRent;
	}
}
