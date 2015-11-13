package game;

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
	}
	
}
