package test;
import java.awt.Color;
import java.util.Set;
import desktop_codebehind.Car;
import desktop_codebehind.Car.Builder;
import desktop_resources.GUI;
import game.*;

/* Description:
* This tests starts when the player press OK, 
* and runs thru an entire game (without user input) 
* and prints the average responsetime. 
*/
public class CDIO2ResponseTimeTest {

	public static void main(String[] args) {
		GUI.showMessage("Start test!");
		double lStartTime = System.currentTimeMillis();
		double counter = 0;
		double difference = 0;
		// Import of 1 dicecup class and 2 player classes.
		DiceCup dicecup = new DiceCup();
		Player player1 = new Player();
		Player player2 = new Player();
		Language language = new Language();
		int fields = 0;
		
		
		Car car1 = new Car.Builder() // chaining
			.primaryColor(Color.ORANGE)
			.secondaryColor(Color.BLACK)
			.typeRacecar()
			.patternDotted()
			.build();
		
		
		Car car2 = new Car.Builder() // chaining
				.primaryColor(Color.CYAN)
				.secondaryColor(Color.BLACK)
				.typeRacecar()
				.patternDotted()
				.build();
		
		
		String name1 = "Player 1";
		String name2 = "Player 2";
		boolean Continue = false;
		
		while (Continue == false) {
			if (name1.length() < 1 || name1.length() > 15 || name1.indexOf(" ") == 0)
				name1 = GUI.getUserString(language.getInvalid1());	
			else if (name2.length() < 1 || name2.length() > 15 || name2.indexOf(" ") == 0)
				name2 = GUI.getUserString(language.getInvalid2());
			else if (name1.equals(name2))
				name2 = GUI.getUserString(language.getnotEqual());
			else
				Continue = true;
		}
		// set player names from GUI input.
		player1.setName(name1);
		player2.setName(name2);
		
		// add players to the GUI.
		GUI.addPlayer(player1.getName(), player1.getBalance(), car1 );
		GUI.addPlayer(player2.getName(), player2.getBalance(), car2 );

		// declare next turn to player1. (First turn).
		Player next = player1;

		// while loop that runs until a winner is found. (win = true).
		boolean win = false;
		while (win == false)
		{
			// The end! Congratulates the winner!
			counter++;
			if (player1.getBalance() == 3000) {
				//GUI.showMessage(player1.getName() + language.getWin());
				win = true;
				break;
				
			}	
			else if (player2.getBalance() == 3000) {
				//GUI.showMessage(player2.getName() + language.getWin());
				win = true;
				break;
			}
			
			// Game begins! GUI method displays 'Roll' button. 
			//GUI.getUserButtonPressed(language.getrollDice(), language.getRoll());

			// Calls the method for a new roll, and displays it in the GUI
			dicecup.newRoll();
			GUI.setDice(dicecup.getDie1(), dicecup.getDie2());
			
			// If player1 just rolled, sets next turn to player2.
			if(next == player1) {
				next = player2;
				GUI.removeAllCars(player1.getName());
				fields = dicecup.getSum();
				GUI.setCar(fields - 1, player1.getName());
				//GUI.showMessage(player1.getName() + language.getRolleda() + dicecup.getDie1() + language.getAnd() + dicecup.getDie2());
				
				switch (fields) {
				case 2:  player1.deposit(250);
//				GUI.showMessage(language.getField1());
				break;
				case 3:  player1.withdraw(200);
//				GUI.showMessage(language.getField2());
				break;
				case 4:  player1.withdraw(100);
//				GUI.showMessage(language.getField3());
				break;
				case 5:  player1.withdraw(20);
//				GUI.showMessage(language.getField4());
				break;
				case 6:  player1.deposit(180);
//				GUI.showMessage(language.getField5());
				break;
				case 7:  
//				GUI.showMessage(language.getField6());
				break;
				case 8:  player1.withdraw(70);
//				GUI.showMessage(language.getField7());
				break;
				case 9:  player1.withdraw(60);
//				GUI.showMessage(language.getField8());
				break;
				case 10: player1.withdraw(80);
//				GUI.showMessage(language.getField9());
				next = player1;
				break;
				case 11: player1.withdraw(90);
//				GUI.showMessage(language.getField10());
				break;
				case 12: player1.deposit(650);
//				GUI.showMessage(language.getField11());
				break;
				}
				GUI.setBalance(player1.getName(), player1.getBalance());
				// Prints out player1's roll
				
			}
			else {
				next = player1;
				GUI.removeAllCars(player2.getName());
				fields = dicecup.getSum();
				GUI.setCar(fields - 1, player2.getName());
//				GUI.showMessage(player2.getName() + language.getRolleda() + dicecup.getDie1() + language.getAnd() + dicecup.getDie2());
				
				switch (fields) {
				case 2:  player2.deposit(250);
//				GUI.showMessage(language.getField1());
				break;
				case 3:  player2.withdraw(200);
//				GUI.showMessage(language.getField2());
				break;
				case 4:  player2.withdraw(100);
//				GUI.showMessage(language.getField3());
				break;
				case 5:  player2.withdraw(20);
//				GUI.showMessage(language.getField4());
				break;
				case 6:  player2.deposit(180);
//				GUI.showMessage(language.getField5());
				break;
				case 7:  
//				GUI.showMessage(language.getField6());
				break;
				case 8:  player2.withdraw(70);
//				GUI.showMessage(language.getField7());
				break;
				case 9:  player2.withdraw(60);
//				GUI.showMessage(language.getField8());
				break;
				case 10: player2.withdraw(80);
//				GUI.showMessage(language.getField9());
				next = player2;
				break;
				case 11: player2.withdraw(90);
//				GUI.showMessage(language.getField10());
				break;
				case 12: player2.deposit(650);
//				GUI.showMessage(language.getField11());
				break;
				}
				GUI.setBalance(player2.getName(), player2.getBalance());
				
				
			}
			double lEndTime = System.currentTimeMillis();
			difference = lEndTime - lStartTime;
			System.out.println("Elapsed milliseconds : " + difference);
			
		}
		System.out.println("Antal kast: " + counter);
		System.out.println(difference/counter);
	}
}
