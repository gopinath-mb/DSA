/**
 * Created With Love By Gopi on 29-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.array;

/**
 * @author Gopi
 */
public class SeparatePositiveAndNegativeNumbers {

	public static void main(String[] args) {
		int numbers[] = { -2, 3, 6, -5, -3, 93, 23, -23, 12 };
		printArray(numbers);
		reArrangeArray(numbers);
		printArray(numbers);
		
		int numbers2[] = { -2,-4,-43,-12 };
		printArray(numbers2);
		reArrangeArray(numbers2);
		printArray(numbers2);
		
		int numbers3[] = { 2,4,43,12 };
		printArray(numbers3);
		reArrangeArray(numbers3);
		printArray(numbers3);
	}

	/**
	 * @param numbers
	 */
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");

		}
		System.out.println();
	}

	/**
	 * @param numbers
	 */
	private static void reArrangeArray(int[] numbers) {

		int i = 0;
		int j = numbers.length-1;
		while (true) {

			while (i<=j && numbers[i] < 0) {
				i++;
			}
			while (i<=j && numbers[j] > 0) {
				j--;
			}
			if(i<j)
			{
				swap(numbers,i,j);
			}else
			{
				break;
			}
		}

	}

	/**
	 * @param numbers
	 * @param i
	 * @param j
	 */
	private static void swap(int[] numbers, int i, int j) {

		int temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}

}
