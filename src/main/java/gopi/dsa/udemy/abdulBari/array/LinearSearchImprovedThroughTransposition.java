/**
 * Created With Love By Gopi on 28-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.array;

/**
 * @author Gopi
 */
public class LinearSearchImprovedThroughTransposition {

	public static void main(String[] args) {
		int numbers[] = { 4, 45, 354, 1, 43, 46, 6, 76, 24, 87 };

		System.out.println("Number 43 found at index: " + linearSearch(numbers, 43));
		System.out.println("Number 43 found at index: " + linearSearch(numbers, 43));
		System.out.println("Number 43 found at index: " + linearSearch(numbers, 43));
		System.out.println("Number 4 found at index: " + linearSearch(numbers, 4));
		System.out.println("Number 0  found at index: " + linearSearch(numbers, 0));
		System.out.println("Number 1 found at index: " + linearSearch(numbers, 1));
	}

	/**
	 * @param numbers
	 * @param i
	 * @return
	 */
	private static int linearSearch(int[] numbers, int key) {
		for (int i = 0; i < numbers.length; i++) {
			if (key == numbers[i]) {
				if (i > 0) {
					swap(numbers,i);
				}
				return i;
			}
		}
		return -1;
	}

	/**
	 * @param i
	 * @param j
	 */
	private static void swap(int[] numbers,int i) {
		int temp = numbers[i];
		numbers[i] = numbers[i-1] ;
		numbers[i-1]  = temp;

	}
}
