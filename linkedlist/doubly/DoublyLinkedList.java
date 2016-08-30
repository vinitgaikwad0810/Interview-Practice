package linkedlist.doubly;

import utils.GeneralUtils;

/**
 * Created by vinit on 8/29/16.
 */
public class DoublyLinkedList {

    public DoublyLinkedListNode getHead() {
        return head;
    }

    public void setHead(DoublyLinkedListNode head) {
        this.head = head;
    }

    private DoublyLinkedListNode head;


    public static void print(DoublyLinkedList doublyLinkedList) {

        DoublyLinkedListNode head = doublyLinkedList.getHead();
        GeneralUtils.println("Forward Direction");
        while (head != null) {
            GeneralUtils.print("--" + head.getData() + "--");
            head = head.getNext();

        }
        head = doublyLinkedList.getHead();
        GeneralUtils.println("Backward Direction");
        while (head.getNext() != null) {
            head = head.getNext();
        }

        while (head != null) {
            GeneralUtils.print("--" + head.getData() + "--");
            head = head.getPrev();
        }
    }
}
