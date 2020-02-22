/**
 * Created With Love By Gopi on 22-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

/**
 * @author Gopi
 */
public class PrintNumbersRecursivelyInIncreasingOrder {

	public static void main(String[] args) {
		int endNumber = 20;
		printNumbersIncrementOrder(endNumber);
	}

	/**
	 * Prints from 1 to end number inclusive
	 * @param startNumber
	 */
	private static void printNumbersIncrementOrder(int endNumber) {

		if (endNumber > 0) {
			printNumbersIncrementOrder(endNumber - 1);
			System.out.println(endNumber);
		}
	}
}
