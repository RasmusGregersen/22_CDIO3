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
		
		GameBoard gameboard = new GameBoard();
		DiceCup dicecup = new DiceCup();
		Language language = new Language();
		
		int players = GUI.getUserInteger("How many players do you wish to play", 2 , 6);	
		Player[] player = new Player[players];

		for (int i=0; i < players; i++) {
			String name = GUI.getUserString("Please enter the name of player" + i+1);
			if (name.length() < 1 || name.length() > 15 || name.indexOf(" ") == 0)
				GUI.showMessage("Invalid name!");
			else 
			{
				GUI.addPlayer(name, player[i].getBalance());
				player[i].setName(name);
			}
			// Mangler at tage højde for at de skal have forskellige navne + GUI car er tilfældige.
		}
		
		boolean win = false;
		while (win == false)
		{
			turn(player[0]);
			turn(player[1]);
			turn(player[2]);
			turn(player[3]);
			turn(player[4]);
			turn(player[5]);
		}
		}

	private static void turn(Player player) {
		// Regler
	}
}
