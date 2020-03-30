/**
 * Created by gopinath_mb on 29-Mar-2020
 */
package com.gopi.ds.linkedlist;

/**
 * @author gopinath_mb
 */
public class ReverseLinkedListRecursively
{

  public static void main(String[] args)
  {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insertAtTheEnd(10);
    list.insertAtTheEnd(20);
    list.insertAtTheEnd(30);
    list.insertAtTheEnd(40);
    list.insertAtTheEnd(50);
    list.insertAtTheEnd(60);
    list.display();
   Node head = list.head;
   reverseRecursively(head);
    
  }

  /**
   * @param head
   */
  private static Node reverseRecursively(Node head)
  {


    return null;
    
  }
  
  
}
