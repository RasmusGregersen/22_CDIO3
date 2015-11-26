package test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import boundary.*;
import desktop_resources.GUI;
import entity.*;


@FixMethodOrder(MethodSorters.JVM)
public class FieldJUnitTest {
	GameBoard gameboard = new GameBoard();
	Player player = new Player("Developer");
	
	@Test
	public void TerritoryTest() {
	GUI.displayChanceCard("Territory Test: Please select Yes in the GUI to test the landOnField() method.");
	player.setFieldPos(1);
	gameboard.setField(player.getFieldPos(), player);
	int expected = 30000 - 1000;
	int actual = this.player.getBalance();
	assertEquals(expected, actual);
	}
	
	@Test
	public void LaborCampTest() {
	GUI.displayChanceCard("Labor Camp Test: Please select Yes in the GUI to test the landOnField() method.");
	player.setFieldPos(4);
	gameboard.setField(player.getFieldPos(), player);
	int expected = 30000 - 2500;
	int actual = this.player.getBalance();
	assertEquals(expected, actual);
	}
	
	@Test
	public void FleetTest() {
	GUI.displayChanceCard("Fleet Test: Please select Yes in the GUI to test the landOnField() method.");
	player.setFieldPos(2);
	gameboard.setField(player.getFieldPos(), player);
	int expected = 30000 - 4000;
	int actual = this.player.getBalance();
	assertEquals(expected, actual);
	}
	
	@Test
	public void RefugeTest() {
	GUI.displayChanceCard("Refuge Test");
	player.setFieldPos(6);
	gameboard.setField(player.getFieldPos(), player);
	int expected = 30000 + 5000;
	int actual = this.player.getBalance();
	assertEquals(expected, actual);
	}
	
	@Test
	public void TaxTest() {
	GUI.displayChanceCard("Tax Test: Please select Fixed Tax in the GUI to test the landOnField() method.");
	player.setFieldPos(18);
	gameboard.setField(player.getFieldPos(), player);
	int expected = 30000 - 4000;
	int actual = this.player.getBalance();
	assertEquals(expected, actual);
	}

}
