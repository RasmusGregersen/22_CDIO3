/*
* Die
*
* Version info
*
* Copyright notice */

package game;

public class Die {

	private int eye; // die eyes 
	
	// method to return eye value
	public int getValue() {
	return eye;
	
	}
	// method to roll the die (generate random value between 1 - 6)
	public void newRoll() {
		eye = (int) Math.ceil(Math.random()*6);
	}
	@Override
	public String toString() {
		return "Die [eye=" + eye + "]";
	}
}
