/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
public class Node
{

  public int data;

  public Node prev;

  public Node next;

  public Node(int data)
  {

    this.data = data;

  }
  
  public String toString()
  {
    return data+"";
  }
}
