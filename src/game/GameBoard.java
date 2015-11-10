package game;

import java.awt.Color;
import desktop_fields.Shipping;
import desktop_fields.Start;
import desktop_fields.Street;
import desktop_resources.GUI;

public class GameBoard {

	private String name;
	private int value;
	
	public GameBoard(String name, int value) 
	{
		this.name = name;
		this.value = value;
	}
	
	public GameBoard()
	{
	desktop_fields.Field[] fields = new desktop_fields.Field[21];
	Field[] fields2 = new Field[21];
	Color color = Color.RED;
	fields2[0] = new Refuge("Walled City", 5000);	
	fields[0] = new Street.Builder()
				.setTitle(fields2.getname())
				.setDescription("")
				.setSubText("1")
				.setBgColor(Color.white)
				.build();
				
				
				
		fields[1] = new Street.Builder()
				.setTitle("Tower")
				.setDescription("")
				.setSubText("2")
				.setBgColor(Color.CYAN)
				.build();
		
		fields[2] = new Street.Builder()
				.setTitle("Crater")
				.setDescription("")
				.setSubText("3")
				.setBgColor(Color.GRAY)
				.build();

		fields[3] = new Street.Builder()
				.setTitle("Palace Gates")
				.setDescription("")
				.setSubText("4")
				.setBgColor(Color.blue)
				.build();

		fields[4] = new Street.Builder()
				.setTitle("Cold Desert")
				.setDescription("")
				.setSubText("5")
				.setBgColor(Color.green)
				.build();

		fields[5] = new Street.Builder()
				.setTitle("Walled City")
				.setDescription("")
				.setSubText("6")
				.setBgColor(Color.magenta)
				.build();

		fields[6] = new Street.Builder()
				.setTitle("Monestary")
				.setDescription("")
				.setSubText("7")
				.setBgColor(Color.pink)
				.build();

		fields[7] = new Street.Builder()
				.setTitle("Black Cave")
				.setDescription("")
				.setSubText("8")
				.setBgColor(Color.darkGray)
				.build();

		fields[8] = new Street.Builder()
				.setTitle("Huts in the mountains")
				.setDescription("")
				.setSubText("9")
				.setBgColor(Color.yellow)
				.build();

		fields[9] = new Street.Builder()
				.setTitle("The Werewall")
				.setDescription("")
				.setSubText("10")
				.setBgColor(Color.WHITE)
				.build();

		fields[10] = new Street.Builder()
				.setTitle("The Pit")
				.setDescription("")
				.setSubText("11")
				.setBgColor(Color.orange)
				.build();

		fields[11] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();

		fields[12] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[13] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[14] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[15] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[16] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[17] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[18] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[19] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[20] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fields[21] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		GUI.create(fields);
	}
	
}
