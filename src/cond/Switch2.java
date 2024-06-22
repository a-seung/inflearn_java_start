package cond;
// if문은 비교연산자를 사용할 수 있지만 switch문은 단순히 같은 값인지만 비교할 수 있다.
public class Switch2 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon;

        switch (grade) { //변수를 넣음
            case 1: // grade 값이 몇인지
                coupon = 1000;
                break; //break를 만나면 끝으로 빠져나옴
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급 받은 쿠폰 " + coupon);

    }
}
