package cond;

public class If5 {
    public static void main(String[] args) {
        //독립된 if문 2개라서 2개 조건 true면 모두 적용됨
        int price = 9000; //
        int age = 11;
        int discount = 0;

        if ( price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if ( age <= 10 ) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 : " + discount + "원");
    }
}
