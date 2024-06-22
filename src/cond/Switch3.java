package cond;
// if문은 비교연산자를 사용할 수 있지만 switch문은 단순히 같은 값인지만 비교할 수 있다.

// switch는 항상break와 같이 사용해야함 + default
// switch문은 값이 같은지 확인하는 연산만 가능
// if문은 참 거짓이 나오는 조건식이 들어감
public class Switch3 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon;

        switch (grade) { //변수를 넣음
            case 1: // grade 값이 몇인지
                coupon = 1000;
                break; //break를 만나면 끝으로 빠져나옴
            case 2:  //break문이 없다면 밑에 줄로 내려가서 호출하게됨=>2,3등급일때 모두 3000 원
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급 받은 쿠폰 " + coupon);

    }
}
