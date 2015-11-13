package game;

public class Tax extends Field {

	private double taxedAmount;
	private double percentage = 1.0;
	private int taxRate;

	Player player = new Player();

	public Tax(String name, double taxedAmount, int taxRate) 
	{
		super(name);
		this.taxedAmount = taxedAmount;
		this.taxRate = taxRate;
	}

	public int TaxedTotalAssets() {

		if (player.getBalance()*(taxedAmount) < taxRate)

			player.getBalance() = player.getBalance()*(percentage-taxedAmount);

		else if (player.getBalance()*(taxedAmount) > taxRate)

			player.getBalance() = player.getBalance()-taxRate;

		return player.getBalance();
	}


	@Override
	public void landOnField(Player player) {

	}

}
