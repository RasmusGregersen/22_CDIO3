package fields;

import desktop_resources.GUI;
import game.Player;

public class Refuge extends Field {
	private int bonus;
	
	public Refuge(String name, int bonus) 
	{
		super(name);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}
	
	@Override
	public void landOnField(Player player) {
		player.depositBalance(bonus);
		GUI.displayChanceCard(player.getName() + ": Congratulations! You win a bonus of " + bonus);
	}
	
	@Override
	public String toString() {
		return "Refuge [getName()=" + getName() + ", getBonus()=" + getBonus() + "]\n";
	}
	
}
