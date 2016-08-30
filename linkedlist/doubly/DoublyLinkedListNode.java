package linkedlist.doubly;

/**
 * Created by vinit on 8/29/16.
 */
public class DoublyLinkedListNode<T> {
    private T data;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode prev;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }

    public DoublyLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedListNode prev) {
        this.prev = prev;
    }
}
