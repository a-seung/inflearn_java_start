package loop;

public class Nested1 {

    public static void main(String[] args) {

        //외부for 2번 x 내부 for 3번 실행 => 총 6번의 내부for문 실행
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++) { //중첩
                System.out.println("-> 내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println();
        }
    }
}
