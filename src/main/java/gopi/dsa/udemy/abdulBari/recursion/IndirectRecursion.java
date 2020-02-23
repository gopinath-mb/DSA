/**
 * Created With Love By Gopi on 23-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

/**
 * Here one fun calls another and other one will call this again.So one or more
 * functions will form a cycle here.
 * 
 * @author Gopi
 */
public class IndirectRecursion {

	public static void main(String[] args) {
		int number = 20;
		funcA(20);
	}

	/**
	 * @param i
	 */
	private static void funcA(int n) {

		if (n > 0) {
			System.out.print(n +" " );
			funcB(n - 1);
		}
	}

	private static void funcB(int n) {
		if (n > 1) {
			System.out.print(n +" " );
			funcA(n / 2);
		}
	}

}
