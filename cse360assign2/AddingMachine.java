//Second version
package cse360assign2;

public class AddingMachine {

	private int total;
	
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () { //Return the total
		return total;
	}
	
	public void add (int value) { //Add value to total and include it in the history
		total += value;
		history = history + " + " + Integer.toString(value);
	}
	
	public void subtract (int value) { //Subtract value to total and include it in the history
		total -= value;
		history = history + " - " + Integer.toString(value);
	}
		
	public String toString () { //Return the history
		return history;
	}

	public void clear() { //Clear the history
		total = 0;
		history = "0";
	
	}
}
