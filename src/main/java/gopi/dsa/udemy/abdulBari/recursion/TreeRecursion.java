/**
 * Created With Love By Gopi on 23-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.recursion;

/**
 * @author Gopi
 */
public class TreeRecursion {

	public static void main(String[] args) {
		int startNum = 3;
		treeRec(startNum);
	}

	/**
	 * @param startNum
	 */
	private static void treeRec(int startNum) {

		if (startNum >0) {
			System.out.print(startNum +" " );
			treeRec(startNum - 1);
			treeRec(startNum - 1);
		}
	}
}
