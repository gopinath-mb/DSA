/**
 * Created With Love By Gopi on 28-Feb-2020
 */
package com.gopi.ds.recursions;

/**
 * @author Gopi
 */
public class TowerOfHanoi {
	static int stepsCount = 0;

	public static void towerOfHanoi(int n, String A, String B, String C) {

		if (n > 0) {
			towerOfHanoi(n - 1, A, C, B);
			System.out.println("Moving disk " + n + " from " + A + " to " + C + " Step Number " + ++stepsCount);
			towerOfHanoi(n - 1, B, A, C);
		}
	}

	public static void main(String[] args) {
		TowerOfHanoi.towerOfHanoi(4, "A", "B", "C");
	}
}
