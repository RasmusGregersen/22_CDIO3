package game;

public class Refuge extends Field {

	private int bonus;
	private String name;
	
	public Refuge(String name, int bonus) 
	{
		this.name = name;
		this.bonus = bonus;
	}

	
	
	public String getName() {
		return name;
	}



	@Override
	public void landOnField(Player player) {
		player.deposit(bonus);
	}
	
}
