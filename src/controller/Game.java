/*
 * Game
 *
 * Version info
 *
 * Copyright notice */

package controller;

import java.awt.Color;
import java.util.Set;

import boundary.GameBoard;
import desktop_codebehind.Car;
import desktop_codebehind.Car.Builder;
import desktop_resources.GUI;
import entity.DiceCup;
import entity.Player;

public class Game {
	private DiceCup dicecup = new DiceCup();
	private int playerCount;
	
	public static void main(String[] args) {
		Game game = new Game();
		game.go();

	}
	
	public void go(){
		GameBoard gameboard = new GameBoard();
		playerCount = GUI.getUserInteger("How many players do you wish to play", 2 , 6);	
		Player[] players = new Player[6];
		Car[] cars = new Car[playerCount];
		
		// Cars for the GUI created
		
		cars[0] = new Car.Builder()
				.primaryColor(Color.BLUE)
				.secondaryColor(Color.BLUE)
				.typeCar()
				.patternFill()
				.build();
		cars[1] = new Car.Builder() // chaining
				.primaryColor(Color.GREEN)
				.secondaryColor(Color.GREEN)
				.typeCar()
				.patternFill()
				.build();
		if (playerCount > 2) {
			cars[2] = new Car.Builder() // chaining
				.primaryColor(Color.ORANGE)
				.secondaryColor(Color.ORANGE)
				.typeCar()
				.patternFill()
				.build();
			if (playerCount > 3) {
				cars[3] = new Car.Builder() // chaining
						.primaryColor(Color.YELLOW)
						.secondaryColor(Color.YELLOW)
						.typeCar()
						.patternFill()
						.build();
				if (playerCount > 4) {
					cars[4] = new Car.Builder() // chaining
							.primaryColor(Color.WHITE)
							.secondaryColor(Color.WHITE)
							.typeCar()
							.patternFill()
							.build();
					if (playerCount > 5) {
						cars[5] = new Car.Builder() // chaining
								.primaryColor(Color.CYAN)
								.secondaryColor(Color.CYAN)
								.typeCar()
								.patternFill()
								.build();
					}
				}
			}
		}

		// Name check.
		for (int i=0; i < playerCount; i++) {
			Player tmp = new Player("");
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
				
				GUI.addPlayer(name, tmp.getBalance(), cars[i]);
				tmp.setName(name);
				break;
			
			}
			players[i] = tmp;
			// Mangler at tage højde for at de skal have forskellige navne + biler er tilfældige.
		}
		
		// Our game loop. playerCount is deducted by 1 everytime a player is eliminated, and when 1 remains the winner is found.
		while (playerCount > 1)
		{
			if (players[0].getBalance() > 0)
				turn(players[0]);
			if (players[1].getBalance() > 0)
				turn(players[1]);
			if (players[2] != null && players[2].getBalance() > 0)
				turn(players[2]);
			if (players[3] != null && players[3].getBalance() > 0)
				turn(players[3]);
			if (players[4] != null && players[4].getBalance() > 0)
				turn(players[4]);
			if (players[5] != null  && players[5].getBalance() > 0)
				turn(players[5]);
		}
		GUI.showMessage("Congratulations! You have won!");
	}
	
	// Turn method that is invoked just above.
	private void turn(Player player) {	
		GUI.getUserButtonPressed("Roll die", player.getName()+ "'s turn");
		GUI.removeAllCars(player.getName());
		dicecup.newRoll();
		GUI.setDice(dicecup.getDie1(),dicecup.getDie2());
		player.setFieldPos(dicecup.getSum());			
		GUI.setCar(player.getFieldPos(), player.getName());
		GameBoard.setField(player.getFieldPos(), player);
		GUI.setBalance(player.getName(), player.getBalance());
		if (player.getBalance() == 0)
			removeplayer(player);
	}
	// Method to remove the player, which is triggered when a player's balance reaches 0.
	public void removeplayer(Player player) {
		GUI.showMessage(player.getName() + " has gone bankrupt");
		playerCount = playerCount - 1;
		GUI.removeAllCars(player.getName());
	}

}
