package ch05_LinkedList_3.ch05_1;

class MyNode<E> {
    E data; // 저장된 데이터
    MyNode<E> link; // 다른 노드를 참조할 링크 노드

    MyNode() {
        this.data = null;
        this.link = null;
    }

    MyNode(E data) {
        this.data = data;
        this.link = null;
    }
}
