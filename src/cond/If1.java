package cond;
//조건문
public class If1 {
    public static void main(String[] args) {
        int age = 20; // 사용자의 나이

        if( age >= 18) {
            System.out.println("성인입니다.");
        } // 참이라서 코드블럭을 실행함

        if (age < 18) {
            System.out.println("미성년자입니다.");
        } //false라서 실행하지 않고 끝으로 가버림
    }
}
