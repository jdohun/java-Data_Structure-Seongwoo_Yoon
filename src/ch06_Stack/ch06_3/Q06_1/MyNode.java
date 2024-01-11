package ch06_Stack.ch06_3.Q06_1;

class MyNode<E> {
    E data;
    MyNode<E> next;

    MyNode() {
        this.data = null;
        this.next = null;
    }

    MyNode(E data) {
        this.data = data;
        this.next = null;
    }
}
