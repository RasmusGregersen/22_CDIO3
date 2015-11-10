package game;

public class Tax extends Field {

	private String name;
	private int fixedValue;
	private int variableValue;
	
	public Tax(String name, int fixedValue, int variableValue) 
	{
		this.name = name;
		this.fixedValue = fixedValue;
		this.variableValue = variableValue;
	}

	@Override
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}
	
}
