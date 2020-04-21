/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
//practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1/?track=PC-W5-LL&batchId=154
public class InsertMiddleOfTheLinkedList {

  public Node insertInMid(Node head, int data) {
    Node node = new Node(data);
    if (null == head) {
      head = node;
    } else {
      Node slow = head;
      Node fast = head;
      while (fast.next != null && fast.next.next != null) {
        fast = fast.next.next;
        slow = slow.next;
      }
      node.next = slow.next;
      slow.next = node;
    }

    return head;
  }

}
