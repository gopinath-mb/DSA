/**
 * Created by gopinath_mb on 29-Mar-2020
 */
package com.gopi.ds.linkedlist.old;

/**
 * @author gopinath_mb
 */
public class ReverseLinkedListOfSizeKIterative
{

  public static void main(String[] args)
  {

    SinglyLinkedList list = new SinglyLinkedList();
    Node head = list.createLinkedList(1, 2);
    head = reverseLinkedList(head, 3);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8);
    head = reverseLinkedList(head, 3);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3);
    head = reverseLinkedList(head, 1);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    head = reverseLinkedList(head, 2);
    list.displayRecursively(head);
    System.out.println();

  }

  /**
   * @param node
   * @return
   */
  private static Node reverseLinkedList(Node node, int k)
  {

    Node prev = null;
    Node cur = node;
    int count = 0;
    Node next = null;
    while (cur != null && count < k)
    {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
      count++;
    }
    if (next != null)
    
      node.next = reverseLinkedList(cur, k);

    return prev;

  }
}
