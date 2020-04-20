/**
 * Created by gopinath_mb on 29-Mar-2020
 */
package com.gopi.ds.linkedlist.old;

/**
 * @author gopinath_mb
 */
public class LoopDetectionInLinkedList
{

  public static void main(String[] args)
  {

    SinglyLinkedList list = new SinglyLinkedList();
    Node head = list.createLinkedList(3, 4, 2);
    System.out.println(f(head));

  }

  /**
   * @param head
   * @return
   */
  private static Node findNthNodeFromEndOfTheList(Node head, int pos)
  {

    Node slow = head;
    Node fast = head;
    int count = 1;
    while (fast != null && pos >= count)
    {
      fast = fast.next;
      count++;
    }
    if (null == fast)
    {
      System.out.println("No " + pos + " element from end of the list.");
      return null;
    }
    while (fast.next != null)
    {
      fast = fast.next;
      slow = slow.next;
    }

    return slow;
  }

  private static boolean f(Node p)
  {
    boolean b = (p == null);
    boolean c = p.next == null;
    boolean c2 = p.data <= p.next.data;
    return (b || c || (c2 && f(p.next)));
  }

}
