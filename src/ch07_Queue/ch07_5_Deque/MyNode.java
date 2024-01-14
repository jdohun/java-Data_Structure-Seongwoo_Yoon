package ch07_Queue.ch07_5_Deque;

class MyNode<E> {
    E data;
    MyNode<E> next;
    MyNode<E> previous;

    MyNode() {
        this.data = null;
        this.next = null;
        this.previous = null;
    }

    MyNode(E data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
