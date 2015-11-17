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
	private DiceCup dicecup = new DiceCup();
	
	public static void main(String[] args) {
		Game game = new Game();
		game.go();
	}
	
	public void go(){
		
		GameBoard gameboard = new GameBoard();
		int playerCount = GUI.getUserInteger("How many players do you wish to play", 2 , 6);	
		Player[] players = new Player[playerCount];
		
		
		for (int i=0; i < playerCount; i++) {
			Player tmp = new Player();
		EnterName:	
			while (true) {
				String name = GUI.getUserString("Please enter the name of player" + (i+1)).trim();
				if (name.length() < 1 || name.length() > 15 || name.indexOf(" ") == 0){
					GUI.showMessage("Invalid name!");
					continue;
				}
				
				for(Player p : players){
					if(p != null && p.getName().equals(name)) {
						GUI.showMessage("Invalid name!");
						continue EnterName;
					}
				}
				
				GUI.addPlayer(name, tmp.getBalance());
				tmp.setName(name);
				break;
			
			}
			players[i] = tmp;
			// Mangler at tage højde for at de skal have forskellige navne + biler er tilfældige.
		}
		boolean win = false;
		while (win == false)
		{
			this.turn(players[0]);
			turn(players[1]);
			if (playerCount > 2)
			turn(players[2]);
			if (playerCount > 3)
			turn(players[3]);
			if (playerCount > 4)
			turn(players[4]);
			if (playerCount > 5)
			turn(players[5]);
			
		}
	}

	private void turn(Player player) {
		GUI.getUserButtonPressed("Roll die", player.getName()+ "'s turn");
		//GUI.removeCar(0, player.getName());
		dicecup.newRoll();
		GUI.setDice(dicecup.getDie1(),dicecup.getDie2());
		GUI.setCar( 0, player.getName());
	}
}
