package game;

public class Territory extends Ownable {
	
	private int rent;
	
	public Territory(String name, int rent, int price) 
	{
		super(name, price);
		this.rent = rent;
	}
	
	public int getRent() {
		return rent;
	}
	
	@Override
	public void landOnField(Player player) {
		
	}

}
