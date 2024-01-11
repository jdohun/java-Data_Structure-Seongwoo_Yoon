package ch03_LinkedList_1.ch03_Q03_2;

import java.util.Arrays;

public class NameCard {

    private static final int NAME_LEN = 30;
    private static final int PHONE_LEN = 30;

    private final char[] name;
    private final char[] phone;

    NameCard(char[] name, char[] phone) {
        this.name = name;
        this.phone = phone;

        // 주어진 배열이 고정된 크기에 맞게 되도록 보장합니다.
        System.arraycopy(name, 0, this.name, 0, Math.min(name.length, NAME_LEN));
        System.arraycopy(phone, 0, this.phone, 0, Math.min(phone.length, PHONE_LEN));
    }

    void showNameCard() {
        System.out.print("[이름] ");

        for (char c : name) {
            System.out.print(c);
        }

        System.out.print(" [번호] ");
        for (char c : phone) {
            System.out.print(c);
        }
        System.out.println();
    }

    boolean nameCompare(char[] targetName) {
        return Arrays.equals(name, targetName);
    }

    void changePhoneNumber(char[] phone) {
        // 주어진 배열이 고정된 크기에 맞게 되도록 보장합니다.
        System.arraycopy(phone, 0, this.phone, 0, Math.min(phone.length, PHONE_LEN));
    }
}
