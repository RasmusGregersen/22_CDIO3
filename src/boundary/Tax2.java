package boundary;

import desktop_resources.GUI;
import entity.Player;

public class Tax2 extends Field {

	private int tax;

	public Tax2(String name, int tax) 
	{
		super(name);
		this.tax = tax;
	}

	public int getTax() {
		return tax;
	}

	@Override
	public void landOnField(Player player) {
		GUI.displayChanceCard(player.getName() + ": You have landed on the Tax field. " + tax + " has been withdrawn from your balance.");
		player.withdrawBalance(tax);
	}
	@Override
	public String toString() {
		return "Tax [getName()=" + getName() + ", getTax()=" + getTax() + "]\n";
	}
}
