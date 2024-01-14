package ch07_Queue.ch07_5_Deque;

public class Deque<E> implements DequeADT<E> {
    MyNode<E> head;
    MyNode<E> tail;

    @Override
    public boolean empty() {
        // head or tail 상관 없음, 첫 삽입 시 head, tail 이 둘 다 새로운 노드를 참조하기 때문
        return head == null;
    }

    @Override
    public void addFirst(E data) {
        MyNode<E> insertion = new MyNode<>(data);

        if (empty()) {
            tail = insertion;
        } else {
            head.previous = insertion;
        }
        insertion.next = head;
        head = insertion;
    }

    @Override
    public void addLast(E data) {
        MyNode<E> insertion = new MyNode<>(data);

        if (empty()) {
            head = insertion;
        } else {
            tail.next = insertion;
        }
        insertion.previous = tail;
        tail = insertion;
    }

    @Override
    public E removeFirst() {
        if (empty()) {
            System.out.println("Deque is Empty");
            return null;
        }

        final E removeData = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.previous = null;
        }

        return removeData;
    }

    @Override
    public E removeLast() {
        if (empty()) {
            System.out.println("Deque is Empty");
            return null;
        }

        final E removeData = tail.data;
        tail = tail.previous;

        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }

        return removeData;
    }

    @Override
    public E getFirst() {
        if (empty()) {
            System.out.println("Deque is Empty");
            return null;
        }
        return head.data;
    }

    @Override
    public E getLast() {
        if (empty()) {
            System.out.println("Deque is Empty");
            return null;
        }
        return tail.data;
    }
}
