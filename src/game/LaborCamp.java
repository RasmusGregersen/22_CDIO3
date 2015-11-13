                          package game;

public abstract class LaborCamp extends Ownable {
	private int baseRent;
	
	public LaborCamp(String name, int baseRent, int price) 
	{
		super(name, price);
		this.baseRent = baseRent;
	}
	
	@Override
	public void landOnField(Player player) {
		
	}
}
