/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.array.basic;

import java.util.ArrayList;

/**
 * @author gopinath_mb
 */
public class RotateAnArray
{

  public static void main(String[] args)
  {

    int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    ArrayUtil.display(arr);
    rotateArr(arr, 3, 10);
    ArrayUtil.display(arr);
  }

  static void rotateArr(int arr[], int d, int n)
  {

    rotate(arr, 0, d - 1);
    rotate(arr, d, n - 1);
    rotate(arr, 0, n - 1);
  }

  public static void rotate(int arr[], int i, int j)
  {
    while (i < j)
    {

      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;

    }
  }
//Function to reverse array in group of k 
  public static ArrayList<Integer> rot(ArrayList<Integer> mv, int n, int k)
  {
    for (int i = 0; i < n; i = i + k)
    {
      int l = i;
      int j = i + k - 1;
      if (j > n - 1)
      {
        j = n - 1;
      }
      while (l < j)
      {
        int temp = mv.get(l);
        mv.set(l, mv.get(j));
        mv.set(j, temp);
        l++;
        j--;
      }

    }

    return mv;

  }

}
