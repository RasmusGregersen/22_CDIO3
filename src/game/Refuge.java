package game;

import desktop_resources.GUI;

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
		player.deposit(bonus);
		GUI.showMessage("Congratulations! You win a bonus of " + bonus);
	}
	
}
