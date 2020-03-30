/**
 * Created With Love By Gopi on 23-Feb-2020
 */
package com.gopi.ds.recursions;

/**
 * @author Gopi
 */
public class NestedRecursions {
	public static void main(String[] args) {
		int nestedRecursion = nestedRecursion(100);
		System.out.println(nestedRecursion);
	}

	public static int nestedRecursion(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return nestedRecursion(nestedRecursion(n + 11));
		}
	}
}
