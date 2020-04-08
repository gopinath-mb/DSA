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
    Node head = list.createLinkedList(1, 2);
    head = reverseRecursively(head);
    list.displayRecursively(head);
    System.out.println();
    head = reverseRecursively(null,head);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8);
    head = reverseRecursively(head);
    list.displayRecursively(head);
    System.out.println();
    head = reverseRecursively(null, head);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3);
    head = reverseRecursively(head);
    list.displayRecursively(head);
    System.out.println();
    head = reverseRecursively(null,head);
    list.displayRecursively(head);
    System.out.println();

    head = list.createLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    head = reverseRecursively(head);
    list.displayRecursively(head);
    System.out.println();
    head = reverseRecursively(null,head);
    list.displayRecursively(head);
    System.out.println();

  }

  /**
   * @param curNode
   */
  private static Node reverseRecursively(Node curNode)
  {
    if (curNode == null || curNode.next == null)
    {
      return curNode;
    }

    Node headNode = reverseRecursively(curNode.next);
    Node next = curNode.next;
    next.next = curNode;
    curNode.next = null;
    return headNode;

  }

  private static Node reverseRecursively(Node prev, Node cur)
  {
    if (cur == null )
    {
      return prev;
    }
    
    Node nextNode=cur.next;
    cur.next=prev;
    prev=cur;
    cur=nextNode;
    
   return reverseRecursively(prev,cur);

  }

}
