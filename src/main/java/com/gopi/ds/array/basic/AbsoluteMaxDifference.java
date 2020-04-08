/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.array.basic;

import java.util.ArrayList;

/**
 * @author gopinath_mb
 */
public class AbsoluteMaxDifference
{

  public static void main(String[] args)
  {

    int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
    ArrayUtil.display(arr);
    System.out.println(minAdjDiff(arr, arr.length));
    
    int[] arr1 = {-1, 40, -14, 7, 6, 5, -4, -1};
    ArrayUtil.display(arr1);
    System.out.println(minAdjDiff(arr1, arr1.length));
  }

  public static int minAdjDiff(int arr[], int n)
  {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < n - 1; i++)
    {
      int diff = Math.abs(arr[i] - arr[i + 1]);
      if(diff<min)
      {
        min=diff;
      }
    }
    
    return Math.min(min, Math.abs(arr[n-1] - arr[0]));
    // Your code here

  }

}
