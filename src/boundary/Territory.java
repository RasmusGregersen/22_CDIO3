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
	public void landOnField(Player player) { // HAR RÅD?
		if (player.getBalance() < super.getPrice()) {
			GUI.displayChanceCard(player.getName() + ": You cannot afford this property.");
		}		
		else if (super.getOwner() == null) { // HAR EJER?
			if (GUI.getUserLeftButtonPressed(player.getName() + ": This Territory has no owner, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
			}
		}
		else if (super.getOwner().getBalance() == 0) { // EJER RØGET UD AF SPILLET?
			if (GUI.getUserLeftButtonPressed(player.getName() + ": This Territory's owner is bankrupt, would you like to buy it?", "Yes", "No")) 
			{
				player.withdrawBalance(super.getPrice());
				super.setOwner(player);
				GUI.setOwner(player.getFieldPos(), player.getName());
			}
		}
		else if (player == super.getOwner()) { // ER SELV EJER?
			GUI.displayChanceCard(player.getName() + ": Welcome back!");
		}
		else { // HAR EJER
			GUI.displayChanceCard(player.getName() + ": You have landed on " + super.getOwner().getName() + "'s Territory. Rent is " + rent);
			player.withdrawBalance(rent);
			super.getOwner().depositBalance(rent);
		}	
	}
	@Override
	public int getRent() {
		return rent;
	}
}
