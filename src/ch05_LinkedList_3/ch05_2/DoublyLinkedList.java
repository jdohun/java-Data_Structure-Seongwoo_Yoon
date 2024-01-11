package ch05_LinkedList_3.ch05_2;

public class DoublyLinkedList<E> {
    MyNode<E> head;
    MyNode<E> current;
    int size;

    DoublyLinkedList() {
        head = null;
        current = null;
        size = 0;
    }

    void insert(E data) {
        MyNode<E> insertionNode = new MyNode<>(data);

        insertionNode.next = head;
        if (head != null) {
            head.previous = insertionNode;
        }

        head = insertionNode;
        // insertionNode.previous = null; // C 에서는 명시적으로 초기화가 필요함

        ++size;
    }

    E first() {
        if (head == null) {
            return null;
        }
        current = head;
        return current.data;
    }

    E next() {
        if (current.next == null) {
            return null;
        }
        current = current.next;
        return current.data;
    }

    E previous() {
        if (current.previous == null) {
            return null;
        }
        current = current.previous;
        return current.data;
    }

    int size() {
        return size;
    }
}
