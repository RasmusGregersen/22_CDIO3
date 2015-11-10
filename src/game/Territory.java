package game;

public class Territory extends Ownable {
	
	private int rent;
	private int price;
	
	public Territory(String name, int rent, int price) 
	{
		super(name, price);
		this.rent = rent;
	}

	public int getRent() {
		return rent;
	}
		
	
	
}
