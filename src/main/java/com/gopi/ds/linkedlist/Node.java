/**
 * Created by gopinath_mb on 29-Mar-2020
 */
package com.gopi.ds.linkedlist;

/**
 * @author gopinath_mb This is to represent simple LinkedList Node.
 */
public class Node
{

  public int data;
  public Node next;
  public Node prev;

  public Node(int data)
  {
    this.data = data;
  }

  public Node(int data, Node next)
  {
    this.data = data;
    this.next = next;

  }
  public Node(int data, Node prev, Node next)
  {
    this.data = data;
    this.prev = prev;
    this.next = next;

  }
}
