package loop;

public class DoWhile2 {
    // 실행 먼저하고 조건을 검사함, true면 또 돌음
    // do-while문은 최초 한번은 항상 실행됨
    // 최초 한번은 코드 블럭을 실행해야하는 경우에 사용
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i <= 3);
    }
}
