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
		if (super.getOwner() == null) { // IKKE HAR EJER
			if (GUI.getUserLeftButtonPressed("This Labor Camp has no owner, would you like to buy it?", "Yes", "No")) 
			{
				player.withdraw(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
				super.getOwner().setLaborcamps();
			}
		}
		else if (super.getOwner().getBalance() == 0) {
			if (GUI.getUserLeftButtonPressed("This Labor Camp's owner is bankrupt, would you like to buy it?", "Yes", "No")) 
			{
				player.withdraw(super.getPrice());
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
			player.withdraw(rent);
			super.getOwner().deposit(rent);
		}	
	}

	@Override
	public int getRent() {
		return baseRent;
	}
}
