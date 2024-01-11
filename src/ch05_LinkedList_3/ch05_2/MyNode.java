package ch05_LinkedList_3.ch05_2;

class MyNode<E> {
    E data;
    MyNode<E> next;
    MyNode<E> previous; // 이전 노드를 참조함 
    
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
