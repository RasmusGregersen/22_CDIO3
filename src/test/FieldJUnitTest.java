package test;

import static org.junit.Assert.*;
import org.junit.Test;

import boundary.Field;
import boundary.Territory;
import entity.*;

public class FieldJUnitTest {
	private Player player;
	private Field territory;
	private Field laborcamp;
	private Field fleet;
	private Field tax;
	private Field tax2;
	private Field refuge;
	
	@Test
	public void TerritoryTest() {
	this.player = new Player("Jens Ole");
	this.territory = new Territory("Test", 500, 1000);
	this.territory.landOnField(this.player);
	}
	
	@Test
	public void tearDown() {
		
	}
	
	@Test
	public void Territory() {
		
	}
	
	@Test
	public void Tax() {
		
	}
	
	@Test
	public void Fleet() {
		
	}

}
