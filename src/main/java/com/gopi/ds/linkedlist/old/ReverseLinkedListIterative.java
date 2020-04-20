/**
 * Created by gopinath_mb on 29-Mar-2020
 */
package com.gopi.ds.linkedlist.old;

/**
 * @author gopinath_mb
 * 
 * https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1/
 */
public class ReverseLinkedListIterative
{

  public static void main(String[] args)
  {

    SinglyLinkedList list = new SinglyLinkedList();
    Node head = list.createLinkedList(1, 2);
    list.display();
    head = reverseLinkedList(head);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8);
    head = reverseLinkedList(head);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3);
    head = reverseLinkedList(head);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    head = reverseLinkedList(head);
    list.displayRecursively(head);
    System.out.println();

  }

  /**
   * @param head
   * @return
   */
  private static Node reverseLinkedList(Node head)
  {

    Node prev = null;
    Node cur = head;
    Node next = null;

    while (null != cur)
    {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }
}
