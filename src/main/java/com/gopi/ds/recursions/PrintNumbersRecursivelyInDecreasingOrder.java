/**
 * Created With Love By Gopi on 22-Feb-2020
 */
package com.gopi.ds.recursions;

/**
 * @author Gopi
 */
public class PrintNumbersRecursivelyInDecreasingOrder {

	public static void main(String[] args) {
		int startNumber = 10;
		printNumbersInDecrementOrder(startNumber);
	}

	/**
	 * @param startNumber
	 */
	private static void printNumbersInDecrementOrder(int startNumber) {

		if(startNumber>0)
		{
			System.out.println(startNumber);
			printNumbersInDecrementOrder(startNumber-1);
		}
	}
	
}
