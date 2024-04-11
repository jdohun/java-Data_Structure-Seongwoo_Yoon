package ch10_Sort.ch10_2_ComplexEfficientSort.ch10_2_4_RadixSort;

public class ListBasedQueue<T> implements Queue<T> {
    Node<T> front;
    Node<T> rear;
    ListBasedQueue() {
        front = null;
        rear = null;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public void enqueue(T data) {
        final Node insertNode = new Node(data);

        if (isEmpty()) {
            front = insertNode;
        } else {
            rear.next = insertNode;
        }
        rear = insertNode;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Memory Error!");
            System.exit(-1);
        }

        Node<T> delNode = front;
        T delData = delNode.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }

        return delData;
    }

    @Override
    public T peak() {
        if (isEmpty()) {
            System.out.println("Queue Memory Error!");
            System.exit(-1);
        }

        return front.data;
    }

    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
