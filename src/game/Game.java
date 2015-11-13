/*
 * Game
 *
 * Version info
 *
 * Copyright notice */

package game;

import java.awt.Color;
import java.util.Set;

import desktop_codebehind.Car;
import desktop_codebehind.Car.Builder;
import desktop_resources.GUI;

public class Game {

	public static void main(String[] args) {

		// Creates new entities of our subclasses.
		DiceCup dicecup = new DiceCup();
		Player[] player = { new Player(), new Player(), new Player(), new Player(), new Player(), new Player() };

		Language language = new Language();

		int players = GUI.getUserInteger("How many players do you wish to play", 2 , 6);	
		
		boolean namecheck = false;
		while (namecheck == false) {
			String name1 = GUI.getUserString(language.getPlayer1());
			String name2 = GUI.getUserString(language.getPlayer2());
			if (players > 2) {
				String name3;
				name3 = GUI.getUserString(language.getPlayer3());
			}
			if (players > 3) {
				String name4;
				name4 = GUI.getUserString(language.getPlayer4());
			}
			if (players > 4) {
				String name5;
				name5 = GUI.getUserString(language.getPlayer5());
			}
			if (players > 5) {
				String name6;
				name6 = GUI.getUserString(language.getPlayer6());
			}

			if (name1.length() < 1 || name1.length() > 15 || name1.indexOf(" ") == 0)
				name1 = GUI.getUserString(language.getInvalid1());	

			else if (name2.length() < 1 || name2.length() > 15 || name2.indexOf(" ") == 0)
				name2 = GUI.getUserString(language.getInvalid2());
			// Player names must not be identical. (Ignores case)
			else if (name1.equalsIgnoreCase(name2))
				name2 = GUI.getUserString(language.getnotEqual());
			else
				namecheck = true;
		}

		Car car1 = new Car.Builder()
				.primaryColor(Color.ORANGE)
				.secondaryColor(Color.BLACK)
				.typeRacecar()
				.patternDotted()
				.build();


		Car car2 = new Car.Builder()
				.primaryColor(Color.CYAN)
				.secondaryColor(Color.BLACK)
				.typeRacecar()
				.patternDotted()
				.build();

		String name1 = GUI.getUserString(language.getPlayer1());
		String name2 = GUI.getUserString(language.getPlayer2());

		player[1].setName(name1);
		player[2].setName(name2);

		GUI.addPlayer(player1.getName(), player1.getBalance(), car1 );
		GUI.addPlayer(player2.getName(), player2.getBalance(), car2 );

		Player next = player1;

		// while loop that runs until a winner is found. (win == true).
		boolean win = false;
		while (player[1].getBalance() < 3000 && p2.getPoints() < 3000) //WINCONDITION

		{
			tur(player[0]);
			tur(player[1]);
			
		}
		}

	}
}
