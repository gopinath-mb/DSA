/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/identical-linked-lists/1/?track=PC-W5-LL&batchId=154
public class IdenticalLinkedListOrNot {

  public boolean isIdentical(Node head1, Node head2) {
    Node temp1 = head1;
    Node temp2 = head2;
    while (temp1 != null && temp2 != null) {
      if (temp1.data != temp2.data) {
        return false;
      }
      temp1 = temp1.next;
      temp2 = temp2.next;
    }
    // Both should be null
    if (temp1 == temp2) {
      return true;
    }
    return false;
  }
}
