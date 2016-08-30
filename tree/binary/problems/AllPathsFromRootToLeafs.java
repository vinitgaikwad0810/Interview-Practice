package tree.binary.problems;

import utils.GeneralUtils;

/**
 * Created by vinit on 8/29/16.
 * Problem URL: http://www.geeksforgeeks.org/given-a-binary-tree-print-all-root-to-leaf-paths/
 */

// Java program to print all the node to leaf path

/* A binary tree node has data, pointer to left child
   and a pointer to right child */
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class AllPathsFromRootToLeafs {
    Node root;

    /*Given a binary tree, print out all of its root-to-leaf
      paths, one per line. Uses a recursive helper to do
      the work.*/
    void printPaths(Node node) {
        int path[] = new int[1000];
        printPathsRecur(node, path, 0);
        for (int i = 0; i < path.length; i++)
            GeneralUtils.println(path[i]);
    }

    /* Recursive helper function -- given a node, and an array
       containing the path from the root node up to but not
       including this node, print out all the root-leaf paths.*/
    void printPathsRecur(Node node, int path[], int pathLen) {
        if (node == null)
            return;

        /* append this node to the path array */
        path[pathLen] = node.data;
        pathLen++;

        /* it's a leaf, so print the path that led to here  */
        if (node.left == null && node.right == null)
            printArray(path, pathLen);
        else {
            /* otherwise try both subtrees */
            printPathsRecur(node.left, path, pathLen);
            printPathsRecur(node.right, path, pathLen);
        }
    }

    /* Utility function that prints out an array on a line. */
    void printArray(int ints[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }

    // driver program to test above functions
    public static void main(String args[]) {
        AllPathsFromRootToLeafs tree = new AllPathsFromRootToLeafs();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        /* Let us test the built tree by printing Insorder traversal */
        tree.printPaths(tree.root);
    }
}

// This code has been contributed by Mayank Jaiswal




