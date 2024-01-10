package ch05_LinkedList_3.ch05_1.Q05_1;

public class NightDuty {
    public static void test() {
        // 원형 연결 리스트의 생성 및 초기화 ///////
        CircularLinkedList<Employee> list = new CircularLinkedList<>();
        Employee data;
        int listSize;

        // 4명의 데이터 저장 ///////
        list.insert(new Employee(1, "Terry"));
        list.insert(new Employee(2, "Jerry"));
        list.insert(new Employee(3, "Hary"));
        list.insert(new Employee(4, "Sunny"));

        // 리스트에 저장된 데이터 출력 ///////
        listSize = list.size() - 1;
        data = list.first();
        if (data != null) {
            data.showEmpInfo();

            for (int i = 0; i < listSize; i++) {
                data = list.next();
                data.showEmpInfo();
            }
        }
        System.out.println();

        // Terry 뒤로 3일 뒤 당직자는? ///////
        data = whoIsNightDuty(list, "Terry", 3);
        if(data != null){
            data.showEmpInfo();
        } else {
            System.out.println("list 에 등록되지 않은 이름입니다.");
        }

        // Sunny 뒤로 15일 뒤 당직자는? ///////
        data = whoIsNightDuty(list, "Sunny", 15);
        if(data != null){
            data.showEmpInfo();
        } else {
            System.out.println("list 에 등록되지 않은 이름입니다.");
        }
    }

    private static Employee whoIsNightDuty(CircularLinkedList<Employee> list, String targetName, int nextDays) {
        // 이름 찾기 ///////
        int size = list.size();
        Employee target;

        target = list.first();
        for (int i = 0; i < size - 1; i++) {
            if (target.empName.equals(targetName)) {
                break;
            }
            target = list.next();
        }

        if (!target.empName.equals(targetName)) {
            return null; // 해당하는 이름을 가진 사원이 존재하지 않으면
        }

        // 그 뒤로 며칠 뒤 ///////
        Employee result = null;
        for (int i = 0; i < nextDays; i++){
            result = list.next();
        }

        return result;
    }
}
