package ch05_LinkedList_3.Q05_2;

public class DoublyDummyLinkedList<E> {
    MyNode<E> head;
    MyNode<E> tail;
    MyNode<E> current;
    int size;

    DoublyDummyLinkedList() {
        head = new MyNode<>();
        tail = new MyNode<>();
        current = null;
        size = 0;

        head.next = tail;
        tail.previous = head;
    }

    void insert(E data) {
        MyNode<E> insertionNode = new MyNode<>(data);

        insertionNode.previous = tail.previous;
        tail.previous.next = insertionNode;

        insertionNode.next = tail;
        tail.previous = insertionNode;

        ++size;
    }

    E first() {
        if (head.next == tail) {
            return null;
        }
        current = head.next;
        return current.data;
    }

    E next() {
        if (current.next == tail) {
            return null;
        }
        current = current.next;
        return current.data;
    }

    E previous() {
        if (current.previous == head) {
            return null;
        }
        current = current.previous;
        return current.data;
    }

    E remove() {
        if (current == null) {
            return null;
        }

        final E removeData = current.data;

        current.previous.next = current.next;
        current.next.previous = current.previous;

        current = current.previous;

        --size;

        return removeData;
    }

    int size() {
        return size;
    }
}
