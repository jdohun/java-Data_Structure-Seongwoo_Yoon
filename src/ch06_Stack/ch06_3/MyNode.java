package ch06_Stack.ch06_3;

class MyNode<E> {
    E data;
    MyNode<E> next;

    MyNode(E data) {
        this.data = data;
        this.next = null;
    }
}
