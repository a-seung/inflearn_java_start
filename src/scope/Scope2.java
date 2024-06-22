package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {// for문 안에서 초기식에 선언한 변수 i는 블록 내부, for문 내에서만 사용가능
            System.out.println("for m = " + m); // 블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } // i 생존 종료
//        System.out.println("main i = " + i);
        System.out.println("main m = " + m);
    }
}
