package ch04_LinkedList_2.ch04_3;

class MyNode<E> {
    MyNode<E> link; // 다른 노드를 참조할 링크 노드
    E data; // 저장된 데이터

    MyNode() {
        this.data = null;
        this.link = null;
    }

    MyNode(E data) {
        this.data = data;
        this.link = null;
    }

    MyNode(E data, MyNode<E> link) {
        this.data = data;
        this.link = link;
    }
}
