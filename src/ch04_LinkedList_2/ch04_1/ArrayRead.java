package ch04_LinkedList_2.ch04_1;

import java.util.Scanner;

public class ArrayRead {
    public static void read() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int readCount = 0;
        int readData;

        while (true) {
            System.out.print("자연수 입력: ");
            readData = sc.nextInt();
            if (readData < 1) {
                break;
            }
            arr[readCount++] = readData;
        }

        for (int i = 0; i < readCount; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
