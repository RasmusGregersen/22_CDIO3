package game;

public class Tax extends Field {

	private int taxedAmount;
	private int taxRate;
	
	public Tax(String name, int taxedAmount, int taxRate) 
	{
		super(name);
		this.taxedAmount = taxedAmount;
		this.taxRate = taxRate;
	}

	@Override
	public void landOnField(Player player) {
		
	}
	
}
