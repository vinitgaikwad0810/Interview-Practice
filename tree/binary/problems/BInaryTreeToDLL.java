package tree.binary.problems;

import linkedlist.doubly.DoublyLinkedList;
import linkedlist.doubly.DoublyLinkedListNode;
import tree.binary.BinaryTreeNode;

import java.util.IllegalFormatException;

/**
 * Created by vinit on 8/29/16.
 */
public class BInaryTreeToDLL {

    void BToDLL(BinaryTreeNode root, DoublyLinkedList doublyLinkedList) {

        if(root==null){
            throw new IllegalArgumentException("No tree");
        }
    }

    void makeLinkages(BinaryTreeNode binaryTreeNode, DoublyLinkedListNode doublyLinkedListNode){

        if(binaryTreeNode!=null){
            makeLinkages(binaryTreeNode.getLeft(),doublyLinkedListNode);
            DoublyLinkedListNode newNode = new DoublyLinkedListNode();
            newNode.setData(binaryTreeNode.getData());
          //  doublyLinkedListNode.setNext();
        }
    }

    public static void main(String[] args) {

    }


}
