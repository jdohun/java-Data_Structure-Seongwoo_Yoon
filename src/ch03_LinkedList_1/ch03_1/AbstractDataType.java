package ch03_LinkedList_1.ch03_1;

public interface AbstractDataType {
    /**
     * 첫 번째 인자로 전달된 주소의 지갑에서 돈을 꺼낸다.
     * 두 번째 인자로 꺼낼 동전의 수, 세 번째 인자로 꺼낼 지폐의 수를 전달한다.
     * 꺼내고자 하는 돈의 총액이 반환된다. 그리고 그만큼 돈은 차감된다.
     */
    int takeOutMoney(Wallet wallet, int coinNum, int billNum);

    /**
     * 첫 번째 인자로 전달된 주소의 지갑에 돈을 넣는다.
     * 두 번째 인자로 넣을 동전의 수, 세 번째 인자로 넣을 지폐의 수를 전달한다.
     * 넣은 만큼 동전과 지폐의 수가 증가한다.
     */
    void putMoney(Wallet wallet, int coinNum, int billNum);
}
