package ch04_LinkedList_2.myLinkedList;

class MyNode<E> {
    public MyNode<E> link; // 다른 노드를 참조할 링크 노드
    private final E data; // 저장된 데이터

    public MyNode() {
        this.data = null;
        this.link = null;
    }

    public MyNode(E data) {
        this.data = data;
        this.link = null;
    }

    public MyNode(E data, MyNode<E> link) {
        this.data = data;
        this.link = link;
    }

    public E getData() {
        return data;
    }
}
