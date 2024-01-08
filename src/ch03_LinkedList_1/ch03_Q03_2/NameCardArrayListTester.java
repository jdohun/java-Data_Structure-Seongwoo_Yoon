package ch03_LinkedList_1.ch03_Q03_2;

public class NameCardArrayListTester {

    public static void test() {
        /*** `MyArrayList`의 생성 및 초기화 ***/
        NameCardArrayList nameCardArrayList = new NameCardArrayList();
        NameCard nameCard;

        /*** 1. 3개의 데이터 저장 ***/
        nameCardArrayList.insert(new NameCard("이진수".toCharArray(), "010-1111-2222".toCharArray()));
        nameCardArrayList.insert(new NameCard("한지영".toCharArray(), "010-2222-5555".toCharArray()));
        nameCardArrayList.insert(new NameCard("조수진".toCharArray(), "010-3333-7777".toCharArray()));

        /*** 저장된 데이터 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d\n", nameCardArrayList.count());

        // 첫 번째 데이터 조회
        nameCard = nameCardArrayList.first();
        while (nameCard != null) {
            nameCard.showNameCard();

            // 이후의 데이터 조회
            nameCard = nameCardArrayList.next();
        }
        System.out.println();


        /*** 2. 특정 이름을 대상으로 탐색을 진행하여, 그 사람의 정보 출력 ***/
        // 첫 번째 데이터 조회
        nameCard = nameCardArrayList.first();
        while (nameCard != null) {
            if (nameCard.nameCompare("한지영".toCharArray())) {
                nameCard.showNameCard();
                break;
            }
            nameCard = nameCardArrayList.next();
        }
        System.out.println();

        /*** 3. 특정 이름을 대상으로 탐색을 진행하여, 그 사람의 전화번호 변경 ***/
        nameCard = nameCardArrayList.first();
        while (nameCard != null) {
            if (nameCard.nameCompare("이진수".toCharArray())) {
                nameCard.changePhoneNumber("010-9999-9999".toCharArray());
                break;
            }
            nameCard = nameCardArrayList.next();
        }

        /*** 4. 특정 이름을 대상으로 탐색을 진행하여, 그 사람의 정보 삭제 ***/
        nameCard = nameCardArrayList.first();
        while (nameCard != null) {
            if (nameCard.nameCompare("조수진".toCharArray())) {
                nameCardArrayList.remove();
                // 여기서 C 언어는 제거 후 메모리 해제함
                break;
            }
            nameCard = nameCardArrayList.next();
        }

        /*** 5. 삭제 후 저장된 데이터 전체 출력 ***/
        System.out.printf("현재 데이터의 수: %d\n", nameCardArrayList.count());

        // 첫 번째 데이터 조회
        nameCard = nameCardArrayList.first();
        while (nameCard != null) {
            nameCard.showNameCard();

            // 이후의 데이터 조회
            nameCard = nameCardArrayList.next();
        }
        System.out.println();
    }
}
