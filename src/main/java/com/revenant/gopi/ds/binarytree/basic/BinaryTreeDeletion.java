/**
 * Created by gopinath_mb on 19-Apr-2020
 */
package com.revenant.gopi.ds.binarytree.basic;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gopinath_mb
 */
public class BinaryTreeDeletion {

  /*
   * A binary tree node has key, pointer to left child and a pointer to right
   * child
   */
  static class Node {
    int data;

    Node left, right;

    // constructor
    Node(int key) {
      this.data = key;
      left = null;
      right = null;
    }
  }

  static Node root;

  static Node temp = root;

  /* Inorder traversal of a binary tree */
  static void inorder(Node temp) {
    if (temp == null)
      return;

    inorder(temp.left);
    System.out.print(temp.data + " ");
    inorder(temp.right);
  }

  public static Node deletionBT(Node root, int key) {
    if (root == null) {
      // If no tree exists.
      return root;
    }
    if (root.left == null && root.right == null) {
      // If root is the only node and if it is the node to be deleted.
      if (root.data == key)
        return null;
      else
        return root;
    }

    Queue<Node> q = new LinkedList<Node>();
    q.add(root);

    // Do level order traversal until we find deepest node and also confirm
    // whether the node to be deleted exists.
    int potentialDataOfDeepestNode = -1;
    Node potentialParentOfDeepestNode = root;
    Node nodeToBeDeleted = null;
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        Node curNode = q.poll();
        if (i == size - 1) {
          potentialDataOfDeepestNode = curNode.data;
        }
        // Check if it is the node to be deleted
        if (curNode.data == key) {
          nodeToBeDeleted = curNode;
        }
        // If atleast one node exists then it can be potential parent of deepest
        // node.
        if (curNode.left != null || curNode.right != null) {
          potentialParentOfDeepestNode = curNode;
        }
        if (curNode.left != null) {
          q.add(curNode.left);
        }
        if (curNode.right != null) {
          q.add(curNode.right);
        }
      }

    }
    // If We found the node to be deleted then nodeToBeDeleted will be non-null
    // else we didn't found the node.
    if (nodeToBeDeleted != null) {
      // Delete by marking the child of parent as null
      if (potentialParentOfDeepestNode.left != null
          && potentialParentOfDeepestNode.left.data == potentialDataOfDeepestNode)
        potentialParentOfDeepestNode.left = null;
      else
        potentialParentOfDeepestNode.right = null;

      // Copy data from deepest node
      nodeToBeDeleted.data = potentialDataOfDeepestNode;
    }
    return root;
  }

  // Driver code
  public static void main(String args[]) {
    root = new Node(10);
    root.left = new Node(11);
    root.left.left = new Node(7);
    root.right = new Node(9);
    root.right.left = new Node(15);
    root.right.right = new Node(8);

    System.out.print("Inorder traversal before deletion:");
    inorder(root);

    int key = 15;
    deletionBT(root, key);

    System.out.print("\nInorder traversal after deletion:");
    inorder(root);

    root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);

    System.out.print("Inorder traversal before deletion:");
    inorder(root);

    key = 10;
    deletionBT(root, key);

    System.out.print("\nInorder traversal after deletion:");
    inorder(root);

    root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);
    root.right.right = new Node(40);

    System.out.print("Inorder traversal before deletion:");
    inorder(root);

    key = 20;
    deletionBT(root, key);

    System.out.print("\nInorder traversal after deletion:");
    inorder(root);
  }

}
