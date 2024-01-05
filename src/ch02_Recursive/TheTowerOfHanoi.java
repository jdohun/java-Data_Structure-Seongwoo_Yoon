package ch02_Recursive;

public class TheTowerOfHanoi {
    static void HanoiTowerMove(int num, char from, char by, char to) {
        if (num == 1) {
            System.out.printf("원반1을 %c에서 %c로 이동\n", from, to);
        } else {
            HanoiTowerMove(num - 1, from, to, by); // 3단계 중 1단계
            System.out.printf("원반%d을(를) %c에서 %c로 이동\n", num, from, to); // 3단계 중 2단계
            HanoiTowerMove(num - 1, by, from, to); // 3단계 중 3단계
        }
    }

    public static void test() {
        // 막대A의 원반 3개를 막대B를 거쳐 막대C로 옮기기
        HanoiTowerMove(3, 'A', 'B', 'C');
    }
}

/*
 * 1. 작은 원반 n-1개(맨 아래 원반을 제외한 나머지)를 A에서 B로 이동
 * 2. 큰 원반(맨 아래의 원반) 1개를 A에서 C로 이동
 * 3. 작은 원반 n-1개(위의 1단계에서 옮겨진 원반)를 B에서 C로 이동
 * */