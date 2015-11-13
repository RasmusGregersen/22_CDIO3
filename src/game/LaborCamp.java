package game;

public class LaborCamp extends Ownable {
	private int baseRent;
	
	public LaborCamp(String name, int baseRent, int price) 
	{
		super(name, price);
		this.baseRent = baseRent;
	}
	
	
	
	public int getBaseRent() {
		return baseRent;
	}



	@Override
	public void landOnField(Player player) {
		
	}

	@Override
	public int getRent() {
		return 0;
	}
}
