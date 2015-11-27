/*
 * Field
 *
 * Final
 *
 * Copyright notice */

package boundary;

import entity.Player;

public abstract class Field { // Abstract class declared

	private String name;
	
	public Field(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public abstract void landOnField(Player player); // Abstract method declared, to be inherited by child classes.
}
