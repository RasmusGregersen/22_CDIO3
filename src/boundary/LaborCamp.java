package boundary;

import desktop_resources.GUI;
import entity.DiceCup;
import entity.Player;

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
	public void landOnField(Player player) { // landOnField method for Fleets overridden from Field class.
		if (super.getOwner() == null) { // Checks if field has no Owner.
			if (player.getBalance() < super.getPrice()) {
				GUI.displayChanceCard(player.getName() + ": You cannot afford this property.");
			}
			else if (GUI.getUserLeftButtonPressed(player.getName() + ": This Labor Camp has no owner, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
				super.getOwner().setLaborcamps();
			}		
		}
		else if (super.getOwner().getBalance() == 0) { // Checks if the owner is bankrupt.
			if (player.getBalance() < super.getPrice()) {
				GUI.displayChanceCard(player.getName() + ": You cannot afford this property.");
			}
			else if (GUI.getUserLeftButtonPressed(player.getName() + ": This Labor Camp's owner is bankrupt, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
			}
		}
		else if (player == super.getOwner()) { // Checks if the actual player is the owner.
			GUI.displayChanceCard(player.getName() + ": Welcome back!");
		}
		else { // Otherwise the field must be owned by another player.
			int rent = 0;
			GUI.displayChanceCard(player.getName() + ": You have landed on " + super.getOwner().getName() + "'s Labor Camp.");
			GUI.getUserButtonPressed(player.getName() + ": Roll the dice to determine the rent", "Roll Dice");
			DiceCup dicecup = new DiceCup();
			dicecup.newRoll();
			GUI.setDice(dicecup.getDie1(), dicecup.getDie2());
			if (super.getOwner().getLaborcamps() == 1)
				rent = dicecup.getSum() * baseRent;
			else if (super.getOwner().getLaborcamps() == 2)
				rent = dicecup.getSum() * baseRent * 2;
			GUI.displayChanceCard(player.getName() + ": The rent has been determined to be: " + rent);
			player.withdrawBalance(rent);
			super.getOwner().depositBalance(rent);
			GUI.setBalance(super.getOwner().getName(), super.getOwner().getBalance());
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
