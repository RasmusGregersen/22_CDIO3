package game;

import java.awt.Color;
import desktop_fields.Shipping;
import desktop_fields.Start;
import desktop_fields.Street;
import desktop_resources.GUI;

public class GameBoard {

	public GameBoard()
	{
	desktop_fields.Field[] fieldGUI = new desktop_fields.Field[21];
	Field[] fieldValue = new Field[21];
	Color color = Color.RED;
	fieldValue[1] = new Territory("Tribe Encampment", 100, 1000);
	fieldGUI[1] = new Street.Builder()
				.setTitle(fieldValue[1].getName())
				.setDescription(fieldValue[1].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[1]).getPrice())
				.setRent(""+((Ownable)fieldValue[1]).getRent())
				.setBgColor(Color.white)
				.build();

	fieldValue[2] = new Territory("Crater", 300, 1500);
	fieldGUI[2] = new Street.Builder()
				.setTitle(fieldValue[2].getName())
				.setDescription("")
				.setSubText("3")
				.setBgColor(Color.GRAY)
				.build();

	fieldValue[3] = new Territory("Mountain", 500, 2000);
	fieldGUI[3] = new Street.Builder()
				.setTitle(fieldValue[3].getName())
				.setDescription(fieldValue[3].getClass().getName())
				.setSubText("4")
				.setBgColor(Color.blue)
				.build();

		fieldGUI[4] = new Street.Builder()
				.setTitle("Cold Desert")
				.setDescription("")
				.setSubText("5")
				.setBgColor(Color.green)
				.build();

		fieldGUI[5] = new Street.Builder()
				.setTitle("Walled City")
				.setDescription("")
				.setSubText("6")
				.setBgColor(Color.magenta)
				.build();

		fieldGUI[6] = new Street.Builder()
				.setTitle("Monestary")
				.setDescription("")
				.setSubText("7")
				.setBgColor(Color.pink)
				.build();

		fieldGUI[7] = new Street.Builder()
				.setTitle("Black Cave")
				.setDescription("")
				.setSubText("8")
				.setBgColor(Color.darkGray)
				.build();

		fieldGUI[8] = new Street.Builder()
				.setTitle("Huts in the mountains")
				.setDescription("")
				.setSubText("9")
				.setBgColor(Color.yellow)
				.build();

		fieldGUI[9] = new Street.Builder()
				.setTitle("The Werewall")
				.setDescription("")
				.setSubText("10")
				.setBgColor(Color.WHITE)
				.build();

		fieldGUI[10] = new Street.Builder()
				.setTitle("The Pit")
				.setDescription("")
				.setSubText("11")
				.setBgColor(Color.orange)
				.build();

		fieldGUI[11] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();

		fieldGUI[12] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[13] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[14] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[15] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[16] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[17] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[18] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[19] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[20] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		fieldGUI[21] = new Street.Builder()
				.setTitle("Goldmine")
				.setDescription("")
				.setSubText("12")
				.setBgColor(color)
				.build();
		
		GUI.create(fieldGUI);
	}
	
}
