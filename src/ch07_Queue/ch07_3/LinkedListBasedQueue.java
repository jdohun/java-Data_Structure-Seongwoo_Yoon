package ch07_Queue.ch07_3;

import ch07_Queue.ch07_1.QueueADT;

public class LinkedListBasedQueue<E> implements QueueADT<E> {

    MyNode<E> front = null;
    MyNode<E> rear = null;

    @Override
    public boolean empty() {
        return front == null;
    }

    @Override
    public void enqueue(E data) {
        MyNode<E> insertion = new MyNode<>(data);

        if (empty()) {
            front = insertion;
        } else {
            rear.next = insertion;
        }

        rear = insertion;
    }

    @Override
    public E dequeue() {
        if (empty()) {
            System.out.println("Queue is Empty");
            System.exit(-1);
        }

        final E removeData = front.data;
        front = front.next;

        return removeData;
    }

    @Override
    public E peek() {
        if (empty()){
            System.out.println("Queue is Empty");
            System.exit(-1);
        }
        return front.next.data;
    }
}
