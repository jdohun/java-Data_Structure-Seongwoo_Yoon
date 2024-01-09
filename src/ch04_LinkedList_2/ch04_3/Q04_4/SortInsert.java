package ch04_LinkedList_2.ch04_3.Q04_4;

@FunctionalInterface
interface SortInsert {
    int compare(Point data, Point predecessorLinkData);
}
