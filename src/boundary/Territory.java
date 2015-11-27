package boundary;

import java.util.Arrays;

import desktop_resources.GUI;
import entity.Player;

public class Territory extends Ownable {

	private int rent;

	public Territory(String name, int rent, int price) 
	{
		super(name, price);
		this.rent = rent;
	}

	

	@Override
	public String toString() {
		return "Territory [getName()=" + getName() + ", getOwner()=" + getOwner() + ", getPrice()=" + 
				getPrice() + ", getRent()=" + getRent() + "]\n";
	}



	@Override 
	public void landOnField(Player player) { // landOnField method for Fleets overridden from Field class.
		if (super.getOwner() == null) { // Checks if field has no Owner.
			if (player.getBalance() < super.getPrice()) {
				GUI.displayChanceCard(player.getName() + ": You cannot afford this property.");
			}
			else if (GUI.getUserLeftButtonPressed(player.getName() + ": This Territory has no owner, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
			}
		}
		else if (super.getOwner().getBalance() == 0) { // Checks if the owner is bankrupt.
			if (player.getBalance() < super.getPrice()) {
				GUI.displayChanceCard(player.getName() + ": You cannot afford this property.");
			}
			else if (GUI.getUserLeftButtonPressed(player.getName() + ": This Territory's owner is bankrupt, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
			}
		}
		else if (player == super.getOwner()) { // Checks if the actual player is the owner.
			GUI.displayChanceCard(player.getName() + ": Welcome back!");
		}
		else { // Otherwise the field must be owned by another active player.
			GUI.displayChanceCard(player.getName() + ": You have landed on " + super.getOwner().getName() + "'s Territory. Rent is " + rent);
			player.withdrawBalance(rent);
			super.getOwner().depositBalance(rent);
			GUI.setBalance(super.getOwner().getName(), super.getOwner().getBalance());
		}	
	}
	@Override
	public int getRent() {
		return rent;
	}
}
