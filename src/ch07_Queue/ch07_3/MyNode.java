package ch07_Queue.ch07_3;

public class MyNode<E> {
    E data;
    MyNode<E> next;

    public MyNode(E data) {
        this.data = data;
        this.next = null;
    }
}
