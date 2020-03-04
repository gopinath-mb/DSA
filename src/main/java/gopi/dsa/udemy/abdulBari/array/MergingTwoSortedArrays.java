/**
 * Created With Love By Gopi on 29-Feb-2020
 */
package gopi.dsa.udemy.abdulBari.array;

import java.util.Arrays;

/**
 * @author Gopi
 */
public class MergingTwoSortedArrays
{

	public static void main(String[] args)
	{

		int[] array1 = { 12, 34, 56, 78, 90 };
		int[] array2 = { 1, 33, 65, 87, 91, 99, 100 };
		int[] finalArray = new int[12];
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		merge(array1, array2, finalArray);
		System.out.println(Arrays.toString(finalArray));
	}

	/**
	 * @param array1
	 * @param array2
	 * @param finalArray
	 */
	private static void merge(int[] array1, int[] array2, int[] finalArray)
	{
		int i = 0, j = 0, k = 0;
		while (true)
		{
			if (array1[i] < array2[j])
			{
				finalArray[k++] = array1[i++];
			} else
			{
				finalArray[k++] = array2[j++];
			}
			if (i >= array1.length)
			{
				for (; j < array2.length; j++)
				{
					finalArray[k++] = array2[j];
				}
				break;
			}
			if (j >= array2.length)
			{
				for (; i < array1.length; i++)
				{
					finalArray[k++] = array2[i];
				}
				break;
			}
		}
	}

}
