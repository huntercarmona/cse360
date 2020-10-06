package cse360assignment02;
/**
 * Class that adds, subtracts, keeps history, clears memory, and converts operations to a string on an integer total
 * @author Hunter Carmona
 *
 */
public class AddingMachine {
  private int total;
  private String history = "";
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history += total;
  }
  /**
   * Method to return the current total
   * @return The current total
   */
  public int getTotal () {
    return total;
  }
  /**
   * Method that adds an integer to the total
   * @param value Integer to be added to the total
   */
  public void add (int value) {
	  history += " + " + value;
	  total += value;
  }
  /**
   * Method that subtracts an integer from the total
   * @param value Integer to subtract the total by
   */
  public void subtract (int value) {
	  history += " - " + value;
	  total -= value;
  }
  /**
   * Method that keeps a history of the transactions
   * @return The history of the transactions
   */
  public String toString () {
    return history;
  }
  /**
   * Method that will clear the history of the transaction
   */
  public void clear() {
	  history = "";
  }
}