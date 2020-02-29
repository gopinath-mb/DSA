/**
 * Created With Love By Gopi on 29-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.array;

import org.junit.Assert;

/**
 * @author Gopi
 */
public class BinarySearchIterativeMethod {

	public static int binarySearch(int low, int high, int key, int[] A) {
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (key == A[mid]) {
				return mid;
			}
			if (key < A[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int A[] = { 2, 4, 5, 6, 12, 16, 19, 24, 37, 41, 56, 78, 91 };
		Assert.assertEquals(10, binarySearch(0, A.length, 56, A));
		Assert.assertEquals(12, binarySearch(0, A.length, 91, A));
		Assert.assertEquals(0, binarySearch(0, A.length, 2, A));
		Assert.assertEquals(-1, binarySearch(0, A.length, 57, A));
		Assert.assertEquals(-1, binarySearch(0, A.length, 11, A));

	}

}
