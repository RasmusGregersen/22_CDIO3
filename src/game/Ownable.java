package game;

public class Ownable extends Field {
	private int price;
	private Player owner;
	
	public Ownable(String name, int price){
		super(name);
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public void landOnField(Player player) {
	}	
	
}
