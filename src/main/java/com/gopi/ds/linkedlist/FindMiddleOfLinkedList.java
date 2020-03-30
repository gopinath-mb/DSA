/**
 * Created by gopinath_mb on 29-Mar-2020
 */
package com.gopi.ds.linkedlist;

/**
 * @author gopinath_mb
 */
public class FindMiddleOfLinkedList
{
  public static void main(String[] args)
  {
    SinglyLinkedList list = new SinglyLinkedList();
    Node head = list.createLinkedList(1, 2);
    Node findMiddleOfTheList = findMiddleOfTheList(head);
    System.out.println("Middle of LL is " + findMiddleOfTheList.data);

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8);
    findMiddleOfTheList = findMiddleOfTheList(head);
    System.out.println("Middle of LL is " + findMiddleOfTheList.data);

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    findMiddleOfTheList = findMiddleOfTheList(head);
    System.out.println("Middle of LL is " + findMiddleOfTheList.data);

  }

  /**
   * @param head
   */
  private static Node findMiddleOfTheList(Node head)
  {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null)
    {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;

  }
}
