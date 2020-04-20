/**
 * Created by gopinath_mb on 01-Apr-2020
 */
package com.gopi.ds.array.basic;

/**
 * @author gopinath_mb
 */
public class ElementsFrequencies {

  public static void main(String[] args) {

    int[] arr = { 2, 3, 2, 3, 5 };
    ArrayUtil.display(arr);

    printFrequency(arr, arr.length);

    int[] arr1 = { 3, 3, 3, 3 };
    ArrayUtil.display(arr1);
    printFrequency(arr1, arr1.length);
  }

  public static void printFrequency(int arr[], int n) {

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      arr[i] -= 1;
    }

    for (int i = 0; i < n; i++) {
      arr[arr[i] % n] += n;
    }

    for (int i = 0; i < n; i++) {
      sb.append(arr[i] / n + " ");
    }
    System.out.println(sb.toString());
  }

}
