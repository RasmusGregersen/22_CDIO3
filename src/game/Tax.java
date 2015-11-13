package game;

public class Tax extends Field {

	private int taxedAmount;
	private double percentage = 1.0;
	private double taxRate;

	public Tax(String name, int taxedAmount, double taxRate) 
	{
		super(name);
		this.taxedAmount = taxedAmount;
		this.taxRate = taxRate;
	}

	public int getTaxedAmount() {
		return taxedAmount;
	}

	@Override
	public void landOnField(Player player) {
		if (player.getBalance()*(taxRate) < taxedAmount){
			player.withdraw(taxedAmount);
		}
		else
		{
			player.withdraw((int)Math.round(player.getBalance()*taxRate));
		}
	}
}
