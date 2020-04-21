/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
public class DoublyLinkedList {

  Node head;

  public Node insertAtPosition(int pos, int data) {
    Node node = new Node(data);
    if (null == head) {
      head = node;
      return head;
    }
    Node temp = head;
    for (int i = 0; i < pos - 1 && null != temp.next; i++) {
      temp = temp.next;
    }
    node.next = temp.next;
    temp.next = node;
    node.prev = temp;
    return head;
  }

}
