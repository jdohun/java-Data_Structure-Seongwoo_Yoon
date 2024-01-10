package ch05_LinkedList_3.ch05_1.Q05_1;

public class Employee {
    int empNo;
    String empName;

    Employee(int empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    void showEmpInfo() {
        System.out.printf("[%d, %s]\n", empNo, empName);
    }
}
