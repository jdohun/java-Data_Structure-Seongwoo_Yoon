package ch03_LinkedList_1.ch03_3;

public class Point {
    int xPosition;
    int yPosition;

    Point(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    void showPointPosition() {
        System.out.printf("[%d, %d]\n", xPosition, yPosition);
    }

    int compare(Point target) {
        if (xPosition == target.xPosition && yPosition == target.yPosition)
            return 0;
        else if (xPosition == target.xPosition)
            return 1;
        else if (yPosition == target.yPosition)
            return 2;
        else
            return -1;
    }
}
