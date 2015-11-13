package game;

public class Tax extends Field {

	private int taxedAmount;
	private double percentage = 1.0;
	private double taxRate;

//	Player player = new Player();

	public Tax(String name, int taxedAmount, double taxRate) 
	{
		super(name);
		this.taxedAmount = taxedAmount;
		this.taxRate = taxRate;
	}

	
	
//	public int TaxedTotalAssets() {
//
//		if (player.getBalance()*(taxedAmount) < taxRate)
//
//			player.getBalance() = player.getBalance()*(percentage-taxedAmount);
//
//		else if (player.getBalance()*(taxedAmount) > taxRate)
//
//			player.getBalance() = player.getBalance()-taxRate;
//
//		return player.getBalance();
//	}


	public int getTaxedAmount() {
		return taxedAmount;
	}



	@Override
	public void landOnField(Player player) {

	}

}
