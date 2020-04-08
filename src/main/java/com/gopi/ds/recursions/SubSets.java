/**
 * Created by gopinath_mb on 09-Apr-2020
 */
package com.gopi.ds.recursions;

import java.util.ArrayList;

/**
 * @author gopinath_mb
 */
public class SubSets
{

  public static void main(String[] args)
  {
    System.out.println(powerSet("a"));
  }
  static ArrayList<String> powerSet(String s)
  {
    ArrayList<String> subSets = new ArrayList<String>();
    subSets(s, "", 0, subSets);
    return subSets;
    // add your code here
  }

  static void subSets(String str, String subStr, int index,
      ArrayList<String> subs)
  {
    if (str.length() == index)
    {
      subs.add(subStr);
    } else
    {

      subSets(str, subStr, index+1, subs);
      subSets(str, subStr + str.charAt(index), index+1, subs);
    }
  }
}
