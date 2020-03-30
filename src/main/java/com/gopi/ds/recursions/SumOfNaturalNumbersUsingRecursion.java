/**
 * Created With Love By Gopi on 23-Feb-2020
 */
package com.gopi.ds.recursions;

/**
 * @author Gopi
 */
public class SumOfNaturalNumbersUsingRecursion {
	public static void main(String[] args) {
		int number = 5;
		int sumOfNaturalNum = sumOfNaturalNum(number);
		System.out.println("Sum of Natural Number " + number + " is :" + sumOfNaturalNum);
	}

	private static int sumOfNaturalNum(int n) {
		if (n < 1) {
			return 0;

		} else {
			return sumOfNaturalNum(n-1) + n;
		}
	}
}
