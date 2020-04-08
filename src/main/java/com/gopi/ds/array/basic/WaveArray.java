/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.array.basic;

/**
 * @author gopinath_mb
 */
public class WaveArray
{

  public static void main(String[] args)
  {

    int[] arr = { 1, 2, 3, 4, 5 };
    ArrayUtil.display(arr);
    convertToWave(arr, arr.length);
    ArrayUtil.display(arr);
    int[] arr1 = { 2, 4, 7, 8, 9, 10 };
    ArrayUtil.display(arr1);
    convertToWave(arr1, arr1.length);
    ArrayUtil.display(arr1);

  }
  public static void convertToWave(int arr[], int n)
  {

    for (int i = 0; i < n - 1; i = i + 2)
    {
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] =temp;
    }

  }
}
