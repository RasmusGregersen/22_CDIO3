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
		fieldValue[0] = new Territory("Tribe Encampment", 100, 1000);
		fieldGUI[0] = new Street.Builder()
				.setTitle(fieldValue[0].getName())
				.setDescription(fieldValue[0].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[0]).getPrice())
				.setRent(""+((Ownable)fieldValue[0]).getRent())
				.setBgColor(Color.white)
				.build();

		fieldValue[1] = new Territory("Crater", 300, 1500);
		fieldGUI[1] = new Street.Builder()
				.setTitle(fieldValue[1].getName())
				.setDescription(fieldValue[1].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[1]).getPrice())
				.setRent(""+((Ownable)fieldValue[1]).getRent())
				.setBgColor(Color.orange)
				.build();

		fieldValue[2] = new Territory("Mountain", 500, 2000);
		fieldGUI[2] = new Street.Builder()
				.setTitle(fieldValue[2].getName())
				.setDescription(fieldValue[2].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[2]).getPrice())
				.setRent(""+((Ownable)fieldValue[2]).getRent())
				.setBgColor(Color.blue)
				.build();

		fieldValue[3] = new Territory("Cold Desert", 700, 3000);
		fieldGUI[3] = new Street.Builder()
				.setTitle(fieldValue[3].getName())
				.setDescription(fieldValue[3].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[3]).getPrice())
				.setRent(""+((Ownable)fieldValue[3]).getRent())
				.setBgColor(Color.green)
				.build();

		fieldValue[4] = new Territory("Black Cave", 1000, 4000);
		fieldGUI[4] = new Street.Builder()
				.setTitle(fieldValue[4].getName())
				.setDescription(fieldValue[4].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[4]).getPrice())
				.setRent(""+((Ownable)fieldValue[4]).getRent())
				.setBgColor(Color.yellow)
				.build();

		fieldValue[5] = new Territory("The Werewall", 1300, 4300);
		fieldGUI[5] = new Street.Builder()
				.setTitle(fieldValue[5].getName())
				.setDescription(fieldValue[5].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[5]).getPrice())
				.setRent(""+((Ownable)fieldValue[5]).getRent())
				.setBgColor(Color.red)
				.build();

		fieldValue[6] = new Territory("Mountain Village", 1600, 4750);
		fieldGUI[6] = new Street.Builder()
				.setTitle(fieldValue[6].getName())
				.setDescription(fieldValue[6].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[6]).getPrice())
				.setRent(""+((Ownable)fieldValue[6]).getRent())
				.setBgColor(Color.DARK_GRAY)
				.build();

		fieldValue[7] = new Territory("South Citadel", 2000, 5000);
		fieldGUI[7] = new Street.Builder()
				.setTitle(fieldValue[7].getName())
				.setDescription(fieldValue[7].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[7]).getPrice())
				.setRent(""+((Ownable)fieldValue[7]).getRent())
				.setBgColor(Color.LIGHT_GRAY)
				.build();

		fieldValue[8] = new Territory("Palace Gates", 2600, 5500);
		fieldGUI[8] = new Street.Builder()
				.setTitle(fieldValue[8].getName())
				.setDescription(fieldValue[8].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[8]).getPrice())
				.setRent(""+((Ownable)fieldValue[8]).getRent())
				.setBgColor(Color.cyan)
				.build();

		fieldValue[9] = new Territory("Tower", 3200, 6000);
		fieldGUI[9] = new Street.Builder()
				.setTitle(fieldValue[9].getName())
				.setDescription(fieldValue[9].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[9]).getPrice())
				.setRent(""+((Ownable)fieldValue[9]).getRent())
				.setBgColor(Color.magenta)
				.build();

		fieldValue[10] = new Territory("Castle", 4000, 8000);
		fieldGUI[10] = new Street.Builder()
				.setTitle(fieldValue[10].getName())
				.setDescription(fieldValue[10].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[10]).getPrice())
				.setRent(""+((Ownable)fieldValue[10]).getRent())
				.setBgColor(Color.WHITE)
				.build();

		fieldValue[11] = new Refuge ("Walled City", 5000);
		fieldGUI[11] = new Street.Builder()
				.setTitle(fieldValue[11].getName())
				.setDescription(fieldValue[11].getClass().getName())
				.setSubText(""+((Refuge)fieldValue[11]).getBonus())
				.setBgColor(Color.WHITE)
				.build();

		fieldValue[12] = new Refuge ("Monastery", 500);
		fieldGUI[12] = new Street.Builder()
				.setTitle(fieldValue[12].getName())
				.setDescription(fieldValue[12].getClass().getName())
				.setSubText(""+((Refuge)fieldValue[12]).getBonus())
				.setBgColor(Color.PINK)
				.build();

		fieldValue[13] = new LaborCamp ("Huts in the mountain", 100, 2500);
		fieldGUI[13] = new Street.Builder()
				.setTitle(fieldValue[13].getName())
				.setDescription(fieldValue[13].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[13]).getPrice())
				.setRent(""+((LaborCamp)fieldValue[13]).getBaseRent())
				.setBgColor(Color.white)
				.build();

		fieldValue[14] = new LaborCamp ("The Pit", 100, 2500);
		fieldGUI[14] = new Street.Builder()
				.setTitle(fieldValue[14].getName())
				.setDescription(fieldValue[14].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[14]).getPrice())
				.setRent(""+((LaborCamp)fieldValue[14]).getBaseRent())
				.setBgColor(Color.white)
				.build();

		fieldValue[15] = new Tax ("Goldmine", 2000, 0);
		fieldGUI[15] = new Street.Builder()
				.setTitle(fieldValue[15].getName())
				.setDescription(fieldValue[15].getClass().getName())
				.setSubText(""+((Tax)fieldValue[15]).getTaxedAmount())
				.setBgColor(Color.blue)
				.build();

		fieldValue[16] = new Tax ("Caravan", 4000, 0.1);
		fieldGUI[16] = new Street.Builder()
				.setTitle(fieldValue[16].getName())
				.setDescription(fieldValue[16].getClass().getName())
				.setSubText(""+((Tax)fieldValue[16]).getTaxedAmount())
				.setBgColor(Color.blue)
				.build();

		fieldValue[17] = new Fleet ("Second Sail", 1, 4000);
		fieldGUI[17] = new Street.Builder()
				.setTitle(fieldValue[17].getName())
				.setDescription(fieldValue[17].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[17]).getPrice())
				.setRent(""+((Ownable)fieldValue[17]).getRent())
				.setBgColor(Color.blue)
				.build();

		fieldValue[18] = new Fleet ("Sea Grover", 1, 4000);
		fieldGUI[18] = new Street.Builder()
				.setTitle(fieldValue[18].getName())
				.setDescription(fieldValue[18].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[18]).getPrice())
				.setRent(""+((Ownable)fieldValue[18]).getRent())
				.setBgColor(Color.blue)
				.build();

		fieldValue[19] = new Fleet ("The Buccaneers", 1, 4000);
		fieldGUI[19] = new Street.Builder()
				.setTitle(fieldValue[19].getName())
				.setDescription(fieldValue[19].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[19]).getPrice())
				.setRent(""+((Ownable)fieldValue[19]).getRent())
				.setBgColor(Color.blue)
				.build();

		fieldValue[20] = new Fleet ("Private armade", 1, 4000);
		fieldGUI[20] = new Street.Builder()
				.setTitle(fieldValue[20].getName())
				.setDescription(fieldValue[20].getClass().getName())
				.setSubText(""+((Ownable)fieldValue[20]).getPrice())
				.setRent(""+((Ownable)fieldValue[20]).getRent())
				.setBgColor(Color.blue)
				.build();

		GUI.create(fieldGUI);
	}

}
