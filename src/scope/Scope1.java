package scope;

public class Scope1 {

    // 지역변수는 본인의 코드 블록 안에서만 생존함
    // 코드블록 안에서는 얼마든지 접근가능 / 벗어나면 제거되기 때문에 접근 불가

    public static void main(String[] args) {
        int m = 10; //m생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x); // x 생존 범위는 if문 안임
        } //x 생존 종료
        System.out.println("main m = " + m);
//        System.out.println("main x = " = x);  // if문이 끝나서 x 가 사라져서 접근 불가임
    } // m 생존 종료

}
