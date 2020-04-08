/**
 * Created by gopinath_mb on 30-Mar-2020
 */
package com.gopi.ds.array.basic;

/**
 * @author gopinath_mb
 */
public class ReverseArrayInPlace
{
  public static void main(String[] args)
  {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    revrse(arr);
    ArrayUtil.display(arr);
  }

  private static void revrse(int[] arr)
  {
    int low = 0;
    int high = arr.length - 1;
    while (low < high)
    {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;

    }

  }

}
