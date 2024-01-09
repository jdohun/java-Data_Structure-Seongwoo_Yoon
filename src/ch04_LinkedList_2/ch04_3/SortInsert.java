package ch04_LinkedList_2.ch04_3;

@FunctionalInterface
public interface SortInsert {
    int compare(Integer data, Integer predecessorLinkData);
}
