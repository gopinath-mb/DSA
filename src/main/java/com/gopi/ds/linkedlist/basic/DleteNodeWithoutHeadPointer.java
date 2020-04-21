/**
 * Created by gopinath_mb on 21-Apr-2020
 */
package com.gopi.ds.linkedlist.basic;

/**
 * @author gopinath_mb
 */
//https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1/?track=PC-W5-LL&batchId=154
public class DleteNodeWithoutHeadPointer {

  // this doesn't work if the node to be deleted is last node.
  void deleteNode(Node node) {
    node.data = node.next.data;
    node.next = node.next.next;
  }

}
