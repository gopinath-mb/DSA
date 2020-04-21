/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1/?track=PC-W5-LL&batchId=154
public class RemoveDuplicatesFromSortedLinkedList {

  Node removeDuplicates(Node head) {
    Node cur = head;
    Node temp = cur.next;
    cur.next = null;
    while (temp != null) {
      if (temp.data != cur.data) {
        cur.next = temp;
        cur = temp;
        temp = temp.next;
        cur.next = null;
      } else {
        Node prev = temp;
        temp = temp.next;
        // de-link
        prev = null;

      }

    }
    return head;
  }
}
