package game;

public class Ownable extends Field {
	private int price;
	private Player owner;
	
	public int getRent() {
		return 0;
	}

	@Override
	public void landOnField(Player player) {
		
	}
	
}
