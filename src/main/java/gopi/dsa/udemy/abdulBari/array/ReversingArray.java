/**
 * Created With Love By Gopi on 29-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.array;

/**
 * @author Gopi
 */
public class ReversingArray {

	public static void main(String[] args) {

		int array[] = { 2, 7, 4, 6, 9, 1 };
		System.err.println(array.length);
		System.out.print("Before reversing: ");
		printArary(array);
		reverseArray(array);
		System.out.println("After reversing: ");
		printArary(array);
	}

	/**
	 * @param array
	 */
	private static void printArary(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	/**
	 * @param array
	 */
	private static void reverseArray(int[] array) {
		int temp;
		for (int i = 0, j = array.length-1; i < j; i++, j--) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

}
